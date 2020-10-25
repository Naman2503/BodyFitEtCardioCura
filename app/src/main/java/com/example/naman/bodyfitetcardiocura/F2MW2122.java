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
public class F2MW2122 extends Fragment {


    public F2MW2122() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_mw2122, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. 4 scrambled egg whites on 2\n    slices of wholemeal toast.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. 1 Low-fat yoghurt.\n" +
                "2. Blueberries.\n" +
                "3. A handful of oats and honey.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. Smoothie – blend 25g with\n    protein, 80g raspberries, 80g\n    blueberries, 50g blackberries and\n    water.\n" +
                "2. 30g brazil nuts.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. 100g low-fat cottage cheese.\n" +
                "2. Pineapple.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. Tuna niçoise salad (100g tuna,\n    mixed salad leaves, plum\n    tomatoes, a red pepper and 4 new\n    potatoes).\n");

        TextView sz2 =(TextView)view.findViewById(R.id.sz2);
        sz2.setText("1. 250ml Skimmed milk.\n");

        return view;
    }

}
