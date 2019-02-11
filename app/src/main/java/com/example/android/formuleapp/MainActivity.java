package com.example.android.formuleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchABC (View view) {
        Intent abcIntent = new Intent(this, ABC_formule.class);
        startActivity(abcIntent);
    }

    public void launchIUR (View view) {
        Intent iurIntent = new Intent(this, U_is_I_maal_R.class);
        startActivity(iurIntent);
    }
}
