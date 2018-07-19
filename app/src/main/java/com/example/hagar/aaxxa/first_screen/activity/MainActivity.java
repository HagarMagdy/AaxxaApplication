package com.example.hagar.aaxxa.first_screen.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hagar.aaxxa.R;
import com.example.hagar.aaxxa.first_screen.pojos.NumberPojo;
import com.example.hagar.aaxxa.first_screen.presenter.FirstScreenPresenter;
import com.example.hagar.aaxxa.first_screen.view.MainActivityInterface;
import com.example.hagar.aaxxa.second_screen.activity.AllNumbers;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainActivityInterface {

    FirstScreenPresenter presenter;

    @BindView(R.id.numbers)
    EditText numbers;

    @BindView(R.id.add)
    Button add;

    @BindView(R.id.show)
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new FirstScreenPresenter(this);

    }


    @OnClick(R.id.add)
    public void add(View view) {
        NumberPojo obj = new NumberPojo();

        String number = numbers.getText().toString();
        String regex = "\\d+";
        if (number.matches("[0-9]+"))
        {
            obj.setNumber(number);
            presenter.addNumber(obj);
        } else {
            Toast.makeText(getApplicationContext(), "Only numbers are allowed", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.show)
    public void show(View view) {
        Intent intent = new Intent(MainActivity.this, AllNumbers.class);
        startActivity(intent);
    }

    @Override
    public void addedSuccessfully() {
        Toast.makeText(getApplicationContext(), "Number Added Successfully", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failToAddNumber() {
        Toast.makeText(getApplicationContext(), "Failed to add the number", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void error() {
        Toast.makeText(getApplicationContext(), "Network error", Toast.LENGTH_SHORT).show();

    }
}
