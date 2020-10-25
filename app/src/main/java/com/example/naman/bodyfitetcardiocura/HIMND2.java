package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HIMND2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himnd2);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 1 cup plain,low-fat yogurt, topped\n     with 3/4 cup bluwberries.\n" +
                "2. 3/4 cup calcium-fortified orange\n     juice.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 medium orange.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Mixed:\n" +
                " ->1 whole-wheat pita stuffed\n" +
                " ->1 cup shredded romaine lettuce\n" +
                " ->1/2 cup sliced tomatoes\n" +
                " ->1/4 cup sliced cucumbers\n" +
                " ->2 Tbsp crumbled feta cheese\n" +
                " ->1 Tbsp reduced-fat ranch dressing\n" +
                "2. 1 kiwi.\n" +
                "3. 1 cup skim milk.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 cup strawberries.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. Chicken stir-fry(3 ounces) with\n     eggplant(1 cup) and basil.\n" +
                "2. 1 cup brown rice with 1 Tbsp\n     chopped dried apricots.\n" +
                "3. 1 cup steamed broccoli.\n" +
                "4. 4 ounces red wine or concord\n     grape juice.\n");

    }
}
