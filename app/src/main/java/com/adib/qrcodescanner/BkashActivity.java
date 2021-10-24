package com.adib.qrcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BkashActivity extends AppCompatActivity {

    Button btnbkash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bkash );

        btnbkash = findViewById( R.id.btnbkash );
/*
        btnbkash.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.bKash.customerapp");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        } );
*/
        btnbkash.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BkashActivity.this, ScannerActivity.class));
            }
        } );

    }
}