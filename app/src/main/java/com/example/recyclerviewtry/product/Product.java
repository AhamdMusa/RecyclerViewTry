package com.example.recyclerviewtry.product;

import com.example.recyclerviewtry.R;

import java.util.ArrayList;

public class Product {

    private String productName, productPrice;
    private int productImage;

    public Product() {
    }

    public Product(String productName, String productPrice, int productImage) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public ArrayList<Product> allProduct(){
        ArrayList<Product> allProduct=new ArrayList<>();

        allProduct.add(new Product("rersg","345", R.drawable.download5));
        allProduct.add(new Product("hhvj","634", R.drawable.download6));
        allProduct.add(new Product("vhuf","253", R.drawable.download7));
        allProduct.add(new Product("xfnxg","765", R.drawable.download8));
        allProduct.add(new Product("dfh","334", R.drawable.download5));
        allProduct.add(new Product("eyw","867", R.drawable.download6));
        allProduct.add(new Product("hfhm","234", R.drawable.download7));
        allProduct.add(new Product("wert","876", R.drawable.download8));
        allProduct.add(new Product("jyukf","345", R.drawable.download5));

        return allProduct;


    }

}
