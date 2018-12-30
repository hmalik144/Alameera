package com.example.h_mal.alameera;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by h_mal on 11/09/2018.
 */

public class CustomAppBarClass {

    private Activity activity;

    public CustomAppBarClass(Activity activity) {
        this.activity = activity;
    }

    public void SetpUpBar(){

        View viewGroupAppBar = activity.findViewById(R.id.appbar);

        ImageView back = viewGroupAppBar.findViewById(R.id.back_icon);
        ImageView profile = viewGroupAppBar.findViewById(R.id.action_bar_profile);

        if ((activity.getClass().toString()).equals(MainActivity.class.toString())) {
            back.setVisibility(View.GONE);
            profile.setVisibility(View.VISIBLE);
            profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    (MainActivity.drawerLayout).openDrawer(Gravity.START);
                    Log.i("", "onClick: Mainactivity");
                }
            });
        }else{
            profile.setVisibility(View.GONE);
            back.setVisibility(View.VISIBLE);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    NavUtils.navigateUpFromSameTask(activity);
                }
            });
        }

        ImageView basket = viewGroupAppBar.findViewById(R.id.action_bar_basket);
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, BasketActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(activity,intent,null);
            }
        });

        ImageView test = this.activity.findViewById(R.id.action_bar_social);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, MediaActivity.class);
                startActivity(activity,intent,null);
            }
        });
    }


}
