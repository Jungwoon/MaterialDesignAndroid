package com.byjw.materialdesignandroid.News.Contract;

import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.News.NewsModel;
import com.byjw.materialdesignandroid.R;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 10. 16..
 */

public class NewsPresenter implements NewsContract.Presenter, OnItemClickListener{

    private NewsContract.Model adapterModel;
    private NewsContract.View adapterView;


    @Override
    public void setNewsAdapterView(NewsContract.View adapterView) {
        this.adapterView = adapterView;
    }

    @Override
    public void setNewsAdapterModel(NewsContract.Model adapterModel) {
        this.adapterModel = adapterModel;
    }

    @Override
    public void loadItems() {
        adapterModel.addItems(getList());
        adapterView.notifyAdapter();
    }

    @Override
    public void onClickListener() {

    }

    @Override
    public void onLongClickListener() {

    }

    private ArrayList<NewsModel> getList() {
        ArrayList<NewsModel> newsModel = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            newsModel.add(new NewsModel(R.drawable.sample_news, "Fun tropical escapes", "The night wa comparatively quiet. Some of the sails were again", "1hr"));
        }

        return newsModel;
    }
}
