package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d19);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("The intense stretch of the legs, spine, and chest strengthens the hip muscles. \n" +
                "In this asana, the entire body is in the front, and the hip is the only organ that pops out at the back of your body. \n" +
                "Hence, it thoroughly works on your hip muscles.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Even though this asana is profound and compelling.\n" +
                "it is best to do it under the supervision of a certified instructor, especially if you have tight thighs or hips.");
    }
}
