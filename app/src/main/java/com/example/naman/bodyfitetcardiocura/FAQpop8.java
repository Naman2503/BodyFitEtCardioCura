package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop8);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.7));

        TextView ft8 =(TextView)findViewById(R.id.ft8);
        ft8.setText("We don't pay attention to the number of calories burned in a workout because it's an out dated and broken way of looking at exercise and nutrition for general health.\n" +
                "We believe it's pointless to count calories, and not just because it's essentially impossible to accurately calculate the amount of calories someone burns during a specific activity.\n" +
                "Not only will calories consumed affect everyone differently,the number of calories burned by people doing identical workouts will vary for every person, every time, depending on a huge range of factors such as sleep and lifestyle habits, stress and nutrition.\n");
    }
}
