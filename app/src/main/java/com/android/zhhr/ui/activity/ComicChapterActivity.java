package com.android.zhhr.ui.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;

import com.android.zhhr.R;
import com.android.zhhr.data.commons.Constants;
import com.android.zhhr.data.entity.Subject;
import com.android.zhhr.presenter.ComicChapterPresenter;
import com.android.zhhr.ui.adapter.ChapterViewpagerAdapter;
import com.android.zhhr.ui.custom.ComicReaderViewpager;
import com.android.zhhr.ui.view.IChapterView;

import butterknife.Bind;

/**
 * Created by 皓然 on 2017/7/20.
 */

public class ComicChapterActivity extends BaseActivity<ComicChapterPresenter> implements IChapterView<Subject>{
    String comic_id;
    String comic_chapters;
    @Bind(R.id.vp_chapters)
    ComicReaderViewpager mViewpager;
    ChapterViewpagerAdapter mAdapter;
    @Override
    protected void initPresenter() {
        mPresenter = new ComicChapterPresenter(this,this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_chapter;
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        comic_id = intent.getStringExtra(Constants.COMIC_ID);
        comic_chapters = intent.getStringExtra(Constants.COMIC_CHAPERS);
        mAdapter = new ChapterViewpagerAdapter(this);
        mViewpager.setAdapter(mAdapter);
        mViewpager.setOffscreenPageLimit(4);
        mPresenter.loadData(comic_id,comic_chapters);
    }

    @Override
    public void ShowToast(String t) {
        showToast(t);
    }

    @Override
    public void getDataFinish() {

    }

    @Override
    public void showEmptyView() {

    }

    @Override
    public void showErrorView(Throwable throwable) {

    }

    @Override
    public void fillData(Subject data) {
        mAdapter.setDatas(data.getComiclist());
        mAdapter.setDirection(Constants.RIGHT_TO_LEFT);
        mViewpager.setCurrentItem(data.getComiclist().size()-1);
    }

    @Override
    public void enterFullScreen() {

    }

    @Override
    public void exitFullScreen() {

    }

    @Override
    public void nextChapter() {

    }

    @Override
    public void preChapter() {

    }

    @Override
    public void SwitchModel(int a) {

    }
}
