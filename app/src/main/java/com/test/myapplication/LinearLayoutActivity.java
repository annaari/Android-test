package com.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

    }

    public void saveChangeLinear(View view){
        EditText editTextViewLinear = findViewById(R.id.linear_editText);
        String editLinear = editTextViewLinear.getText().toString();
        TextView textViewLinear = findViewById(R.id.linear_textView);
        textViewLinear.setText(editLinear);
    }
}
