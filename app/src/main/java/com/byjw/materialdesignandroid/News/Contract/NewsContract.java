package com.byjw.materialdesignandroid.News.Contract;

import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.News.NewsModel;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 8. 16..
 */

public interface NewsContract {

    interface View {

        void setOnClickListener(OnItemClickListener onItemClickListener);

        void notifyAdapter();

    }

    interface Model {

        void addItems(ArrayList<NewsModel> newsList);

        NewsModel getItem(int position);

    }

    interface Presenter {

        void setNewsAdapterView(NewsContract.View adapterView);

        void setNewsAdapterModel(NewsContract.Model adapterModel);

        void loadItems();

    }

}
