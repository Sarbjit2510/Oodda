package com.punjabi.oodda;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Alphabet_Activity_Screen extends AppCompatActivity {

    ViewPager viewpager;
    MyPageAdapter adapter;
    Button swipe_left_btn, swipe_right_btn;
    ImageView title_img_alpha;
    Integer[] img_exp_1 = {R.drawable.ooth, R.drawable.eye, R.drawable.ett, R.drawable.saleti, R.drawable.hathi, R.drawable.kabutar, R.drawable.khera, R.drawable.gamla, R.drawable.ghar, R.drawable.chamcha,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth};

    Integer[] img_exp_2 = {R.drawable.unn, R.drawable.anar, R.drawable.ell, R.drawable.seb, R.drawable.hath, R.drawable.kallam, R.drawable.khet, R.drawable.gulaab, R.drawable.gharhi, R.drawable.charka,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth};

    Integer[] img_exp_3 = {R.drawable.ullu, R.drawable.aamb, R.drawable.imli, R.drawable.suntra, R.drawable.hockey, R.drawable.kursi, R.drawable.khota, R.drawable.ganna, R.drawable.ghora, R.drawable.chuha,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth};

    Integer[] img_exp_4 = {R.drawable.ungal, R.drawable.angoor, R.drawable.istri, R.drawable.sapera, R.drawable.hall, R.drawable.kar, R.drawable.kharbuja, R.drawable.gajjar, R.drawable.ghara, R.drawable.chiri,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth,
            R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth, R.drawable.ooth};
    View back_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragments = getFragments();

        viewpager = (ViewPager) findViewById(R.id.viewpager);
        swipe_left_btn = (Button) findViewById(R.id.swipe_left_btn);
        swipe_right_btn = (Button) findViewById(R.id.swipe_right_btn);
        title_img_alpha = (ImageView) findViewById(R.id.title_img_alpha);
        back_layout = findViewById(R.id.back_layout);

        adapter = new MyPageAdapter(getSupportFragmentManager(), fragments);
        viewpager.setAdapter(adapter);

        swipe_left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(getItem(-1), true);
            }
        });

        swipe_right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(getItem(+1), true);
            }
        });
//        title_img_alpha.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    Alphabet_Activity_Screen.this.finish();
//                    Alphabet_Activity_Screen.this.overridePendingTransition(R.anim.stay, R.anim.slide_down);
//                }
//                return true;
//            }
//        });

        back_layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {



                return false;
            }
        });
    }

    private int getItem(int i) {
        return viewpager.getCurrentItem() + i;
    }

    private List<Fragment> getFragments() {
        List<Fragment> fList = new ArrayList<Fragment>();
        String[] punjabi_txt_1 = this.getResources().getStringArray(R.array.example_one);
        String[] punjabi_txt_2 = this.getResources().getStringArray(R.array.example_two);
        String[] punjabi_txt_3 = this.getResources().getStringArray(R.array.example_three);
        String[] punjabi_txt_4 = this.getResources().getStringArray(R.array.example_four);

        for (int i = 0; i < punjabi_txt_1.length; i++) {
            fList.add(AlphabateScreen.newInstance(punjabi_txt_1[i],punjabi_txt_2[i],punjabi_txt_3[i],punjabi_txt_4[i],
                    img_exp_1[i],img_exp_2[i],img_exp_3[i],img_exp_4[i]));
        }


        return fList;
    }

    private class MyPageAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragments;

        public MyPageAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments.get(position);
        }

        @Override
        public int getCount() {
            return this.fragments.size();
        }
    }

}
