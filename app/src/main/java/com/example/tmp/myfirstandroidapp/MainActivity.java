package com.example.tmp.myfirstandroidapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // findViewById --> takes 1 parameter
        Button btnMilesToKm=(Button)findViewById(R.id.btnMilesToKm);
        btnMilesToKm.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                // get id
                EditText txtBoxMiles=(EditText)findViewById(R.id.txtBoxMiles);
                EditText txtBoxKms=(EditText)findViewById(R.id.txtBoxKms);
                // get text
                double dMiles=Double.valueOf(txtBoxMiles.getText().toString());
                double dKms=dMiles/0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");
                txtBoxKms.setText(formatVal.format(dKms));
            }
        });

        Button btnKmsToMiles=(Button)findViewById(R.id.btnKmsToMiles);
        btnKmsToMiles.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                // get id
                EditText txtBoxMiles=(EditText)findViewById(R.id.txtBoxMiles);
                EditText txtBoxKms=(EditText)findViewById(R.id.txtBoxKms);
                // get text
                double dKms=Double.valueOf(txtBoxKms.getText().toString());
                double dMiles=dKms*0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");
                txtBoxMiles.setText(formatVal.format(dMiles));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
