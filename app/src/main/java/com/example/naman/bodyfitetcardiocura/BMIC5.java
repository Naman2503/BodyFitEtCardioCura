package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMIC5 extends AppCompatActivity {

    private CheckBox c1;
    private Button bt,bmi1,bmi2,bmi3,bmi4,bmi5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmic5);
        addListnerOnButton();

        final EditText e1 = (EditText) findViewById(R.id.wtb);
        final EditText e2 = (EditText) findViewById(R.id.htb);
        final TextView tv5 = (TextView) findViewById(R.id.bt1);

        findViewById(R.id.calc).setOnClickListener(new View.OnClickListener() {

            // Logic for validation, input can't be empty
            @Override
            public void onClick(View v) {

                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();

                if(TextUtils.isEmpty(str1)){
                    e1.setError("Please enter your weight");
                    e1.requestFocus();
                    return;
                }

                if(TextUtils.isEmpty(str2)){
                    e2.setError("Please enter your height");
                    e2.requestFocus();
                    return;
                }

//Get the user values from the widget reference
                float weight = Float.parseFloat(str1);
                float height = Float.parseFloat(str2)/100;

//Calculate BMI value
                float bmiValue = calculateBMI(weight, height);

//Define the meaning of the bmi value
                String bmiInterpretation = interpretBMI(bmiValue);

                tv5.setText(String.valueOf(bmiValue + "-" + bmiInterpretation));

            }
        });
    }

    public void addListnerOnButton(){
        c1=(CheckBox) findViewById(R.id.hi);
        bt= (Button) findViewById(R.id.pro);
        bmi1= (Button) findViewById(R.id.bmi1);
        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(c1.isChecked()){
                    click2();
                }
                else {
                    click1();
                }

            }
        });

        bmi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BMIC5.this,BMIpop.class);
                startActivity(intent);
            }
        });

        /*Button sb1= (Button) findViewById(R.id.s1);
        sb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BMIC5.this,Slide2.class);
                startActivity(intent);
            }
        }); */


    }

    public void click1()
    {
        Intent intent=new Intent(this,Exo6.class);
        startActivity(intent);
    }

    public void click2()
    {
        Intent intent=new Intent(this,HIMF.class);
        startActivity(intent);
    }

    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }

    // Interpret what BMI means
    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return "Severely underweight";

        } else if (bmiValue < 18.5) {
            return "Underweight";

        } else if (bmiValue < 25) {
            return "Normal";

        } else if (bmiValue < 30) {
            return "Overweight";

        } else {
            return "Obesity";

        }
    }

}
