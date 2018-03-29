package com.example.guru.devistuti;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class laxmi extends AppCompatActivity {
    Button playDurga;
    TextView lyrics;
    boolean isPlaying = false;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laxmi);
        getSupportActionBar().setTitle("Jai Maa Laxmi");
        playDurga=(Button)findViewById(R.id.playLaxmi);
        mediaPlayer=MediaPlayer.create(this,R.raw.saraswatimantra);
        lyrics=(TextView)findViewById(R.id.laxmi_lyrics);
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
