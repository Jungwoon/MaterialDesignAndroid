package com.byjw.materialdesignandroid.Books;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.R;

public class Books extends Fragment {

    public static Books newInstance() {
        return new Books();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_books, container, false);
    }

}
