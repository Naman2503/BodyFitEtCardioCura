package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HIMND7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himnd7);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. Egg & Tomato Toast:\n" +
                " ->1 corn tortilla\n" +
                " ->1 large egg,cooked in 1/4 tsp olive\n     oil or coat pan with a thin layer of\n     cooking spray\n" +
                " ->5 cherry tomatoes,halved\n" +
                " ->1 medium banana\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 3/4 cup blueberries.\n" +
                "2. 1 Tbsp unsalted dry-roasted\n     almonds.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Tuna & White bean Spinach Salad:\n" +
                " ->2 cups spinach\n" +
                " ->2.5 oz. chunk light tuna in water,\n     drained\n" +
                " ->1/2 cup canned white beans,\n     rinsed\n" +
                " ->3/4 cup veggies of your choice(try\n     tomatoes & cucumbers)\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 medium orange.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 1 serving Lemongrass Pork &\n     Spaghetti Squash noodle bowl.\n");

    }
}
