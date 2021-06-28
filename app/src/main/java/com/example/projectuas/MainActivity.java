package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView tebak, resep, youtube, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tebak = findViewById(R.id.tebak);
        resep = findViewById(R.id.resep);
        youtube = findViewById(R.id.youtube);
        profile = findViewById(R.id.profile);


//        animasi ketika tombol di tekan
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);


        tebak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent tbk = new Intent(MainActivity.this, TebakBuah.class);
                startActivity(tbk);
            }
        });

        resep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setAnimation(anim);
                Intent resep = new Intent(MainActivity.this, ResepNusantara.class);
                startActivity(resep);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setAnimation(anim);
                Intent youtube = new Intent(MainActivity.this, PemutarYoutube.class);
                startActivity(youtube);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setAnimation(anim);
                Intent profil = new Intent(MainActivity.this, ProfileSaya.class);
                startActivity(profil);
            }
        });
    }
}