package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HIF1 extends Fragment {

    public HIF1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_hif1, container, false);

        final ImageButton h1 = (ImageButton) view.findViewById(R.id.hib1);
        h1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HIMND.class);
                startActivity(intent);
            }
        });

        final ImageButton h2 = (ImageButton) view.findViewById(R.id.hib2);
        h2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MaleDY.class);
                startActivity(intent);
            }
        });


        return view;
    }

}
