package com.example.mad_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LabAssessment2 extends AppCompatActivity {
    int[] btn1={R.drawable.b1,R.drawable.b4};
    int[] btn2={R.drawable.b2,R.drawable.b5};
    int[] btn3={R.drawable.b3,R.drawable.b6};
    int b1=1,b2=1,b3=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_assessment2);
    }

    public void changeBackground(View view) {
        switch (view.getId()){
            case R.id.imgBtn1:{
                ((ImageButton)view).setImageResource(btn1[b1]);
                b1=(b1==0)?1:0;
                break;
            }
            case R.id.imgBtn2:{
                ((ImageButton)view).setImageResource(btn2[b2]);
                b2=(b2==0)?1:0;
                break;
            }
            case R.id.imgBtn3:{
                ((ImageButton)view).setImageResource(btn3[b3]);
                b3=(b3==0)?1:0;
                break;
            }
        }
    }
}