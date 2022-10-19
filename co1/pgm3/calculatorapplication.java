package com.example.sjcet.calculatorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    TextView result;
    int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.et1);
        txt2=findViewById(R.id.et2);

        result=findViewById(R.id.tv1);
    }

    public void btnadd(View view) {
        a=Integer.parseInt(txt1.getText().toString());
        b=Integer.parseInt(txt2.getText().toString());
        c=a+b;
        result.setText(Integer.toString(c));
    }

    public void btnsub(View view) {
        a=Integer.parseInt(txt1.getText().toString());
        b=Integer.parseInt(txt2.getText().toString());
        c=a-b;
        result.setText(Integer.toString(c));
    }

    public void btnmul(View view) {
        a=Integer.parseInt(txt1.getText().toString());
        b=Integer.parseInt(txt2.getText().toString());
        c=a*b;
        result.setText(Integer.toString(c));
    }

    public void btndiv(View view) {
        a=Integer.parseInt(txt1.getText().toString());
        b=Integer.parseInt(txt2.getText().toString());
        c=a/b;
        result.setText(Integer.toString(c));
    }
}
