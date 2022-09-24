package com.example.wheresmynotebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OtherPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        TextView MA, EO, RKM, AKM, LabEO, LabPEM;
        MA = findViewById(R.id.textView18);
        EO = findViewById(R.id.textView20);
        RKM = findViewById(R.id.textView24);
        AKM = findViewById(R.id.textView26);
        LabEO = findViewById(R.id.textView28);
        LabPEM = findViewById(R.id.textView30);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("MYUserPrefs", Context.MODE_PRIVATE);

        String MAs = sp.getString("stu_MA", "");
        String EOs = sp.getString("stu_EO", "");
        String RKMs = sp.getString("stu_RKM", "");
        String AKMs = sp.getString("stu_AKM", "");
        String LabEOs = sp.getString("stu_LabEO", "");
        String LabPEMs = sp.getString("stu_LabPEM", "");

        MA.setText(MAs);
        EO.setText(EOs);
        RKM.setText(RKMs);
        AKM.setText(AKMs);
        LabEO.setText(LabEOs);
        LabPEM.setText(LabPEMs);

    }
}
