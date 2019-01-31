package com.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message_activity);

        TextView message = (TextView) findViewById(R.id.message);
        TextView name = (TextView) findViewById(R.id.name);

        Intent intent = getIntent();
        DataActivity data = intent.getParcelableExtra("Data");

        message.setText("Message" + data.getMessage());
        name.setText("Name:" + data.getName());

    }
}

