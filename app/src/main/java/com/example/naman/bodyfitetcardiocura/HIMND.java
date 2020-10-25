package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HIMND extends AppCompatActivity implements View.OnClickListener{

    TextView ht1;
    Button hm1,hm2,hm3,hm4,hm5,hm6,hm7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himnd);

        ht1= (TextView) findViewById(R.id.hmt1);
        hm1= (Button) findViewById(R.id.himnd1);
        hm2= (Button) findViewById(R.id.himnd2);
        hm3= (Button) findViewById(R.id.himnd3);
        hm4= (Button) findViewById(R.id.himnd4);
        hm5= (Button) findViewById(R.id.himnd5);
        hm6= (Button) findViewById(R.id.himnd6);
        hm7= (Button) findViewById(R.id.himnd7);
        hm1.setOnClickListener(this);
        hm2.setOnClickListener(this);
        hm3.setOnClickListener(this);
        hm4.setOnClickListener(this);
        hm5.setOnClickListener(this);
        hm6.setOnClickListener(this);
        hm7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.himnd1)
        {
            Intent intent=new Intent(this,HIMND1.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.himnd2)
        {
            Intent intent=new Intent(this,HIMND2.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.himnd3)
        {
            Intent intent=new Intent(this,HIMND3.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.himnd4)
        {
            Intent intent=new Intent(this,HIMND4.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.himnd5)
        {
            Intent intent=new Intent(this,HIMND5.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.himnd6)
        {
            Intent intent=new Intent(this,HIMND6.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.himnd7)
        {
            Intent intent=new Intent(this,HIMND7.class);
            startActivity(intent);
        }

    }

}
