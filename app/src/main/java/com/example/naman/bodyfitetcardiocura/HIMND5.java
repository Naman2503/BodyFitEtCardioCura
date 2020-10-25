package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HIMND5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himnd5);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 1/2 cup rolled oats,cooked in 1\n     cup milk.\n" +
                "2. 1/2 cup sliced strawberries.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1/2 bell pepper,sliced.\n" +
                "2. 2 Tbsp hummus.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Toaster-Oven Tostadas:\n" +
                " ->2 corn tortillas\n" +
                " ->2/3 cup canned black beans,\n     rinsed\n" +
                " ->1/2 bell pepper,sliced\n" +
                " ->2 Tbsp shredded cheddar cheese\n" +
                " ->2 Tbsp salsa or pico de gallo\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1/2 cup blueberries.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 1 1/4 cups Chicken Cauliflower\n     fried rice.\n" +
                "2. 2 cups mixed greens, topped with\n     1 Tbsp red wine vinegar and 2\n     tsp olive oil.\n");

    }
}
