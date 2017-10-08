package com.punjabi.oodda;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Aman on 13-Feb-16.
 */
public class AnimatedView extends LinearLayout {
    private Context mContext;
    int x = -1;
    int y = -1;
    private int xVelocity = 10;
    private int yVelocity = 5;
    private Handler h;
    private final int FRAME_RATE = 130;

    public AnimatedView(Context context, AttributeSet attrs)  {
        super(context, attrs);
        mContext = context;
        h = new Handler();
    }
    private Runnable r = new Runnable() {
        @Override
        public void run() {
            invalidate();
        }
    };
    protected void onDraw(Canvas c) {
        BitmapDrawable ball1 = (BitmapDrawable) mContext.getResources().getDrawable(R.drawable.ooda_blank);
        BitmapDrawable ball2 = (BitmapDrawable) mContext.getResources().getDrawable(R.drawable.ooda_blank);
        BitmapDrawable ball3 = (BitmapDrawable) mContext.getResources().getDrawable(R.drawable.ooda_blank);
        BitmapDrawable ball4 = (BitmapDrawable) mContext.getResources().getDrawable(R.drawable.ooda_blank);
        bounsball(c,ball1);
        bounsball(c,ball2);
        bounsball(c,ball3);
        bounsball(c,ball4);
    }

    private void bounsball(Canvas c, BitmapDrawable ball) {
        if (x<0 && y <0) {
            x = this.getWidth()/2;
            y = this.getHeight()/2;
        } else {
            x += xVelocity;
            y += yVelocity;
            if ((x > this.getWidth() - ball.getBitmap().getWidth()) || (x < 0)) {
                xVelocity = xVelocity*-1;
            }
            if ((y > this.getHeight() - ball.getBitmap().getHeight()) || (y < 0)) {
                yVelocity = yVelocity*-1;
            }
        }
        c.drawBitmap(ball.getBitmap(), x, y, null);
        h.postDelayed(r, FRAME_RATE);
    }
}