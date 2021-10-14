package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//public class MinMaxClass {
    public int Min(int a, int b){
        if(a<b){
            return a;
        }
        else return b;
    }

    public int Max(int a, int b){
        if(a<b){
            return b;
        }
        else return a;
    }
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/
}