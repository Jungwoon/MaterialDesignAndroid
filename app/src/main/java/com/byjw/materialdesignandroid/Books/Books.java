package com.byjw.materialdesignandroid.Books;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.Books.Contract.BooksPresenter;
import com.byjw.materialdesignandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Books extends Fragment {

    @BindView(R.id.recycler_books)
    RecyclerView recyclerView;

    BooksPresenter booksPresenter;
    BooksAdapter booksAdapter;

    public static Books newInstance() {
        return new Books();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_books, container, false);
        ButterKnife.bind(this, view);

        booksAdapter = new BooksAdapter(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(booksAdapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        booksPresenter = new BooksPresenter();
        booksPresenter.setBooksAdapterModel(booksAdapter);
        booksPresenter.setBooksAdapterView(booksAdapter);
        booksPresenter.loadItems();

    }
}
