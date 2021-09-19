package com.example.testapplication.view.dao

import com.example.testapplication.view.network.model.User

interface DatabaseHelper {

    suspend fun getAll(): List<User>

    suspend fun insertAll(list: List<User>)
}