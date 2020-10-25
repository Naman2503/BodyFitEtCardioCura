package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MND6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnd6);

        TextView b2 =(TextView)findViewById(R.id.b2);
        b2.setText("1. 8 oz low fat plain yogurt.\n" +
                "2. 2 Tbs wheat germ.\n" +
                "3. 1 Tbs honey.\n" +
                "4. 1 cup blueberries.\n" +
                "5. 1/2 whole wheat english muffin,\n     toasted.\n");

        TextView sx2 =(TextView)findViewById(R.id.sx2);
        sx2.setText("1. Trail Mix:\n" +
                " ->1/4 cup dried cranberries\n" +
                " ->2 Tbs chopped almonds\n" +
                " ->2 Tbs sunflower seeds.\n");

        TextView l2 =(TextView)findViewById(R.id.l2);
        l2.setText("1. 5 oz turkey burger, cooked.\n" +
                "2. 3 cups mixed greens.\n" +
                "3. 1/4 cup chopped tomato.\n" +
                "4. 2 Tbs diced avocado.\n" +
                "5. 1 Tbs olive oil+lemon juice.\n");

        TextView sy2 =(TextView)findViewById(R.id.sy2);
        sy2.setText("1. 1 bell pepper, sliced.\n" +
                "2. White Bean Dip:\n" +
                " ->1/2 cup canned cannelloni beans\n" +
                " ->2 Tbs chopped scallion + 1 tsp\n     olive oil + 1/2 tsp lemon zest.\n");

        TextView d2 =(TextView)findViewById(R.id.d2);
        d2.setText("1. 4 oz cooked turkey cutlet (breast\n     meat), sliced.\n" +
                "2. 1 cup steamed green beans with 2\n     tsp flax oil.\n" +
                "3. 1 cup cooked brown rice.\n");

    }
}
