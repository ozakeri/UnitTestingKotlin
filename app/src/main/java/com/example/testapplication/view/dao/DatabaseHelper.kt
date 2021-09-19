package com.example.testapplication.view.dao

interface DatabaseHelper {

    suspend fun getAll(): List<UserEntity>

    suspend fun insertAll(list: List<UserEntity>)
}