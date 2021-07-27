package com.example.openfoodfactesgi.services


import com.example.openfoodfactesgi.dto.DTOSuccess
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface SuccessApiService {

    @GET("/success/getSuccess")
    fun getSuccess(): Call<List<DTOSuccess?>>
}