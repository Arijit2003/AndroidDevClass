package com.example.mad_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Addition extends AppCompatActivity {
    EditText num1;
    EditText num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
    }
    public void add(View v){

        Integer n1=(!num1.getText().toString().equals(""))?Integer.parseInt(num1.getText().toString()):null;
        Integer n2=(!num2.getText().toString().equals(""))?Integer.parseInt(num2.getText().toString()):null;
        if(n1!=null && n2!=null)
            Toast.makeText(this, "Summation is: ".concat(String.valueOf(n1+n2)), Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Please Enter a value in each field", Toast.LENGTH_SHORT).show();
    }


    public void nextActivity(View view) {
        startActivity(new Intent(this,RowColumn.class));
    }
}