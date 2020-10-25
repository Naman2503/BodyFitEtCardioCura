package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MND5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnd5);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 2 oz cooked turkey bacon.\n" +
                "2. 4 egg whites scrambled.\n" +
                "3. 1 cup steamed spinach.\n" +
                "4. 1 whole wheat flour tortilla.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 medium apple.\n" +
                "2. 1 oz part skim mozzarella cheese.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Asian Shrimp Salad:\n" +
                " ->5 oz cooked shrimp\n" +
                " ->3 cups mixed greens\n" +
                " ->1 cup sliced cucumber\n" +
                " ->1/2 cup canned mandarin oranges\n     (packed in water)\n" +
                " ->1 tsp toasted sesame seeds\n" +
                " ->2 Tbs sliced almonds\n" +
                " ->2 Tbs sesame ginger salad\n     dressing.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 6 oz non fat fruit yogurt.\n" +
                "2. 1/2 cup blueberries.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. Spicy Turkey Sloppy Joes:\n" +
                " ->4 oz ground turkey breast sautéed\n     in 1 tsp olive oil\n" +
                " ->2 Tbs diced onion\n" +
                " ->1 Tbs tomato paste\n" +
                " ->1 tsp chili powder\n" +
                " ->1 cup chopped spinach.\n" +
                "2. 1 (6.5 in) large whole wheat pita\n     bread.\n" +
                "3. 1 cup steamed broccoli with 1 tsp\n     olive oil+lemon juice.\n");

    }
}
