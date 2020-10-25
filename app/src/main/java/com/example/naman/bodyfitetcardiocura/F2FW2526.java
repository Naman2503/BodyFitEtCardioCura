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
public class F2FW2526 extends Fragment {


    public F2FW2526() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_fw2526, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. One grilled haddock fillet with\n    roasted peppers.\n" +
                "2. Courgettes.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. 100g chicken.\n" +
                "2. 1 tomato-sliced.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. 150g turkey with green salad.\n" +
                "2. Steamed broccoli and ½ tbsp olive\n    oil.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. 100g chicken.\n" +
                "2. 5 pecan nuts.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. 150g-200g steak served with\n    steamed green beans.\n" + "2. Broccoli.\n");

        return view;
    }

}
