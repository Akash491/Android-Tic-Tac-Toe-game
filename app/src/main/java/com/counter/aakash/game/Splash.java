package com.counter.aakash.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread td = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                        Intent id=new Intent(Splash.this,MainActivity.class);
                    startActivity(id);
                }

            }


        };td.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}