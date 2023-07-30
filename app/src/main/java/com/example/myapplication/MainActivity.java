package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    EditText edt;
    Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.textView);
        edt=findViewById(R.id.edttext);
        bt1=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cel=Double.parseDouble(edt.getText().toString());

            Toast.makeText(MainActivity.this,"temperature in farenheit is "+converttofarenheit(cel),Toast.LENGTH_LONG).show();

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cel=Double.parseDouble(edt.getText().toString());

                Toast.makeText(MainActivity.this,"temperature in kelvin is "+converttokelvin(cel),Toast.LENGTH_LONG).show();

            }
        });

    } public double converttofarenheit(double cel)
    {
        double farenheit=(cel*9/5)+32;
        return farenheit;
    }
    public double converttokelvin(double cel)
    {
        double kelvin=273.15+cel;
        return kelvin;
    }
}