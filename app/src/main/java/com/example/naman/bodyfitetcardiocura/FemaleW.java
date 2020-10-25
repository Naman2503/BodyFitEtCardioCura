package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FemaleW extends AppCompatActivity implements View.OnClickListener{

    TextView fv1;
    Button fd1,fd2,fd3,fd4,fd5,fd6,fd7,fd8,fd9,fd10,fd11,fd12,fd13,fd14,fd15,fd16,fd17,fd18,fd19,fd20,fd21,fd22,fd23,
            fd24,fd25,fd26,fd27,fd28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_w);

        fv1= (TextView) findViewById(R.id.fw);
        fd1= (Button) findViewById(R.id.fw1);
        fd2= (Button) findViewById(R.id.fw2);
        fd3= (Button) findViewById(R.id.fw3);
        fd4= (Button) findViewById(R.id.fw4);
        fd5= (Button) findViewById(R.id.fw5);
        fd6= (Button) findViewById(R.id.fw6);
        fd7= (Button) findViewById(R.id.fw7);
        fd8= (Button) findViewById(R.id.fw8);
        fd9= (Button) findViewById(R.id.fw9);
        fd10= (Button) findViewById(R.id.fw10);
        fd11= (Button) findViewById(R.id.fw11);
        fd12= (Button) findViewById(R.id.fw12);
        fd13= (Button) findViewById(R.id.fw13);
        fd14= (Button) findViewById(R.id.fw14);
        fd15= (Button) findViewById(R.id.fw15);
        fd16= (Button) findViewById(R.id.fw16);
        fd17= (Button) findViewById(R.id.fw17);
        fd18= (Button) findViewById(R.id.fw18);
        fd19= (Button) findViewById(R.id.fw19);
        fd20= (Button) findViewById(R.id.fw20);
        fd21= (Button) findViewById(R.id.fw21);
        fd22= (Button) findViewById(R.id.fw22);
        fd23= (Button) findViewById(R.id.fw23);
        fd24= (Button) findViewById(R.id.fw24);
        fd25= (Button) findViewById(R.id.fw25);
        fd26= (Button) findViewById(R.id.fw26);
        fd27= (Button) findViewById(R.id.fw27);
        fd28= (Button) findViewById(R.id.fw28);
        fd1.setOnClickListener(this);
        fd2.setOnClickListener(this);
        fd3.setOnClickListener(this);
        fd4.setOnClickListener(this);
        fd5.setOnClickListener(this);
        fd6.setOnClickListener(this);
        fd7.setOnClickListener(this);
        fd8.setOnClickListener(this);
        fd9.setOnClickListener(this);
        fd10.setOnClickListener(this);
        fd11.setOnClickListener(this);
        fd12.setOnClickListener(this);
        fd13.setOnClickListener(this);
        fd14.setOnClickListener(this);
        fd15.setOnClickListener(this);
        fd16.setOnClickListener(this);
        fd17.setOnClickListener(this);
        fd18.setOnClickListener(this);
        fd19.setOnClickListener(this);
        fd20.setOnClickListener(this);
        fd21.setOnClickListener(this);
        fd22.setOnClickListener(this);
        fd23.setOnClickListener(this);
        fd24.setOnClickListener(this);
        fd25.setOnClickListener(this);
        fd26.setOnClickListener(this);
        fd27.setOnClickListener(this);
        fd28.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.fw1)
        {
            Intent intent=new Intent(this,FW12.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw2)
        {
            Intent intent=new Intent(this,FW12.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw3)
        {
            Intent intent=new Intent(this,FW34.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw4)
        {
            Intent intent=new Intent(this,FW34.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw5)
        {
            Intent intent=new Intent(this,FW56.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw6)
        {
            Intent intent=new Intent(this,FW56.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw7)
        {
            Intent intent=new Intent(this,FW78.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw8)
        {
            Intent intent=new Intent(this,FW78.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw9)
        {
            Intent intent=new Intent(this,FW910.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw10)
        {
            Intent intent=new Intent(this,FW910.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw11)
        {
            Intent intent=new Intent(this,FW1112.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw12)
        {
            Intent intent=new Intent(this,FW1112.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw13)
        {
            Intent intent=new Intent(this,FW1314.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw14)
        {
            Intent intent=new Intent(this,FW1314.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw15)
        {
            Intent intent=new Intent(this,FW1516.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw16)
        {
            Intent intent=new Intent(this,FW1516.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw17)
        {
            Intent intent=new Intent(this,FW1718.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw18)
        {
            Intent intent=new Intent(this,FW1718.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw19)
        {
            Intent intent=new Intent(this,FW1920.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw20)
        {
            Intent intent=new Intent(this,FW1920.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw21)
        {
            Intent intent=new Intent(this,FW2122.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw22)
        {
            Intent intent=new Intent(this,FW2122.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw23)
        {
            Intent intent=new Intent(this,FW2324.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw24)
        {
            Intent intent=new Intent(this,FW2324.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw25)
        {
            Intent intent=new Intent(this,FW2526.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw26)
        {
            Intent intent=new Intent(this,FW2526.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw27)
        {
            Intent intent=new Intent(this,FW2728.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.fw28)
        {
            Intent intent=new Intent(this,FW2728.class);
            startActivity(intent);
        }


    }

}
