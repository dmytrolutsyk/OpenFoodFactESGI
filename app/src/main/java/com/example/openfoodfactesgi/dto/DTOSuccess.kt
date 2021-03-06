package com.example.openfoodfactesgi.dto

import com.google.gson.annotations.SerializedName

data class DTOSuccess(
    @SerializedName("_id") var idSuccess: String,
    @SerializedName("name") var name: String,
    @SerializedName("description") var description: String,
    @SerializedName("image") var image: String,
) {
}