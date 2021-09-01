package com.example.memod;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MakePost extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_post);

        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MakePost.this , HomeNew.class);
                startActivity(intent);
            }
        });


        ImageView home = (ImageView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MakePost.this , HomeNew.class);
                startActivity(intent);
            }
        });
        ImageView chart = (ImageView) findViewById(R.id.chart);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MakePost.this , PostActivity.class);
                startActivity(intent);
            }
        });

        ImageView alert = (ImageView) findViewById(R.id.alert);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MakePost.this , Notification.class);
                startActivity(intent);
            }
        });

    }}
