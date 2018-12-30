package com.example.h_mal.alameera;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by h_mal on 09/09/2018.
 */

public class BookingAdapter extends ArrayAdapter<Booking>{

    public BookingAdapter(@NonNull Context context, @NonNull List<Booking> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        return convertView;
    }
}
