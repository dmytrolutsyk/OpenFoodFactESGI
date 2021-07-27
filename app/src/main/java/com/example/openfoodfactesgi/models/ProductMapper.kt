package com.example.openfoodfactesgi.models

class ProductMapper {
    companion object{

        fun map(productDto: ProductDTO?): Product {
            var id = "null"
            var productName = "null"
            if (productDto != null) {
                id = productDto.id
            }
            if (productDto != null) {
                productName = productDto.productName
            }
            return Product(id, productName);
        }
    }

}