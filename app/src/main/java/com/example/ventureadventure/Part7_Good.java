package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part7_Good extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part7__good);
    }

    public void goToPart8(View view) {
        Intent i;
        i = new Intent(this, Part8.class);
        startActivity(i);
    }
}
