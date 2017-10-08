package com.punjabi.oodda;


import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlphabateScreen extends Fragment implements View.OnClickListener {

    public static String EXTRA_MESSAGE_TEXT1 = "extra_text1";
    public static String EXTRA_MESSAGE_TEXT2 = "extra_text2";
    public static String EXTRA_MESSAGE_TEXT3 = "extra_text3";
    public static String EXTRA_MESSAGE_TEXT4 = "extra_text4";
    public static String EXTRA_MESSAGE_IMG1 = "extra_img1";
    public static String EXTRA_MESSAGE_IMG2 = "extra_img2";
    public static String EXTRA_MESSAGE_IMG3 = "extra_img3";
    public static String EXTRA_MESSAGE_IMG4 = "extra_img4";
    TextView punjabi_text, english_text;
    ImageView text_image, first_example_image, second_example_image, third_example_image;
    LinearLayout alphachart;
    String text_1, text_2, text_3, text_4;
    int imgs1, imgs2, imgs3, imgs4;


    public static final AlphabateScreen newInstance(String text_1, String text_2, String text_3, String text_4, int imgs1, int imgs2, int imgs3, int imgs4) {
        AlphabateScreen f = new AlphabateScreen();
        Bundle bdl = new Bundle(1);
        bdl.putString(EXTRA_MESSAGE_TEXT1, text_1);
        bdl.putString(EXTRA_MESSAGE_TEXT2, text_2);
        bdl.putString(EXTRA_MESSAGE_TEXT3, text_3);
        bdl.putString(EXTRA_MESSAGE_TEXT4, text_4);
        bdl.putInt(EXTRA_MESSAGE_IMG1, imgs1);
        bdl.putInt(EXTRA_MESSAGE_IMG2, imgs2);
        bdl.putInt(EXTRA_MESSAGE_IMG3, imgs3);
        bdl.putInt(EXTRA_MESSAGE_IMG4, imgs4);
        f.setArguments(bdl);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alphabate_screen, container, false);

        punjabi_text = (TextView) view.findViewById(R.id.punjabi_text);
        english_text = (TextView) view.findViewById(R.id.english_text);
        text_image = (ImageView) view.findViewById(R.id.text_image);
        first_example_image = (ImageView) view.findViewById(R.id.first_example_image);
        second_example_image = (ImageView) view.findViewById(R.id.second_example_image);
        third_example_image = (ImageView) view.findViewById(R.id.third_example_image);

        text_1 = getArguments().getString(EXTRA_MESSAGE_TEXT1);
        text_2 = getArguments().getString(EXTRA_MESSAGE_TEXT2);
        text_3 = getArguments().getString(EXTRA_MESSAGE_TEXT3);
        text_4 = getArguments().getString(EXTRA_MESSAGE_TEXT4);

        imgs1 = getArguments().getInt(EXTRA_MESSAGE_IMG1);
        imgs2 = getArguments().getInt(EXTRA_MESSAGE_IMG2);
        imgs3 = getArguments().getInt(EXTRA_MESSAGE_IMG3);
        imgs4 = getArguments().getInt(EXTRA_MESSAGE_IMG4);

        if (!text_1.equals(""))
            punjabi_text.setText(text_1);

        text_image.setImageResource(imgs1);
        first_example_image.setImageResource(imgs2);
        second_example_image.setImageResource(imgs3);
        third_example_image.setImageResource(imgs4);

        first_example_image.setOnClickListener(this);
        second_example_image.setOnClickListener(this);
        third_example_image.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Bitmap main = ((BitmapDrawable) text_image.getDrawable()).getBitmap();
        switch (v.getId()) {
            case R.id.first_example_image:
                Bitmap firstBitmap = ((BitmapDrawable) first_example_image.getDrawable()).getBitmap();

                text_image.setImageBitmap(firstBitmap);
                first_example_image.setImageBitmap(main);

                break;

            case R.id.second_example_image:

                Bitmap secondBitmap = ((BitmapDrawable) second_example_image.getDrawable()).getBitmap();

                text_image.setImageBitmap(secondBitmap);
                second_example_image.setImageBitmap(main);

                break;

            case R.id.third_example_image:

                Bitmap thirdBitmap = ((BitmapDrawable) third_example_image.getDrawable()).getBitmap();

                text_image.setImageBitmap(thirdBitmap);
                third_example_image.setImageBitmap(main);

                break;

        }
    }


}
