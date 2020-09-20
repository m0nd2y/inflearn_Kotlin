package com.example.room_exam_kotlin

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    var title : String
) {
    @PrimaryKey(autoGenerate = true) val id: Int = 0
}