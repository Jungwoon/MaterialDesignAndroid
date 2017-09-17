package com.byjw.materialdesignandroid.Music;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jungwoon on 2017. 9. 17..
 */

class MusicViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.music_card_view_img)
    ImageView image;

    @BindView(R.id.music_card_view_title)
    TextView title;

    @BindView(R.id.music_card_view_genre)
    TextView genre;

    private Context context;
    private final OnItemClickListener onItemClickListener;

    public MusicViewHolder(Context context, ViewGroup parent, OnItemClickListener onItemClickListener) {
        super(LayoutInflater.from(context).inflate(R.layout.music_card_view, parent, false));
        ButterKnife.bind(this, itemView);

        this.context = context;
        this.onItemClickListener = onItemClickListener;
    }

    public void onBind(MusicModel musicModel, final int position) {
        RequestOptions options = new RequestOptions();
        options.centerCrop();

        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hello world : " + position, Toast.LENGTH_SHORT).show();
            }
        });

        Glide.with(context).load(musicModel.getImage()).apply(options).into(image);
        title.setText(musicModel.getTitle());
        genre.setText(musicModel.getGenre());


//        setAnimation(itemView);
    }
}
