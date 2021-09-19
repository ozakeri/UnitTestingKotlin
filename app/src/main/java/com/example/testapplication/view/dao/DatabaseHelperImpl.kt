package com.example.testapplication.view.dao

import com.example.testapplication.view.network.model.User

class DatabaseHelperImpl(val appDatabase: AppDatabase) : DatabaseHelper {

    override suspend fun getAll(): List<User> = appDatabase.userDao().getAll()

    override suspend fun insertAll(list: List<User>) = appDatabase.userDao().insertAll(list)
}