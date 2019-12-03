package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part9);
    }

    public void goToPart9Bad(View view) {
        Intent i;
        i = new Intent(this, Part9_Bad.class);
        startActivity(i);
    }

    public void goToPart9Good(View view) {
        Intent i;
        i = new Intent(this, Part9_Good.class);
        startActivity(i);
    } //fixed

}
