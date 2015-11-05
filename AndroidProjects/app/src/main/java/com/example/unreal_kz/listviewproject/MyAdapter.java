package com.example.unreal_kz.listviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Unreal_KZ on 05.11.2015.
 */
public class MyAdapter extends ArrayAdapter<String>{
    public MyAdapter(Context context, String []resource) {
        super(context, R.layout.custom_list_view,resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.custom_list_view,parent, false);
        String data = getItem(position);
        TextView textView = (TextView) convertView.findViewById(R.id.txtViewID);
        textView.setText(data);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imgViewID);
        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.ic_action_name4);
                break;
            case 1:
                imageView.setImageResource(R.drawable.ic_action_name);
                break;
            case 2:
                imageView.setImageResource(R.drawable.ic_action_name2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.ic_action_name3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.ic_action_name4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.ic_action_name3);
                break;
            case 6:
                imageView.setImageResource(R.drawable.ic_action_name);
                break;
            case 7:
                imageView.setImageResource(R.drawable.ic_action_name2);
                break;
            default:
                imageView.setImageResource(R.drawable.ic_action_name3);
                break;
        }
        return convertView;
    }
}
