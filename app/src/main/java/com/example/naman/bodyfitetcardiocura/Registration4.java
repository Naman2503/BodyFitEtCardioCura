package com.example.naman.bodyfitetcardiocura;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class Registration4 extends AppCompatActivity {

    EditText first,last,email,mobile,pass,confpass;
    Button save,cancel;
    DatabaseHandler4 db;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration4);


        first=(EditText)findViewById(R.id.editfirstname);
        last=(EditText)findViewById(R.id.editlastname);
        email=(EditText)findViewById(R.id.editemail);
        mobile=(EditText)findViewById(R.id.editmobileno);
        pass=(EditText)findViewById(R.id.editpassword);
        confpass=(EditText)findViewById(R.id.editconformpassword);

        save=(Button)findViewById(R.id.btnsave);
        cancel=(Button)findViewById(R.id.btncancel);


        save.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){
                // TODO Auto-generated method stub

                String edfirst=first.getText().toString();
                String edlast=last.getText().toString();
                String edemail=email.getText().toString();
                String edmobile=mobile.getText().toString();
                String edpass=pass.getText().toString();
                String edConf=confpass.getText().toString();

                if(edConf.equals(edpass)){


                    db=new DatabaseHandler4(Registration4.this,null,null,2);
                    RegisterData4 reg=new RegisterData4();

                    reg.setfirstName(edfirst);
                    reg.setlastName(edlast);
                    reg.setEmailId(edemail);
                    reg.setMobNo(edmobile);
                    reg.setPassword(edpass);
                    db.addregister(reg);

                    Toast.makeText(getApplicationContext(),"Registered",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(),Slide2.class));
                }
                else if(edfirst.isEmpty() || edlast.isEmpty() || edemail.isEmpty() || edmobile.isEmpty()){

                    Toast.makeText(getApplicationContext(),"Not Registered",Toast.LENGTH_LONG).show();
                    pass.setText("");
                    confpass.setText("");
                }
                else{

                    Toast.makeText(getApplicationContext(),"Password doesn't match",Toast.LENGTH_LONG).show();
                    pass.setText("");
                    confpass.setText("");
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Registration4.this,Slide2.class);
                startActivity(intent);
            }
        });

    }


}


