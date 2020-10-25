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
public class F2FW1920 extends Fragment {


    public F2FW1920() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_fw1920, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. 100g smoked salmon.\n" +
                "2. Spinach.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. 100g chicken breast with ½ yellow\n    pepper, sliced.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. One grilled chicken breast with\n    garden salad and ½ tbsp olive oil.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. 100g turkey slices.\n" +
                "2. ¼ Avocado.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. One grilled lamb steak (or two\n    cutlets).\n" +
                "2. Steamed broccoli.\n" +
                "3. Spinach.\n");

        return view;
    }

}
