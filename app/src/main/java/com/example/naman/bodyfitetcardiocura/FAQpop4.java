package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop4);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.5));

        TextView ft4 =(TextView)findViewById(R.id.ft4);
        ft4.setText("Most Personal Trainers are fully aware that in order to change an unhealthy lifestyle you have to work within it.\n" +
                "You will find that many Personal Trainers can give you nutritional and lifestyle advice - whether you take it is up to you.\n" +
                "We are only with you a few hours a week, but the fitter you become,the better you will treat your body as a natural consequence.\n");
    }
}
