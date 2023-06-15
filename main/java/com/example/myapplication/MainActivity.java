package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2;
    Button btn1,btn2,btn3,btn4;
    int num1,num2;
    TextView result;

    float a , b , c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        btn1=findViewById(R.id.plus);
        btn2=findViewById(R.id.minus);
        btn3=findViewById(R.id.Multi);
        btn4=findViewById(R.id.devide);
        result=findViewById(R.id.result);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String one=input1.getText().toString();
               String two=input2.getText().toString();
               if(one.equals("") || two.equals("")){
                   Toast.makeText(MainActivity.this, "Please fill numbers", Toast.LENGTH_SHORT).show();;
               }
               else{
                   int num1=Integer.parseInt(one);
                   int num2=Integer.parseInt(two);
                   int ans=num1+num2;
                   result.setText(""+ans);

               }


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one=input1.getText().toString();
                String two=input2.getText().toString();
                if(one.equals("") || two.equals("")){
                    Toast.makeText(MainActivity.this, "Please fill numbers", Toast.LENGTH_SHORT).show();;
                }
                else{
                    int num1=Integer.parseInt(one);
                    int num2=Integer.parseInt(two);
                    int ans=num1-num2;
                    result.setText(""+ans);

                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one=input1.getText().toString();
                String two=input2.getText().toString();
                if(one.equals("") || two.equals("")){
                    Toast.makeText(MainActivity.this, "Please fill numbers", Toast.LENGTH_SHORT).show();;
                }
                else{
                    int num1=Integer.parseInt(one);
                    int num2=Integer.parseInt(two);
                    int ans=num1*num2;
                    result.setText(""+ans);

                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one=input1.getText().toString();
                String two=input2.getText().toString();
                if(one.equals("") || two.equals("")){
                    Toast.makeText(MainActivity.this, "Please fill numbers", Toast.LENGTH_SHORT).show();;
                }
                else{
                    int num1=Integer.parseInt(one);
                    int num2=Integer.parseInt(two);
                    int ans=num1/num2;
                    result.setText(""+ans);

                }

            }
        });
    }
}