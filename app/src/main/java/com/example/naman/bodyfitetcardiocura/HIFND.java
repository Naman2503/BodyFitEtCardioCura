package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HIFND extends AppCompatActivity implements View.OnClickListener{

    TextView hd1;
    Button hf1,hf2,hf3,hf4,hf5,hf6,hf7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hifnd);

        hd1= (TextView) findViewById(R.id.hft1);
        hf1= (Button) findViewById(R.id.hifnd1);
        hf2= (Button) findViewById(R.id.hifnd2);
        hf3= (Button) findViewById(R.id.hifnd3);
        hf4= (Button) findViewById(R.id.hifnd4);
        hf5= (Button) findViewById(R.id.hifnd5);
        hf6= (Button) findViewById(R.id.hifnd6);
        hf7= (Button) findViewById(R.id.hifnd7);
        hf1.setOnClickListener(this);
        hf2.setOnClickListener(this);
        hf3.setOnClickListener(this);
        hf4.setOnClickListener(this);
        hf5.setOnClickListener(this);
        hf6.setOnClickListener(this);
        hf7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.hifnd1)
        {
            Intent intent=new Intent(this,HIMND1.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.hifnd2)
        {
            Intent intent=new Intent(this,HIMND3.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.hifnd3)
        {
            Intent intent=new Intent(this,HIMND5.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.hifnd4)
        {
            Intent intent=new Intent(this,HIMND7.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.hifnd5)
        {
            Intent intent=new Intent(this,HIMND2.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.hifnd6)
        {
            Intent intent=new Intent(this,HIMND4.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.hifnd7)
        {
            Intent intent=new Intent(this,HIMND6.class);
            startActivity(intent);
        }

    }

}
