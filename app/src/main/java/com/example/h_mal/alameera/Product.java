package com.example.h_mal.alameera;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by h_mal on 08/09/2018.
 */

@IgnoreExtraProperties
public class Product {

    public String productDescription;
    public String productImage;
    public String productName;
    public float productPrice;
    public int productQuantity;

    public Product() {
    }

    public Product(String productDescription, String productImage, String productName, float productPrice, int productQuantity) {
        this.productDescription = productDescription;
        this.productImage = productImage;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductImage() {
        return productImage;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
