package com.android.zhhr.ui.view;

/**
 * Created by 皓然 on 2017/7/20.
 */

public interface IChapterView<T> extends IBaseView{
    //获取数据完成
    void getDataFinish();
    //未获取到数据
    void showEmptyView();
    //展示错误页面
    void showErrorView(Throwable throwable);
    //填充数据
    void fillData(T data);
    //进入全屏
    void enterFullScreen();
    //退出全屏
    void exitFullScreen();
    //下一章
    void nextChapter();
    //前一章
    void preChapter();
    //切换预览模式
    void SwitchModel(int a);
}
