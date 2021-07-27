package com.example.openfoodfactesgi.services

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers

import retrofit2.http.POST




interface ApiServicies {
    @POST("auth/login")
    @Headers("Content-Type: application/json")
    fun login(@Body body: JsonObject?): Call<JsonObject?>
}