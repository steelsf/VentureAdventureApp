package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part3_Bad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3__bad2);
    }

    public void goToPart4(View view) {
        Intent i;
        i = new Intent(this, Part4.class);
        startActivity(i);
    }

    public void goToBeginning(View view) {
        Intent i;
        i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
