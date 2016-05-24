package com.example.mari.inquirer_android_client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {

           super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    SoketListner.con(getApplicationContext());

           Button logBut = (Button) findViewById(R.id.log_but);
           logBut.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(getApplicationContext(), QRActivity.class);
                   startActivity(intent);

               }
           });

           Button regBut = (Button) findViewById(R.id.reg_but);
           regBut.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Toast toast = Toast.makeText(getApplicationContext(),
                           "Register works", Toast.LENGTH_SHORT);
                   toast.show();

               }
           });
    }

    public void pri(String s){
        Toast toast = Toast.makeText(getApplicationContext(),
                s, Toast.LENGTH_SHORT);
        toast.show();
    }
}
