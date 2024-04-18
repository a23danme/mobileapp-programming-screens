package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startMainActivity2= findViewById(R.id.button);
        startMainActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the SecondActivity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", "Daniel"); // Optional
                intent.putExtra("age", 24);  // Optional
                startActivity(intent);
            }
        });
    }
}
