package com.byjw.materialdesignandroid.Shopping;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.R;

public class Shopping extends Fragment {

    public static Shopping newInstance() {
        return new Shopping();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shopping, container, false);
    }

}
