package com.prayudha.asdi.mandiritangerangservice;

import android.Manifest;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class KotaBumi extends AppCompatActivity  {

    //mendeklarasikan variable global dengan tipe akses Private
    private ImageView kota_lokasibumi, call_kota_bumi;
    Button button;

    private static final String strKotalokasibumi = "Kota Lokasi Bumi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kota_bumi);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mendeklarasikan id tiap View
        kota_lokasibumi = (ImageView) findViewById(R.id.carilokasibumi);
        call_kota_bumi = (ImageView) findViewById(R.id.call_kota_bumi);

        kota_lokasibumi.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent map = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=-6.193829, 106.724489(" + "Mandiri KCP Tangerang Bumi Permata Indah" + ")"));
                startActivity(map);
            }
        });

        call_kota_bumi.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                AlertDialog.Builder alertexit = new AlertDialog.Builder(
                        KotaBumi.this);

                alertexit.setMessage("Apakah Anda Yakin Untuk Menelpon?").setIcon(android.R.drawable.ic_dialog_info)
                        .setTitle("Informasi").setCancelable(false)
                        .setPositiveButton("Ya", new AlertDialog.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel: 73453233"));
                                startActivity(callIntent);

                            }
                        })
                        .setNegativeButton("Tidak", new AlertDialog.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog a = alertexit.create();
                a.show();

            }
        });



    }
}
