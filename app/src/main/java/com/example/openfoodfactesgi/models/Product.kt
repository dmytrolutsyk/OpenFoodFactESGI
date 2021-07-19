package com.example.openfoodfactesgi.models

import com.google.gson.annotations.SerializedName

/*data class Product(
    var id: String,
    var productName: String
    )*/
class Product {
    @SerializedName("_id")
    public var _id: String? = null

    @SerializedName("productName")
    public var productName: String? = null

    constructor(_id: String?, productName: String? ){
        this._id = _id
        this.productName = productName
    }

    override fun toString(): String {
        return "Product(_id= $_id, productName= $productName)"
    }

}