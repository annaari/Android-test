package com.test.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.halcyonmobile.learning.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this,
                DisplayMessageActivity.class);
        EditText editTextArtist = findViewById(R.id.artist);
        EditText editTextSong = findViewById(R.id.song);
        String artist = editTextArtist.getText().toString();
        String song = editTextSong.getText().toString();

        Music music = new Music(artist,song);
        intent.putExtra("Music", music);
        startActivity(intent);
    }
}