package com.example.guru.devistuti;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kali extends AppCompatActivity {
    Button playDurga;
    TextView lyrics;
    boolean isPlaying = false;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kali);
        getSupportActionBar().setTitle("Jai Maa Kali");
        playDurga=(Button)findViewById(R.id.playKali);
         mediaPlayer=MediaPlayer.create(this,R.raw.jaikali);
        lyrics=(TextView)findViewById(R.id.kali_lyrics);
        lyrics.setVisibility(View.INVISIBLE);
        playDurga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lyrics.setVisibility(View.VISIBLE);
                if (isPlaying==false){
                    playDurga.setText("PAUSE");
                    mediaPlayer.start();
                    isPlaying=true;
                }
                else {
                    playDurga.setText("PLAY");
                    mediaPlayer.pause();
                    isPlaying=false;
                }

            }
        });
    }
    @Override
    public void onPause()
    {
        if(mediaPlayer != null && mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
        }
        super.onPause();
    }


}
