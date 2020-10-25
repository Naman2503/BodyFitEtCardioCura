package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MND3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnd3);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1.Peanut Butter & Banana Shake:\n" +
                " ->1 oz vanilla protein powder\n" +
                " ->1 Tbs natural peanut butter\n" +
                " ->1 medium banana\n" +
                " ->1 Tbs wheat germ\n" +
                " ->8 fl oz skim milk.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 slice sprouted wheat bread,\n     toasted.\n" +
                "2. 1 oz low fat Swiss cheese.\n" +
                "3. 1 cup green grapes.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. 2 cups lentil soup.\n" +
                "2. 4 oz roasted turkey breast.\n" +
                "3. 3 cups chopped lettuce.\n" +
                "4. 2 tsp olive oil+2 tsp balsamic\n     vinegar.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 bell pepper, sliced.\n" +
                "2. 1 hard boiled egg.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 5 oz grilled chicken breast with 1\n     tsp olive oil+1 tsp chili powder.\n" +
                "2. 1 large baked sweet potato+1\n     Tbs low fat plain yogurt.\n" +
                "3. 2 cups broccoli roasted with 2 tsp\n     olive oil.\n");

    }
}
