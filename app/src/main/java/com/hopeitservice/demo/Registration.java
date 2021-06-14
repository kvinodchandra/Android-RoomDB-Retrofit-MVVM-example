package com.hopeitservice.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hopeitservice.demo.databinding.ActivityRegistrationBinding;
import com.hopeitservice.demo.mvvn.RegisterViewModel;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_registration);

        ActivityRegistrationBinding binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_registration);

        binding.setRegViewModel(new RegisterViewModel());
        binding.executePendingBindings();
    }

    @BindingAdapter("toastMsg")
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}