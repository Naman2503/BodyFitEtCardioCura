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
public class F2MW2728 extends Fragment {


    public F2MW2728() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f2_mw2728, container, false);


        TextView b2 =(TextView)view.findViewById(R.id.b2);
        b2.setText("1. 4 scrambled egg whites on 2\n    slices of wholemeal toast.\n" +
                "2. 1 Grapefruit.\n");

        TextView sx2 =(TextView)view.findViewById(R.id.sx2);
        sx2.setText("1. Smoothie – blend 25g protein,\n    300ml skimmed milk, 50g\n    blueberries, 50g blackberries and a\n    banana.\n");

        TextView l2 =(TextView)view.findViewById(R.id.l2);
        l2.setText("1. Tuna sandwich on wholemeal\n    bread.\n" +
                "2. 1 Pear.\n");

        TextView sy2 =(TextView)view.findViewById(R.id.sy2);
        sy2.setText("1. Mixed nuts and fruit bar.\n");

        TextView d2 =(TextView)view.findViewById(R.id.d2);
        d2.setText("1. 120g fillet steak.\n" +
                "2. 1 small jacket potato.\n" +
                "3. Spinach.\n" +
                "4. 1 Grilled tomato.\n");

        TextView sz2 =(TextView)view.findViewById(R.id.sz2);
        sz2.setText("1. 1 Apple.\n" + "2. 2 tbsp natural peanut butter.\n");

        return view;
    }

}
