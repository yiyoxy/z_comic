package com.android.zhhr.ui.custom;

import android.support.v4.view.PagerAdapter;

/**
 * Created by 皓然 on 2017/7/20.
 */

public final class VerticalViewPagerCompat {
    private VerticalViewPagerCompat() {
    }

    public static void setDataSetObserver(PagerAdapter adapter, DataSetObserver observer) {
        adapter.registerDataSetObserver(observer);
    }

    public static class DataSetObserver extends android.database.DataSetObserver {
    }
}
