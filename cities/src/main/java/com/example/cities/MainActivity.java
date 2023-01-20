package com.example.cities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.btn_imageFragmentFirst);
        Button button2 = findViewById(R.id.btn_imageFragmentSecond);

        FirstImageFragment firstImageFragment = new FirstImageFragment();
        SecondImageFragment secondImageFragment = new SecondImageFragment();

        button1.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, firstImageFragment).addToBackStack(null).commit());
        button2.setOnClickListener(v -> getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, secondImageFragment).addToBackStack(null).commit());
    }
}