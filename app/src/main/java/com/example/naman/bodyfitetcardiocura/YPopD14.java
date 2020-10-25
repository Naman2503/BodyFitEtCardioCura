package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d14);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("The Half Frog Pose is one of the most challenging poses, but it gives you remarkable results.\n" +
                " It stretches and strengthens the hips, quadriceps, and the hamstring muscles. \n" +
                "You will feel energized as it stimulates blood circulation.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("It is best to avoid this asana if you have neck, shoulder or lower back pain.");
    }
}
