package com.example.openfoodfactesgi.models

data class Product(
    var id: String?,
    var productName: String?,
    val productQuantity: Long?,
    val brandOwner: String?,
    val categories: String?,
    val labels: String?,
    val countries: String?,
    val stores: String?,
    val manufacturingPlaces: String?,
    //val ingredientsDebug: List<String?>,
    val imageThumbURL: String?,
    val nutriscoreGrade: String?,
)
