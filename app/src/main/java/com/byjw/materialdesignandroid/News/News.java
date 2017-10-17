package com.byjw.materialdesignandroid.News;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.News.Contract.NewsPresenter;
import com.byjw.materialdesignandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class News extends Fragment {

    @BindView(R.id.recycler_news)
    RecyclerView recyclerView;

    NewsPresenter newsPresenter;
    NewsAdapter newsAdapter;


    public static News newInstance() {
        return new News();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        ButterKnife.bind(this, view);

        newsAdapter = new NewsAdapter(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(newsAdapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();

        newsPresenter = new NewsPresenter();
        newsPresenter.setNewsAdapterModel(newsAdapter);
        newsPresenter.setNewsAdapterView(newsAdapter);
        newsPresenter.loadItems();
    }
}
