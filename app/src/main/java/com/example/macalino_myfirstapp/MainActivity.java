package com.example.macalino_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
TextView name;
TextView MyName;
TextView num;
TextView mail;
TextView MyDisplay;
Button MyButton;
Button MyClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.txtName);
        MyName = (TextView)  findViewById(R.id.txtMyName);
        num = (TextView) findViewById(R.id.txtNum);
        mail = (TextView) findViewById(R.id. txtMail);
        MyDisplay = (TextView) findViewById(R.id.txtDisplay);
        MyButton = (Button) findViewById(R.id.btnclick);
        MyClear = (Button) findViewById(R.id.btnClear);

        //MyDisplay.setText("Hello Joules");

        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDisplay.setText("Hello Joules");
            }
        });

        MyClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDisplay.setText("Hello");
            }
        });
    }

}