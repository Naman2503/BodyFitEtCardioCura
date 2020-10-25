package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment62 extends Fragment {


    public Fragment62() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_fragment62, container, false);

        final ImageButton h1 = (ImageButton) view.findViewById(R.id.fc1);
        h1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FemaleND.class);
                startActivity(intent);
            }
        });

        final ImageButton h2 = (ImageButton) view.findViewById(R.id.fc2);
        h2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MaleDY.class);
                startActivity(intent);
            }
        });

        final ImageButton h3 = (ImageButton) view.findViewById(R.id.fc3);
        h3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FemaleW.class);
                startActivity(intent);
            }
        });

        return view;
    }

}

