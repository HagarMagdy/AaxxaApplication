package com.example.hagar.aaxxa.first_screen.view;


import com.example.hagar.aaxxa.first_screen.pojos.NumberPojo;

/**
 * Created by Hagar on 18/07/2018.
 */

public interface FirstScreenPresenterInterface {
    void addNumber(NumberPojo number);
    void showSuccessMessage();
    void showErrorMessage();
    void retrofitError();
}
