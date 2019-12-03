package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part6_Bad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part6__bad2);
    }

    public void goToPart6Good(View view) {
        Intent i;
        i = new Intent(this, Part6_Good.class);
        startActivity(i);
    }
}
