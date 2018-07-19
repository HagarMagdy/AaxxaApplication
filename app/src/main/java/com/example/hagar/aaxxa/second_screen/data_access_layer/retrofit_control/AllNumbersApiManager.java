package com.example.hagar.aaxxa.second_screen.data_access_layer.retrofit_control;

import com.example.hagar.aaxxa.second_screen.pojos.NumberPojo;
import com.example.hagar.aaxxa.second_screen.pojos.NumbersListPojo;
import com.example.hagar.aaxxa.second_screen.presenter.AllNumbersPresenter;
import com.example.hagar.aaxxa.second_screen.view.AllNumbersApiNumbersInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hagar on 18/07/2018.
 */

public class AllNumbersApiManager implements AllNumbersApiNumbersInterface {
   AllNumbersPresenter presenter;

    public AllNumbersApiManager() {
    }

    public AllNumbersApiManager(AllNumbersPresenter presenter) {
        this.presenter = presenter;
    }

    ArrayList<NumberPojo> allNumbers;
    @Override
    public ArrayList<NumberPojo> getAllNumbers() {
       Service apiService = ApiUtils.getService();
        apiService.getNumbers().enqueue(new Callback<NumbersListPojo>() {
            @Override
            public void onResponse(Call<NumbersListPojo> call, Response<NumbersListPojo> response) {

                allNumbers = response.body().getNumbers();
                presenter.setArray(allNumbers);


            }

            @Override
            public void onFailure(Call<NumbersListPojo> call, Throwable t) {

                presenter.showError();
            }
        });
        return allNumbers;
    }
}
