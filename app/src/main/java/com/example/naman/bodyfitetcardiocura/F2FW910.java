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
public class F2FW910 extends Fragment {


    public F2FW910() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_fw910, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. 200g turkey breast.\n" +
                "2. ¼ Avocado.\n" +
                "3. ¼ Cucumber-sliced.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. Two hard-boiled eggs with ½ red\n    pepper-sliced.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. 150g grilled prawns.\n" +
                "2. A green salad.\n" +
                "3. Tomatoes.\n" +
                "4. ½ tbsp olive oil.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. 100g turkey breast.\n" +
                "2. Five almonds.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. 100g chicken breast.\n" +
                "2. Steamed broccoli.\n");

        return view;
    }

}
