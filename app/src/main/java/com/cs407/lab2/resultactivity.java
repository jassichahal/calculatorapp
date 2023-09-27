package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class resultactivity extends AppCompatActivity {
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultactivity);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String operation = intent.getStringExtra("operation");
        textView.setText("Result: " + operation);


       // switch(Objects.requireNonNull(operation)) {

            //int num1 = 0;
///            int result;
            //case '+':
             //   result = num1 + num2;
              //  break;
           // case '-':
             //   result = num1 - num2;
             //   break;
           // case 'X':
            //    result = num1 * num2;
             //   break;
          //  case '/':
               // result = num1 / num2;
//
       // }
    }

}