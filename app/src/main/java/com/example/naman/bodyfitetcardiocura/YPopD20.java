package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d20);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("This asana is a hip opener and also works on the inner thighs.\n" +
                " The balancing act of keeping the legs folded while sticking the toes together stimulates the toning of the hip muscles.\n" +
                " It is a very relaxing asana and releases tension in the hip and thigh muscles.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Refrain from doing this asana if you suffer from lower back pain, or knee or groin injuries.");
    }
}
