package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d9);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("This pose tones and firms the abdominal muscles. \n" +
                "The focus shifts to both the sides of the body while you stretch. \n" +
                "This asana works on melting your love handles and improves blood circulation and digestion.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("If you experience a discomfort or stiffness in the neck or hips, consult your doctor before doing this asana.");
    }
}
