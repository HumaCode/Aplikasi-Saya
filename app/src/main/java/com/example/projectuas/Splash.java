package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity {

    TextView judul;
    ImageView bg;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    judul = findViewById(R.id.judul1);
    bg = findViewById(R.id.img);
    lottieAnimationView = findViewById(R.id.lottie);

    bg.animate().translationY(-3000).setDuration(2000).setStartDelay(5000);
    judul.animate().translationY(3000).setDuration(2000).setStartDelay(5000);
    lottieAnimationView.animate().translationY(1400).setDuration(2000).setStartDelay(5000);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                Splash.this.startActivity(i);
                Splash.this.finish();
            }
        }, 3400L);
    }
}