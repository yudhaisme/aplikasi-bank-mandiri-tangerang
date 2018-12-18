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


public class TangCiputat extends AppCompatActivity {

    //mendeklarasikan variable global dengan tipe akses Private
    private ImageView tang_lokasiciputat, call_tang_ciputat;
    Button button;

    private static final String strKotalokasiciputat = "Kota Lokasi Ciputat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tang_ciputat);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mendeklarasikan id tiap View
        tang_lokasiciputat = (ImageView) findViewById(R.id.carilokasiciputat);
        call_tang_ciputat = (ImageView) findViewById(R.id.call_tang_ciputat);

        tang_lokasiciputat.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent map = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=-6.318756, 106.746089(" + "Mandiri KCP Tangerang Pasar Ciputat" + ")"));
                startActivity(map);
            }
        });

        call_tang_ciputat.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                AlertDialog.Builder alertexit = new AlertDialog.Builder(
                        TangCiputat.this);

                alertexit.setMessage("Apakah Anda Yakin Untuk Menelpon?").setIcon(android.R.drawable.ic_dialog_info)
                        .setTitle("Informasi").setCancelable(false)
                        .setPositiveButton("Ya", new AlertDialog.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel: 7426545"));
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

