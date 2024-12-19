package com.example.tasklaunchpad

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {

    //Builidng the retrofit instance
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://api.imgflip.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //Connecting to Api
    val apiInterface: ApiInterface by lazy {
        retrofit.create(ApiInterface::class.java)
    }


}