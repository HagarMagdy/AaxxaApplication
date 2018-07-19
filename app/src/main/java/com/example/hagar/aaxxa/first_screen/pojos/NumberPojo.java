package com.example.hagar.aaxxa.first_screen.pojos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Hagar on 18/07/2018.
 */

public class NumberPojo {
    @SerializedName("id")
    private int id;

    @SerializedName("number")
    private String number;

    public NumberPojo() {
    }

    public NumberPojo(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
