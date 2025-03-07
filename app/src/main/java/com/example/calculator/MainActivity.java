package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=(AppCompatButton) findViewById(R.id.add);
        b2=(AppCompatButton) findViewById(R.id.sub);
        b3=(AppCompatButton) findViewById(R.id.mul);
        b4=(AppCompatButton) findViewById(R.id.div);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "add", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),Add.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "subtract", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),Subtract.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "multiply", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),Mul.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "division", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),Div.class);
                startActivity(i);
            }
        });

    }
}