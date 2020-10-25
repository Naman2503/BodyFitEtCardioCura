package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HIMND4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himnd4);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 1 cup bran cereal.\n" +
                "2. 1 cup skim milk.\n" +
                "3. 1/2 cup blueberries.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 medium apple.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Green salad with Chicken:\n" +
                " ->3 cups mixed greens\n" +
                " ->3 oz. leftover cooked chicken\n     breast\n" +
                " ->5 cherry tomatoes,halved\n" +
                " ->1/2 cup cucumber slices\n" +
                " ->1/4 cup shredded carrot\n" +
                " ->1 Tbsp red wine vinegar\n" +
                " ->2 tsp olive oil\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 medium orange.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 1 serving cod with tomato cream\n     sauce.\n" +
                "2. 1/2 cup cooked brown rice.\n" +
                "3. 2 cups mixed greens,topped with\n     1 Tbsp balsamic vinegar and 2\n     tsp olive oil.\n");

    }
}
