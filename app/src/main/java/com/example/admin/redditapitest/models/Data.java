package com.example.admin.redditapitest.models;

import com.example.admin.redditapitest.models.objects.Children;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Admin on 2/24/18.
 */

public class Data {

    @SerializedName("modhash")
    private String modHash;

    @SerializedName("children")
    private ArrayList<Children> children;

    public String getModHash() {
        return modHash;
    }

    public void setModHash(String modHash) {
        this.modHash = modHash;
    }

    public ArrayList<Children> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Data{" +
                "modHash='" + modHash + '\'' +
                ", children=" + children +
                '}';
    }
}
