package com.byjw.materialdesignandroid.News;

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
 * Created by jungwoon on 2017. 10. 16..
 */

class NewsViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.news_view_title)
    TextView title;

    @BindView(R.id.news_view_contents)
    TextView contents;

    @BindView(R.id.news_view_update_time)
    TextView updateTime;

    @BindView(R.id.news_view_img)
    ImageView image;

    private Context context;
    private final OnItemClickListener onItemClickListener;


    public NewsViewHolder(Context context, ViewGroup parent, OnItemClickListener onItemClickListener) {
        super(LayoutInflater.from(context).inflate(R.layout.news_view, parent, false));
        ButterKnife.bind(this, itemView);

        this.context = context;
        this.onItemClickListener = onItemClickListener;
    }

    public void onBind(NewsModel newsModel, final int position) {
        RequestOptions options = new RequestOptions();
        options.centerCrop();

        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hello world : " + position, Toast.LENGTH_SHORT).show();
            }
        });

        Glide.with(context).load(newsModel.getImage()).apply(options).into(image);
        title.setText(newsModel.getTitle());
        contents.setText(newsModel.getContents());
        updateTime.setText(newsModel.getUpdateTime());
    }
}
