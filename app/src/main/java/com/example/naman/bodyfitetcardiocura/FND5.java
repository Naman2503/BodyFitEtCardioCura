package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FND5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnd5);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 1/3 cup dried oatmeal cooked in\n     water.\n" +
                "2. 1 banana with 2 tsp almond\n     butter.\n" +
                "3. Dash of cinnamon.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 1 cup cucumber slices.\n" +
                "2. 2 Tbsp guacamole.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Avocado and cucumber nori rolls.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 7 oz full-fat plain greek yogurt.\n" +
                "2. 1 Tbsp flaxseeds.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 4 oz salmon baked with 1/4 lemon\n     juice.\n" +
                "2. 1 tbsp dijon mustard.\n" +
                "3. 1 Tbsp chopped fresh parsley.\n" +
                "4. 2 cups sauteed spinach.\n");

    }
}
