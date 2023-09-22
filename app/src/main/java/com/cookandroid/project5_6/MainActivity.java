package com.cookandroid.project5_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout lay1, lay2, lay3, lay4;
    int width, height;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 5-6");

        lay1 = (LinearLayout) findViewById(R.id.lay1);
        lay2 = (LinearLayout) findViewById(R.id.lay2);
        lay3 = (LinearLayout) findViewById(R.id.lay3);
        lay4 = (LinearLayout) findViewById(R.id.lay4);

        lay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = lay1.getWidth();
                height = lay1.getHeight();
                Toast.makeText(getApplicationContext(), "폭 : "+ width + " 높이 : " + height, Toast.LENGTH_SHORT).show();
            }
        });

        lay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = lay2.getWidth();
                height = lay2.getHeight();
                Toast.makeText(getApplicationContext(), "폭 : "+ width + " 높이 : " + height, Toast.LENGTH_SHORT).show();
            }
        });

        lay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = lay3.getWidth();
                height = lay3.getHeight();
                Toast.makeText(getApplicationContext(), "폭 : "+ width + " 높이 : " + height, Toast.LENGTH_SHORT).show();
            }
        });

        lay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = lay4.getWidth();
                height = lay4.getHeight();
                Toast.makeText(getApplicationContext(), "폭 : "+ width + " 높이 : " + height, Toast.LENGTH_SHORT).show();
            }
        });

    }
}