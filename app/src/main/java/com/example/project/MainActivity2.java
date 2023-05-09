package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    SharedPreferences Preferences;
    EditText EditText;
    Button Back;
    Button Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText = findViewById(R.id.EditText);
        Button = findViewById(R.id.Save);
        Preferences = getSharedPreferences("Preferences", MODE_PRIVATE);
        Back = findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = Preferences.edit();
                editor.putString("EditText", EditText.getText().toString());
                editor.apply();
            }
        });
    }
}