package com.byjw.materialdesignandroid.Music;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.Music.Contract.MusicContract;

import java.util.ArrayList;

/**
 * Created by jungwoon on 2017. 9. 17..
 */

public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder>
    implements MusicContract.View, MusicContract.Model {

    private Context context;
    private OnItemClickListener onItemClickListener;
    private ArrayList<MusicModel> musicList;

    public MusicAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MusicViewHolder(context, parent, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(MusicViewHolder holder, int position) {
        if (holder == null) return;
        holder.onBind(musicList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return musicList != null ? musicList.size() : 0;
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
    public void addItems(ArrayList<MusicModel> musicList) {
        if (musicList == null) return;

        this.musicList = musicList;
    }

    @Override
    public MusicModel getItem(int position) {
        return null;
    }
}
