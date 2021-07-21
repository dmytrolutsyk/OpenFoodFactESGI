package com.example.openfoodfactesgi.models

class ProductMapper {
    companion object{
        fun mapProductFromResponse(dto: ProductResponseDTO?): Product{
                return Product(
                    dto?.product?.id,
                    dto?.product?.productName,
                    dto?.product?.productQuantity,
                    dto?.product?.brandOwner,
                    dto?.product?.categories,
                    dto?.product?.labels,
                    dto?.product?.countries,
                    dto?.product?.stores,
                    dto?.product?.manufacturingPlaces,
                    //dto?.product?.ingredientsDebug,
                    dto?.product?.imageThumbURL,
                    dto?.product?.nutriscoreGrade)
        }
    }

}