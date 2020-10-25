package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FND3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnd3);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. Avocado banana smoothie:\n" +
                " ->1 cup of almond milk\n" +
                " ->1 small frozen banana\n" +
                " ->1 Tbsp nut butter\n" +
                " ->1/2 small avocado\n" +
                " ->1 handful of raw spinach\n" +
                " ->1 scoop protein powder\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 5 carrot sticks.\n" +
                "2. 1 Tbsp hummus.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. 2 cups carrot kale salad topped\n     with 1/2 cup quinoa and 1/3 cup\n     chickpeas.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 12 small olives.\n" +
                "2. 1 oz Parmesan cheese.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 4 oz grilled tuna steak.\n" +
                "2. 1 cup sauteed red cabbage.\n");

    }
}
