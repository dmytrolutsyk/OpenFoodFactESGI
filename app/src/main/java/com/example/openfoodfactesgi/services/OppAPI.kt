package com.example.openfoodfactesgi.services

import com.example.openfoodfactesgi.models.ProductDTO
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*


interface OppAPI {

    @GET("product/{codeBar}.json")
    @Headers("Content-Type: application/json")
    fun getProduct(@Path("codeBar") codeBar: String?): Call<getProductResult>
    //fun getProduct(@Path("codeBar") codeBar: String?): Call<ProductDTO?>
}

data class getProduct(val id: String, val productName: String)
data class getProductResult(val error: String, val product: Product)