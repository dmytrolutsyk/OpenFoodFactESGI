package com.example.openfoodfactesgi.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkProviderOppAPI {
    lateinit var instance: NetworkProviderOppAPI
    var retrofit: Retrofit

    init {
         retrofit = Retrofit.Builder()
            .baseUrl("https://world.openfoodfacts.org/api/v0/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun<T> buildService(service: Class<T>): T{
        return retrofit.create(service)
    }

}