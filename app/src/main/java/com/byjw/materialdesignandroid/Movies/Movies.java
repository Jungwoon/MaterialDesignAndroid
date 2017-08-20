package com.byjw.materialdesignandroid.Movies;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.Movies.Contract.MoviesPresenter;
import com.byjw.materialdesignandroid.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Movies extends Fragment {

    @BindView(R.id.recycler_movies_new_releases)
    RecyclerView recyclerView;

    MoviesPresenter moviesPresenter;
    MoviesAdapter moviesAdapter;

    public static Movies newInstance() {
        return new Movies();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_movies, container, false);
        ButterKnife.bind(this, view);

        moviesAdapter = new MoviesAdapter(getContext());

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(moviesAdapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        return view;

    }

    @Override
    public void onResume() {
        super.onResume();

        moviesPresenter = new MoviesPresenter();
        moviesPresenter.setMoviesAdapterModel(moviesAdapter);
        moviesPresenter.setMoviesAdapterView(moviesAdapter);
        moviesPresenter.loadItems(getList());
    }

    private ArrayList<MoviesModel> getList() {
        Bitmap sampleImage = ((BitmapDrawable)getResources().getDrawable(R.drawable.sample_book)).getBitmap();

        ArrayList<MoviesModel> moviesModels = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            moviesModels.add(new MoviesModel(sampleImage, "Sample Title", "Sample Genre"));
        }


        return moviesModels;
    }
}
