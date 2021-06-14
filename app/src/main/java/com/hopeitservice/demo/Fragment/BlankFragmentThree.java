package com.hopeitservice.demo.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hopeitservice.demo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragmentThree#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragmentThree extends Fragment {


    public BlankFragmentThree() {
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
        Print("onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Print("onCreateView");
        return inflater.inflate(R.layout.fragment_blank_three, container, false);
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
        Log.e("FragmentThree", s);
    }

}