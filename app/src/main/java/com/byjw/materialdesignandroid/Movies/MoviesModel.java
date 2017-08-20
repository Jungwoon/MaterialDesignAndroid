package com.byjw.materialdesignandroid.Movies;

import android.graphics.Bitmap;

/**
 * Created by jungwoon on 2017. 8. 20..
 */

public class MoviesModel {

    private Bitmap image;
    private String title;
    private String genre;

    public MoviesModel(Bitmap image, String title, String genre) {
        this.image = image;
        this.title = title;
        this.genre = genre;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
