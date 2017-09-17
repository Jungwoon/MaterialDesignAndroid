package com.byjw.materialdesignandroid.Music;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.Music.Contract.MusicPresenter;
import com.byjw.materialdesignandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Music extends Fragment {

    @BindView(R.id.recycler_music_new_releases)
    RecyclerView recyclerViewNewMusic;

    @BindView(R.id.recycler_music_recommended_for_you)
    RecyclerView recyclerViewRecommendMusic;

    MusicPresenter musicPresenter;
    MusicAdapter musicAdapter;

    public static Music newInstance() {
        return new Music();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);
        ButterKnife.bind(this, view);

        musicAdapter = new MusicAdapter(getContext());

        recyclerViewNewMusic.setHasFixedSize(true);
        recyclerViewNewMusic.setAdapter(musicAdapter);
        recyclerViewNewMusic.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        recyclerViewRecommendMusic.setHasFixedSize(true);
        recyclerViewRecommendMusic.setAdapter(musicAdapter);
        recyclerViewRecommendMusic.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        musicPresenter = new MusicPresenter();
        musicPresenter.setMoviesAdapterModel(musicAdapter);
        musicPresenter.setMoviesAdapterView(musicAdapter);
        musicPresenter.loadItems();
    }
}
