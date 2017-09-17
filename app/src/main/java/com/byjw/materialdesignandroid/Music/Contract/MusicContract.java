package com.byjw.materialdesignandroid.Music.Contract;

import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.Music.MusicModel;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 8. 16..
 */

public interface MusicContract {

    interface View {

        void setOnClickListener(OnItemClickListener onItemClickListener);

        void notifyAdapter();

    }

    interface Model {

        void addItems(ArrayList<MusicModel> musicList);

        MusicModel getItem(int position);

    }

    interface Presenter {

        void setMoviesAdapterView(MusicContract.View adapterView);

        void setMoviesAdapterModel(MusicContract.Model adapterModel);

        void loadItems();

    }
}
