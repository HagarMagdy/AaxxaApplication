package com.example.hagar.aaxxa.second_screen.pojos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Hagar on 18/07/2018.
 */

public class NumberPojo {
    @SerializedName("id")
    private int id;

    @SerializedName("number")
    private int number;

    public NumberPojo() {
    }

    public NumberPojo(int id, int number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
