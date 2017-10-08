package com.punjabi.oodda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class Vowel_Screen extends AppCompatActivity implements View.OnClickListener {
    Punjabi_Type_Cast PUN_A, PUN_AA, PUN_I, PUN_EE, PUN_U, PUN_AO, PUN_E, PUN_AI, PUN_O, PUN_AU, PUN_AM, PUN_AAN;
    String[] vowel_text;
    ImageView title_vowel;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel__screen);
        PUN_A = (Punjabi_Type_Cast) findViewById(R.id.text_a);
        PUN_AA = (Punjabi_Type_Cast) findViewById(R.id.text_aa);
        PUN_I = (Punjabi_Type_Cast) findViewById(R.id.text_i);
        PUN_EE = (Punjabi_Type_Cast) findViewById(R.id.text_ee);
        PUN_U = (Punjabi_Type_Cast) findViewById(R.id.text_u);
        PUN_AO = (Punjabi_Type_Cast) findViewById(R.id.text_ao);
        PUN_E = (Punjabi_Type_Cast) findViewById(R.id.text_e);
        PUN_AI = (Punjabi_Type_Cast) findViewById(R.id.text_ai);
        PUN_AU = (Punjabi_Type_Cast) findViewById(R.id.text_au);
        PUN_AM = (Punjabi_Type_Cast) findViewById(R.id.text_am);
        PUN_O = (Punjabi_Type_Cast) findViewById(R.id.text_o);
        PUN_AAN = (Punjabi_Type_Cast) findViewById(R.id.text_aan);
        title_vowel = (ImageView) findViewById(R.id.title_img_vowel);

        animation = AnimationUtils.loadAnimation(this, R.anim.blink);

        vowel_text = getResources().getStringArray(R.array.vowel);
        PUN_A.setText(vowel_text[0]);
        PUN_AA.setText(vowel_text[1]);
        PUN_I.setText(vowel_text[2]);
        PUN_EE.setText(vowel_text[3]);
        PUN_U.setText(vowel_text[4]);
        PUN_AO.setText(vowel_text[5]);
        PUN_E.setText(vowel_text[6]);
        PUN_AI.setText(vowel_text[7]);
        PUN_O.setText(vowel_text[8]);
        PUN_AU.setText(vowel_text[9]);
        PUN_AM.setText(vowel_text[10]);
        PUN_AAN.setText(vowel_text[11]);

        PUN_A.setOnClickListener(this);
        PUN_AA.setOnClickListener(this);
        PUN_I.setOnClickListener(this);
        PUN_EE.setOnClickListener(this);
        PUN_U.setOnClickListener(this);
        PUN_AO.setOnClickListener(this);
        PUN_E.setOnClickListener(this);
        PUN_AI.setOnClickListener(this);
        PUN_O.setOnClickListener(this);
        PUN_AU.setOnClickListener(this);
        PUN_AM.setOnClickListener(this);
        PUN_AAN.setOnClickListener(this);

        title_vowel.setOnTouchListener(new View.OnTouchListener() {
                                           @Override
                                           public boolean onTouch(View v, MotionEvent event) {
                                               if (event.getAction() == MotionEvent.ACTION_DOWN) {
                                                   Vowel_Screen.this.finish();
                                                   Vowel_Screen.this.overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
                                               }
                                               return true;
                                           }
                                       }

        );

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_a:
                PUN_A.startAnimation(animation);
                break;

            case R.id.text_aa:
                PUN_AA.startAnimation(animation);
                break;

            case R.id.text_i:
                PUN_I.startAnimation(animation);
                break;

            case R.id.text_ee:
                PUN_EE.startAnimation(animation);
                break;

            case R.id.text_u:
                PUN_U.startAnimation(animation);
                break;

            case R.id.text_ao:
                PUN_AO.startAnimation(animation);
                break;

            case R.id.text_e:
                PUN_E.startAnimation(animation);
                break;

            case R.id.text_ai:
                PUN_AI.startAnimation(animation);
                break;

            case R.id.text_au:
                PUN_AU.startAnimation(animation);
                break;

            case R.id.text_am:
                PUN_AM.startAnimation(animation);
                break;

            case R.id.text_o:
                PUN_O.startAnimation(animation);
                break;

            case R.id.text_aan:
                PUN_AAN.startAnimation(animation);
                break;
        }
    }
}
