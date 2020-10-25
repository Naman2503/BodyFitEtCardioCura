package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FND7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnd7);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. Scrambled eggs(1 whole egg + 2\n     egg whites).\n" +
                "2. 1/2 tsp oregano.\n" +
                "3. 1/3 cup cooked quinoa.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 sliced red bell pepper.\n" +
                "2. 2 Tbsp guacamole.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Kale chicken salad:\n" +
                " ->1 cup kale\n" +
                " ->1/4 lemon juice\n" +
                " ->1 tsp olive oil\n" +
                " ->4 oz grilled chicken\n" +
                " ->2 Tbsp pomegranate seeds\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 5 cups air-popped popcorn.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 3 been chili.\n");

    }
}
