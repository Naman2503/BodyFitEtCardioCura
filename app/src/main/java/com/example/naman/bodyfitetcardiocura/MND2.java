package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MND2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnd2);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 1 cup cooked steel cut oatmeal\n     (prepared with water).\n" +
                "2. 2 Tbs chopped walnuts.\n" +
                "3. 1 Tbs honey.\n" +
                "4. 1/2 cup blueberries.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 cup green grapes.\n" +
                "2. 3/4 cup low fat cottage cheese.\n" +
                "3. 6 whole wheat crackers.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. 4 oz roasted turkey breast.\n" +
                "2. 1/2 roasted red pepper.\n" +
                "3. 1 oz part skim mozzarella cheese.\n" +
                "4. 2 slices multigrain bread, toasted.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1/4 cup dried cranberries.\n" +
                "2. 10 almonds.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 4 oz grilled flank steak.\n" +
                "2. 1 cup steamed green beans with 2\n     tsp flax oil.\n" +
                "3. 3/4 cup cooked whole wheat\n     couscous.\n");

    }
}
