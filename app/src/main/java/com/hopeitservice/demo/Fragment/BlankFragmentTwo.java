package com.hopeitservice.demo.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hopeitservice.demo.R;

public class BlankFragmentTwo extends Fragment {


    public BlankFragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Print("onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Print("OnCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Print("OnCreateView");
        View view = inflater.inflate(R.layout.fragment_blank_two, container, false);;
        Button button = view.findViewById(R.id.button3);
        button.setOnClickListener(view1->{
//            FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.add(R.id.fragment_section, new BlankFragmentThree());
//            fragmentTransaction.addToBackStack(null);
//            fragmentTransaction.setReorderingAllowed(false);
//            fragmentTransaction.commit();
        });
        return view;
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Print("onActivityCreate");
    }
    @Override
    public void onStart() {
        super.onStart();
        Print("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Print("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Print("onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Print("onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Print("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Print("onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Print("onDetach");
    }

    public void Print(String s){
        Log.e("FragmentTwo", s);
    }
}