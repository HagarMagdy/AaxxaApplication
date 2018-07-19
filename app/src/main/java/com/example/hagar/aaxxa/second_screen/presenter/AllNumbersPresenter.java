package com.example.hagar.aaxxa.second_screen.presenter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hagar.aaxxa.R;
import com.example.hagar.aaxxa.second_screen.activity.AllNumbers;
import com.example.hagar.aaxxa.second_screen.data_access_layer.retrofit_control.AllNumbersApiManager;
import com.example.hagar.aaxxa.second_screen.pojos.NumberPojo;
import com.example.hagar.aaxxa.second_screen.pojos.NumbersListPojo;
import com.example.hagar.aaxxa.second_screen.view.AllNumbersPresenterInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hagar on 18/07/2018.
 */

public class AllNumbersPresenter implements AllNumbersPresenterInterface  {
    AllNumbersApiManager model;
    AllNumbers view;

    void initModel(){
        model = new AllNumbersApiManager(this);
    }


    public AllNumbersPresenter(AllNumbers view) {
        this.view = view;
        initModel();
    }

    @Override
    public void setArray(ArrayList<NumberPojo> numbers) {
     view.getNumbers(numbers);
    }

    @Override
    public void showError() {
    view.showError();
    }

    @Override
    public void getAll() {
        model.getAllNumbers();
    }


}
