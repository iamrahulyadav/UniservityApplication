package com.example.codemaven3015.uniservityapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class Colleges extends AppCompatActivity {
    RecyclerView Popular_Product;
    LinearLayoutManager layoutManager;
    String fromWhere = "";
TextView headerText;
SearchView searchView;
    ArrayList<String> names;
    CollegeRecycler_Card adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);

        Popular_Product=findViewById(R.id.Popular_Product);
        Popular_Product =findViewById(R.id.Popular_Product);
        setTextToHeader();
        setPopularProduct();
        setSearchView();

    }
    private void filter(String text) {
        //new array list that will hold the filtered data
        ArrayList<String> filterdNames = new ArrayList<>();

        //looping through existing elements
        for (String s : names) {
            //if the existing elements contains the search input
            if (s.toLowerCase().contains(text.toLowerCase())) {
                //adding the element to filtered list
                filterdNames.add(s);
            }
        }

        //calling a method of the adapter class and passing the filtered list
        adapter.filterList(filterdNames);
    }

    private void setSearchView() {
        searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText.toString());
                return true;
            }
        });
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
