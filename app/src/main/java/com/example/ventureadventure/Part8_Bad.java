package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part8_Bad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part8__bad);
    }

    public void goToPart8Good(View view) {
        Intent i;
        i = new Intent(this,Part8_Good.class);
        startActivity(i);
    }

    public void goToBeginning(View view) {
        Intent i;
        i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
