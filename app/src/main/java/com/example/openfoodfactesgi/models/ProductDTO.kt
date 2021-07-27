package com.example.openfoodfactesgi.models

//import com.example.openfoodfactesgi.services.*
import com.google.gson.annotations.SerializedName


data class ProductDTO (
    @SerializedName("_id")
    val id: String,

    @SerializedName("product_name")
    val productName: String,
)