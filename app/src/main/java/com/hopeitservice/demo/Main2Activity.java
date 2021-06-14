package com.hopeitservice.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    private String TAG = getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e(TAG, "onCreate");

        MyListData[] myListData = new MyListData[]{
        new MyListData("Email", android.R.drawable.ic_dialog_email),
        new MyListData("Info", android.R.drawable.ic_dialog_info),
        new MyListData("Delete", android.R.drawable.ic_delete),
        new MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
        new MyListData("Alert", android.R.drawable.ic_dialog_alert),
        new MyListData("Map", android.R.drawable.ic_dialog_map),
        new MyListData("Email", android.R.drawable.ic_dialog_email),
        new MyListData("Info", android.R.drawable.ic_dialog_info),
        new MyListData("Delete", android.R.drawable.ic_delete),
        new MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
        new MyListData("Alert", android.R.drawable.ic_dialog_alert),
        new MyListData("Map", android.R.drawable.ic_dialog_map),
        };

        RecyclerView recyclerView = findViewById(R.id.rcv_list);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public void myFun(){
        Log.e("my func", "run");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }
}
