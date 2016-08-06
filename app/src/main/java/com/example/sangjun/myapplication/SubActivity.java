package com.example.sangjun.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Context;
/**
 * Created by SangJun on 2016-07-31.
 */
public class SubActivity extends MainActivity{
    int a=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.subactivity);

        final Vibrator vibe;
        vibe = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        Button changeColor = (Button)findViewById(R.id.button3);
        Button vibrate = (Button)findViewById(R.id.button4);
        Button sound = (Button)findViewById(R.id.button5);

        final Drawable red = getResources().getDrawable(R.drawable.red);
        final Drawable green = getResources().getDrawable(R.drawable.green);
        final ImageView imageView = (ImageView)findViewById(R.id.imageView);
        final SoundPool soundPool = new SoundPool(1, AudioManager.STREAM_ALARM,0);
        final int soundID = soundPool.load(this,R.raw.realsound,1);


        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(soundID,1,1,0,0,0.5f);
            }
        });
        changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(a==1){
                    imageView.setImageDrawable(red);
                    a=0;
                }
                else{
                    imageView.setImageDrawable(green);
                    a=1;
                }

            }
        });

        vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long[] pattern = {0,500,200,400,100};
                vibe.vibrate(pattern,-1);
            }
        });




    }

}
