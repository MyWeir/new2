package com.example.yls.anew;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {
        private TabLayout mTabLayout;
        private ViewPager mViewPager;
//        private MyPageAdapter mPageAdapter;
//        private ArrayList<NewsFragment> mFragmentArrayList = new ArrayList<NewsFragment>();
        private ArrayList<String> mTitleList = new ArrayList<String>();;
//

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

//            initFragmentArrayList();
            initTitleList();

            mTabLayout = (TabLayout) findViewById(R.id.sliding_tab);
            mViewPager = (ViewPager) findViewById(R.id.viewpage);

//            mPageAdapter = new MyPageAdapter(getSupportFragmentManager(), mFragmentArrayList, mTitleList);
//            mViewPager.setAdapter(mPageAdapter);
//            mViewPager.setOffscreenPageLimit(4); // 3天
//
////
            mTabLayout.setupWithViewPager(mViewPager);
        }

        private void initTitleList() {

            mTitleList.add("头条");
            mTitleList.add("娱乐");
            mTitleList.add("美食");
            mTitleList.add("天气");
        }

//        private void initFragmentArrayList() {
//            NewsFragment fa = new NewsFragment();
//            Bundle bundle = new Bundle();
//            bundle.putInt("NEWSTYPE", 1);
//            fa.setArguments(bundle);
//
//
//            NewsFragment fb = new NewsFragment();
//            Bundle bundle2 = new Bundle();
//            bundle2.putInt("NEWSTYPE", 2);
//            fb.setArguments(bundle2);
//
//            NewsFragment fc = new NewsFragment();
//            Bundle bundle3 = new Bundle();
//            bundle3.putInt("NEWSTYPE", 3);
//            fc.setArguments(bundle3);
//
//            NewsFragment fd = new NewsFragment();
//            Bundle bundle4 = new Bundle();
//            bundle4.putInt("NEWSTYPE", 4);
//            fd.setArguments(bundle4);

//
//            mFragmentArrayList.add(fa);
//            mFragmentArrayList.add(fb);
//            mFragmentArrayList.add(fc);
//            mFragmentArrayList.add(fd);
}

