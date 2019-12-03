package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4);
    }

    public void goToPart5(View view) {
        Intent i;
        i = new Intent(this, Part5.class);
        startActivity(i);
    }

    public void goToPart4Bad(View view) {
        Intent i;
        i = new Intent(this, Part4_Bad.class);
        startActivity(i);
    }
}
