package com.nishan.frameanimation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int splashTimeout=2000;//time in milesecond
    ImageView imgView;
    AnimationDrawable frameAnimation;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView=findViewById(R.id.imageView);
        imgView.setImageResource(R.drawable.frameanimation);
        frameAnimation=(AnimationDrawable)imgView.getDrawable();
        frameAnimation.start();

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        new Handler().postDelayed(new Runnable() {
            public void run() {
              //  Intent intent=new Intent(SplashActivity.this,HomeActivity.class);
               // startActivity(intent);
                //finish();//for show this activity one time
            }
        },splashTimeout);
        imgView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
       }
}
