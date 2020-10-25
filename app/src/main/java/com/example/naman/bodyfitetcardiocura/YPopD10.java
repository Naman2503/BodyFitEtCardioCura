package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d10);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("A pivotal pose in the Surya Namaskar, this is an elegant asana that works on your upper body.\n" +
                " It gives the abdominal muscles a rooted stretch and acts as a catalyst for burning unwanted belly fat.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Do not attempt this asana if you are pregnant or suffer from a hernia.");
    }
}
