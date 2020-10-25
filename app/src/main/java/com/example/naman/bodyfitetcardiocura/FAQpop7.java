package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop7);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView ft7 =(TextView)findViewById(R.id.ft7);
        ft7.setText("While none of the movements are complicated or difficult to perform, you're no doubt more interested in whether training is tough in terms of the amount of effort you have to put in.\n" +
                "We're interested in helping you get the results you want, and doing that involves asking just a little bit more from your body than it can handle.\n" +
                "While that's almost the definition of 'tough' (and it has to be if you want to see results), we don't believe that this training session should be an exercise in torture.\n");
    }
}
