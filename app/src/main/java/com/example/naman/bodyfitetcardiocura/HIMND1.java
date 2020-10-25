package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HIMND1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himnd1);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 1 cup cooked oatmeal,sprinkled\n     with 1 Tbsp chopped walnuts and\n     1 tsp cinnamon.\n" +
                "2. 1 banana.\n" +
                "3. 1 cup skim milk.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 medium apple.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. 1 cup low fat(1 percent or\n     lower), plain yogurt with 1 tsp\n     ground flaxseed.\n" +
                "2. 1/2 cup peach halves,canned in\n     juice.\n" +
                "3. 5 melba toast crackers.\n" +
                "4. 1 cup raw broccoli and\n     cauliflower.\n" +
                "5. 2 Tbsp low-fat cream cheese,plain\n     or vegetable flavor(as a spread\n     for crackers or vegetable dip).\n" +
                "6. Sparkling water.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 medium orange.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 4 ounces salmon.\n" +
                "2. 1/2 cup green beans with 1 Tbsp\n     toasted almonds.\n" +
                "3. 2 cups mixed salad greens.\n" +
                "4. 2 Tbsp low-fat salad dressing.\n" +
                "5. 1 Tbsp sunflower seeds.\n" +
                "6. 1 cup skim milk.\n" +
                "7. 1 small orange.\n");

    }
}
