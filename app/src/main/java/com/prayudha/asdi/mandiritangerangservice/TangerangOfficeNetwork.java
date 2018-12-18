package com.prayudha.asdi.mandiritangerangservice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TangerangOfficeNetwork extends AppCompatActivity {

    //mendeklarasikan variable global dengan tipe akses Private
    private ImageView kabupaten_tangerang, kota_tangerang, tangerang_selatan;
    Button button;

    private static final String strKabupatentangerang = "Kabupaten Tangerang";
    private static final String strKotatangerang = "Kota Tangerang";
    private static final String strTangerangselatan = "Tangerang Selatan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangerang_office_network);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale1);

        //mendeklarasikan id tiap View
        kabupaten_tangerang = (ImageView) findViewById(R.id.kabupaten_tangerang);
        kota_tangerang = (ImageView) findViewById(R.id.kota_tangerang);
        tangerang_selatan = (ImageView) findViewById(R.id.tangerang_selatan);

        kabupaten_tangerang.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(TangerangOfficeNetwork.this, DaerahKabupaten.class);
                startActivity(i);
            }
        });

        kota_tangerang.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(TangerangOfficeNetwork.this, DaerahKota.class);
                startActivity(i);
            }
        });

        tangerang_selatan.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(TangerangOfficeNetwork.this, DaerahTangsel.class);
                startActivity(i);
            }
        });


    }
}
