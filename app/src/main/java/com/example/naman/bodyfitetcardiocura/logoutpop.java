package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import static java.lang.System.exit;

public class logoutpop extends AppCompatActivity {

    Button bl1,bl2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logoutpop);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.3));

        bl1= (Button) findViewById(R.id.lp1);
        bl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(logoutpop.this,Login3.class);
                startActivity(intent);
                exit(1);
            }
        });

        bl2= (Button) findViewById(R.id.lp2);
        bl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(logoutpop.this,Exo6.class);
                startActivity(intent);
                exit(1);
            }
        });

    }
}
