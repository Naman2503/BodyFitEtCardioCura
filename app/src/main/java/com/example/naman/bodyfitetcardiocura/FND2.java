package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FND2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnd2);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. Broccoli rabe.\n" +
                "2. Egg toast.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 cup sugar snap peas with\n     1 oz goat cheese and fresh\n     thyme,warmed in the oven for 3\n     minutes.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Shrimp salad:\n" +
                " ->2 cups mixed baby greens\n" +
                " ->5 shrimps\n" +
                " ->1/4 steamed avocado\n" +
                " ->2 sliced hearts of palm spears\n" +
                " ->1/4 lemon juice\n" +
                " ->1 tsp olive oil\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 green apple.\n" + "2. 2 tsp peanut butter.\n" + "3. 1/2 tsp cinnamon.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 1 small sweet potato.\n" + "2. 1 cup sauteed spinach.\n" + "3. 1/4 lemon juice.\n" + "4. 4 oz grilled chicken.\n");

    }
}
