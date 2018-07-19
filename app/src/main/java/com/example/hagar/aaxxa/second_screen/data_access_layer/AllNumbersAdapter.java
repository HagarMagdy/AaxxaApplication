package com.example.hagar.aaxxa.second_screen.data_access_layer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hagar.aaxxa.R;
import com.example.hagar.aaxxa.second_screen.data_access_layer.retrofit_control.AllNumbersApiManager;
import com.example.hagar.aaxxa.second_screen.pojos.NumberPojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hagar on 18/07/2018.
 */

public class AllNumbersAdapter extends ArrayAdapter {
    ArrayList<NumberPojo> numbers;
    Context mycontext;

    public AllNumbersAdapter(@NonNull Context context,int id,int num, int resource, @NonNull ArrayList<NumberPojo> objects) {
        super(context, resource, objects);
        mycontext=context;
        this.numbers=objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = null;
        LayoutInflater inflater=(LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        row = inflater.inflate(R.layout.cell,parent,false);

        TextView id =(TextView ) row.findViewById(R.id.theid);
        TextView number = (TextView)row.findViewById(R.id.num);
        // set the row values
        id.setText(Integer.toString(numbers.get(position).getId()));
        number.setText(Integer.toString(numbers.get(position).getNumber()));

        return row;
    }

}
