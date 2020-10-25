package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop10);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.7));

        TextView ft10 =(TextView)findViewById(R.id.ft10);
        ft10.setText("The latest fancy machines or complex movements might seem like they hold the key to getting in shape, but don't get sucked in to the fitness world's obsession with finding the secret sauce – that one fancy machine, complicated movement or magic pill that will quickly and easily get you those abs you've always dreamed of.\n\n" +
                "Don't get us wrong - there's nothing wrong with highly complex movements like muscle ups or Olympic lifts, but we don't teach them because if you're training for general health and fitness you really don't need to be able to perform such specialized skills.\n" +
                "Not only do they take a tremendous amount of time to learn safely, movements like these can put a lot of stress on your joints and ligaments, and, in our opinion, carry an unnecessarily high risk of injury.\n");
    }
}
