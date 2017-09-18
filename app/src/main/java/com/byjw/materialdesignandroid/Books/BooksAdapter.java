package com.byjw.materialdesignandroid.Books;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.Books.Contract.BooksContract;
import com.byjw.materialdesignandroid.Listener.OnItemClickListener;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 9. 17..
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksViewHolder>
    implements BooksContract.View, BooksContract.Model {

    private Context context;
    private OnItemClickListener onItemClickListener;
    private ArrayList<BooksModel> booksList;

    public BooksAdapter(Context context) {
        this.context = context;
    }

    @Override
    public BooksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BooksViewHolder(context, parent, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(BooksViewHolder holder, int position) {
        if (holder == null) return;
        holder.onBind(booksList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return booksList != null ? booksList.size() : 0;
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
    public void addItems(ArrayList<BooksModel> booksList) {
        if (booksList == null) return;

        this.booksList = booksList;
    }

    @Override
    public BooksModel getItem(int position) {
        return booksList.get(position);
    }
}
