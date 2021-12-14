package com.eggyfawwas.myquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LihatHasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_hasil);
        getSupportActionBar().hide();

    }

    public void kembali(View view) {
        Intent intent = new Intent(LihatHasilActivity.this, ReportActivity.class);
        startActivity(intent);
    }
}