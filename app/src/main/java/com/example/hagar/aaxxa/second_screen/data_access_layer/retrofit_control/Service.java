package com.example.hagar.aaxxa.second_screen.data_access_layer.retrofit_control;




import com.example.hagar.aaxxa.first_screen.pojos.NumberPojo;
import com.example.hagar.aaxxa.first_screen.pojos.ResponseMessage;
import com.example.hagar.aaxxa.second_screen.pojos.NumbersListPojo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Hagar on 18/07/2018.
 */

public interface Service {
    @GET("getall")
    Call<NumbersListPojo> getNumbers();
}
