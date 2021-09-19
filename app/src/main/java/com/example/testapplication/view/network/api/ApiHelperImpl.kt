package com.example.testapplication.view.network.api

import com.example.testapplication.view.network.model.User

class ApiHelperImpl(val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): List<User> = apiService.getUsers()

    override suspend fun getMoreUsers(): List<User> = apiService.getMoreUsers()

    override suspend fun getUsersWithError(): List<User> = apiService.getUsersWithError()

}