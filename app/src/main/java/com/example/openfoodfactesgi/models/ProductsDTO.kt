package com.example.openfoodfactesgi.models

import com.example.openfoodfactesgi.services.Product
import com.google.gson.annotations.SerializedName

data class ProductsDTO (
    val product: Product,

    @SerializedName("status_verbose")
    val statusVerbose: String
)