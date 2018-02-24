package com.example.admin.redditapitest.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 2/24/18.
 */

public class dataFeed {

    @SerializedName("kind")
    private String kind;
    @SerializedName("data")
    private Data data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "dataFeed{" +
                "kind='" + kind + '\'' +
                ", data=" + data +
                '}';
    }
}
