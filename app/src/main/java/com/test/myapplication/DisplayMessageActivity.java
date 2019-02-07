package com.test.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message_activity);

        Music music = getIntent().getParcelableExtra("Music");

        TextView textViewMusic =  findViewById(R.id.music);


        textViewMusic.setText(music.getSong()+" by "+ music.getArtist());



    }
}

