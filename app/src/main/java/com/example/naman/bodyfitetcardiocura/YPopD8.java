package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class YPopD8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypop_d8);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView t1 =(TextView)findViewById(R.id.t1);
        t1.setText("Think of a see-saw or a boat when you think of this asana.\n" +
                " It works in the same way, and the midriff becomes the base for balancing the body.\n" +
                " If you have trouble losing that stubborn belly fat, here is something that will give you visible results.\n" +
                " With a little practice, you are well on your way to achieve toned abs.");

        TextView t3 =(TextView)findViewById(R.id.t3);
        t3.setText("Do not do this asana if you are suffering from insomnia, hernia or spinal injuries.");
    }
}
