package com.byjw.materialdesignandroid.Movies;

/**
 * Created by jungwoon on 2017. 8. 20..
 */

public class MoviesModel {

    private int image;
    private String title;
    private String genre;

    public MoviesModel(int image, String title, String genre) {
        this.image = image;
        this.title = title;
        this.genre = genre;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
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
