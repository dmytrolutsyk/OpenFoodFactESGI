package com.example.openfoodfactesgi

import com.example.openfoodfactesgi.models.Product

class Singleton {
     companion object {
        var productObject: Product? = null
        }
        /*var instance = null

        var productModel: Product? = null
        fun getInstance(): Singleton {
            print("init")
            if (instance == null) {
                instance = Singleton
            }
            return instance
        }*/
    }


