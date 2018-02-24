package com.example.admin.redditapitest;

import com.example.admin.redditapitest.models.dataFeed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Admin on 2/24/18.
 */

public interface RedditAPI {

    String BASE_URL = "https://www.reddit.com/";

    @Headers("Content-Type: application/json")
    @GET(".json")
    Call<dataFeed> getData();

}
