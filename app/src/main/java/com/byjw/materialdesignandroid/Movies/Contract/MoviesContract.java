package com.byjw.materialdesignandroid.Movies.Contract;

import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.Movies.MoviesModel;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 8. 16..
 */

public interface MoviesContract {

    interface View {

        void setOnClickListener(OnItemClickListener onItemClickListener);

        void notifyAdapter();

    }

    interface Model {

        void addItems(ArrayList<MoviesModel> moviesList);

        MoviesModel getItem(int position);

    }

    interface Presenter {

        void setMoviesAdapterView(MoviesContract.View adapterView);

        void setMoviesAdapterModel(MoviesContract.Model adapterModel);

        void loadItems(ArrayList<MoviesModel> movieList);

    }
}
