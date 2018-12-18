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


public class KabKosambi extends AppCompatActivity {

    //mendeklarasikan variable global dengan tipe akses Private
    private ImageView kab_lokasikosambi, call_kab_kosambi;
    Button button;

    private static final String strKablokasikosambi = "Kabupaten Lokasi Kosambi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kab_kosambi);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mendeklarasikan id tiap View
        kab_lokasikosambi = (ImageView) findViewById(R.id.carilokasikosambi);
        call_kab_kosambi = (ImageView) findViewById(R.id.call_kab_kosambi);

        kab_lokasikosambi.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent map = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=-6.096620, 106.686821(" + "Mandiri KCP Tangerang Mutiara Kosambi" + ")"));
                startActivity(map);
            }
        });

        call_kab_kosambi.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                AlertDialog.Builder alertexit = new AlertDialog.Builder(
                        KabKosambi.this);

                alertexit.setMessage("Apakah Anda Yakin Untuk Menelpon?").setIcon(android.R.drawable.ic_dialog_info)
                        .setTitle("Informasi").setCancelable(false)
                        .setPositiveButton("Ya", new AlertDialog.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel: 55310473"));
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
