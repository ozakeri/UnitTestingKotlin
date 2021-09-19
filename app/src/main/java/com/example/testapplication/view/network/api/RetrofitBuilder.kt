package com.example.testapplication.view.network.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private const val BaseUrl = "https://5e510330f2c0d300147c034c.mockapi.io/"

    private fun getRetroit(): Retrofit {
        return Retrofit.Builder().baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    val apiService: ApiService = getRetroit().create(ApiService::class.java)
}