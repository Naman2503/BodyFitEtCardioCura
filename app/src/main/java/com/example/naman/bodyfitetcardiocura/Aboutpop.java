package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Aboutpop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutpop);

        /*getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.9));*/

        TextView t1 =(TextView)findViewById(R.id.ts1);
        t1.setText("1.Healthcare providers are often looking for ways to objectively monitor and improve people health and fitness.\n" +
                "Our app takes the input from the users and then analyse these data and summarize them, as well as devise individualized plans and provide personalized coaching.\n" +
                "This Health and Fitness app has demonstrated that any individual will be benefited by improving exercise activities, diet control, weight management, stress relief, etc.\n\n" +
                "2.Home Workouts provides daily workout routines for all your main muscle groups.\n" +
                "In just a few minutes a day, you can build muscles and keep fitness at home without having to go to the gym.\n" +
                "No equipment or coach needed, all exercises can be performed with just your body weight.\n\n" +
                "3.The app has full body workouts. All the workouts are designed by experts.\n" +
                "None of them need equipment, so there is no need to go to the gym.\n" +
                "Even though it just takes a few minutes a day, it can effectively tone your muscles and help you get six pack abs at home.\n\n" +
                "4.The warm-up and stretching routines are designed to make sure you exercise in a scientific way.\n" +
                "With animations and video guidance for each exercise, you can make sure you use the right form during each exercise.\n\n" +
                "5.Stick with our home workouts, and you will notice a change in your body in just a few short weeks.\n");

        Button tc= (Button) findViewById(R.id.tcb1);
        tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Aboutpop.this,Contactpop.class);
                startActivity(intent);
            }
        });
    }
}
