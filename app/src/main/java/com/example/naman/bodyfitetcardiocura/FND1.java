package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FND1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnd1);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 7 oz full fat greek yogurt.\n" +
                "2. 1 Tbsp chia seeds.\n" +
                "3. 1/2 grapefruit.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 5 celery sticks.\n" +
                "2. 2 tsps almond butter.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Chicken spinach salad:\n" +
                " ->2 cups raw spinach\n" +
                " ->4 oz grilled chicken\n" +
                " ->1/4 sliced avocado\n" +
                " ->1 tsp olive oil\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 six-oz almond milk latte.\n" +
                "2. 10 cashews.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. Green tea-marinated cod over\n     lentil-currant salad.\n");

    }
}
