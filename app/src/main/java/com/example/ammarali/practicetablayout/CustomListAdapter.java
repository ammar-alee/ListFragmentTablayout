package com.example.ammarali.practicetablayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ammar.Ali on 10/30/16.
 */

public class CustomListAdapter extends BaseAdapter {

    private ArrayList<ListItem> listData;
    private LayoutInflater layoutInflater;

    public CustomListAdapter(Context context, ArrayList<ListItem> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_row_layout, null);
            holder = new ViewHolder();
            holder.headingView = (TextView) convertView.findViewById(R.id.title);
            holder.randomTextView = (TextView) convertView.findViewById(R.id.randomText);
            holder.imageView = (ImageView) convertView.findViewById(R.id.thumbImage);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ListItem list_Item = listData.get(position);
        holder.headingView.setText(list_Item.getHeading());
        holder.randomTextView.setText("" + list_Item.getRandomText());

        if (holder.imageView != null) {
            new ImageDownloaderTask(holder.imageView).execute(list_Item.getUrl());
        }

        return convertView;
    }

    static class ViewHolder {
        TextView headingView;
        TextView randomTextView;
        ImageView imageView;
    }
}