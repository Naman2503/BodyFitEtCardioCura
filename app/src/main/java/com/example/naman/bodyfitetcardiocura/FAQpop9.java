package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class FAQpop9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqpop9);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        TextView ft9 =(TextView)findViewById(R.id.ft9);
        ft9.setText("To gain lots of muscle mass, you need to train in a very specific way, and you have to lift a lot of weight.\n" +
                "If you train consistently according to our app, you'll get you in extremely good shape, but we're not training you to be a strength athlete or bodybuilder.\n" +
                "Combining resistance training with the cardio-exercises demands will make you efficient, strong, durable and lean, but it won't make you bulky.\n" +
                "You won't be lifting heavy enough weights for that.\n");
    }
}
