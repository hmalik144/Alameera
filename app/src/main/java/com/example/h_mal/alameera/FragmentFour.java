package com.example.h_mal.alameera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.h_mal.alameera.FragmentOne.HomeScreenItemAdapter;
import com.example.h_mal.alameera.FragmentOne.HomeScreenItems;

import java.util.ArrayList;


public class FragmentFour extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_four, container, false);

        ListView lv = rootView.findViewById(R.id.listViewServices);

        ArrayList<HomeScreenItems> items = new ArrayList<>();
        items.add(new HomeScreenItems(R.drawable.hamma,"Hammam Bath"));
        items.add(new HomeScreenItems(R.drawable.earring,"Earrings"));
        items.add(new HomeScreenItems(R.drawable.hairmist,"Hair Mist"));
        items.add(new HomeScreenItems(R.drawable.hair,"Hair"));
        items.add(new HomeScreenItems(R.drawable.nails,"Nails"));

        HomeScreenItemAdapter adapter = new HomeScreenItemAdapter(getContext(),items);

        lv.setAdapter(adapter);

        return rootView;
    }

}
