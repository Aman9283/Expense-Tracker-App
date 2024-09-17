package com.example.expensemanager.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.expensemanager.R;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //SharedPreferences pref= getSharedPreferences("")
                Intent intent= new Intent(splashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}