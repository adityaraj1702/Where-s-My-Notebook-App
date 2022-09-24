package com.example.wheresmynotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText stu_MA, stu_EO, stu_RKM, stu_AKM, stu_LabEO, stu_LabPEM;
    Button viewBtn, btn3, btn4, btn5, btn6, btn7, btn8;
    SharedPreferences sp;
    String MAs, EOs, RKMs, AKMs, LabEOs, LabPEMs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stu_MA = findViewById(R.id.stu_MA);
        stu_EO = findViewById(R.id.stu_EO);
        stu_RKM = findViewById(R.id.stu_RKM);
        stu_AKM = findViewById(R.id.stu_AKM);
        stu_LabEO = findViewById(R.id.stu_LabEO);
        stu_LabPEM = findViewById(R.id.stu_LabPEM);
        viewBtn = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);

        sp = getSharedPreferences("MYUserPrefs", Context.MODE_PRIVATE);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MAs = stu_MA.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_MA", MAs);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EOs = stu_EO.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_EO", EOs);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RKMs = stu_RKM.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_RKM", RKMs);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AKMs = stu_AKM.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_AKM", AKMs);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LabEOs = stu_LabEO.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_LabEO", LabEOs);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LabPEMs = stu_LabPEM.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_LabPEM", LabPEMs);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });

        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OtherPage.class);
                startActivity(intent);
            }
        });
    }
}