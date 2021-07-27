package com.example.openfoodfactesgi.services

import android.support.annotation.NonNull
import android.util.Log
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object NetworkProviderAPI {
    lateinit var instance: NetworkProviderAPI
    var retrofit: Retrofit
    private lateinit var apiServices: ApiServicies

    init {
        retrofit = Retrofit.Builder()
            .baseUrl("https://food-fact.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun<T> buildService(service: Class<T>): T{
        return retrofit.create(service)
    }

    fun login(
        login: String?,
        password: String?
    ): String {
        var res: String = ""
        val jsonObject = JsonObject()
        jsonObject.addProperty("login", login)
        jsonObject.addProperty("password", password)
        val call: Call<JsonObject?> = apiServices.login(jsonObject)
        call.enqueue(object : Callback<JsonObject?> {
            override fun onResponse(
                @NonNull call: Call<JsonObject?>?,
                @NonNull response: Response<JsonObject?>
            ) {
                val list: JsonObject? = response.body()
                Log.d("testco", response.body().toString())
                res = response.body().toString()
            }

            override fun onFailure(@NonNull call: Call<JsonObject?>?, @NonNull t: Throwable?) {}
        })
        return res
    }
}