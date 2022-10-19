package com.example.sjcet.loginapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sjcet.loginapplication.R;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.uname);
        e2 = (EditText)findViewById(R.id.passwd);
        b1 = (Button)findViewById(R.id.login);
        b2 = (Button)findViewById(R.id.Cancel);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("admin") && e2.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Credentials...",Toast.LENGTH_SHORT).show();

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
