package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FAQs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        Button f1= (Button) findViewById(R.id.fq1);
        f1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop1.class);
                startActivity(intent);
            }
        });

        Button f2= (Button) findViewById(R.id.fq2);
        f2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop2.class);
                startActivity(intent);
            }
        });

        Button f3= (Button) findViewById(R.id.fq3);
        f3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop3.class);
                startActivity(intent);
            }
        });

        Button f4= (Button) findViewById(R.id.fq4);
        f4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop4.class);
                startActivity(intent);
            }
        });

        Button f5= (Button) findViewById(R.id.fq5);
        f5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop5.class);
                startActivity(intent);
            }
        });

        Button f6= (Button) findViewById(R.id.fq6);
        f6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop6.class);
                startActivity(intent);
            }
        });

        Button f7= (Button) findViewById(R.id.fq7);
        f7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop7.class);
                startActivity(intent);
            }
        });

        Button f8= (Button) findViewById(R.id.fq8);
        f8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop8.class);
                startActivity(intent);
            }
        });

        Button f9= (Button) findViewById(R.id.fq9);
        f9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop9.class);
                startActivity(intent);
            }
        });

        Button f10= (Button) findViewById(R.id.fq10);
        f10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(FAQs.this,FAQpop10.class);
                startActivity(intent);
            }
        });
    }
}
