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


public class DaerahTangsel extends AppCompatActivity {
    //mendeklarasikan variable global dengan tipe akses Private
    private ImageView tang_bsd, tang_jurangmangu, tang_mall, tang_bintaro, tang_bintaro3, tang_bumi, tang_gading,
            tang_graha, tang_itc, tang_pamulang, tang_paris, tang_ciputat, tang_pdcabe, tang_sarua,
            tang_cirendeu, tang_serpong, tang_summarecon;
    Button button;

    private static final String strTangbsd = "Tang BSD";
    private static final String strTangjurangmangu = "Tang Jurangmangu";
    private static final String strTangmall = "Tang Mall";
    private static final String strTangbintaro = "Tang Bintaro";
    private static final String strTangbintaro3 = "Tang Bintaro3";
    private static final String strTangbumi = "Tang Bumi";
    private static final String strTanggading = "Tang Gading";
    private static final String strTanggraha = "Tang Graha";
    private static final String strTangitc = "Tang ITC";
    private static final String strTangpamulang = "Tang Pamulang";
    private static final String strTangparis = "Tang Paris";
    private static final String strTangciputat = "Tang Ciputat";
    private static final String strTangpdcabe = "Tang Pondok Cabe";
    private static final String strTangsarua = "Tang Sarua";
    private static final String strTangcirendeu = "Tang Cirendeu";
    private static final String strTangserpong = "Tang Serpong";
    private static final String strTangsummarecon = "Tang Summarecon";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daerah_tangsel);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale1);

        //mendeklarasikan id tiap View
        tang_bsd = (ImageView) findViewById(R.id.tang_bsd);
        tang_jurangmangu = (ImageView) findViewById(R.id.tang_jurangmangu);
        tang_mall = (ImageView) findViewById(R.id.tang_mall);
        tang_bintaro = (ImageView) findViewById(R.id.tang_bintaro);
        tang_bintaro3 = (ImageView) findViewById(R.id.tang_bintaro3);
        tang_bumi = (ImageView) findViewById(R.id.tang_bumi);
        tang_gading = (ImageView) findViewById(R.id.tang_gading);
        tang_graha = (ImageView) findViewById(R.id.tang_graha);
        tang_itc = (ImageView) findViewById(R.id.tang_itc);
        tang_pamulang = (ImageView) findViewById(R.id.tang_pamulang);
        tang_paris = (ImageView) findViewById(R.id.tang_paris);
        tang_ciputat = (ImageView) findViewById(R.id.tang_ciputat);
        tang_pdcabe = (ImageView) findViewById(R.id.tang_pdcabe);
        tang_sarua = (ImageView) findViewById(R.id.tang_sarua);
        tang_cirendeu = (ImageView) findViewById(R.id.tang_cirendeu);
        tang_serpong = (ImageView) findViewById(R.id.tang_serpong);
        tang_summarecon = (ImageView) findViewById(R.id.tang_summarecon);

       tang_bsd.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangBsd.class);
                startActivity(i);
            }
        });

        tang_jurangmangu.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangJurangmangu.class);
                startActivity(i);
            }
        });

        tang_mall.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangMall.class);
                startActivity(i);
            }
        });

        tang_bintaro.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangBintaro.class);
                startActivity(i);
            }
        });

        tang_bintaro3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangBintaro3.class);
                startActivity(i);
            }
        });

        tang_bumi.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangBumi.class);
                startActivity(i);
            }
        });

        tang_gading.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangGading.class);
                startActivity(i);
            }
        });

        tang_graha.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangGraha.class);
                startActivity(i);
            }
        });

        tang_itc.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangItc.class);
                startActivity(i);
            }
        });

        tang_pamulang.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangPamulang.class);
                startActivity(i);
            }
        });

        tang_paris.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangParis.class);
                startActivity(i);
            }
        });

        tang_ciputat.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangCiputat.class);
                startActivity(i);
            }
        });

        tang_pdcabe.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangPdCabe.class);
                startActivity(i);
            }
        });

        tang_sarua.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangSarua.class);
                startActivity(i);
            }
        });

        tang_cirendeu.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangCirendeu.class);
                startActivity(i);
            }
        });

        tang_serpong.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangSerpong.class);
                startActivity(i);
            }
        });

        tang_summarecon.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahTangsel.this, TangSummarecon.class);
                startActivity(i);
            }
        });


        }
    }
