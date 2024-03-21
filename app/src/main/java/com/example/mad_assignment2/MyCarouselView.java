package com.example.mad_assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

public class MyCarouselView extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_carousel_view);
        findViewById(R.id.next).setOnClickListener(view->{
            startActivity(new Intent(this,CompanySectors.class));
        });

    }
}