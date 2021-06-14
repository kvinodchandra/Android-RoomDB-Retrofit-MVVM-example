package com.hopeitservice.demo.Room_DB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DAO {
    @Query("Select * from todo")
    LiveData<List<DBModel>> getToDoList();

    @Insert
    void insertToDo(DBModel dbModel);

    @Update
    void updateToDo(DBModel dbModel);

    @Delete
    void deletePerson(DBModel dbModel);

    @Query("Select * from todo where id IN (:id)")
    List<DBModel> findById(int id);

}
