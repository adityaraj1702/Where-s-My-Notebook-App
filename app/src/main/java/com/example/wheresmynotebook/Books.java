package com.example.wheresmynotebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Books extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        EditText b1, b2, b3, b4, b5, b6, b7;
        Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
        SharedPreferences sp;

        b1 = findViewById(R.id.book1);
        b2 = findViewById(R.id.book2);
        b3 = findViewById(R.id.book3);
        b4 = findViewById(R.id.book4);
        b5 = findViewById(R.id.book5);
        b6 = findViewById(R.id.book6);
        b7 = findViewById(R.id.book7);
        btn1 = findViewById(R.id.button9);
        btn2 = findViewById(R.id.button10);
        btn3 = findViewById(R.id.button11);
        btn4 = findViewById(R.id.button12);
        btn5 = findViewById(R.id.button13);
        btn6 = findViewById(R.id.button14);
        btn7 = findViewById(R.id.button15);

        sp = getSharedPreferences("MYUserPrefs2", Context.MODE_PRIVATE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("book_b1", b1.getText().toString());
                editor.commit();
                Toast.makeText(Books.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("book_b2", b2.getText().toString());
                editor.commit();
                Toast.makeText(Books.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("book_b3", b3.getText().toString());
                editor.commit();
                Toast.makeText(Books.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("book_b4", b4.getText().toString());
                editor.commit();
                Toast.makeText(Books.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("book_b5", b5.getText().toString());
                editor.commit();
                Toast.makeText(Books.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("book_b6", b6.getText().toString());
                editor.commit();
                Toast.makeText(Books.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("book_b7", b7.getText().toString());
                editor.commit();
                Toast.makeText(Books.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
