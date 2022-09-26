package com.example.myapplication.controller;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



import com.example.myapplication.R;


public class NovasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novas);
        Intent intent = this.getIntent();

        if(intent != null ) {
            String title = intent.getStringExtra("title");

            TextView news_title = findViewById(R.id.text_view_titulo);

            news_title.setText(title);


        }
    }
}