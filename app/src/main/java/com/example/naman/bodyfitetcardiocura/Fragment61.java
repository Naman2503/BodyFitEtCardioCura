package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
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
public class Fragment61 extends Fragment {

    public Fragment61() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_fragment61, container, false);

        final ImageButton h1 = (ImageButton) view.findViewById(R.id.fb1);
        h1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MaleND.class);
                startActivity(intent);
            }
        });

        final ImageButton h2 = (ImageButton) view.findViewById(R.id.fb2);
        h2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MaleDY.class);
                startActivity(intent);
            }
        });

        final ImageButton h3 = (ImageButton) view.findViewById(R.id.fb3);
        h3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MaleW.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
