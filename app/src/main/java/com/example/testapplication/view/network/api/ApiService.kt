package com.example.testapplication.view.network.api

import com.example.testapplication.view.network.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

    @GET ("more-users")
    suspend fun getMoreUsers(): List<User>

    @GET("error")
    suspend fun getUsersWithError(): List<User>
}