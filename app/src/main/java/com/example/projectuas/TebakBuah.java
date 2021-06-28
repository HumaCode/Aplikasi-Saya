package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class TebakBuah extends AppCompatActivity {

    ImageView imageView_apel, imageView_alpukat, imageView_durian, imageView_ceri,
            imageView_jambuair, imageView_manggis, imageView_pisang,
            imageView_semangka, imageView_mangga, imageView_strauberry;
    Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_buah);

        inisialisasi();



        onClick();
    }

    private void onClick() {
        //        animasi ketika tombol di tekan
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);

//        untuk apel
        imageView_apel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent apel = new Intent(TebakBuah.this, JawabanTb.class);
                apel.putExtra("nama_buah", "apel");
                startActivity(apel);
            }
        });

        imageView_alpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent alpukat = new Intent(TebakBuah.this, JawabanTb.class);
                alpukat.putExtra("nama_buah", "alpukat");
                startActivity(alpukat);
            }
        });

        imageView_durian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent durian = new Intent(TebakBuah.this, JawabanTb.class);
                durian.putExtra("nama_buah", "durian");
                startActivity(durian);
            }
        });

        imageView_ceri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent ceri = new Intent(TebakBuah.this, JawabanTb.class);
                ceri.putExtra("nama_buah", "ceri");
                startActivity(ceri);
            }
        });

        imageView_jambuair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent jambu = new Intent(TebakBuah.this, JawabanTb.class);
                jambu.putExtra("nama_buah", "jambu air");
                startActivity(jambu);
            }
        });

        imageView_manggis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent manggis = new Intent(TebakBuah.this, JawabanTb.class);
                manggis.putExtra("nama_buah", "manggis");
                startActivity(manggis);
            }
        });

        imageView_pisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent pisang = new Intent(TebakBuah.this, JawabanTb.class);
                pisang.putExtra("nama_buah", "pisang");
                startActivity(pisang);
            }
        });

        imageView_semangka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent semangka = new Intent(TebakBuah.this, JawabanTb.class);
                semangka.putExtra("nama_buah", "semangka");
                startActivity(semangka);
            }
        });

        imageView_mangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent mangga = new Intent(TebakBuah.this, JawabanTb.class);
                mangga.putExtra("nama_buah", "mangga");
                startActivity(mangga);
            }
        });

        imageView_strauberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent berry = new Intent(TebakBuah.this, JawabanTb.class);
                berry.putExtra("nama_buah", "strawberry");
                startActivity(berry);
            }
        });

//        tombol kembali
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent back = new Intent(TebakBuah.this, MainActivity.class);
                startActivity(back);
            }
        });
    }

    private void inisialisasi() {
        imageView_apel = findViewById(R.id.imageView_apel);
        imageView_alpukat = findViewById(R.id.imageView_alpukat);
        imageView_durian = findViewById(R.id.imageView_durian);
        imageView_ceri = findViewById(R.id.imageView_ceri);
        imageView_jambuair = findViewById(R.id.imageView_jambuair);
        imageView_manggis = findViewById(R.id.imageView_manggis);
        imageView_pisang = findViewById(R.id.imageView_pisang);
        imageView_semangka = findViewById(R.id.imageView_semangka);
        imageView_mangga = findViewById(R.id.imageView_mangga);
        imageView_strauberry = findViewById(R.id.imageView_strauberry);
        kembali = findViewById(R.id.kembali);


    }
}