package com.hopeitservice.demo.Room_DB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "todo")
public
class DBModel {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "subject")
    private String subject;
    @ColumnInfo(name = "task")
    private String task;

    public DBModel( String subject, String task) {
        this.subject = subject;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
