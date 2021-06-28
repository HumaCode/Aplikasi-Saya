package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class ProfileSaya extends AppCompatActivity {

    Button alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_saya);

        alamat = findViewById(R.id.almt);

        //        animasi ketika tombol di tekan
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);

        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setAnimation(anim);
                Intent alamat = new Intent(ProfileSaya.this, AlamatSaya.class);
                startActivity(alamat);
            }
        });
    }
}