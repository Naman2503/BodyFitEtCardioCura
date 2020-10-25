package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop3);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.4));

        TextView ft3 =(TextView)findViewById(R.id.ft3);
        ft3.setText("There is no 'should' - you can achieve results working out in a gym, in the park, or at home.\n" +
                "It is more a matter of availability and of convenience for you, particularly if you have special rehabilitative needs, which may require special equipment.\n");
    }
}
