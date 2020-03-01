package com.example.h_mal.alameera;

import android.graphics.RectF;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alamkanak.weekview.MonthLoader;
import com.alamkanak.weekview.WeekView;
import com.alamkanak.weekview.WeekViewEvent;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FragmentTwo extends Fragment {

    WeekView mWeekView;
    List<WeekViewEvent> events = new ArrayList<WeekViewEvent>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);

//        ListView bookingsListView = rootView.findViewById(R.id.listViewBookings);

//        ArrayList<Booking> bookingEntry = new ArrayList<>();
//        bookingEntry.add(new Booking())

//        BookingAdapter adapter = new BookingAdapter(getActivity(),);
//        bookingsListView.setAdapter(adapter);
        mWeekView = (WeekView) rootView.findViewById(R.id.weekView);

        if ((MainActivity.mAuth).getCurrentUser() == null){
            mWeekView.setVisibility(View.GONE);
        }else {




            mWeekView.setOnEventClickListener(new WeekView.EventClickListener() {
                @Override
                public void onEventClick(WeekViewEvent event, RectF eventRect) {

                }
            });

            mWeekView.setMonthChangeListener(new MonthLoader.MonthChangeListener() {
                @Override
                public List<WeekViewEvent> onMonthChange(int newYear, int newMonth) {

                    return events;
                }
            });

            mWeekView.setEmptyViewClickListener(new WeekView.EmptyViewClickListener() {
                @Override
                public void onEmptyViewClicked(Calendar time) {
//                openDialog(time);
                }
            });
        }

        return rootView;
    }
}
