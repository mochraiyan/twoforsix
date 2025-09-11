package com.malik.twoforsix;

public class Article {
    private final int imageResource;
    private final String title;
    private final String subtitle;

    public Article(int imageResource, String title, String subtitle) {
        this.imageResource = imageResource;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}
