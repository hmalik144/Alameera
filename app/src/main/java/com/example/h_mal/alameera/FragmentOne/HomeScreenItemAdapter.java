package com.example.h_mal.alameera.FragmentOne;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.h_mal.alameera.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by h_mal on 22/08/2018.
 */

public class HomeScreenItemAdapter extends ArrayAdapter<HomeScreenItems>{


    public HomeScreenItemAdapter(@NonNull Context context, @NonNull ArrayList<HomeScreenItems> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.home_screen_list_item, parent, false);
        }
        HomeScreenItems currentItem = getItem(position);

        ImageView homeScreenImageView = listItemView.findViewById(R.id.home_item_imageView);

        Picasso.with(getContext()).load(currentItem.getImg()).placeholder(R.drawable.alogo2).into(homeScreenImageView);

        TextView homeScreenTextView = listItemView.findViewById(R.id.home_item_textView);
        homeScreenTextView.setText(currentItem.getTitle());

        return listItemView;
    }
}
