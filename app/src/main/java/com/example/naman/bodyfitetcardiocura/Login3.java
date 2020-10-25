package com.example.naman.bodyfitetcardiocura;

        import java.util.List;

        import android.app.Activity;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.database.Cursor;
        import android.os.Bundle;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.view.MenuItem;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import static java.lang.System.exit;


public class Login3 extends AppCompatActivity {


    EditText user, pass;
    Button login, not_reg;
    DatabaseHandler4 db;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);


        user = (EditText) findViewById(R.id.eduser);
        pass = (EditText) findViewById(R.id.edpass);
        login = (Button) findViewById(R.id.login);
        //not_reg = (Button) findViewById(R.id.not_reg);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                db = new DatabaseHandler4(Login3.this, null, null, 2);
                String username = user.getText().toString();
                String password = pass.getText().toString();

                String StoredPassword = db.getregister(username);
                if (password.equals(StoredPassword)) {

                    Toast.makeText(getApplicationContext(),"Login Successfull", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Login3.this, BMIC5.class);
                    startActivity(i);

                } else if((username.isEmpty()) || (password.isEmpty()) || (!(password.equals(StoredPassword)))) {
                    Toast.makeText(getApplicationContext(), "Username/Password Incorrect", Toast.LENGTH_LONG).show();
                    user.setText("");
                    pass.setText("");
                } else {
                    Toast.makeText(getApplicationContext(), "Username/Password Incorrect", Toast.LENGTH_LONG).show();
                    user.setText("");
                    pass.setText("");
                }



            }
        });


    }

    /*@Override
    public void onBackPressed()
    {
        final AlertDialog.Builder builder=new AlertDialog.Builder(Login3.this);
        builder.setMessage("Are you sure you want to exit the app?");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }*/

    /* @Override
                    public boolean onCreateOptionsMenu(Menu menu) {
MenuInflater inflater = getMenuInflater();
inflater.inflate(R.menu.action_settings, menu);
            return super.onCreateOptionsMenu(menu);
           //
     }
     */
   /*  public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case R.id.action_settings:
                // search action
                Intent i = new Intent(Login3.this, Registration4.class);
                startActivity(i);
                return true;
        }
        return false;

    } */

}


