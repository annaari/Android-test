package com.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.appcompat.app.AppCompatActivity;

import static com.test.myapplication.R.id.frame_textView;

public class FrameLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);

    }

    public void saveChangeFrame(View view){
        EditText editTextView = findViewById(R.id.frame_editText);
        String edit = editTextView.getText().toString();
        TextView textView = findViewById(R.id.frame_textView);
        textView.setText(edit);
    }
}
