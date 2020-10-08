package com.example.countapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
    }

    public void increment(View view) {
        count++;
        tv.setText(""+count);
    }

    public void resetCount(View view) {
        count = 0;
        tv.setText(""+count);
    }

    public void dicreament(View view) {
        if(count>0){
            count--;
            tv.setText(""+count);
        }
    }
}