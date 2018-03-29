package com.example.guru.devistuti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
   ImageButton kali,laxmi,durga,saraswati;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kali=(ImageButton)findViewById(R.id.kali);
        laxmi=(ImageButton)findViewById(R.id.lxmi);
        durga=(ImageButton)findViewById(R.id.durga);
        saraswati=(ImageButton)findViewById(R.id.saraswati);

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.guru.devistuti.kaliList.class);
                startActivity(intent);

            }
        });

        laxmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.guru.devistuti.laxmiList.class);
                startActivity(intent);

            }
        });

        durga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.guru.devistuti.durgaList.class);
                startActivity(intent);

            }
        });

        saraswati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.guru.devistuti.saraswatiList.class);
                startActivity(intent);

            }
        });

    }
}
