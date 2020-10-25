package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d17);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("Think of it like doing a ‘split’ while dancing, except this is seated. \n" +
                "The deep stretch releases the tension in your torso and hip muscles and tones the hips.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("This is an advanced pose that does not have any potential risks. \n" +
                "However, use a soft cushion or blanket under your torso if you have lower back pain.");
    }
}
