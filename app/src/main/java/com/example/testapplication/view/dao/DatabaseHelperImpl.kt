package com.example.testapplication.view.dao

class DatabaseHelperImpl(val appDatabase: AppDatabase) : DatabaseHelper {

    override suspend fun getAll(): List<UserEntity> = appDatabase.userDao().getAll()

    override suspend fun insertAll(list: List<UserEntity>) = appDatabase.userDao().insertAll(list)
}