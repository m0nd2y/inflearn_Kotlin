package com.example.room_exam_kotlin

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Todo::class], version = 1)
abstract class Appdatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}