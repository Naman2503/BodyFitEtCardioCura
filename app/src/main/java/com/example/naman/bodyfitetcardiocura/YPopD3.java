package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d3);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("This pose requires you to stay off the ground by supporting the body on your hands and keeping the core intact. \n" +
                "It not only tones your arms but also strengthens and tones your biceps and triceps.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Do not attempt this if you have a shoulder or hip injury. \n" +
                "Work with a certified yoga instructor who can help you with variations.");
    }
}
