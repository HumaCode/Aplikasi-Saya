package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class JawabanTb extends AppCompatActivity {

    ImageView tbk_img;
    EditText jawab;
    Button cek, suara;
    private String jawaban;
    Dialog dialog;
    MediaPlayer sAlpukat, sApel, sCeri, sDurian,
            sJambu, sManggis, sStrawberry, sMangga, sPisang, sSemangka, benar, gagal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawaban_tb);

        inisialisasi();
        cekIntent();
        cekJawaban();
    }

    private void cekJawaban() {

        //        animasi ketika tombol di tekan
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                if(jawab.getText().toString().equals(jawaban)) {
                    benar();
                }else{
                    salah();
                }
            }
        });
    }

    private void salah() {
        dialog.setContentView(R.layout.popup_salah);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button kmbl = dialog.findViewById(R.id.kmb);

        //        animasi ketika tombol di tekan
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);

        gagal = MediaPlayer.create(this, R.raw.gagal2);
        gagal.setVolume(1,1);
        gagal.start();

        kmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                dialog.dismiss();
                Toast.makeText(JawabanTb.this, "Silahkan Ulangi Lagi Jawaban Kamu..", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }

    private void benar() {
        dialog.setContentView(R.layout.popup_benar);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button kmbl = dialog.findViewById(R.id.kmb);
        TextView jwb = dialog.findViewById(R.id.jawaban);

        //        animasi ketika tombol di tekan
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);

        benar = MediaPlayer.create(this, R.raw.yeaah_kid);
        benar.setVolume(1,1);
        benar.start();

        kmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                dialog.dismiss();
                Toast.makeText(JawabanTb.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });

        jwb.setText("Ini Adalah Buah " + jawaban);
        dialog.show();
    }

    private void cekIntent() {
        Intent cek = getIntent();
        String nama_buah = cek.getStringExtra("nama_buah");

        //        animasi ketika tombol di tekan
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);

        if (nama_buah.equals("apel")){
            tbk_img.setImageResource(R.drawable.apel);
            jawaban = "apel";

//            suara
            sApel = MediaPlayer.create(this, R.raw.apel);
            sApel.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sApel.start();
                }
            });

        }else if(nama_buah.equals("alpukat")) {
            tbk_img.setImageResource(R.drawable.alpukat);
            jawaban = "alpukat";

            //            suara
            sAlpukat = MediaPlayer.create(this, R.raw.alpukat);
            sAlpukat.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sAlpukat.start();
                }
            });
        }else if(nama_buah.equals("ceri")) {
            tbk_img.setImageResource(R.drawable.ceri);
            jawaban = "ceri";

            //            suara
            sCeri = MediaPlayer.create(this, R.raw.ceri);
            sCeri.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sCeri.start();
                }
            });
        }else if(nama_buah.equals("durian")) {
            tbk_img.setImageResource(R.drawable.durian);
            jawaban = "durian";

            //            suara
            sDurian = MediaPlayer.create(this, R.raw.durian);
            sDurian.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sDurian.start();
                }
            });
        }else if(nama_buah.equals("jambu air")) {
            tbk_img.setImageResource(R.drawable.jambuair);
            jawaban = "jambu air";

            //            suara
            sJambu = MediaPlayer.create(this, R.raw.jambu_air);
            sJambu.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sJambu.start();
                }
            });
        }else if(nama_buah.equals("manggis")) {
            tbk_img.setImageResource(R.drawable.manggis);
            jawaban = "manggis";

            //            suara
            sManggis = MediaPlayer.create(this, R.raw.manggis);
            sManggis.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sManggis.start();
                }
            });
        }else if(nama_buah.equals("mangga")) {
            tbk_img.setImageResource(R.drawable.mango);
            jawaban = "mangga";

            //            suara
            sMangga = MediaPlayer.create(this, R.raw.mangga);
            sMangga.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sMangga.start();
                }
            });
        }else if(nama_buah.equals("pisang")) {
            tbk_img.setImageResource(R.drawable.pisangb);
            jawaban = "pisang";

            //            suara
            sPisang = MediaPlayer.create(this, R.raw.pisang);
            sPisang.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sPisang.start();
                }
            });
        }else if(nama_buah.equals("semangka")) {
            tbk_img.setImageResource(R.drawable.semangkab);
            jawaban = "semangka";

            //            suara
            sSemangka = MediaPlayer.create(this, R.raw.semangka);
            sSemangka.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sSemangka.start();
                }
            });
        }else if(nama_buah.equals("strawberry")) {
            tbk_img.setImageResource(R.drawable.strawberry);
            jawaban = "strawberry";

            //            suara
            sStrawberry = MediaPlayer.create(this, R.raw.strawberry);
            sStrawberry.setVolume(1,1);
            suara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.startAnimation(anim);
                    sStrawberry.start();
                }
            });
        }
    }

    private void inisialisasi() {
        tbk_img = findViewById(R.id.tebak_img);
        jawab = findViewById(R.id.editText_jawab);
        cek = findViewById(R.id.buttonCek);
        suara = findViewById(R.id.buttonSuara);
        dialog = new Dialog(this);
    }
}