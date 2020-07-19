package com.example.demolistviewwithcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] countryName;
    private int[] img;
    private LayoutInflater inflater;

    CustomAdapter(Context context, String[] countryName, int[] img) {
        this.context = context;
        this.countryName = countryName;
        this.img = img;
    }

    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item,parent,false);
        }

        ImageView imgView = convertView.findViewById(R.id.imgViewId);
        TextView tv1 = convertView.findViewById(R.id.textViewId);

        imgView.setImageResource(img[position]);
        tv1.setText(countryName[position]);

        return convertView;
    }
}

