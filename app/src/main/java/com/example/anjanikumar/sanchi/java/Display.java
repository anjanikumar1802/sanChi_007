package com.example.anjanikumar.sanchi.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.anjanikumar.sanchi.R;

public class Display extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        imageView = findViewById(R.id.album_display);
        imageView.setImageResource(getIntent().getIntExtra("image_id",00));
    }
}
