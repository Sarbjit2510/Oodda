package com.punjabi.oodda;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;

public class Gurmukhi_Screen extends AppCompatActivity {
    Punjabi_Type_Cast text_zoom;
    GridView GRID_gurmukhi;
    String[] gurmukhi_text;
    ArrayList<GridObject> myObjects;
    MyCustomAdapter adapter;
    ImageView title_img_gurmukhi;
    private int previous_selected = -1;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurmukhi__screen);
        gurmukhi_text = getResources().getStringArray(R.array.alphatbet);
        final Animation popup_down = AnimationUtils.loadAnimation(Gurmukhi_Screen.this, R.anim.blink);
        myObjects = new ArrayList<>();
        for (String s : gurmukhi_text) {
            myObjects.add(new GridObject(s, 0));
        }

        GRID_gurmukhi = (GridView) findViewById(R.id.gridView1);
        text_zoom = (Punjabi_Type_Cast) findViewById(R.id.text_punjabi);
        title_img_gurmukhi = (ImageView) findViewById(R.id.title_img_gurmukhi);
        adapter = new MyCustomAdapter(Gurmukhi_Screen.this);
        GRID_gurmukhi.setAdapter(adapter);
        GRID_gurmukhi.setChoiceMode(GridView.CHOICE_MODE_SINGLE);
        myObjects.get(0).setState(1);
        GRID_gurmukhi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                view.startAnimation(popup_down);

                text_zoom.setText(gurmukhi_text[position]);
                for (int i = 0; i < myObjects.size(); i++) {
                    myObjects.get(i).setState(0);
                }
                myObjects.get(position).setState(1);
                adapter.notifyDataSetChanged();
                play_file_wav();
            }
        });
        title_img_gurmukhi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    if(player!=null){
                        player.stop();
                    }
                    Gurmukhi_Screen.this.finish();
                    Gurmukhi_Screen.this.overridePendingTransition(R.anim.slide_up, R.anim.slide_down);

                }
                return true;
            }
        });

    }

    static class ViewHolder {
        TextView textView;
        ImageView image;
    }

    private class MyCustomAdapter extends BaseAdapter {

        private LayoutInflater mInflater;

        public MyCustomAdapter(Context context) {
            mInflater = LayoutInflater.from(context);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            GridObject object = myObjects.get(position);
            ViewHolder holder;

            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.gird_singe_text, null);
                holder = new ViewHolder();
                holder.textView = (Punjabi_Type_Cast) convertView.findViewById(R.id.grid_text);
                holder.image = (ImageView) convertView.findViewById(R.id.img);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.textView.setText(object.getName());
            holder.image.setImageResource(R.drawable.text_back);

            if (object.getState() == 1) {
                holder.image.setImageResource(R.drawable.ooda_blank);
            } else {
//                    holder.image.setImageResource(R.drawable.ooda_blank);
                holder.image.setImageResource(R.drawable.text_back);

            }
            previous_selected++;
            return convertView;
        }

        @Override
        public int getCount() {
            return myObjects.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
    }

    public void play_file(int number, Context con) throws IOException {
        AssetManager am;

        am = con.getAssets();
        AssetFileDescriptor afd = am.openFd("android.resource://" + Gurmukhi_Screen.this.getPackageName() + "/" + R.raw.audio);
        MediaPlayer mp = new MediaPlayer();
        try {
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
            mp.setLooping(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void play_file_wav() {
        player = MediaPlayer.create(Gurmukhi_Screen.this, R.raw.audio);
        player.start();
        player.setLooping(false);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
