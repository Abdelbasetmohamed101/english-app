package com.example.englishapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class colorsActivity extends AppCompatActivity {

    Button white,black,green,blue,red;
    MediaPlayer[] mediaPlayer = new MediaPlayer[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_colors);
        white=findViewById(R.id.button);
        blue=findViewById(R.id.button2);
        red=findViewById(R.id.button3);
        green=findViewById(R.id.button4);
        black=findViewById(R.id.button5);
        mediaPlayer[0] =MediaPlayer.create(this,R.raw.white);
        mediaPlayer [1]=MediaPlayer.create(this,R.raw.blue);
        mediaPlayer [2]=MediaPlayer.create(this,R.raw.red);
        mediaPlayer [3]=MediaPlayer.create(this,R.raw.green);
        mediaPlayer [4]=MediaPlayer.create(this,R.raw.black);
        white.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mediaPlayer[0].start();

            }
        });
        blue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mediaPlayer[1].start();

            }
        });
        red.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mediaPlayer[2].start();

            }
        });
        green.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mediaPlayer[3].start();

            }
        });
        black.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mediaPlayer[4].start();

            }
        });


    }
}