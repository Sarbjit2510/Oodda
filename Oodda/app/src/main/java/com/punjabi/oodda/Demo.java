package com.punjabi.oodda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class Demo extends AppCompatActivity {
ImageView imageView;
    int distX=0;
    LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        imageView = (ImageView) findViewById(R.id.img);
        linear=(LinearLayout)findViewById(R.id.linear);
        TranslateAnimation animation = new TranslateAnimation(0, 250, 0, 300);
        animation.setDuration(1000);
        animation.setFillAfter(true);
        animation.setRepeatCount(10);

        animation.setAnimationListener(new MyAnimationListener());

        imageView.startAnimation(animation);

    }
        private class MyAnimationListener implements Animation.AnimationListener {

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.clearAnimation();
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(imageView.getWidth(), imageView.getHeight());
                lp.setMargins(250, 200, 0, 0);
                imageView.setLayoutParams(lp);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                imageView.clearAnimation();
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(imageView.getWidth(), imageView.getHeight());
                lp.setMargins(50, 100, 0, 0);
                imageView.setLayoutParams(lp);
            }

            @Override
            public void onAnimationStart(Animation animation) {
            }

        }


}
