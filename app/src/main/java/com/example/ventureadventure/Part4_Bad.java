package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part4_Bad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4__bad);
    }

    public void goToPart5(View view) {
        Intent i;
        i = new Intent(this, Part5.class);
        startActivity(i);
    }
}
