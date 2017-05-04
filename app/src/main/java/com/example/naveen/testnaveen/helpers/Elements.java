package com.example.naveen.testnaveen.helpers;

/**
 * Created by USer on 5/4/2017.
 */

public class Elements {
    private String title, time, content;
    private int images;

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }

    public int getImages() {
        return images;
    }

    public Elements(String title, String time, String content, int images) {

        this.title = title;
        this.time = time;
        this.content = content;
        this.images = images;
    }
}
