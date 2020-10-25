package com.example.naman.bodyfitetcardiocura;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d1);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("It is one of the most sought-after asanas for thyroid patients. \n" +
                "You need to lock your chin on the chest, between your collarbones, while holding your breath. \n" +
                "This will make your jawline defined.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("If you have any breathing issues, do this asana under the supervision of a certified yoga teacher.\n" +
                " Do not attempt this if you suffer from high blood pressure or heart disease.");
    }
}