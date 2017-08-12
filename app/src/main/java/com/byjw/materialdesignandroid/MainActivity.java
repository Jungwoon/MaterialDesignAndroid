package com.byjw.materialdesignandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.navigation)
    BottomNavigationView navigation;

    @BindView(R.id.view_pager)
    ViewPager viewPager;

    public static PagerAdapter adapter;
    private final int NUM_OF_PAGES = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        adapter = new PagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_movies:
//                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_music:
//                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_books:
//                    viewPager.setCurrentItem(2);
                    return true;
                case R.id.navigation_news:
//                    viewPager.setCurrentItem(3);
                    return true;
            }
            return false;
        }

    };

}
