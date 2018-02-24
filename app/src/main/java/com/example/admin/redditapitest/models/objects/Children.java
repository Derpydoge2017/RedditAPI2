package com.example.admin.redditapitest.models.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 2/24/18.
 */

public class Children {

    @SerializedName("data")
    private childrenData data;

    @SerializedName("kind")
    private String kind;

    public childrenData getChildrenData() {
        return data;
    }

    public void setData(childrenData data) {
        this.data = data;
    }

    public String getKindKind() {
        return kind;
    }

    public void setKindKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Children{" +
                "data=" + data +
                ", kind='" + kind + '\'' +
                '}';
    }
}
