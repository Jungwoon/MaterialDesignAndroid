package com.byjw.materialdesignandroid.Main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.byjw.materialdesignandroid.Books.Books;
import com.byjw.materialdesignandroid.Movies.Movies;
import com.byjw.materialdesignandroid.Music.Music;
import com.byjw.materialdesignandroid.R;
import com.byjw.materialdesignandroid.Shopping.Shopping;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.navigation)
    BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, Movies.newInstance()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_movies:
                    replaceFragment(Movies.newInstance());
                    return true;
                case R.id.navigation_music:
                    replaceFragment(Music.newInstance());
                    return true;
                case R.id.navigation_books:
                    replaceFragment(Books.newInstance());
                    return true;
                case R.id.navigation_shopping:
                    replaceFragment(Shopping.newInstance());
                    return true;
            }
            return false;
        }

    };

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment).commit();
    }

}
