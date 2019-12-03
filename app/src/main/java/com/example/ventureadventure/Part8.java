package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part8);
    }

    public void goToPart8Good(View view) {
        Intent i;
        i = new Intent(this,Part8_Good.class);
        startActivity(i);
    }

    public void goToPart8Bad(View view) {
        Intent i;
        i = new Intent(this,Part8_Bad.class);
        startActivity(i);
    }
}
