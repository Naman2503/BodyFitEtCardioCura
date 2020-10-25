package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FemaleND extends AppCompatActivity implements View.OnClickListener{

    TextView ft1;
    Button fb1,fb2,fb3,fb4,fb5,fb6,fb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_nd);

        ft1= (TextView) findViewById(R.id.fnd);
        fb1= (Button) findViewById(R.id.fnd1);
        fb2= (Button) findViewById(R.id.fnd2);
        fb3= (Button) findViewById(R.id.fnd3);
        fb4= (Button) findViewById(R.id.fnd4);
        fb5= (Button) findViewById(R.id.fnd5);
        fb6= (Button) findViewById(R.id.fnd6);
        fb7= (Button) findViewById(R.id.fnd7);
        fb1.setOnClickListener(this);
        fb2.setOnClickListener(this);
        fb3.setOnClickListener(this);
        fb4.setOnClickListener(this);
        fb5.setOnClickListener(this);
        fb6.setOnClickListener(this);
        fb7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.fnd1)
        {
            Intent intent=new Intent(this,FND1.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fnd2)
        {
            Intent intent=new Intent(this,FND2.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fnd3)
        {
            Intent intent=new Intent(this,FND3.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fnd4)
        {
            Intent intent=new Intent(this,FND4.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fnd5)
        {
            Intent intent=new Intent(this,FND5.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fnd6)
        {
            Intent intent=new Intent(this,FND6.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fnd7)
        {
            Intent intent=new Intent(this,FND7.class);
            startActivity(intent);
        }

    }

}
