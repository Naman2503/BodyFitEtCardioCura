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
public class F2MW1112 extends Fragment {


    public F2MW1112() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_mw1112, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. 2-egg omelette.\n" +
                "2. Cheese.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. Smoothie: blend 25g protein,\n    1 apple, 50g blueberries, 50g\n    blackberries and a banana with\n    water.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. 90g sardines on 1 slice of\n    wholemeal toast.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. 150g raw carrots.\n" +
                "2. Hummus.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. 100g grilled salmon.\n" +
                "2. Green beans.\n" +
                "3. Asparagus.\n" +
                "4. 70g brown rice.\n");

        TextView sz2 =(TextView)view.findViewById(R.id.sz2);
        sz2.setText("1. 200ml skimmed milk.\n");

        return view;
    }

}
