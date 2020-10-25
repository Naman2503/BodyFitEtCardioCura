package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop6);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView ft6 =(TextView)findViewById(R.id.ft6);
        ft6.setText("The training combines both cardio and strength training into efficient little minute session.\n" +
                "We stick to the no-nonsense stuff that works: the most effective and safest progressions and regressions of the fundamental human movement patterns.\n" +
                "Amongst other things, the sessions vary daily in terms of the work-to- rest ratios, the order in which exercises are performed, and the overall intensity required,which means your body is always kept guessing and your progress never stagnates.\n");
    }
}
