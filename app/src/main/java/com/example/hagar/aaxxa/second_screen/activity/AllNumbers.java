package com.example.hagar.aaxxa.second_screen.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hagar.aaxxa.R;
import com.example.hagar.aaxxa.second_screen.data_access_layer.AllNumbersAdapter;
import com.example.hagar.aaxxa.second_screen.pojos.NumberPojo;
import com.example.hagar.aaxxa.second_screen.presenter.AllNumbersPresenter;
import com.example.hagar.aaxxa.second_screen.view.AllNumbersInterface;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AllNumbers extends AppCompatActivity implements AllNumbersInterface {

    @BindView((R.id.list))
     ListView listv;

    AllNumbersPresenter presenter;
    ArrayList<NumberPojo> allNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_numbers);
        ButterKnife.bind(this);
        presenter = new AllNumbersPresenter(this);
        presenter.getAll();
    }


    @Override
    public void getNumbers(ArrayList<NumberPojo> numbers) {
        // set the adapter with the numbers list
        AllNumbersAdapter adapter=new AllNumbersAdapter(this,R.id.theid,R.id.num,R.layout.cell,numbers);

        listv.setAdapter(adapter);
    }

    @Override
    public void showError() {
        Toast.makeText(getApplicationContext(), "Network error", Toast.LENGTH_SHORT).show();

    }
}
