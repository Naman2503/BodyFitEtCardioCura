package com.example.naman.bodyfitetcardiocura;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.id;

public class MaleND extends AppCompatActivity implements View.OnClickListener {

    TextView t1;
    Button b1, b2, b3, b4, b5, b6, b7;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_nd);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        t1 = (TextView) findViewById(R.id.mnd);
        b1 = (Button) findViewById(R.id.mnd1);
        b2 = (Button) findViewById(R.id.mnd2);
        b3 = (Button) findViewById(R.id.mnd3);
        b4 = (Button) findViewById(R.id.mnd4);
        b5 = (Button) findViewById(R.id.mnd5);
        b6 = (Button) findViewById(R.id.mnd6);
        b7 = (Button) findViewById(R.id.mnd7);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.mnd1) {
            Intent intent = new Intent(this, MND1.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.mnd2) {
            Intent intent = new Intent(this, MND2.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.mnd3) {
            Intent intent = new Intent(this, MND3.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.mnd4) {
            Intent intent = new Intent(this, MND4.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.mnd5) {
            Intent intent = new Intent(this, MND5.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.mnd6) {
            Intent intent = new Intent(this, MND6.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.mnd7) {
            Intent intent = new Intent(this, MND7.class);
            startActivity(intent);
        }

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("MaleND Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
