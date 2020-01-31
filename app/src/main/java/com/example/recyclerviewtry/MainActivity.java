package com.example.recyclerviewtry;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import com.example.recyclerviewtry.product.Product;
import com.example.recyclerviewtry.product.adapter.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView productList;
    private Product product;
    private ArrayList<Product> products;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productList=findViewById(R.id.rc_VW);

        product=new Product();
        products=product.allProduct();
        
        init();
        
    }

    private void init() {
        adapter = new Adapter(this, products);
        productList.setLayoutManager(new GridLayoutManager(this,2));
        productList .setAdapter(adapter);

    }
}
