package com.byjw.materialdesignandroid.Movies.Contract;

import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.Movies.MoviesModel;
import com.byjw.materialdesignandroid.R;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 8. 20..
 */

public class MoviesPresenter implements MoviesContract.Presenter, OnItemClickListener {

    private MoviesContract.Model adapterModel;
    private MoviesContract.View adapterView;

    @Override
    public void setMoviesAdapterView(MoviesContract.View adapterView) {
        this.adapterView = adapterView;
    }

    @Override
    public void setMoviesAdapterModel(MoviesContract.Model adapterModel) {
        this.adapterModel = adapterModel;
    }

    @Override
    public void loadItems() {
        adapterModel.addItems(getList());
        adapterView.notifyAdapter();
    }

    @Override
    public void onClickListener() {}

    @Override
    public void onLongClickListener() {}

    private ArrayList<MoviesModel> getList() {
        ArrayList<MoviesModel> moviesModels = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            moviesModels.add(new MoviesModel(R.drawable.sample_movie, "Sample Title", "Sample Genre"));
        }

        return moviesModels;
    }
}
