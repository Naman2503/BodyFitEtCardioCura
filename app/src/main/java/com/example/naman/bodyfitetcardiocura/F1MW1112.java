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
public class F1MW1112 extends Fragment {


    public F1MW1112() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.activity_f1_mw1112, container, false);

        final Button bm1 = (Button)view.findViewById(R.id.video1);
        bm1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi1 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=zJmYRT4v9rw"));
                startActivity(bi1);
            }
        });

        final Button bm2 = (Button)view.findViewById(R.id.video2);
        bm2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi2 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/KMgAmFD-Z6U"));
                startActivity(bi2);
            }
        });

        final Button bm3 = (Button)view.findViewById(R.id.video3);
        bm3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi3 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/Cilm0WNRdCo"));
                startActivity(bi3);
            }
        });

        final Button bm4 = (Button)view.findViewById(R.id.video4);
        bm4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi4 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/JZQA08SlJnM"));
                startActivity(bi4);
            }
        });

        final Button bm5 = (Button)view.findViewById(R.id.video5);
        bm5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi5 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/wkD8rjkodUI"));
                startActivity(bi5);
            }
        });

        final Button bm6 = (Button)view.findViewById(R.id.video6);
        bm6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi6 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/sinpFajtRPw"));
                startActivity(bi6);
            }
        });

        final Button bm7 = (Button)view.findViewById(R.id.video7);
        bm7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi7 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/SU2UmCkiKC8"));
                startActivity(bi7);
            }
        });

        final Button bm8 = (Button)view.findViewById(R.id.video8);
        bm8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi8 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/Z2n58m2i4jg"));
                startActivity(bi8);
            }
        });

        final Button bm9 = (Button)view.findViewById(R.id.video9);
        bm9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi9 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/JZQA08SlJnM"));
                startActivity(bi9);
            }
        });

        final Button bm10 = (Button)view.findViewById(R.id.video10);
        bm10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi10 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/wkD8rjkodUI"));
                startActivity(bi10);
            }
        });

        final Button bm11 = (Button)view.findViewById(R.id.video11);
        bm11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi11 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/sinpFajtRPw"));
                startActivity(bi11);
            }
        });

        final Button bm12 = (Button)view.findViewById(R.id.video12);
        bm12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi12 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/SU2UmCkiKC8"));
                startActivity(bi12);
            }
        });

        final Button bm13 = (Button)view.findViewById(R.id.video13);
        bm13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi13 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/Z2n58m2i4jg"));
                startActivity(bi13);
            }
        });

        final Button bm14 = (Button)view.findViewById(R.id.video14);
        bm14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi14 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/JDcdhTuycOI"));
                startActivity(bi14);
            }
        });

        final Button bm15 = (Button)view.findViewById(R.id.video15);
        bm15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi15 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/eqVMAPM00DM"));
                startActivity(bi15);
            }
        });

        return view;
    }

}

