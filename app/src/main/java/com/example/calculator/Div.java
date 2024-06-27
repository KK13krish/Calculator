package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Div extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);
        e1=(EditText) findViewById(R.id.num11);
        e2=(EditText) findViewById(R.id.num22);
        b1=(AppCompatButton) findViewById(R.id.dividing);
        b2=(AppCompatButton) findViewById(R.id.returns);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=e1.getText().toString();
                String num2=e2.getText().toString();

                try {
                    double n1=Double.parseDouble(num1);
                    double n2=Double.parseDouble(num2);
                    double div=n1/n2;
                    Toast.makeText(getApplicationContext(),Double.toString(div), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_SHORT).show();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}