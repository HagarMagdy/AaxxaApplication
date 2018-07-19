package com.example.hagar.aaxxa.first_screen.data_access_layer.retrofit_control;




import android.util.Log;

import com.example.hagar.aaxxa.first_screen.pojos.NumberPojo;
import com.example.hagar.aaxxa.first_screen.pojos.ResponseMessage;
import com.example.hagar.aaxxa.first_screen.presenter.FirstScreenPresenter;
import com.example.hagar.aaxxa.first_screen.view.NumberApiManagerInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hagar on 18/07/2018.
 */

public class NumberApiManager implements NumberApiManagerInterface {
    FirstScreenPresenter presenter;

    public NumberApiManager(FirstScreenPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void addNumber(NumberPojo number) {

        Service apiService = ApiUtils.getService();
        apiService.addNumber(number).enqueue(new Callback<ResponseMessage>() {
            @Override
            public void onResponse(Call<ResponseMessage> call, Response<ResponseMessage> response) {

                    // in this case, number added successfully
                    presenter.showSuccessMessage();

            }

            @Override
            public void onFailure(Call<ResponseMessage> call, Throwable t) {
               presenter.retrofitError();
            }
        });
    }
}
