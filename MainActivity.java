package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String oldNumber="";
    String op = "+";
    boolean isNewOp = true;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
  } 
    
     public void numberEvent(View view) {
        if(isNewOp)
            ed1.setText("");
            isNewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.button_0:
                number +=  "0";
                break;
            case R.id.button_1:
                number +=  "1";
                break;
            case R.id.button_2:
                number +=  "2";
                break;
            case R.id.button_3:
                number +=  "3";
                break;
            case R.id.button_4:
                number +=  "4";
                break;
            case R.id.button_5:
                number +=  "5";
                break;
            case R.id.button_6:
                number +=  "6";
                break;
            case R.id.button_7:
                number +=  "7";
                break;
            case R.id.button_8:
                number +=  "8";
                break;
            case R.id.button_9:
                number +=  "9";
                break;
        }
        ed1.setText(number);
    }
    
    public void opperatorEvent(View view) {
    isNewOp = true;
    oldNumber = ed1.getText().toString();
    switch (view.getId()){
        case R.id.button_plus:
            op = "+";
            break;
        case R.id.button_minus:
            op = "-";
            break;
        case R.id.button_multi:
            op = "*";
            break;
        case R.id.button_div:
            op = "/";
            break;
    }
}

