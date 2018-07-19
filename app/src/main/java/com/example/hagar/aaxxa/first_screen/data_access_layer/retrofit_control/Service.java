package com.example.hagar.aaxxa.first_screen.data_access_layer.retrofit_control;




import com.example.hagar.aaxxa.first_screen.pojos.NumberPojo;
import com.example.hagar.aaxxa.first_screen.pojos.ResponseMessage;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Hagar on 18/07/2018.
 */

public interface Service {

    @POST("insert")
    Call<ResponseMessage> addNumber(@Body NumberPojo pojo);
}
