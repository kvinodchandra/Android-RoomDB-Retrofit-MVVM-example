package com.hopeitservice.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.hopeitservice.demo.Dagger.Api;
import com.hopeitservice.demo.Hero;
import com.hopeitservice.demo.Main2Activity;
import com.hopeitservice.demo.R;
import com.hopeitservice.demo.Retrofit.APIServices;
import com.hopeitservice.demo.Retrofit.RetroModel;
import com.hopeitservice.demo.Retrofit.RetroService;
import com.hopeitservice.demo.RoomDB;
import com.hopeitservice.demo.mvvn.AppViewModel;
import com.hopeitservice.demo.databinding.ActivityMainBinding;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private String TAG = getClass().getName();
    @Inject
    Retrofit retrofit;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new AppViewModel());
        activityMainBinding.executePendingBindings();

        RetroService service = APIServices.getRetrofitInstance().create(RetroService.class);

        Call<List<RetroModel>> list = service.getAllPhotos();

        list.enqueue(new Callback<List<RetroModel>>() {
            @Override
            public void onResponse(Call<List<RetroModel>> call, Response<List<RetroModel>> response) {
                for (RetroModel s : response.body()){
                    Log.e("Title", s.getTitle());
                    Log.e("URL", s.getUrl());
                    Log.e("THUM_URL", s.getTumnailUrl());
                }
            }

            @Override
            public void onFailure(Call<List<RetroModel>> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void onClickButton(View view){
        //throw new RuntimeException("Test Crash");
        startActivity(new Intent(getApplicationContext(), Main2Activity.class));
    }

    private void getHeroes() {
        Api api = retrofit.create(Api.class);
        Call<List<Hero>> call = api.getHeroes();

        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {

                List<Hero> heroList = response.body();
                String[] heroes = new String[heroList.size()];

                for (int i = 0; i < heroList.size(); i++) {
                    heroes[i] = heroList.get(i).getName();
                }

                listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, heroes));
            }

            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
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

//    public void selectFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(R.id.fragment_section, new BlankFragmentOne());
//        fragmentTransaction.addToBackStack(null);
////        fragmentTransaction.setReorderingAllowed(true);
//        fragmentTransaction.commit();
//    }

//    public void selectFragmentTwo(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.fragment_section, new BlankFragmentTwo());
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.setReorderingAllowed(true);
//        fragmentTransaction.commit();
//    }


    // any change in toastMessage attribute
    // defined on the Button with bind prefix
    // invokes this method
    @BindingAdapter({"toastMessage"})
    public static void runMe( View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onClickRegister(View v){
        startActivity(new Intent(getApplicationContext(), RoomDB.class));

    }
}
