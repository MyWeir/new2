package com.example.yls.anew;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by yls on 2017/6/3.
 */
public class MyPageAdapter extends PagerAdapter {
//    public MyPageAdapter(FragmentManager supportFragmentManager, ArrayList<NewsFragment> fragmentArrayList, ArrayList<String> titleList) {
//    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
