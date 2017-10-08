package com.punjabi.oodda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class Matras_Screen extends AppCompatActivity implements View.OnClickListener {
    Punjabi_Type_Cast PUN_name, PUN_ZOOM_text, PUN_bihari, PUN_horra, PUN_kanna, PUN_tippi, PUN_unkr, PUN_kanoora, PUN_duulama, PUN_duulankr, PUN_aadak, PUN_laam, PUN_bindi;
    String[] matras;
    TextView ENG_name;
    ImageView title_img_matras;
    Animation popup_down;
    LinearLayout text_bihari_layout, text_hora_layout, text_kanna_layout, text_tippi_layout, text_oankr_layout, text_kanora_layout, text_dulava_layout, text_doolankar_layout,
            text_addak_layout, text_laam_layout, text_bindi_layout;
    List<LinearLayout> layoutList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matras__screen);

        popup_down = AnimationUtils.loadAnimation(Matras_Screen.this, R.anim.blink);

        PUN_bihari = (Punjabi_Type_Cast) findViewById(R.id.text_bihari);
        PUN_horra = (Punjabi_Type_Cast) findViewById(R.id.text_hora);
        PUN_kanna = (Punjabi_Type_Cast) findViewById(R.id.text_kanna);
        PUN_tippi = (Punjabi_Type_Cast) findViewById(R.id.text_tippi);
        PUN_unkr = (Punjabi_Type_Cast) findViewById(R.id.text_oankr);
        PUN_kanoora = (Punjabi_Type_Cast) findViewById(R.id.text_kanora);
        PUN_duulama = (Punjabi_Type_Cast) findViewById(R.id.text_dulava);
        PUN_duulankr = (Punjabi_Type_Cast) findViewById(R.id.text_doolankar);
        PUN_aadak = (Punjabi_Type_Cast) findViewById(R.id.text_addak);
        PUN_laam = (Punjabi_Type_Cast) findViewById(R.id.text_laam);
        PUN_bindi = (Punjabi_Type_Cast) findViewById(R.id.text_bindi);
        PUN_ZOOM_text = (Punjabi_Type_Cast) findViewById(R.id.big_text);
        PUN_name = (Punjabi_Type_Cast) findViewById(R.id.punjabi_text);
        ENG_name = (TextView) findViewById(R.id.englisg_text);
        title_img_matras = (ImageView) findViewById(R.id.title_img_matras);

        text_bihari_layout = (LinearLayout) findViewById(R.id.text_bihari_layout);
        text_hora_layout = (LinearLayout) findViewById(R.id.text_hora_layout);
        text_kanna_layout = (LinearLayout) findViewById(R.id.text_kanna_layout);
        text_tippi_layout = (LinearLayout) findViewById(R.id.text_tippi_layout);
        text_oankr_layout = (LinearLayout) findViewById(R.id.text_oankr_layout);
        text_kanora_layout = (LinearLayout) findViewById(R.id.text_kanora_layout);
        text_dulava_layout = (LinearLayout) findViewById(R.id.text_dulava_layout);
        text_doolankar_layout = (LinearLayout) findViewById(R.id.text_doolankar_layout);
        text_addak_layout = (LinearLayout) findViewById(R.id.text_addak_layout);
        text_laam_layout = (LinearLayout) findViewById(R.id.text_laam_layout);
        text_bindi_layout = (LinearLayout) findViewById(R.id.text_bindi_layout);

        matras = getResources().getStringArray(R.array.matras);

        PUN_bihari.setOnClickListener(this);
        PUN_horra.setOnClickListener(this);
        PUN_kanna.setOnClickListener(this);
        PUN_tippi.setOnClickListener(this);
        PUN_unkr.setOnClickListener(this);
        PUN_kanoora.setOnClickListener(this);
        PUN_duulama.setOnClickListener(this);
        PUN_duulankr.setOnClickListener(this);
        PUN_aadak.setOnClickListener(this);
        PUN_laam.setOnClickListener(this);
        PUN_bindi.setOnClickListener(this);

        PUN_name.setText("ਬਿਹਾਰੀ");
        ENG_name.setText("Bihari");

        PUN_bihari.setText(matras[0]);
        PUN_horra.setText(matras[1]);
        PUN_kanna.setText(matras[2]);
        PUN_tippi.setText(matras[3]);
        PUN_unkr.setText(matras[4]);
        PUN_kanoora.setText(matras[5]);
        PUN_duulama.setText(matras[6]);
        PUN_duulankr.setText("=");
        PUN_aadak.setText(matras[7]);
        PUN_laam.setText(matras[8]);
        PUN_bindi.setText(matras[10]);

        title_img_matras.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Matras_Screen.this.finish();
                    Matras_Screen.this.overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
                }
                return false;
            }
        });

    }


    @Override
    public void onClick(View v) {
        selectLinear();
        switch (v.getId()) {
            case R.id.text_bihari:
                PUN_ZOOM_text.setText((matras[0]));
                PUN_name.setText("ਬਿਹਾਰੀ");
                ENG_name.setText("Bihari");
                text_bihari_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_bihari_layout.startAnimation(popup_down);
                break;

            case R.id.text_hora:
                PUN_ZOOM_text.setText((matras[1]));
                PUN_name.setText("ਹੋੜਾ");
                ENG_name.setText("Horaa");
                text_hora_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_hora_layout.startAnimation(popup_down);
                break;

            case R.id.text_kanna:
                PUN_ZOOM_text.setText((matras[2]));
                PUN_name.setText("ਕੰਨਾ");
                ENG_name.setText("Kannaa");
                text_kanna_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_kanna_layout.startAnimation(popup_down);
                break;

            case R.id.text_tippi:
                PUN_ZOOM_text.setText((matras[3]));
                PUN_name.setText("ਟਿੱਪੀ");
                ENG_name.setText("Tippee");
                text_tippi_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_tippi_layout.startAnimation(popup_down);
                break;

            case R.id.text_oankr:
                PUN_ZOOM_text.setText((matras[4]));
                PUN_name.setText("ਔਕੜ");
                ENG_name.setText("Aunkar");
                text_oankr_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_oankr_layout.startAnimation(popup_down);
                break;

            case R.id.text_kanora:
                PUN_ZOOM_text.setText((matras[5]));
                PUN_name.setText("ਕਨੌੜਾ");
                ENG_name.setText("Kanauraa");
                text_kanora_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_kanora_layout.startAnimation(popup_down);
                break;

            case R.id.text_dulava:
                PUN_ZOOM_text.setText((matras[6]));
                PUN_name.setText("ਦੁਲਾਵਾਂ");
                ENG_name.setText("Dulaavan");
                text_dulava_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_dulava_layout.startAnimation(popup_down);
                break;

            case R.id.text_doolankar:
                PUN_ZOOM_text.setText("=");
                PUN_name.setText("ਦੂਲੈ");
                ENG_name.setText("Dulankar");
                text_doolankar_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_doolankar_layout.startAnimation(popup_down);
                break;

            case R.id.text_addak:
                PUN_ZOOM_text.setText((matras[7]));
                PUN_name.setText("ਅਧਕ");
                ENG_name.setText("Adhak");
                text_addak_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_addak_layout.startAnimation(popup_down);
                break;

            case R.id.text_laam:
                PUN_ZOOM_text.setText((matras[8]));
                PUN_name.setText("ਲਾਵ");
                ENG_name.setText("Laav");
                text_laam_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_laam_layout.startAnimation(popup_down);
                break;

            case R.id.text_bindi:
                PUN_ZOOM_text.setText((matras[10]));
                PUN_name.setText("ਸਿਹਾਰੀ");
                ENG_name.setText("Sihari");
                text_bindi_layout.setBackgroundResource(R.drawable.ooda_blank);
                text_bindi_layout.startAnimation(popup_down);
                break;
        }
    }

    public void selectLinear() {
        text_hora_layout.setBackgroundResource(R.drawable.text_back);
        text_kanna_layout.setBackgroundResource(R.drawable.text_back);
        text_bihari_layout.setBackgroundResource(R.drawable.text_back);
        text_tippi_layout.setBackgroundResource(R.drawable.text_back);
        text_oankr_layout.setBackgroundResource(R.drawable.text_back);
        text_kanora_layout.setBackgroundResource(R.drawable.text_back);
        text_dulava_layout.setBackgroundResource(R.drawable.text_back);
        text_doolankar_layout.setBackgroundResource(R.drawable.text_back);
        text_addak_layout.setBackgroundResource(R.drawable.text_back);
        text_laam_layout.setBackgroundResource(R.drawable.text_back);
        text_bindi_layout.setBackgroundResource(R.drawable.text_back);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }

}
