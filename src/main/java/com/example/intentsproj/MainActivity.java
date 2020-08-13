package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.view.Gravity.*;

public class MainActivity<TOP, LEFT> extends AppCompatActivity {
    private Button button;
    private Intent SecondActivityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }

        });

    }


        public void openSecondActivity() {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(SecondActivityIntent);
        }
    }