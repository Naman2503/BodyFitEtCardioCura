package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FND6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnd6);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. Oatmeal pancakes:\n" +
                " ->1 whole egg\n" +
                " ->2 egg whites\n" +
                " ->1/4 cup old-fashioned or quick-\n     cooking oats\n" +
                " ->1 pinch of ground cinnamon\n" +
                " ->1/2 cup low fat cottage cheese\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. 5 celery sticks with 2 tsp peanut\n     butter.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. Green salad with shitake bacon:\n" +
                " ->1/2 cup cooked chickpeas\n" +
                " ->1 1/2 Tbsp olive oil\n" +
                " ->1/2 tsp paprika\n" +
                " ->1 tsp turmeric\n" +
                " ->1 pinch black pepper and sea salt\n" +
                " ->6-8 large shiitake mushrooms\n" +
                " ->2 cups torn butter lettuce\n" +
                " ->1 Tbsp Parmigiano-Reggiano\n" +
                " ->1/2 small clove garlic\n" +
                " ->1 Tbsp fresh lemon juice\n" +
                " ->1 Tbsp white balsamic vinegar\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1/2 grapefruit.\n" +
                "2. 10 walnuts.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. Quinoa stuffed pepper.\n");

    }
}
