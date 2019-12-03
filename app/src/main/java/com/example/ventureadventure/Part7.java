package com.example.ventureadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Part7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part7);
    }

    public void goToPart7Bad(View view) {
        Intent i;
        i = new Intent(this,Part7_Bad.class);
        startActivity(i);
    }

    public void goToPart7Good(View view) {
        Intent i;
        i = new Intent(this, Part7_Good.class);
        startActivity(i);
    }
}
