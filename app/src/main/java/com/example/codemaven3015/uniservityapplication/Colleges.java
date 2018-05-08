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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Colleges extends AppCompatActivity {
    RecyclerView Popular_Product;
    LinearLayoutManager layoutManager;
    String fromWhere = "";
    TextView headerText;
    SearchView searchView;
    //ArrayList<String> names;
    JSONArray countries,ukrain,russia, allUniversitiesList;
    CollegeRecycler_Card adapter;
    JSONArray tempArray ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);

        Popular_Product=findViewById(R.id.Popular_Product);
        Popular_Product =findViewById(R.id.Popular_Product);
        try {
            setVariable();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        setTextToHeader();
        //setPopularProduct(tempArray);
        setSearchView();

    }

    private void setVariable() throws JSONException {
        countries = new JSONArray();
        String[] countries1 ={"Ukrain","Russia"};
        int[] images_countries = {R.drawable.ukraine_flag,
                R.drawable.russian_flag};
        for(int i = 0; i< countries1.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",countries1[i]);
            obj.put("image_logo",images_countries[i]);
            countries.put(obj);
        }

        String[] college_ukrain = {"BOGOMOLETS NATIONALMEDICAL UNIVERSITY","Kharkiv National Medical University","Vinnitsa National Medical University",
                "ODESSA NATIONAL MEDICAL UNIVERSITY UKRAINE (KIEV)","Kiev Medical University UAFM","Dnipropetrovsk State Medical Academy",
                "V. N. Karazin Kharkiv National Medical University","ZAPOROZHYE STATE MEDICAL UNIVERSITY UKRAINE "};
        int[] images_ukrain = {
                R.drawable.bogomolets_logo,R.drawable.kharkiv_logo,R.drawable.vinnitsa_logo,
                R.drawable.odessa_logo,R.drawable.kiev_logo,R.drawable.dnipropetrovsk_logo,
                R.drawable.vnkarazin_logo,R.drawable.zaporizhia_logo};
        ukrain = new JSONArray();
        for(int i = 0; i< college_ukrain.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_ukrain[i]);
            obj.put("image_logo",images_ukrain[i]);
            ukrain.put(obj);
        }

        int[] images_russia ={
                R.drawable.moscow_logo,R.drawable.people_logo,R.drawable.stavropol_logo,
                R.drawable.smolensk_logo,R.drawable.kursk_logo,R.drawable.bashkir_logo,
                R.drawable.kazan_logo,R.drawable.volgograd_logo,R.drawable.kirov_logo};
        String[] college_russia={"Moscow State University","PEOPLES' FRIENDSHIP UNIVERSITY OF RUSSIA",
                "STAVROPOL STATE MEDICAL UNIVERSITY", "SMOLENSK STATE MEDICAL UNIVERSITY",
                "KURSK STATE MEDICAL UNIVERSITY","BASHKIR STATE MEDICAL UNIVERSITY","KAZAN STATE MEDICAL UNIVERSITY",
                "VOLGOGRAD STATE MEDICAL UNIVERSITY","KIROV STATE MEDICAL UNIVERSITY"};

        russia = new JSONArray();
        for(int i = 0; i< college_russia.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_russia[i]);
            obj.put("image_logo",images_russia[i]);
            russia.put(obj);
        }

        String[] allUniversities = {"BOGOMOLETS NATIONALMEDICAL UNIVERSITY","Kharkiv National Medical University","Vinnitsa National Medical University",
                "ODESSA NATIONAL MEDICAL UNIVERSITY UKRAINE (KIEV)","Kiev Medical University UAFM","Dnipropetrovsk State Medical Academy",
                "V. N. Karazin Kharkiv National Medical University","ZAPOROZHYE STATE MEDICAL UNIVERSITY UKRAINE ","Moscow State University","PEOPLES' FRIENDSHIP UNIVERSITY OF RUSSIA",
                "STAVROPOL STATE MEDICAL UNIVERSITY", "SMOLENSK STATE MEDICAL UNIVERSITY",
                "KURSK STATE MEDICAL UNIVERSITY","BASHKIR STATE MEDICAL UNIVERSITY","KAZAN STATE MEDICAL UNIVERSITY",
                "VOLGOGRAD STATE MEDICAL UNIVERSITY","KIROV STATE MEDICAL UNIVERSITY"};
        int[] images_allUniversities = {
                R.drawable.bogomolets_logo,R.drawable.kharkiv_logo,R.drawable.vinnitsa_logo,
                R.drawable.odessa_logo,R.drawable.kiev_logo,R.drawable.dnipropetrovsk_logo,
                R.drawable.vnkarazin_logo,R.drawable.zaporizhia_logo,
                R.drawable.moscow_logo,R.drawable.people_logo,R.drawable.stavropol_logo,
                R.drawable.smolensk_logo,R.drawable.kursk_logo,R.drawable.bashkir_logo,
                R.drawable.kazan_logo,R.drawable.volgograd_logo,R.drawable.kirov_logo
        };

        allUniversitiesList = new JSONArray();
        for(int i = 0; i< allUniversities.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",allUniversities[i]);
            obj.put("image_logo",images_allUniversities[i]);
            allUniversitiesList.put(obj);
        }





    }
    private void filter(String text) {
        //new array list that will hold the filtered data
        //ArrayList<String> filterdNames = new ArrayList<>();
        JSONArray filterList = new JSONArray();
        for (int i = 0 ; i<tempArray.length(); i++){
            JSONObject obj = new JSONObject();

            try {
                obj = tempArray.getJSONObject(i);
                String name = obj.getString("name");
                if(name.toLowerCase().contains(text.toLowerCase())){
                    filterList.put(obj);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        adapter=new CollegeRecycler_Card(this,filterList,fromWhere);
        Popular_Product.setAdapter(adapter);
        //setPopularProduct(filterList);
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
        tempArray = new JSONArray();
        if(fromWhere.equals("Universities")){
            tempArray = allUniversitiesList;
        }else if(fromWhere.equals("Countries")) {
            tempArray = countries;
        }else if(fromWhere.equals("UKRAINE")){
            tempArray = ukrain;
        }else  if(fromWhere.equals("RUSSIA")){
            tempArray = russia;
        }else {
            tempArray = allUniversitiesList;
        }
        setPopularProduct(tempArray);
    }


    private void setPopularProduct( JSONArray arrayList)
    {
        Popular_Product.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        Popular_Product.setLayoutManager(layoutManager);
        adapter=new CollegeRecycler_Card(this,arrayList,fromWhere);
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
        Popular_Product.addItemDecoration(new SpacesItemDecoration(spacingInPixels));
        Popular_Product.setItemAnimator(new DefaultItemAnimator());
        Popular_Product.setAdapter(adapter);
    }
}
