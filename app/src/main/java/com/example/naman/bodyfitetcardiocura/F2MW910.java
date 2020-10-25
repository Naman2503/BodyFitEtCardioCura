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
public class F2MW910 extends Fragment {


    public F2MW910() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_mw910, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. 45g oats.\n" +
                "2. 300ml skimmed milk.\n" +
                "3. 1 tsp honey.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. 10 Radishes.\n" +
                "2. Balsamic vinaigrette.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. 1 can of tuna with beetroot.\n" +
                "2. 1 low-fat yoghurt.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. Smoothie – blend 25g with\n    protein, 80g raspberries, 80g\n    blueberries and 50g blackberries\n    with water.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. 120g barbecue chicken kebab\n    with peppers.\n" +
                "2. 70g brown rice.\n");

        TextView sz2 =(TextView)view.findViewById(R.id.sz2);
        sz2.setText("1. 100g cottage cheese.\n" + "2. Grapes.");

        return view;
    }

}
