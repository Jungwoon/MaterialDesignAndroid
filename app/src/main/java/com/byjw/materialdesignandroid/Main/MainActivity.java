package com.byjw.materialdesignandroid.Main;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.byjw.materialdesignandroid.Books.Books;
import com.byjw.materialdesignandroid.Main.Contract.MainContract;
import com.byjw.materialdesignandroid.Main.Contract.MainPresenter;
import com.byjw.materialdesignandroid.Movies.Movies;
import com.byjw.materialdesignandroid.Music.Music;
import com.byjw.materialdesignandroid.R;
import com.byjw.materialdesignandroid.News.News;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @BindView(R.id.navigation)
    BottomNavigationView navigation;

    @BindView(R.id.search_menu)
    ImageView searchMenu;

    @OnClick(R.id.search_menu)
    void onClick() {

        if (menuFlag) {
            searchMenu.setImageDrawable(menuDrawable);
            menuDrawable.start();
        }
        else {
            searchMenu.setImageDrawable(backDrawable);
            backDrawable.start();
        }

        menuFlag = !menuFlag;

    }

    MainPresenter mainPresenter;

    AnimatedVectorDrawable menuDrawable;
    AnimatedVectorDrawable backDrawable;

    private boolean menuFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        menuDrawable = (AnimatedVectorDrawable) getDrawable(R.drawable.ic_menu_animatable);
        backDrawable = (AnimatedVectorDrawable) getDrawable(R.drawable.ic_back_animatable);

        menuFlag = true;

//        BottomNavigationViewHelper.disableShiftMode(navigation); // 아이콘이 바뀔때 밀리는거 제거

        mainPresenter = new MainPresenter();
        mainPresenter.attachView(this, getSupportFragmentManager());
        mainPresenter.setFragment();

        navigation.setOnNavigationItemSelectedListener(selectedListener);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detachView();
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_movies:
                    mainPresenter.replaceFragment(Movies.newInstance());
                    return true;
                case R.id.navigation_music:
                    mainPresenter.replaceFragment(Music.newInstance());
                    return true;
                case R.id.navigation_books:
                    mainPresenter.replaceFragment(Books.newInstance());
                    return true;
                case R.id.navigation_news:
                    mainPresenter.replaceFragment(News.newInstance());
                    return true;
            }
            return false;
        }

    };
}
