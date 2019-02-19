package com.test.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConstraintLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);

    }

    public void saveChangeConstraint(View view){
        EditText editTextViewConstraint = findViewById(R.id.constraint_editText);
        String editConstraint = editTextViewConstraint.getText().toString();
        TextView textView = findViewById(R.id.constraint_textView);
        textView.setText(editConstraint);
    }
}
