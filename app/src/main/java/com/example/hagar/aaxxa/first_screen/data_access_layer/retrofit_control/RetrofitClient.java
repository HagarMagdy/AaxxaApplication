package com.example.hagar.aaxxa.first_screen.data_access_layer.retrofit_control;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hagar on 18/07/2018.
 */

public class RetrofitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {


            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }
}
