package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part8_Good extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part8__good);
    }

    public void goToPart9(View view) {
        Intent i;
        i = new Intent(this,Part9.class);
        startActivity(i);
    }
}
