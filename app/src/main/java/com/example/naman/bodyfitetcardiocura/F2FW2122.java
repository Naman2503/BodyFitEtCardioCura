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
public class F2FW2122 extends Fragment {


    public F2FW2122() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_fw2122, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. Scrambled eggs (one whole, two\n    whites).\n" +
                "2. Tomatoes.\n" +
                "3. Green beans.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. 100g turkey slices.\n" +
                "2. ¼ Cucumber-sliced.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. Baked cod fillet with salad.\n" +
                "2. Tomato.\n" +
                "3. Spinach with ½ tbsp olive oil.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. 100g chicken breast.\n" +
                "2. ½ Grilled courgette.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. 100g chicken breast stir-fry made\n    with ½ tsp oil and green veg.\n");

        return view;
    }

}
