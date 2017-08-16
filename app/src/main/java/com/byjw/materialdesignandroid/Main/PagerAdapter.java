package com.byjw.materialdesignandroid.Main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.byjw.materialdesignandroid.Books.Books;
import com.byjw.materialdesignandroid.Movies.Movies;
import com.byjw.materialdesignandroid.Music.Music;
import com.byjw.materialdesignandroid.Shopping.Shopping;

/**
 * Created by jungwoon on 2017. 8. 12..
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Movies();
            case 1:
                return new Music();
            case 2:
                return new Books();
            case 3:
                return new Shopping();
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 0;
    }
}
