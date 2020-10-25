package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d6);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("The asana involves a deep twist and is an intermediary level pose that anyone can easily master with practice.\n" +
                " It improves the natural flexibility of your upper body and also helps tone your shoulder blades.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Do not attempt if you have a headache or insomnia or if you are menstruating.");
    }
}
