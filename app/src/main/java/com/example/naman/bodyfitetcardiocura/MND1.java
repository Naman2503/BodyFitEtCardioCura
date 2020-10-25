package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MND1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnd1);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 1 large egg.\n" +
                "2. 2 large egg whites.\n" +
                "3. 1/4 cup chopped tomato.\n" +
                "4. 2 Tbs grated parmesan cheese.\n" +
                "5. 2 Tbs chopped fresh basil.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 25 almonds.\n" +
                "2. 1 medium apple.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. 4 oz grilled chicken breast, diced.\n" +
                "2. 2 Tbs dried cranberries.\n" +
                "3. 2 Tbs diced avocado.\n" +
                "4. 3 cups baby spinach.\n" +
                "5. 1 Tbs olive oil+2 tsp balsamic\n     vinegar.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 6 oz non fat fruit yogurt.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 4 oz grilled chicken breast, diced.\n" +
                "2. 1 cup cooked penne pasta.\n" +
                "3. 1/2 cup marinara sauce.\n" +
                "4. 2 Tbs grated parmesan cheese.\n" +
                "5. 3 cups chopped lettuce.\n" +
                "6. 2 tsp olive oil+2 tsp balsamic\n     vinegar.\n");

    }
}
