package com.example.admin.redditapitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.example.admin.redditapitest.models.dataFeed;
import com.example.admin.redditapitest.models.objects.Children;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private static final String BASE_URL = "https://www.reddit.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getDataButton = (Button) (findViewById(R.id.getData));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RedditAPI redditAPI = retrofit.create(RedditAPI.class);
        Call<dataFeed> call = redditAPI.getData();

        call.enqueue(new Callback<dataFeed>() {
            @Override
            public void onResponse(Call<dataFeed> call, Response<dataFeed> response) {
                Log.d(TAG, "onResponse : Server Response" + response.toString());
                Log.d(TAG, "onResponse : Recieved Information" + response.body().toString());

                ArrayList<Children> childrenList = response.body().getData().getChildren();

                for(int i = 0; i < childrenList.size(); i++){
                    Log.d(TAG, "onResponse: \n" +
                    "kind: " + childrenList.get(i).getKindKind() + "\n" +
                            "subreddit : " + childrenList.get(i).getChildrenData().getSubreddit() + "\n" +
                            "author : " + childrenList.get(i).getChildrenData().getAuthor() + "\n" +
                            "----------------------------------------------------------------\n\n");

                }

            }

            @Override
            public void onFailure(Call<dataFeed> call, Throwable t) {
                Log.e(TAG, "Something went wrong: " + t.getMessage());
                Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
