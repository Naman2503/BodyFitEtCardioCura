package com.example.naman.bodyfitetcardiocura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class BMIpop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmipop);

        getSupportActionBar().hide();

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.7));

        TextView t2 =(TextView)findViewById(R.id.t2);
        t2.setText("While a severely underweight condition is unhealthy, weight gain comes more easily to some \n" +
                "people than others. Not eating enough calories may be the primary reason you're thin. The \n" +
                "number of calories necessary to gain weight varies and depends on current intake, weight \n" +
                "gain, activity and genetics. Use a calorie booster to add extra calories as needed. You may \n" +
                "feel exercise is counter-effective when you're trying to gain weight, but you need to work \n" +
                "muscles for them to grow. A healthy weight-gain plan includes strength-training exercises \n" +
                "that work out all your major muscle groups -- arms, back, shoulders, chest, abs and legs.");

        TextView t4 =(TextView)findViewById(R.id.t4);
        t4.setText("Underweight might be secondary to or symptomatic of an underlying disease. Unexplained weight \n" +
                "loss may require professional medical diagnosis.Underweight can also be a primary causative \n" +
                "condition. Severely underweight individuals may have poor physical stamina and a weak \n" +
                "immune system, leaving them open to infection.\n" +
                "\n" +
                "Underweight individuals may be advised to gain weight by increasing calorie intake. Another \n" +
                "way for underweight people to gain weight is by exercising. Certain drugs may increase \n" +
                "appetite either as their primary effect or as a side effect normal.");

        TextView t6 =(TextView)findViewById(R.id.t6);
        t6.setText("A normal body mass index (BMI) does not necessarily mean you're healthy. But it also mean \n" +
                "that your BMI is under-control and you can do exercise with proper diet to remain fit further.");

        TextView t8 =(TextView)findViewById(R.id.t8);
        t8.setText("Being overweight or fat is having more body fat than is optimally healthy. Being overweight \n" +
                "is especially common where food supplies are plentiful and lifestyles are sedentary. If an \n" +
                "individual is overweight and has excess body fat it can create or lead to health risks. \n" +
                "Reports are surfacing, however, that being mildly overweight to slightly obese. The usual \n" +
                "treatments for overweight individuals are diet and physical exercise.");

        TextView t10 =(TextView)findViewById(R.id.t10);
        t10.setText("Obesity is a medical condition in which excess body fat has accumulated to the extent that \n" +
                "it may have a negative effect on health. Obesity is most commonly caused by a combination of \n" +
                "excessive food intake, lack of physical activity, and genetic susceptibility. A few cases \n" +
                "are caused primarily by genes, endocrine disorders, medications, or disorder. Changes to \n" +
                "diet and exercising are the main treatments.[2] Diet quality can be improved by reducing the \n" +
                "consumption of energy-dense foods, such as those high in fat or sugars, and by increasing \n" +
                "the intake of dietary fibre.");
    }
}
