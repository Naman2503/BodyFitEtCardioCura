package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d4);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("Your arms become the base for balancing the entire upper body while you try to stay afloat.\n" +
                "This asana helps strengthen and tone the biceps, triceps, and arms.\n");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("It is a simple asana that can be done by everyone.\n" +
                "However, you need to be careful if you have neck or shoulder injuries");
    }
}
