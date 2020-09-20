package com.example.room_exam_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
                applicationContext,
                Appdatabase::class.java, "db"
        ).build()

        db.todoDao().getAll().observe(this, Observer { todos ->
            result_text.text = todos.toString()
        })


        add_button.setOnClickListener {
            db.todoDao().insert(Todo(todo_edit.text.toString()))
        }

    }
}