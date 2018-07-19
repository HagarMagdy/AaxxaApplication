package com.example.hagar.aaxxa.first_screen.presenter;


import com.example.hagar.aaxxa.first_screen.activity.MainActivity;
import com.example.hagar.aaxxa.first_screen.data_access_layer.retrofit_control.NumberApiManager;
import com.example.hagar.aaxxa.first_screen.pojos.NumberPojo;
import com.example.hagar.aaxxa.first_screen.view.FirstScreenPresenterInterface;

/**
 * Created by Hagar on 18/07/2018.
 */

public class FirstScreenPresenter implements FirstScreenPresenterInterface {
    NumberApiManager model;
    MainActivity view;

    public FirstScreenPresenter(MainActivity view) {
        this.view = view;
        initModel();
    }
    void initModel(){
        model = new NumberApiManager(this);
    }

    @Override
    public void addNumber(NumberPojo number) {
        model.addNumber(number);
    }

    @Override
    public void showSuccessMessage() {
        view.addedSuccessfully();
    }

    @Override
    public void showErrorMessage() {
      view.failToAddNumber();
    }

    @Override
    public void retrofitError() {
      view.error();
    }
}
