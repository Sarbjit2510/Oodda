package com.punjabi.oodda.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.punjabi.oodda.Gurmukhi_Screen;
import com.punjabi.oodda.Punjabi_Type_Cast;
import com.punjabi.oodda.R;

/**
 * Created by Aman on 07-Feb-16.
 */
public class Grid_Gurmukhi_Adapter extends BaseAdapter {
    Context con;
    String[] gurmukhi;

    public Grid_Gurmukhi_Adapter(Context gurmukhi_screen, String[] gurmukhi_text) {
        this.con = gurmukhi_screen;
        this.gurmukhi = gurmukhi_text;
    }

    @Override
    public int getCount() {
        return gurmukhi.length;
    }

    @Override
    public Object getItem(int position) {
        return gurmukhi[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        ViewHolder viewHolder = null;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.gird_singe_text, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else

        {
            viewHolder = (ViewHolder) view.getTag();
        }


        viewHolder.textView.setText(gurmukhi[position]);



        return view;
    }

    public class ViewHolder {

        Punjabi_Type_Cast textView;
        LinearLayout linear_back;

        public ViewHolder(View view) {

            textView = (Punjabi_Type_Cast) view.findViewById(R.id.grid_text);
//            linear_back = (ImageView) view.findViewById(R.id.img);
        }
    }

}
