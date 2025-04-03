package com.example.calcapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.widget.EditText;
import android.annotation.SuppressLint;

public class MainActivity extends AppCompatActivity {
     EditText pt1,pt2;
     TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        pt1 = findViewById(R.id.pt1);
        pt2 = findViewById(R.id.pt2);
        tv2 = findViewById(R.id.tv2);
    }
    @SuppressLint("SetTextI18n")
    public void Add(android.view.View view) {
        int a = Integer.parseInt(pt1.getText().toString());
        int b = Integer.parseInt(pt2.getText().toString());
        int r = a + b;
        tv2.setText(""+r);
    }
    @SuppressLint("SetTextI18n")
    public void Sub(android.view.View view) {
        int a = Integer.parseInt(pt1.getText().toString());
        int b = Integer.parseInt(pt2.getText().toString());
        int r = a - b;
        tv2.setText(""+r);
    }
    @SuppressLint("SetTextI18n")
    public void Mul(android.view.View view) {
        int a = Integer.parseInt(pt1.getText().toString());
        int b = Integer.parseInt(pt2.getText().toString());
        int r = a * b;
        tv2.setText(""+r);
    }
    @SuppressLint("SetTextI18n")
    public void Div(android.view.View view) {
        int a = Integer.parseInt(pt1.getText().toString());
        int b = Integer.parseInt(pt2.getText().toString());
        int r = a / b;
        tv2.setText(""+r);
    }

}