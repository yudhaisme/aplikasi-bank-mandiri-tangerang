package com.prayudha.asdi.mandiritangerangservice;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //mendeklarasikan variable global dengan tipe akses Private
    private ImageView tngoffice, mandiriinformasi, aboutapps, help;
    Button button;
    private boolean isUserClickedBackButton = false;


    private static final String strTngoffice = "Tangerang Office";
    private static final String strMandiriinformasi = "Mandiri Informasi";
    private static final String strAboutapps = "About Apps";
    private static final String strHelp = "Help";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale1);



        //mendeklarasikan id tiap View
        tngoffice = (ImageView)findViewById(R.id.tangerang_office);
        mandiriinformasi = (ImageView)findViewById(R.id.mandiri_informasi);
        aboutapps = (ImageView)findViewById(R.id.about_apps);
        help = (ImageView)findViewById(R.id.help);

        tngoffice.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(MainActivity.this, TangerangOfficeNetwork.class);
                startActivity(i);
            }
        });

        mandiriinformasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(MainActivity.this, WebActivity.class);
                startActivity(i);
            }
        });

        aboutapps.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(MainActivity.this, About.class);
                startActivity(i);
            }
        });

        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View arg0){
                arg0.startAnimation(animScale);
                Intent i = new Intent(MainActivity.this, Help.class);
                startActivity(i);
            }
        });

            }

    @Override
    public void onBackPressed() {
        if (!isUserClickedBackButton) {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_LONG).show();
            isUserClickedBackButton = true;
        } else {
            super.onBackPressed();
        }
        new CountDownTimer(3000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                isUserClickedBackButton = false;
            }
        }.start();


    }
}

