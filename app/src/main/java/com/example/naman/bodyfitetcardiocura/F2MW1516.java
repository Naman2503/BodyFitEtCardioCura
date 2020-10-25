package com.example.naman.bodyfitetcardiocura;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2MW1516 extends Fragment {


    public F2MW1516() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_mw1516, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. 45g oats.\n" +
                "2. 300ml skimmed milk.\n" +
                "3. 1 tsp honey.\n" +
                "4. 200ml apple juice.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. 120g low-fat yoghurt.\n" +
                "2. Blueberries.\n" +
                "3. Honey.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. Grilled chicken(1 chicken breast).\n" +
                "2. Salad sandwich.\n" +
                "3. Wholemeal bread.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. Smoothie – blend 25g with\n    protein, 80g raspberries, 80g\n    blueberries, 50g blackberries and\n    water.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. 120g tuna steak.\n" +
                "2. Stir-fried broccoli.\n" +
                "3. Mushrooms.\n" +
                "4. Green beans.\n" +
                "5. Sesame seeds and oil.\n" +
                "6. 70g brown rice.\n");

        TextView sz2 =(TextView)view.findViewById(R.id.sz2);
        sz2.setText("1. 250ml skimmed milk.\n");

        return view;
    }

}
