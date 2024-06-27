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

public class Subtract extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtract);
        e1=(EditText) findViewById(R.id.num11);
        e2=(EditText) findViewById(R.id.num22);
        b1=(AppCompatButton) findViewById(R.id.subtracting);
        b2=(AppCompatButton) findViewById(R.id.returnss);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String num1 = e1.getText().toString();
                    String num2 = e2.getText().toString();
                    int n1 = Integer.parseInt(num1);
                    int n2 = Integer.parseInt(num2);
                    int diff = n1 - n2;
                    Toast.makeText(getApplicationContext(), String.valueOf(diff), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
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