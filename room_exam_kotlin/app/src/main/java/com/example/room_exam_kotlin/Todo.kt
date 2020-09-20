package com.example.room_exam_kotlin

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Todo(@PrimaryKey(autoGenerate = true) val id: Int, var title : String) {

}