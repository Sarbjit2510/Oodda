package com.punjabi.oodda;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Aman on 03-Feb-16.
 */
public class Punjabi_Type_Cast extends  TextView{

        private Context c;
        public Punjabi_Type_Cast(Context c) {
            super(c);
            this.c = c;
            try {
                Typeface tfs = Typeface.createFromAsset(c.getAssets(),
                        "WebLipiHeavy.ttf");
                setTypeface(tfs);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        public Punjabi_Type_Cast(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            this.c = context;
            try {
                Typeface tfs = Typeface.createFromAsset(c.getAssets(),
                        "WebLipiHeavy.ttf");
                setTypeface(tfs);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // TODO Auto-generated constructor stub
        }

        public Punjabi_Type_Cast(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.c = context;
            try {
                Typeface tfs = Typeface.createFromAsset(c.getAssets(),
                        "WebLipiHeavy.ttf");
                setTypeface(tfs);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
