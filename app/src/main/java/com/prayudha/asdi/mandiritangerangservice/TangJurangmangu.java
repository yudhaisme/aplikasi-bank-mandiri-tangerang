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


public class TangJurangmangu extends AppCompatActivity {

    //mendeklarasikan variable global dengan tipe akses Private
    private ImageView tang_lokasijurangmangu, call_tang_jurangmangu;
    Button button;

    private static final String strKotalokasijurangmangu = "Kota Lokasi Jurangmangu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tang_jurangmangu);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mendeklarasikan id tiap View
        tang_lokasijurangmangu = (ImageView) findViewById(R.id.carilokasijurangmangu);
        call_tang_jurangmangu = (ImageView) findViewById(R.id.call_tang_jurangmangu);

        tang_lokasijurangmangu.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent map = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=-6.264821, 106.737615(" + "Mandiri Cash Outlet Tangerang Jurangmangu" + ")"));
                startActivity(map);
            }
        });

        call_tang_jurangmangu.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                AlertDialog.Builder alertexit = new AlertDialog.Builder(
                        TangJurangmangu.this);

                alertexit.setMessage("Apakah Anda Yakin Untuk Menelpon?").setIcon(android.R.drawable.ic_dialog_info)
                        .setTitle("Informasi").setCancelable(false)
                        .setPositiveButton("Ya", new AlertDialog.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel: 73887963"));
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