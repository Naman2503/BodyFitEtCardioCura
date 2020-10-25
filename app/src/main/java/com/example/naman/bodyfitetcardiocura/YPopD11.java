package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d11);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("The Cobbler Pose works on the inner and outer thighs.\n" +
                " An interesting variation of this pose is to flutter the legs like a butterfly –\n" +
                " a reason why it is also called the Butterfly Pose. It is easy, straightforward, and relaxes your lower body.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Avoid doing this if you are menstruating or have knee injuries.");
    }
}
