package com.example.hagar.aaxxa.second_screen.data_access_layer.retrofit_control;

/**
 * Created by Hagar on 18/07/2018.
 */

public class ApiUtils {
    public static final String BASE_URL = "http://192.168.43.152:8585/AaxxaaTask/api/version1/number/";


    public static Service getService() {

        return RetrofitClient.getClient(BASE_URL).create(Service.class);
    }
}
