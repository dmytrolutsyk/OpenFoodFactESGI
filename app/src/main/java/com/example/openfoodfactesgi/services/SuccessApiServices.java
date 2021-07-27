package com.example.openfoodfactesgi.services;

import com.google.gson.JsonObject;

public interface SuccessApiServices {
    @GET("success/getSuccess")
    fun getSuccess(): Call<List<BuDTO?>>
}
