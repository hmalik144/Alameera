package com.example.h_mal.alameera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


public class FragmentFive extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_five, container, false);

        GridView gridLayout = rootView.findViewById(R.id.loyalty_card_view);

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);

        LoyaltyAdapter adapter = new LoyaltyAdapter(getActivity(),booleans);
        gridLayout.setAdapter(adapter);

        return rootView;
    }


}
