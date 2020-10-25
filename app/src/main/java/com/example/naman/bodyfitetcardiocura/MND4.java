package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MND4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnd4);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 1/2 cup granola.\n" +
                "2. 6 oz low fat vanilla yogurt.\n" +
                "3. 1 medium apple, chopped + 1/2\n     tsp cinnamon.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 2 Tbs dried cranberries.\n" +
                "2. 10 almonds.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Roast Beef & Spinach Wrap:\n" +
                " ->3 oz roast beef, sliced\n" +
                " ->1/2 cup black beans\n" +
                " ->2 Tbs salsa\n" +
                " ->1 cup baby spinach\n" +
                " ->2 Tbs diced avocado\n" +
                " ->1 whole wheat flour tortilla.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 medium banana.\n" +
                "2. 1/2 cup low fat cottage cheese.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 5 oz grilled salmon.\n" +
                "2. 2 cups steamed swiss chard with\n     1 tsp flax oil+lemon juice.\n" +
                "3. 1 cup sliced cucumber.\n");

    }
}
