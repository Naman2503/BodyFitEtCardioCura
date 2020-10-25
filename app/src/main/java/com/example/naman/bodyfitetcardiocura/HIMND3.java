package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HIMND3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himnd3);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 1 cup non-fat plain greek yogurt.\n" +
                "2. 1/2 cup blueberries.\n" +
                "3. 1 1/2 Tbsp silvered almonds.\n" +
                "4. 2 tsp honey.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 2 medium carrots.\n" +
                "2. 2 Tbsp hummus.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. 1 1/2 cups Roasted Tofu & Peanut\n     noodle salad.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 cup strawberries.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 1 serving grilled Romaine with\n     Avocado-Lime Dresing.\n" +
                "2. 4 oz. cooked chicken breast,\n     cooked in 1 1/2 tsp olive oil\n     and seasoned with 1/4 tsp cumin\n     and a pinch each of salt and\n     pepper.\n" +
                "3. 3/4 cup cooked quinoa.\n");

    }
}
