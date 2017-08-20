package com.byjw.materialdesignandroid.Movies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.Movies.Contract.MoviesContract;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 8. 20..
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesViewHolder>
        implements MoviesContract.View, MoviesContract.Model {

    private Context context;
    private OnItemClickListener onItemClickListener;
    private ArrayList<MoviesModel> moviesList;

    public MoviesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MoviesViewHolder(context, parent, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        if (holder == null) return;
        holder.onBind(moviesList.get(position));
    }

    @Override
    public int getItemCount() {
        return moviesList != null ? moviesList.size() : 0;
    }

    @Override
    public void setOnClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public void addItems(ArrayList<MoviesModel> moviesList) {
        if (moviesList == null) return;

        this.moviesList = moviesList;
    }

    @Override
    public MoviesModel getItem(int position) {
        return moviesList.get(position);
    }
}
