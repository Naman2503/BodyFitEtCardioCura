package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop5);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.4));

        TextView ft5 =(TextView)findViewById(R.id.ft5);
        ft5.setText("Yes. Each client's needs are evaluated and a complete nutrition plan is recommended.\n" +
                "It will be your F.U.E.L. system - Food Used for Energy and Living.\n" +
                "It is meant to supply your body with all of its needs, and catered to what your specific goals are.\n");
    }
}
