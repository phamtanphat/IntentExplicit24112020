package com.example.intentexplicit24112020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendString(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("chuoi","Hello");
        startActivity(intent);
    }
}