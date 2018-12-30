package com.example.h_mal.alameera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.h_mal.alameera.FragmentOne.HomeScreenItemAdapter;
import com.example.h_mal.alameera.FragmentOne.HomeScreenItems;

import java.util.ArrayList;


public class FragmentHome extends Fragment{

    private HomeScreenItemAdapter adapter;

    private ArrayList<HomeScreenItems> items;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        ListView lv = rootView.findViewById(R.id.listView);

        items = new ArrayList<>();
        items.add(new HomeScreenItems(R.drawable.hair,"Hair"));
        items.add(new HomeScreenItems(R.drawable.nails,"Nails"));
        items.add(new HomeScreenItems(R.drawable.hamma,"Hammam Bath"));
        items.add(new HomeScreenItems(R.drawable.earring,"Earrings"));
        items.add(new HomeScreenItems(R.drawable.hairmist,"Hair Mist"));

        adapter = new HomeScreenItemAdapter(getContext(),items);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(),ServiceActivity.class);
                startActivity(i);
            }
        });

        return rootView;
    }


}
