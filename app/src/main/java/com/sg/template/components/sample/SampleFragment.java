package com.sg.template.components.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.sg.template.R;
import com.sg.template.ui.base.BaseFragment;


public class SampleFragment extends BaseFragment {

    public static SampleFragment newInstance() {
        SampleFragment fragment = new SampleFragment();
        return fragment;
    }


    @Override
    public void onAttachFragment(Activity activity) {

    }

    @Override
    public void onCreateFragment(Bundle bundle) {

    }

    /**
     * Layout sent by your onInflateViewFragment() is converted into a View, enhanced and all the views in the component are binded.
     * and is  given to you as an argument,make all the modifications in this method and return the view.
     * View
     * @param view
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateViewFragment(View view, Bundle savedInstanceState) {
        //showProgressDialog();
        return view;
    }

    @Override
    public int onInflateViewFragment() {
        return R.layout.fragment_sample;
    }

    @Override
    public String getFragmentTitle() {
        return "Sample Fragment";
    }
}
