package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MDY7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdy7);

        Button y1= (Button) findViewById(R.id.by1);
        y1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD10.class);
                startActivity(intent);
            }
        });

        Button y2= (Button) findViewById(R.id.by2);
        y2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD9.class);
                startActivity(intent);
            }
        });

        Button y3= (Button) findViewById(R.id.by3);
        y3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD3.class);
                startActivity(intent);
            }
        });

        Button y4= (Button) findViewById(R.id.by4);
        y4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD6.class);
                startActivity(intent);
            }
        });

        Button y5= (Button) findViewById(R.id.by5);
        y5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD8.class);
                startActivity(intent);
            }
        });

        Button y6= (Button) findViewById(R.id.by6);
        y6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD19.class);
                startActivity(intent);
            }
        });

        Button y7= (Button) findViewById(R.id.by7);
        y7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD7.class);
                startActivity(intent);
            }
        });

        Button y8= (Button) findViewById(R.id.by8);
        y8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD15.class);
                startActivity(intent);
            }
        });

        Button y9= (Button) findViewById(R.id.by9);
        y9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD14.class);
                startActivity(intent);
            }
        });

        Button y10= (Button) findViewById(R.id.by10);
        y10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MDY7.this,YPopD11.class);
                startActivity(intent);
            }
        });

        Button bm1 = (Button)findViewById(R.id.v1);
        bm1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi1 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/cL7n4_y_PHo"));
                startActivity(bi1);
            }
        });

        Button bm2 = (Button)findViewById(R.id.v2);
        bm2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi2 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/49N1m_RZmVQ"));
                startActivity(bi2);
            }
        });

        Button bm3 = (Button)findViewById(R.id.v3);
        bm3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi3 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/EpXmHyO5uRk"));
                startActivity(bi3);
            }
        });

        Button bm4 = (Button)findViewById(R.id.v4);
        bm4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi4 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/Z43c1aeAMeM"));
                startActivity(bi4);
            }
        });

        Button bm5 = (Button)findViewById(R.id.v5);
        bm5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi5 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/y-9U3I7fGQQ"));
                startActivity(bi5);
            }
        });

        Button bm6 = (Button)findViewById(R.id.v6);
        bm6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi6 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/UdIf0m2oh3s"));
                startActivity(bi6);
            }
        });

        Button bm7 = (Button)findViewById(R.id.v7);
        bm7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi7 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/fMxEHVzcAJ4"));
                startActivity(bi7);
            }
        });

        Button bm8 = (Button)findViewById(R.id.v8);
        bm8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi8 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/a4wuKEUqGZA"));
                startActivity(bi8);
            }
        });

        Button bm9 = (Button)findViewById(R.id.v9);
        bm9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi9 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/qC9-Rj3NEcE"));
                startActivity(bi9);
            }
        });

        Button bm10 = (Button)findViewById(R.id.v10);
        bm10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bi10 = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/YXOeBUjmERI"));
                startActivity(bi10);
            }
        });

    }
}
