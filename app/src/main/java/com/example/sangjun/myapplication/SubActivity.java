package com.example.sangjun.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by SangJun on 2016-07-31.
 */
public class SubActivity extends MainActivity{
    int a=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity);
        Button button = (Button)findViewById(R.id.button3);
        final Drawable red = getResources().getDrawable(R.drawable.red);
        final Drawable green = getResources().getDrawable(R.drawable.green);

        final ImageView imageView = (ImageView)findViewById(R.id.imageView);



        button.setOnClickListener(new View.OnClickListener() {
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





    }

}
