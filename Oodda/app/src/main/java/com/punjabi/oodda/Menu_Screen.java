package com.punjabi.oodda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Menu_Screen extends AppCompatActivity implements View.OnClickListener {
    TextView _view;
    LinearLayout LINEAR_gurmukhi, LINEAR_alphabet, LINEAR_vowel, LINEAR_matras, mainlinear;
    ViewGroup _root;
    private int _xDelta;
    private int _yDelta;
    View view_new;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        setupViews();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linear_gurmukhi:
                LINEAR_gurmukhi.startAnimation(animation);
                Intent i = new Intent(Menu_Screen.this, Gurmukhi_Screen.class);
                startActivity(i);
//                Menu_Screen.this.finish();
                Menu_Screen.this.overridePendingTransition(R.anim.enter_from_bottom, R.anim.enter_to_top);
                break;

            case R.id.linear_alphabet:
                LINEAR_alphabet.startAnimation(animation);
                Intent i_alpha = new Intent(Menu_Screen.this, Alphabet_Activity_Screen.class);
                startActivity(i_alpha);
//                Menu_Screen.this.finish();
                Menu_Screen.this.overridePendingTransition(R.anim.enter_from_bottom, R.anim.enter_to_top);

                break;

            case R.id.linear_vowels:
                LINEAR_vowel.startAnimation(animation);
                Intent i_vowel = new Intent(Menu_Screen.this, Vowel_Screen.class);
                startActivity(i_vowel);
                Menu_Screen.this.overridePendingTransition(R.anim.enter_from_bottom, R.anim.enter_to_top);
//                Menu_Screen.this.finish();
                break;

            case R.id.linear_matras:
                LINEAR_matras.startAnimation(animation);
                Intent i_matras = new Intent(Menu_Screen.this, Matras_Screen.class);
                startActivity(i_matras);
//                Menu_Screen.this.finish();
                Menu_Screen.this.overridePendingTransition(R.anim.enter_from_bottom, R.anim.enter_to_top);
                break;
        }
    }

    private void setupViews() {

        LINEAR_gurmukhi = (LinearLayout) findViewById(R.id.linear_gurmukhi);
        LINEAR_alphabet = (LinearLayout) findViewById(R.id.linear_alphabet);
        LINEAR_vowel = (LinearLayout) findViewById(R.id.linear_vowels);
        LINEAR_matras = (LinearLayout) findViewById(R.id.linear_matras);
        LINEAR_gurmukhi.setOnClickListener(this);
        LINEAR_alphabet.setOnClickListener(this);
        LINEAR_vowel.setOnClickListener(this);
        LINEAR_matras.setOnClickListener(this);
        animation = AnimationUtils.loadAnimation(Menu_Screen.this, R.anim.blinkformenu);

    }
}
