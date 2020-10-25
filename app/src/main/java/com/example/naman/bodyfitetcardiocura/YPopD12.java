package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d12);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("A posture that counters the effects of sitting all day and accumulating fat in the lower part of the body.\n" +
                " It stretches the thighs, groin, and hip muscles. It improves flexibility and tones the inner/outer thigh region.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Avoid this asana if you suffer from knee or hip pain.");
    }
}
