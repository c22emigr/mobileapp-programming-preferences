package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView TextView;
    SharedPreferences Preferences;
    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView = findViewById(R.id.TextView);
        Preferences = getSharedPreferences("Preferences", MODE_PRIVATE);
        Button = findViewById(R.id.Button);
        Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(Intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        String name = Preferences.getString("name", "inget namn hittades");
        TextView.setText(name);
    }
}
