package com.byjw.materialdesignandroid.Movies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.byjw.materialdesignandroid.Listener.OnItemClickListener;
import com.byjw.materialdesignandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jungwoon on 2017. 8. 20..
 */

public class MoviesViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.movies_card_view_img)
    ImageView image;

    @BindView(R.id.movies_card_view_title)
    TextView title;

    @BindView(R.id.movies_card_view_genre)
    TextView genre;

    private Context context;
    private final OnItemClickListener onItemClickListener;

    public MoviesViewHolder(Context context, ViewGroup parent, OnItemClickListener onItemClickListener) {
        super(LayoutInflater.from(context).inflate(R.layout.movies_card_view, parent, false));
        ButterKnife.bind(this, itemView);

        this.context = context;
        this.onItemClickListener = onItemClickListener;

    }

    public void onBind(MoviesModel moviesModel) {
        image.setImageBitmap(moviesModel.getImage());
        title.setText(moviesModel.getTitle());
        genre.setText(moviesModel.getGenre());

//        setAnimation(itemView);
    }

    // Animation을 주기 위한 부분
    private void setAnimation(View viewToAnimate) {
        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        viewToAnimate.setAnimation(animation);
    }

}
