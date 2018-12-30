package com.example.h_mal.alameera;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by h_mal on 08/09/2018.
 */

public class ProductsAdapter extends ArrayAdapter<Product>{

    private ProgressBar pb;

    private int count = 0;

    public ProductsAdapter(@NonNull Activity context, @NonNull ArrayList<Product> objects, ProgressBar pb) {
        super(context, 0, objects);
        this.pb = pb;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_products, parent, false);
        }
        Product currentProduct = getItem(position);

        ImageView productImageView = listItemView.findViewById(R.id.prodImageView);
        TextView productName = listItemView.findViewById(R.id.prodNameTextView);
        TextView productDesc = listItemView.findViewById(R.id.proDescTextView2);
        TextView productPrice = listItemView.findViewById(R.id.prodPriceTextView3);

        Picasso.with(getContext())
                .load(currentProduct.getProductImage())
                .placeholder(R.drawable.a)
                .into(productImageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        count = count +1;
                        if (count >= 1){
                            pb.setVisibility(View.GONE);
                        }
                    }

                    @Override
                    public void onError() {

                    }
                });

        productName.setText(currentProduct.getProductName());
        productDesc.setText(currentProduct.getProductDescription());
        productPrice.setText(String.valueOf(currentProduct.getProductPrice()));

        return listItemView;

    }




}
