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
public class F2FW2728 extends Fragment {


    public F2FW2728() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_fw2728, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. 3-egg-white omelette.\n" +
                "2. Grilled tomatoes.\n" +
                "3. Steamed spinach.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. 100g turkey.\n" +
                "2. 5 Brazil nuts.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. 150g chicken breast.\n" +
                "2. Steamed asparagus.\n" +
                "3. Green salad.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. 100g turkey.\n" +
                "2. ¼ Cucumber-sliced.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. Grilled skinless duck breast.\n" +
                "2. Steamed oriental greens or\n    broccoli.\n");

        return view;
    }

}
