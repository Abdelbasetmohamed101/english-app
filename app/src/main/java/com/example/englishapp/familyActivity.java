package com.example.englishapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class familyActivity extends AppCompatActivity {
    ImageButton father,mother,grand_father,grand_mother;
    MediaPlayer[] mediaPlayer = new MediaPlayer[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_family);
        father=findViewById(R.id.imageButton);
        mother=findViewById(R.id.imageButton5);
        grand_father=findViewById(R.id.imageButton6);
        grand_mother=findViewById(R.id.imageButton7);
        mediaPlayer[0] =MediaPlayer.create(this,R.raw.father);
        mediaPlayer [1]=MediaPlayer.create(this,R.raw.mother);
        mediaPlayer [2]=MediaPlayer.create(this,R.raw.grand_father);
        mediaPlayer [3]=MediaPlayer.create(this,R.raw.grand_mother);
        father.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                    mediaPlayer[0].start();

            }
        });
        mother.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mediaPlayer[1].start();

            }
        });
        grand_father.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mediaPlayer[2].start();

            }
        });
        grand_mother.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mediaPlayer[3].start();
            }
        });



    }
}