package com.byjw.materialdesignandroid.Main.Contract;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.byjw.materialdesignandroid.Movies.Movies;
import com.byjw.materialdesignandroid.R;

/**
 * Created by jungwoon on 2017. 8. 20..
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    private FragmentManager fragmentManager;

    @Override
    public void attachView(MainContract.View view, FragmentManager fragmentManager) {
        this.view = view;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public void detachView() {
        if (view != null) view = null;
    }

    @Override
    public void setFragment() {
        fragmentManager.beginTransaction()
                .add(R.id.fragment_container, Movies.newInstance()).commit();
    }

    @Override
    public void replaceFragment(Fragment fragment) {
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment).commit();
    }
}
