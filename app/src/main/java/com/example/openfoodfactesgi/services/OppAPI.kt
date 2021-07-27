package com.example.openfoodfactesgi.services

import com.example.openfoodfactesgi.models.ProductDTO
import com.example.openfoodfactesgi.models.ProductResponseDTO
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*


interface OppAPI {

    @GET("product/{codeBar}.json")
    //@Headers("Content-Type: application/json")
    fun getProduct(@Path("codeBar") codeBar: String?): Call<ProductResponseDTO?>

}

