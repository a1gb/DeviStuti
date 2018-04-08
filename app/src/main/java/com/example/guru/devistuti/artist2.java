package com.example.guru.devistuti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class artist2 extends AppCompatActivity {
    Button playDurga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist2);
        getSupportActionBar().setTitle("Laxmi Bai Songs");
        playDurga=(Button)findViewById(R.id.art2);
        playDurga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(artist2.this,laxmiList.class);
                startActivity(intent);
            }
        });
    }
}
