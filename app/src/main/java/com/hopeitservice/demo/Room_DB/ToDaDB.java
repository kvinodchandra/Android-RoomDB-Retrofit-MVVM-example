package com.hopeitservice.demo.Room_DB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = { DBModel.class }, version = 1)
public abstract class ToDaDB extends RoomDatabase {
    private static ToDaDB db= null;
    public static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(4);

    public static synchronized ToDaDB getInstance(Context c) {
        if (db==null) {
            db = Room.databaseBuilder(c.getApplicationContext(),
                    ToDaDB.class, "todo_db")
                    .build();
        }
        return db;
    }

    public abstract DAO dao();
}
