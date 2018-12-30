package com.example.h_mal.alameera;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by h_mal on 08/09/2018.
 */

public class LoyaltyAdapter extends ArrayAdapter<Boolean> {

    public LoyaltyAdapter(@NonNull Context context, @NonNull List<Boolean> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_loyalty, parent, false);
        }

        Boolean currentBoolean = getItem(position);

        ImageView cross = listItemView.findViewById(R.id.cross);

        if (currentBoolean){
            cross.setVisibility(View.VISIBLE);
        }else{
            cross.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
