package com.example.codemaven3015.uniservityapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class Colleges extends AppCompatActivity {
    RecyclerView Popular_Product;
    LinearLayoutManager layoutManager;
    String fromWhere = "";
TextView headerText;
    CollegeRecycler_Card adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);

        Popular_Product=findViewById(R.id.Popular_Product);
        Popular_Product =findViewById(R.id.Popular_Product);
        setTextToHeader();
        setPopularProduct();

    }

    private void setTextToHeader() {
        headerText = findViewById(R.id.headerText);
        String newString;
        newString=getIntent().getStringExtra("menu");
        fromWhere = newString;
        headerText.setText(newString);
    }


    private void setPopularProduct()
    {
        Popular_Product.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        Popular_Product.setLayoutManager(layoutManager);
        adapter=new CollegeRecycler_Card(this,fromWhere);
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
        Popular_Product.addItemDecoration(new SpacesItemDecoration(spacingInPixels));
        Popular_Product.setItemAnimator(new DefaultItemAnimator());
        Popular_Product.setAdapter(adapter);
    }
}
