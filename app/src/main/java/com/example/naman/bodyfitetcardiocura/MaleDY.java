package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MaleDY extends AppCompatActivity implements View.OnClickListener{

    TextView u1;
    Button c1,c2,c3,c4,c5,c6,c7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_dy);

        u1= (TextView) findViewById(R.id.mdy);
        c1= (Button) findViewById(R.id.mdy1);
        c2= (Button) findViewById(R.id.mdy2);
        c3= (Button) findViewById(R.id.mdy3);
        c4= (Button) findViewById(R.id.mdy4);
        c5= (Button) findViewById(R.id.mdy5);
        c6= (Button) findViewById(R.id.mdy6);
        c7= (Button) findViewById(R.id.mdy7);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.mdy1)
        {
            Intent intent=new Intent(this,MDY1.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mdy2)
        {
            Intent intent=new Intent(this,MDY2.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mdy3)
        {
            Intent intent=new Intent(this,MDY3.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mdy4)
        {
            Intent intent=new Intent(this,MDY4.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mdy5)
        {
            Intent intent=new Intent(this,MDY5.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mdy6)
        {
            Intent intent=new Intent(this,MDY6.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mdy7)
        {
            Intent intent=new Intent(this,MDY7.class);
            startActivity(intent);
        }

    }
}
