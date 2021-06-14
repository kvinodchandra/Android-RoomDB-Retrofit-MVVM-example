package com.hopeitservice.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.hopeitservice.demo.Room_DB.DBModel;
import com.hopeitservice.demo.Room_DB.ToDaDB;

import java.util.List;

import static com.hopeitservice.demo.Room_DB.ToDaDB.EXECUTOR_SERVICE;

public class RoomDB extends AppCompatActivity {

    private EditText et_sub, et_task;
    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_db);

        ToDaDB db = ToDaDB.getInstance(this);

        et_sub = findViewById(R.id.et_sub);
        et_task = findViewById(R.id.et_task);
        btn_submit = findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(view -> {
           String sub =  et_sub.getText().toString();
           String tsk =  et_task.getText().toString();
            DBModel dbm = new DBModel(sub, tsk);
          //  new Thread(()->{
            EXECUTOR_SERVICE.execute(()->{
                db.dao().insertToDo(dbm);
            });

            //}).start();
        });

       // db.dao().getToDoList();
      //  new Thread(() -> {
            db.dao().getToDoList().observe(this, dbModels -> {
                for (DBModel m: dbModels){
                    Log.e("Subject", m.getSubject());
                    Log.e("Task", m.getTask());
                }
            });
       // }).start();

    }
}