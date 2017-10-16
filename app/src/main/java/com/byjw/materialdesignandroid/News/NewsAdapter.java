package com.byjw.materialdesignandroid.News;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.News.Contract.NewsContract;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 10. 16..
 */

class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder>
    implements NewsContract.View, NewsContract.Model {

    private Context context;
    private OnItemClickListener onItemClickListener;
    private ArrayList<NewsModel> newsList;

    public NewsAdapter(Context context) {
        this.context = context;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsViewHolder(context, parent, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        if (holder == null) return;
        holder.onBind(newsList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return newsList != null ? newsList.size() : 0;
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
    public void addItems(ArrayList<NewsModel> newsList) {
        if (newsList == null) return;
        this.newsList = newsList;
    }

    @Override
    public NewsModel getItem(int position) {
        return newsList.get(position);
    }
}
