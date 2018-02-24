package com.example.admin.redditapitest.models.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 2/24/18.
 */

public class childrenData {

    @SerializedName("subreddit")
    private String subreddit;

    @SerializedName("author")
    private String author;

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "childrenData{" +
                "subreddit='" + subreddit + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
