package com.example.tasklaunchpad

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("get_memes")
    fun getData(): Call<responceDataClass>
}