package com.informatika.umm.modul_5_mobile.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/*
 * create by Ulfah Nur Oktaviana
 * NIM = 201810370311261
 */

//response dari restaurant yang didapatkan dari retrofit akan dibuat dalam bentuk array
//Dimana memiliki serialLizedname yang sama. ketika data tidak sama maka respon yang ditangkan dari
//retrofit tidak akan terbaca

public class RestaurantResponse {

    @SerializedName("results")
    @Expose
    private List<Restaurant> results = new ArrayList<>();

    public List<Restaurant> getResults() {
        return results;
    }
}
