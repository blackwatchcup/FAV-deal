package com.example.qsr.fav_deal.fragments;

import com.example.qsr.fav_deal.R;
import com.example.qsr.fav_deal.base.BaseFragment;
import com.loopj.android.http.RequestParams;

/**************************************
 * FileName : com.example.qsr.fav_deal.fragments
 * Author : qsr
 * Time : 2016/7/26 12:26
 * Description : 主页
 **************************************/
public class HomePageFragment extends BaseFragment {
    @Override
    protected void initEvent() {

    }

    @Override
    protected RequestParams getParams() {
        return new RequestParams();
    }

    @Override
    protected String getUrl() {
        return "";
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData(String content) {

    }

    @Override
    protected void initTitle() {

    }
}