package com.example.h_mal.alameera;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class FragmentThree extends Fragment {

    private DatabaseReference productsDB;
    private Product currentProduct;
    private String TAG = "fragmentThree";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);

        final ListView listView = rootView.findViewById(R.id.listViewProducts);
        final ProgressBar pb = rootView.findViewById(R.id.fragProgress);

        listView.setVisibility(View.INVISIBLE);

        final ArrayList<Product> products = new ArrayList<Product>();
        productsDB = FirebaseDatabase.getInstance().getReference("Products");

        productsDB.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                products.clear();

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {


                    Product retrievedProduct = postSnapshot.getValue(Product.class);

                    //adding artist to the list
                    products.add(retrievedProduct);
                }

                Log.i(TAG, "onDataChange: current products: " + products.size() + "\n" +
                            "product image: " + products.get(0).getProductImage());

                ProductsAdapter adapter = new ProductsAdapter(getActivity(),products,pb);
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.i(TAG, "onCancelled: "+ databaseError);

            }
        });

        pb.setTag(pb.getVisibility());
        pb.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                int newVis = pb.getVisibility();
                if((int)pb.getTag() != newVis)
                {
                    pb.setTag(pb.getVisibility());
                    //visibility has changed
                    listView.setVisibility(View.VISIBLE);
                }
            }
        });

        return rootView;
    }

}
