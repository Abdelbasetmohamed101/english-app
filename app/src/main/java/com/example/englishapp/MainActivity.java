package com.example.englishapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageButton colors,family;

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        colors=findViewById(R.id.imageButton2);
        family=findViewById(R.id.imageButton3);
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent  colors_intent = new Intent(MainActivity.this, colorsActivity.class);
                startActivity(colors_intent);
            }
        });
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent  family_intent = new Intent(MainActivity.this, familyActivity.class);
                startActivity(family_intent);
            }
        });
    }
}