package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop2);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView ft2 =(TextView)findViewById(R.id.ft2);
        ft2.setText("When you are overweight, when you are underweight, when you are unfit, when you want to get fitter, when you have just had a baby, when you are in training, when you are bored with training, when the kids have left home, when the jeans don't fit, when you are too busy to keep fit, when you are going skiing, when Christmas has happened, when summer is about to happen, when aerobics has got boring, when you can't avoid the mirror, when you always avoid the scales, when you want to!.\n");
    }
}
