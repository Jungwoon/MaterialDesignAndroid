package com.byjw.materialdesignandroid.Music;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.R;

public class Music extends Fragment {
    public static Music newInstance() {
        return new Music();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_music, container, false);
    }

}
