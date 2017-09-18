package com.byjw.materialdesignandroid.Books.Contract;

import com.byjw.materialdesignandroid.Books.BooksModel;
import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.R;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 9. 17..
 */

public class BooksPresenter implements BooksContract.Presenter, OnItemClickListener {

    private BooksContract.Model adapterModel;
    private BooksContract.View adapterView;


    @Override
    public void setBooksAdapterView(BooksContract.View adapterView) {
        this.adapterView = adapterView;
    }

    @Override
    public void setBooksAdapterModel(BooksContract.Model adapterModel) {
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

    private ArrayList<BooksModel> getList() {
        ArrayList<BooksModel> booksModel = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            booksModel.add(new BooksModel(R.drawable.sample_book, "Sample Title", "Sample Genre"));
        }

        return booksModel;
    }
}
