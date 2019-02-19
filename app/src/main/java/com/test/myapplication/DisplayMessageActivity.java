package com.test.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message_activity);

        Music music = getIntent().getParcelableExtra("Music");

        TextView textViewMusic = findViewById(R.id.music);


        textViewMusic.setText(music.getSong() + " by " + music.getArtist());

    }

    public void goToFramePage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this,
                FrameLayoutActivity.class);

        startActivity(intent);
    }

    public void goToLinearPage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this,
                LinearLayoutActivity.class);

        startActivity(intent);
    }

    public void goToConstraintPage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this,
                ConstraintLayoutActivity.class);

        startActivity(intent);
    }
}

