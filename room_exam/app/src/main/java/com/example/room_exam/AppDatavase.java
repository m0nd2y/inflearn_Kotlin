package com.example.room_exam;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Todo.class})
public abstract class AppDatavase extends RoomDatabase {
}
