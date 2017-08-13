package com.byjw.materialdesignandroid.Movies;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.R;

public class Movies extends Fragment {

    public static Movies newInstance() {
        return new Movies();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movies, container, false);
    }

}
