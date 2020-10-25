package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d15);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("A pose that fully stretches the hamstrings and tones the calf muscles. \n" +
                "It strengthens your thighs, legs, and back while stimulating the functioning of the kidneys and liver.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("It is one of the most basic poses and can be done by anyone. \n" +
                "However, for beginners, it might take a while before they can fully bend and stretch.");
    }
}
