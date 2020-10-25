package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MaleW extends AppCompatActivity implements View.OnClickListener{

    TextView v1;
    Button d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_w);

        v1= (TextView) findViewById(R.id.mw);
        d1= (Button) findViewById(R.id.mw1);
        d2= (Button) findViewById(R.id.mw2);
        d3= (Button) findViewById(R.id.mw3);
        d4= (Button) findViewById(R.id.mw4);
        d5= (Button) findViewById(R.id.mw5);
        d6= (Button) findViewById(R.id.mw6);
        d7= (Button) findViewById(R.id.mw7);
        d8= (Button) findViewById(R.id.mw8);
        d9= (Button) findViewById(R.id.mw9);
        d10= (Button) findViewById(R.id.mw10);
        d11= (Button) findViewById(R.id.mw11);
        d12= (Button) findViewById(R.id.mw12);
        d13= (Button) findViewById(R.id.mw13);
        d14= (Button) findViewById(R.id.mw14);
        d15= (Button) findViewById(R.id.mw15);
        d16= (Button) findViewById(R.id.mw16);
        d17= (Button) findViewById(R.id.mw17);
        d18= (Button) findViewById(R.id.mw18);
        d19= (Button) findViewById(R.id.mw19);
        d20= (Button) findViewById(R.id.mw20);
        d21= (Button) findViewById(R.id.mw21);
        d22= (Button) findViewById(R.id.mw22);
        d23= (Button) findViewById(R.id.mw23);
        d24= (Button) findViewById(R.id.mw24);
        d25= (Button) findViewById(R.id.mw25);
        d26= (Button) findViewById(R.id.mw26);
        d27= (Button) findViewById(R.id.mw27);
        d28= (Button) findViewById(R.id.mw28);
        d1.setOnClickListener(this);
        d2.setOnClickListener(this);
        d3.setOnClickListener(this);
        d4.setOnClickListener(this);
        d5.setOnClickListener(this);
        d6.setOnClickListener(this);
        d7.setOnClickListener(this);
        d8.setOnClickListener(this);
        d9.setOnClickListener(this);
        d10.setOnClickListener(this);
        d11.setOnClickListener(this);
        d12.setOnClickListener(this);
        d13.setOnClickListener(this);
        d14.setOnClickListener(this);
        d15.setOnClickListener(this);
        d16.setOnClickListener(this);
        d17.setOnClickListener(this);
        d18.setOnClickListener(this);
        d19.setOnClickListener(this);
        d20.setOnClickListener(this);
        d21.setOnClickListener(this);
        d22.setOnClickListener(this);
        d23.setOnClickListener(this);
        d24.setOnClickListener(this);
        d25.setOnClickListener(this);
        d26.setOnClickListener(this);
        d27.setOnClickListener(this);
        d28.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.mw1)
        {
            Intent intent=new Intent(this,MW12.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw2)
        {
            Intent intent=new Intent(this,MW12.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw3)
        {
            Intent intent=new Intent(this,MW34.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw4)
        {
            Intent intent=new Intent(this,MW34.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw5)
        {
            Intent intent=new Intent(this,MW56.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw6)
        {
            Intent intent=new Intent(this,MW56.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw7)
        {
            Intent intent=new Intent(this,MW78.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw8)
        {
            Intent intent=new Intent(this,MW78.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw9)
        {
            Intent intent=new Intent(this,MW910.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw10)
        {
            Intent intent=new Intent(this,MW910.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw11)
        {
            Intent intent=new Intent(this,MW1112.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw12)
        {
            Intent intent=new Intent(this,MW1112.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw13)
        {
            Intent intent=new Intent(this,MW1314.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw14)
        {
            Intent intent=new Intent(this,MW1314.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw15)
        {
            Intent intent=new Intent(this,MW1516.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw16)
        {
            Intent intent=new Intent(this,MW1516.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw17)
        {
            Intent intent=new Intent(this,MW1718.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw18)
        {
            Intent intent=new Intent(this,MW1718.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw19)
        {
            Intent intent=new Intent(this,MW1920.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw20)
        {
            Intent intent=new Intent(this,MW1920.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw21)
        {
            Intent intent=new Intent(this,MW2122.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw22)
        {
            Intent intent=new Intent(this,MW2122.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw23)
        {
            Intent intent=new Intent(this,MW2324.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw24)
        {
            Intent intent=new Intent(this,MW2324.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw25)
        {
            Intent intent=new Intent(this,MW2526.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw26)
        {
            Intent intent=new Intent(this,MW2526.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw27)
        {
            Intent intent=new Intent(this,MW2728.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.mw28)
        {
            Intent intent=new Intent(this,MW2728.class);
            startActivity(intent);
        }


    }
}
