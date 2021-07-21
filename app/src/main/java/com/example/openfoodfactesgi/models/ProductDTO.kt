package com.example.openfoodfactesgi.models

//import com.example.openfoodfactesgi.services.*
import com.google.gson.annotations.SerializedName


data class ProductResponseDTO(
    @SerializedName("code")
    val code: String,
    @SerializedName("product")
    val product: ProductDTO
)

data class ProductDTO (
    @SerializedName("_id")
    val id: String?,

    @SerializedName("product_name")
    val productName: String?,

    @SerializedName("product_quantity")
    val productQuantity: Long?,

    @SerializedName("brand_owner")
    val brandOwner: String?,

    val categories: String?,
    val labels: String?,
    val countries: String?,
    val stores: String?,

    @SerializedName("manufacturing_places")
    val manufacturingPlaces: String?,

    //@SerializedName("ingredients_debug")
    //val ingredientsDebug: List<String?>?,

    @SerializedName("image_thumb_url")
    val imageThumbURL: String?,

    @SerializedName("nutriscore_grade")
    val nutriscoreGrade: String?,
)

