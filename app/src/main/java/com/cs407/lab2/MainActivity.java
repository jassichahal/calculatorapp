package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToActivity(String s) {
        Log.i("INFO",s);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }
}