package com.example.h_mal.alameera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BasketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        CustomAppBarClass newbar = new CustomAppBarClass(this);
        newbar.SetpUpBar();
    }
}
