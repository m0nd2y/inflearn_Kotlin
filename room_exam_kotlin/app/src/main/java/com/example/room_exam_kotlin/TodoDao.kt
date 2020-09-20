package com.example.room_exam_kotlin

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface TodoDao {
    @Query("SELECT * FROM Todo")
    fun getAll(): List<Todo>

    @Insert
    fun insert(todo : Todo)

    @Update
    fun update(todo : Todo)

    @Delete
    fun delete(todo : Todo)
}