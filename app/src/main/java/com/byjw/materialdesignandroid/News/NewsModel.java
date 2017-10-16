package com.byjw.materialdesignandroid.News;

/**
 * Created by jungwoon on 2017. 10. 16..
 */

public class NewsModel {

    private int image;
    private String title;
    private String contents;
    private String updateTime;

    public NewsModel(int image, String title, String contents, String updateTime) {
        this.image = image;
        this.title = title;
        this.contents = contents;
        this.updateTime = updateTime;
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

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
