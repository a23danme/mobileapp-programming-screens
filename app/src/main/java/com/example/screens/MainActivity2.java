package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView TextviewForNameAndAge =findViewById(R.id.TextviewForNameAndAge);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            int age = extras.getInt("age");

            String displayText = "Name: " + name + "\nAge: " + age;
            TextviewForNameAndAge.setText(displayText);
        }
    }
}
