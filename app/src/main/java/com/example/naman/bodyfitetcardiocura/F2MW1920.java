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
public class F2MW1920 extends Fragment {


    public F2MW1920() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_mw1920, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. Smoothie – blend 25g with\n    protein, 300ml skimmed milk,\n    100g strawberries and a banana.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. 90g Mackerel on 1 slice of\n    wholemeal toast.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. 1 apple.\n" +
                "2. Chicken salad sandwich.\n" +
                "3. Wholemeal bread.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. 1 Banana.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. 120g Fillet steak.\n" +
                "2. Spinach.\n" +
                "3. 2 Grilled tomatoes.\n");

        TextView sz2 =(TextView)view.findViewById(R.id.sz2);
        sz2.setText("1. 100g low-fat cottage cheese.\n" +
                "2. Pineapple.\n");

        return view;
    }

}
