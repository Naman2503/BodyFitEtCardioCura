package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d13);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("This pose is all about the lunge – \n" +
                "it stretches the legs, hamstrings, and thighs, thereby helping in toning the muscles from the hips to the ankles.\n" +
                " It releases tension and gives you great flexibility.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Do not attempt this if you have high blood pressure or knee pains/injuries.\n" +
                " There are a few variations for people with neck or shoulder pains.");
    }
}
