package com.example.codemaven3015.uniservityapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
//    RecyclerView Popular_Product;
//    LinearLayoutManager layoutManager;
LinearLayout UKRAINE_textview,RUSSIA_textview;
//    HomeRecycler_Card adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setUKRAINE_textview();

        //Popular_Product =findViewById(R.id.Popular_Product);
        //setPopularProduct();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void setUKRAINE_textview()
    {
        UKRAINE_textview=findViewById(R.id.UKRAINE_textview);
        RUSSIA_textview=findViewById(R.id.RUSSIA_textview);
        UKRAINE_textview.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            Intent intent= new Intent(Home.this,Colleges.class);
            intent.putExtra("menu","UKRAINE");
            startActivity(intent);
        }
    });

        RUSSIA_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(Home.this,Colleges.class);
                intent.putExtra("menu","RUSSIA");
                startActivity(intent);
            }
        });
    }

//    private void setPopularProduct()
//    {
//
//        Popular_Product.setHasFixedSize(true);
//        layoutManager=new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        Popular_Product.setLayoutManager(layoutManager);
//        adapter=new HomeRecycler_Card(this);
//        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
//        Popular_Product.addItemDecoration(new SpacesItemDecoration(spacingInPixels));
//        Popular_Product.setItemAnimator(new DefaultItemAnimator());
//        Popular_Product.setAdapter(adapter);
//    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            // Handle the camera action
        } else if (id == R.id.countries) {
            Intent intent= new Intent(Home.this,Colleges.class);
            intent.putExtra("menu","Countries");
            startActivity(intent);

        } else if (id == R.id.universities) {
            Intent intent= new Intent(Home.this,Colleges.class);
            intent.putExtra("menu","Universities");
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
