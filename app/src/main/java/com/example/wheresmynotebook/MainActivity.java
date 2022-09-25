package com.example.wheresmynotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView book1, book2, book3, book4, book5, book6, book7;
    EditText stu_b1, stu_b2, stu_b3, stu_b4, stu_b5, stu_b6, stu_b7;
    Button viewBtn, btn3, btn4, btn5, btn6, btn7, btn8, btn9, setbtn;
    SharedPreferences sp;
    String b1s, b2s, b3s, b4s, b5s, b6s, b7s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning ids to variables and buttons
        book1 = findViewById(R.id.textView3);
        book2 = findViewById(R.id.textView5);
        book3 = findViewById(R.id.textView6);
        book4 = findViewById(R.id.textView7);
        book5 = findViewById(R.id.textView8);
        book6 = findViewById(R.id.textView9);
        book7 = findViewById(R.id.textView11);
        stu_b1 = findViewById(R.id.stu_b1);
        stu_b2 = findViewById(R.id.stu_b2);
        stu_b3 = findViewById(R.id.stu_b3);
        stu_b4 = findViewById(R.id.stu_b4);
        stu_b5 = findViewById(R.id.stu_b5);
        stu_b6 = findViewById(R.id.stu_b6);
        stu_b7 = findViewById(R.id.stu_b7);
        viewBtn = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button16);
        setbtn = findViewById(R.id.button);

        // Creating Shared Preferences
        sp = getSharedPreferences("MYUserPrefs", Context.MODE_PRIVATE);
        SharedPreferences sp2 = getApplicationContext().getSharedPreferences("MYUserPrefs2", Context.MODE_PRIVATE);
        book1.setText(sp2.getString("book_b1", ""));
        book2.setText(sp2.getString("book_b2", ""));
        book3.setText(sp2.getString("book_b3", ""));
        book4.setText(sp2.getString("book_b4", ""));
        book5.setText(sp2.getString("book_b5", ""));
        book6.setText(sp2.getString("book_b6", ""));
        book7.setText(sp2.getString("book_b7", ""));

        //Setting onClickListener to buttons and storing input in sp
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1s = stu_b1.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_b1", b1s);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2s = stu_b2.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_b2", b2s);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3s = stu_b3.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_b3", b3s);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4s = stu_b4.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_b4", b4s);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5s = stu_b5.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_b5", b5s);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6s = stu_b6.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_b6", b6s);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7s = stu_b7.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("stu_b7", b7s);
                editor.commit();
                Toast.makeText(MainActivity.this, "Info saved.", Toast.LENGTH_SHORT).show();
            }
        });

//        onClickListener to view records button
        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              Creating New Activity for records
                Intent intent = new Intent(MainActivity.this, OtherPage.class);
                startActivity(intent);
            }
        });

//        onclickListener to setNoteBook button
        setbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              Creating New Activity for Setting Notebooks
                Intent intent = new Intent(MainActivity.this, Books.class);
                startActivity(intent);
            }
        });
    }
}