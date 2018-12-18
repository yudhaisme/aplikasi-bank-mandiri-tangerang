package com.prayudha.asdi.mandiritangerangservice;

import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DaerahKabupaten extends AppCompatActivity {

    //mendeklarasikan variable global dengan tipe akses Private
    private ImageView kab_balaraja, kab_cikupa, kab_citra, kab_curug, kab_kosambi, kab_kemis, kab_kotbum;
    Button button;

    private static final String strKabbalaraja = "Kabupaten Balaraja";
    private static final String strKabcikupa = "Kabupaten Cikupa";
    private static final String strKabcitra = "Kabupaten Citra";
    private static final String strKabcurug = "Kabupaten Curug";
    private static final String strKabkosambi = "Kabupaten Kosambi";
    private static final String strKabkemis = "Kabupaten Pasar Kemis";
    private static final String strKabkotbum = "Kabupaten Kotabumi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daerah_kabupaten);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale1);

        //mendeklarasikan id tiap View
        kab_balaraja = (ImageView) findViewById(R.id.kab_balaraja);
        kab_cikupa = (ImageView) findViewById(R.id.kab_cikupa);
        kab_citra = (ImageView) findViewById(R.id.kab_citra);
        kab_curug = (ImageView) findViewById(R.id.kab_curug);
        kab_kosambi = (ImageView) findViewById(R.id.kab_kosambi);
        kab_kemis = (ImageView) findViewById(R.id.kab_kemis);
        kab_kotbum = (ImageView) findViewById(R.id.kab_kotbum);

        kab_balaraja.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKabupaten.this, KabBalaraja.class);
                startActivity(i);
            }
        });

        kab_cikupa.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKabupaten.this, KabCikupa.class);
                startActivity(i);
            }
        });

        kab_citra.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKabupaten.this, KabCitra.class);
                startActivity(i);
            }
        });

        kab_curug.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKabupaten.this, KabCurug.class);
                startActivity(i);
            }
        });

        kab_kosambi.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKabupaten.this, KabKosambi.class);
                startActivity(i);
            }
        });

        kab_kemis.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKabupaten.this, KabKemis.class);
                startActivity(i);
            }
        });

        kab_kotbum.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(DaerahKabupaten.this, KabKotbum.class);
                startActivity(i);
            }
        });



    }
}
