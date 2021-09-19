package com.example.testapplication.view.network.api

import com.example.testapplication.view.network.model.User
import retrofit2.http.GET

interface ApiHelper {
    suspend fun getUsers(): List<User>

    suspend fun getMoreUsers(): List<User>

    suspend fun getUsersWithError(): List<User>
}