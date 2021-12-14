package com.eggyfawwas.myquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        getSupportActionBar().hide();

    }

    public void kirimdata(View view) {
        Intent intent = new Intent(CreateActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void report(View view) {
        Intent intent = new Intent(CreateActivity.this, ReportActivity.class);
        startActivity(intent);
    }
}