package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/*
   Tanggal Pengerjaan : 12 Agustus 2019
   NIM : 10116155
   Nama : Rr Savira Maulita Risani
   Kelas : AKB-4
   */

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(getApplicationContext(),
                IntroActivity.class);
        startActivity(intent);
        finish();
    }
}