package com.byjw.materialdesignandroid.Books.Contract;

import com.byjw.materialdesignandroid.Books.BooksModel;
import com.byjw.materialdesignandroid.Listener.OnItemClickListener;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 8. 16..
 */

public interface BooksContract {

    interface View {

        void setOnClickListener(OnItemClickListener onItemClickListener);

        void notifyAdapter();

    }

    interface Model {

        void addItems(ArrayList<BooksModel> booksList);

        BooksModel getItem(int position);

    }

    interface Presenter {

        void setBooksAdapterView(BooksContract.View adapterView);

        void setBooksAdapterModel(BooksContract.Model adapterModel);

        void loadItems();

    }
}
