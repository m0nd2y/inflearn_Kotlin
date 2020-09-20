package com.example.room_exam;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.room.Room;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    final AppDatabase db;

    public MainViewModel(@NonNull Application application) {
        super(application);

        db = Room.databaseBuilder(application, AppDatabase.class, "todo-db").build();

    }

    public LiveData<List<Todo>> getAll() {
        return db.todoDao().getAll()
    }
}
