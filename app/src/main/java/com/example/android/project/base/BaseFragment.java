package com.example.android.project.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Android on 2017/4/5.
 */

public abstract class BaseFragment extends Fragment {

    public View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(setLayout(), null);
        ViewGroup parent = (ViewGroup) rootView.getParent();
        if (parent != null)
            parent.removeView(rootView);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initialize();
        initView();
        initDate();
    }

    public void initialize() {

    }

    public abstract int setLayout();

    public abstract void initView();

    public abstract void initDate();
}
