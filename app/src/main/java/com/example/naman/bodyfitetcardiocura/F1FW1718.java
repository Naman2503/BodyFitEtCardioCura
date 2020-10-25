package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1FW1718 extends Fragment {


    public F1FW1718() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f1_fw1718, container, false);

        final Button bm1 = (Button)view.findViewById(R.id.video1);
        bm1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi1 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=iSSAk4XCsRA"));
                startActivity(bi1);
            }
        });

        final Button bm2 = (Button)view.findViewById(R.id.video2);
        bm2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi2 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=mGvzVjuY8SY"));
                startActivity(bi2);
            }
        });

        final Button bm3 = (Button)view.findViewById(R.id.video3);
        bm3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi3 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=Gr8Nvldbz6A"));
                startActivity(bi3);
            }
        });

        final Button bm4 = (Button)view.findViewById(R.id.video4);
        bm4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi4 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=jgh6sGwtTwk"));
                startActivity(bi4);
            }
        });

        final Button bm5 = (Button)view.findViewById(R.id.video5);
        bm5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi5 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=jgh6sGwtTwk"));
                startActivity(bi5);
            }
        });

        final Button bm6 = (Button)view.findViewById(R.id.video6);
        bm6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi6 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=eEG9uXjx4vQ"));
                startActivity(bi6);
            }
        });

        final Button bm7 = (Button)view.findViewById(R.id.video7);
        bm7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi7 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=ah8xx4r1nfU"));
                startActivity(bi7);
            }
        });

        final Button bm8 = (Button)view.findViewById(R.id.video8);
        bm8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi8 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=YB0egDzsu18"));
                startActivity(bi8);
            }
        });

        final Button bm9 = (Button)view.findViewById(R.id.video9);
        bm9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi9 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=dn0OfNMXoOw"));
                startActivity(bi9);
            }
        });

        final Button bm10 = (Button)view.findViewById(R.id.video10);
        bm10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi10 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=Gf8FkwgU5RA"));
                startActivity(bi10);
            }
        });

        return view;
    }

}

