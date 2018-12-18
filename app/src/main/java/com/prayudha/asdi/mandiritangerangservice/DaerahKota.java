package com.prayudha.asdi.mandiritangerangservice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DaerahKota extends AppCompatActivity {
    //mendeklarasikan variable global dengan tipe akses Private
    private ImageView kota_bandara, kota_selapajang, kota_duta, kota_gedung, kota_taman, kota_ahmad, kota_bumi,
            kota_cikokol, kota_ciledug, kota_tangcity, kota_daan, kota_kisamaun, kota_merdeka, kota_jati, kota_psporis,
            kota_pinangsia, kota_borobudur;
    Button button;

    private static final String strKotabandara = "Bandara";
    private static final String strKotaselapajang = "Selapajang";
    private static final String strKotaduta = "Duta";
    private static final String strKotagedung = "Gedung";
    private static final String strKotaporis = "Poris";
    private static final String strKotataman = "Taman";
    private static final String strKotaahmad = "Ahmad";
    private static final String strKotabumi = "Bumi";
    private static final String strKotacikokol = "Cikokol";
    private static final String strKotaciledug = "Ciledug";
    private static final String strKotacbd = "CBD";
    private static final String strKotatangcity = "Tangerang City";
    private static final String strKotadaan = "Daan Mogot";
    private static final String strKotakisamaun = "Kisamaun";
    private static final String strKotamerdeka = "Merdeka";
    private static final String strKotajati = "Jati";
    private static final String strKotapsporis = "Pasar Poris";
    private static final String strKotapinangsia = "Pinangsia";
    private static final String strKotaborobudur = "Borobudur";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daerah_kota);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale1);

        //mendeklarasikan id tiap View
        kota_bandara = (ImageView) findViewById(R.id.kota_bandara);
        kota_selapajang = (ImageView) findViewById(R.id.kota_selapajang);
        kota_duta = (ImageView) findViewById(R.id.kota_duta);
        kota_gedung = (ImageView) findViewById(R.id.kota_gedung);
        kota_taman = (ImageView) findViewById(R.id.kota_taman);
        kota_ahmad = (ImageView) findViewById(R.id.kota_ahmad);
        kota_bumi = (ImageView) findViewById(R.id.kota_bumi);
        kota_cikokol = (ImageView) findViewById(R.id.kota_cikokol);
        kota_ciledug = (ImageView) findViewById(R.id.kota_ciledug);
        kota_tangcity = (ImageView) findViewById(R.id.kota_tangcity);
        kota_daan = (ImageView) findViewById(R.id.kota_daan);
        kota_kisamaun = (ImageView) findViewById(R.id.kota_kisamaun);
        kota_merdeka = (ImageView) findViewById(R.id.kota_merdeka);
        kota_jati = (ImageView) findViewById(R.id.kota_jati);
        kota_psporis = (ImageView) findViewById(R.id.kota_psporis);
        kota_pinangsia = (ImageView) findViewById(R.id.kota_pinangsia);
        kota_borobudur = (ImageView) findViewById(R.id.kota_borobudur);


        kota_bandara.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaBandara.class);
                startActivity(i);
            }
        });

        kota_selapajang.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaSelapajang.class);
                startActivity(i);
            }
        });

        kota_duta.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaDuta.class);
                startActivity(i);
            }
        });

        kota_gedung.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaGedung.class);
                startActivity(i);
            }
        });

        kota_taman.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaTaman.class);
                startActivity(i);
            }
        });

        kota_ahmad.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaAhmad.class);
                startActivity(i);
            }
        });

        kota_bumi.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaBumi.class);
                startActivity(i);
            }
        });

        kota_cikokol.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaCikokol.class);
                startActivity(i);
            }
        });

        kota_ciledug.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaCiledug.class);
                startActivity(i);
            }
        });

        kota_tangcity.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaTangcity.class);
                startActivity(i);
            }
        });

        kota_daan.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaDaan.class);
                startActivity(i);
            }
        });

        kota_kisamaun.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaKisamaun.class);
                startActivity(i);
            }
        });

        kota_merdeka.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaMerdeka.class);
                startActivity(i);
            }
        });

        kota_jati.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaJati.class);
                startActivity(i);
            }
        });

        kota_psporis.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaPsPoris.class);
                startActivity(i);
            }
        });

        kota_pinangsia.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaPinangsia.class);
                startActivity(i);
            }
        });

        kota_borobudur.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKota.this, KotaBorobudur.class);
                startActivity(i);
            }
        });



    }
}
