package com.example.testapplication.view.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.testapplication.view.network.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    suspend fun getAll(): List<User>

    @Insert
    suspend fun insertAll(list: List<User>)
}