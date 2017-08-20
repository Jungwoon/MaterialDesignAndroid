package com.byjw.materialdesignandroid.Main.Contract;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by jungwoon on 2017. 8. 16..
 */

public interface MainContract {

    interface View {

        void showToast(String message);

    }

    interface Presenter {

        void attachView(View view, FragmentManager fragmentManager);

        void detachView();

        void setFragment();

        void replaceFragment(Fragment fragment);


    }

}
