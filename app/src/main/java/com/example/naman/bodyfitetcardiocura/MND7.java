package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MND7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnd7);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 2 whole grain waffles.\n" +
                "2. 1 Tbs natural peanut butter.\n" +
                "3. 1 medium apple.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 cup green grapes.\n" +
                "2. 1 oz low fat Swiss cheese.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. 3 cups mixed greens.\n" +
                "2. 4 oz roasted turkey breast.\n" +
                "3. 1/2 cup chopped tomato.\n" +
                "4. 1 hard boiled egg.\n" +
                "5. 2 Tbs grated parmesan cheese.\n" +
                "6. 2 Tbs chopped fresh basil + 1 Tbs\n     olive oil + lemon juice.\n" +
                "7. 1 oz whole wheat pretzels.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 slice whole wheat bread,\n     toasted.\n" +
                "2. 1 Tbs natural peanut butter.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 4 oz roasted pork tenderloin.\n" +
                "2. 1/2 cup cooked quinoa.\n" +
                "3. 2 cups steamed swiss chard with\n     1 tsp flax oil + lemon juice.\n");

    }
}
