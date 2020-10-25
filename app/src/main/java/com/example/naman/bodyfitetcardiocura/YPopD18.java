package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d18);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("This is one of the best yoga poses for weight loss as it stretches the entire lower portion of your body. \n" +
                "The focus is on the hip bone as it goes perpendicular to the floor. \n" +
                "The inner thighs, groin, and hamstrings are also toned and strengthened in the process.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Avoid this if you’re pregnant or menstruating.");
    }
}
