package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop1);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.5));

        TextView ft1 =(TextView)findViewById(R.id.ft1);
        ft1.setText("Some people are happy to follow their own programme in their own time and place; for those who lack the time, or the motivation, or the energy to train effectively on their own, a Personal Trainer can be the answer.\n" +
                    "The support, advice and encouragement come with safe exercise technique to help you avoid injuries.\n");
    }
}
