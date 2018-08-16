package com.example.mohammad.simpledrum;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        sound1 = sp.load(MainActivity.this,R.raw.one,1);
        sound2 = sp.load(MainActivity.this,R.raw.two,1);
        sound3 = sp.load(MainActivity.this,R.raw.three,1);
        sound4 = sp.load(MainActivity.this,R.raw.four,1);
        sound5 = sp.load(MainActivity.this,R.raw.five,1);
        sound6 = sp.load(MainActivity.this,R.raw.six,1);

    }
    public void playSound1(View v){
        sp.play(sound1,1.0f,1.0f,0,0,10f);
    }
    public void playSound2(View v){
        sp.play(sound2,1.0f,1.0f,0,0,10f);
    }
    public void playSound3(View v){
        sp.play(sound3,1.0f,1.0f,0,0,10f);
    }
    public void playSound4(View v){
        sp.play(sound4,1.0f,1.0f,0,0,10f);
    }
    public void playSound5(View v){
        sp.play(sound5,1.0f,1.0f,0,0,10f);
    }
    public void playSound6(View v){
        sp.play(sound6,1.0f,1.0f,0,0,10f);
    }

}
