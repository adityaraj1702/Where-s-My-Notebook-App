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

//        Declaration of variables and assigning ids to them
        TextView b1, b2, b3, b4, b5, b6, b7, book1, book2, book3, book4, book5, book6, book7;
        b1 = findViewById(R.id.textView18);
        b2 = findViewById(R.id.textView20);
        b3 = findViewById(R.id.textView24);
        b4 = findViewById(R.id.textView26);
        b5 = findViewById(R.id.textView28);
        b6 = findViewById(R.id.textView30);
        b7 = findViewById(R.id.textView31);
        book1 = findViewById(R.id.textView17);
        book2 = findViewById(R.id.textView19);
        book3 = findViewById(R.id.textView23);
        book4 = findViewById(R.id.textView25);
        book5 = findViewById(R.id.textView27);
        book6 = findViewById(R.id.textView29);
        book7 = findViewById(R.id.textView22);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("MYUserPrefs", Context.MODE_PRIVATE);

//      Taking values from sp and setting it to TextViews
        b1.setText(sp.getString("stu_b1", ""));
        b2.setText(sp.getString("stu_b2", ""));
        b3.setText(sp.getString("stu_b3", ""));
        b4.setText(sp.getString("stu_b4", ""));
        b5.setText(sp.getString("stu_b5", ""));
        b6.setText(sp.getString("stu_b6", ""));
        b7.setText(sp.getString("stu_b7", ""));

        SharedPreferences sp2 = getApplicationContext().getSharedPreferences("MYUserPrefs2", Context.MODE_PRIVATE);
        book1.setText(sp2.getString("book_b1", ""));
        book2.setText(sp2.getString("book_b2", ""));
        book3.setText(sp2.getString("book_b3", ""));
        book4.setText(sp2.getString("book_b4", ""));
        book5.setText(sp2.getString("book_b5", ""));
        book6.setText(sp2.getString("book_b6", ""));
        book7.setText(sp2.getString("book_b7", ""));
    }
}
