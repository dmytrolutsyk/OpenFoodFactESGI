package com.example.openfoodfactesgi.dto;
import com.google.gson.annotations.SerializedName

data class DTOSuccess (
        @SerializedName("name") var name: String,
        @SerializedName("isClient") var isClient: Boolean,
        @SerializedName("isBu") var isBu: Boolean,
        @SerializedName("isBuOrigine") var isBuOrigine: Boolean,
        @SerializedName("idPlanning") var idPlanning: Int,
        @SerializedName("nom") var nom: String?
){
}
