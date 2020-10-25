package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d16);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("The Warrior 2 Pose is a revitalizing pose that helps you build stamina while stretching all the muscles below your hips.\n" +
                " It is the second level of the Warrior Pose that comes with a lot of benefits apart from just toning and \n" +
                "strengthening your legs. \n" +
                "It relieves sciatica like magic.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Avoid this asana if you have chronic knee pain, arthritis, high blood pressure or diarrhea.");
    }
}
