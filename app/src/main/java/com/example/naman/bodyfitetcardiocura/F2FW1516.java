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
public class F2FW1516 extends Fragment {


    public F2FW1516() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_fw1516, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. Omelette made with three egg\n    whites and filled with 75g chopped\n    mixed peppers and a handful of\n    spinach.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. 100g chicken with ½ red pepper,\n    sliced.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. One grilled chicken breast.\n" +
                "2. Mixed salad leaves.\n" +
                "3. Red peppers.\n" +
                "4. Green beans with ¼ tbsp olive oil.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. 100g turkey breast.\n" +
                "2. ¼ cucumber-sliced.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. 100g grilled chicken breast.\n" +
                "2. Steamed broccoli.\n");

        return view;
    }

}
