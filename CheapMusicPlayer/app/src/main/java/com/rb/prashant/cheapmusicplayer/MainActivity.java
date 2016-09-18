package com.rb.prashant.cheapmusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.closer);

    }

    public void play(View view){
        mediaPlayer.start();
        Log.v("music","Pressed Play");
    }
    public void pause(View view){
        mediaPlayer.pause();
        Log.v("music","Pressed Pause");
    }




}
