package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FND4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnd4);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. Salmon pesto tartine.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 cup jicama slices.\n" +
                "2. 2 Tbsp tzatziki.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Tuna salad:\n" +
                " ->1 cup romaine\n" +
                " ->1 diced plum tomato\n" +
                " ->1/2 cup artichoke hearts\n" +
                " ->4 oz canned tuna\n" +
                " ->1 tsp olive oil\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 cup blueberries.\n" +
                "2. 10 almonds.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 4 oz grilled pork tenderloin.\n" +
                "2. 2 cups bok choy sauteed with 2\n     tsp avocado oil.\n");

    }
}
