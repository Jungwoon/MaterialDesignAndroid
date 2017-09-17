package com.byjw.materialdesignandroid.Music.Contract;

import com.byjw.materialdesignandroid.Music.MusicModel;
import com.byjw.materialdesignandroid.R;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 9. 17..
 */

public class MusicPresenter implements MusicContract.Presenter {

    private MusicContract.Model adapterModel;
    private MusicContract.View adapterView;

    @Override
    public void setMoviesAdapterView(MusicContract.View adapterView) {
        this.adapterView = adapterView;
    }

    @Override
    public void setMoviesAdapterModel(MusicContract.Model adapterModel) {
        this.adapterModel = adapterModel;
    }

    @Override
    public void loadItems() {
        adapterModel.addItems(getList());
        adapterView.notifyAdapter();
    }

    private ArrayList<MusicModel> getList() {
        ArrayList<MusicModel> musicModels = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            musicModels.add(new MusicModel(R.drawable.sample_music, "Sample Title", "Sample Genre"));
        }

        return musicModels;
    }
}
