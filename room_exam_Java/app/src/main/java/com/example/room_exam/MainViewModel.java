package com.example.room_exam;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Room;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    final AppDatabase db;

    public MainViewModel(@NonNull Application application) {
        super(application);

        db = Room.databaseBuilder(application, AppDatabase.class, "todo-db").build();

    }

    public LiveData<List<Todo>> getAll() {
        return db.todoDao().getAll();
    }

    public void insert(Todo todo) {
        new InsertAsyncTask(db.todoDao()).execute(todo);
    }

    private static class InsertAsyncTask extends AsyncTask<Todo, Void, Void> {
        private TodoDao mTododao;

        public InsertAsyncTask(TodoDao todoDao) {
            this.mTododao = todoDao;
        }

        @Override
        protected Void doInBackground(Todo ... todos) {
            mTododao.insert(todos[0]);
            return null;
        }
    }
}
