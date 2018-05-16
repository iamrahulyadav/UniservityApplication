package com.example.codemaven3015.uniservityapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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
    JSONArray countries,ukrain,russia,bangladesh,belarus,china,georgia,kazakshtan,
            kyragyzstan,nepal,phillipines,poland, allUniversitiesList;
    CollegeRecycler_Card adapter;
    JSONArray tempArray ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);

        Popular_Product=findViewById(R.id.Popular_Product);
        Popular_Product =findViewById(R.id.Popular_Product);
        searchView = findViewById(R.id.searchView);
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
        String[] countries1 ={"BANGLADESH","BELARUS","CHINA","GEORGIA","KAZAKSHTAN",
                "KYRAGYZSTAN","NEPAL","PHILLIPINES","POLAND",
                "RUSSIA","UKRAIN"};
        int[] images_countries = {
                R.drawable.bangladesh,R.drawable.flag_of_belarus,R.drawable.china,
                R.drawable.flag_of_georgia,R.drawable.flag_of_kazakhstan,R.drawable.kyrgyzstan,
                R.drawable.nepal,R.drawable.philippines,R.drawable.poland,R.drawable.russia,R.drawable.ukraine_flag};
        for(int i = 0; i< countries1.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",countries1[i]);
            obj.put("image_logo",images_countries[i]);
            countries.put(obj);
        }
////////////////////////////////////////

        String[] college_bangladesh ={"ANWER KHAN MODERN MEDICAL COLLEGE","DHAKA CENTRAL INT MEDICAL COLLEGE",
                "JALALABAD RAGIB-RABEYA MEDICAL COLLEGE","NORTH EAST MEDICAL COLLEGE","PARK VIEW MEDICAL COLLEGE",
                "SYLHET WOMEN'S MEDICAL COLLEGE"};
        int[] images_bangladesh = { R.drawable.anwer_logo, R.drawable.dhaka_logo,
                R.drawable.jalalabad_ragib_logo, R.drawable.north_logo, R.drawable.park_logo, R.drawable.sylhet_logo};
        bangladesh = new JSONArray();
        for(int i = 0; i< college_bangladesh.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_bangladesh[i]);
            obj.put("image_logo",images_bangladesh[i]);
            bangladesh.put(obj);
        }
//////////////////////////////////////////
        String[] college_belarus ={"GRODON STATE MEDICAL UNIVERSITY","BELARUSSIAN STATE MEDICAL UNIVERSITY",
                "VITEBSK STATE MEDICAL UNIVERSITY","GOMEL STATE MEDICAL UNIVERSITY"};
        int[] images_belarus = { R.drawable.grodon_logo,R.drawable.belarussian_logo,R.drawable.vitebsk_logo,
                R.drawable.gomel_logo};
        belarus = new JSONArray();
        for(int i = 0; i< college_belarus.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_belarus[i]);
            obj.put("image_logo",images_belarus[i]);
            belarus.put(obj);
        }

        //////////////////////////////////////////
        String[] college_china ={"HUBEI UNIVERSITY OF MEDICINE","JILIN MEDICAL UNIVERSITY",
                "KUNMING MEDICAL UNIVERSITY","JIUJIANG UNIVERSITY","YUNNAN UNIVERSITY","BEIHUA MEDICAL UNIVERSITY",
                "CAPITAL MEDICAL UNIVERSITY","UNIVERSITY OF SOUTH CHINA (USC)","CHINA MEDICAL UNIVERSITY" ,
                "CHINA THREE GORGES UNIVERSITY"};
        int[] images_china = { R.drawable.hubei_logo,R.drawable.jilin_logo,R.drawable.kunming_logo,
                R.drawable.jiujiang_logo,
                R.drawable.yunnan_logo,R.drawable.beihua_logo,R.drawable.capital_logo,
                R.drawable.usc_logo,R.drawable.china_logo,R.drawable.three_logo};
        china = new JSONArray();
        for(int i = 0; i< college_china.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_china[i]);
            obj.put("image_logo",images_china[i]);
            china.put(obj);
        }

        //////////////////////////////////////////
        String[] college_georgia ={"BATUNI SHOTA RUSTAVELI MEDICAL UNIVERSITY","TBILISI STATE MEDICAL UNIVERSITY",
                "NEW VISION UNIVERSITY","CAUCASUS INTERNATIONAL UNIVERSITY","EUROPEAN UNIVERSITY",
                "GEO MEDI MEDICAL UNIVERSITY","DAVID TVILDIANI MEDICAL UNIVERSITY",
                "IVANE JAVAKHISHVILI TBILISI STATE UNIVERSITY"};
        int[] images_georgia = { R.drawable.batuni_logo,R.drawable.tabilisi_logo,R.drawable.new_logo,
                R.drawable.caucasus_logo,R.drawable.europeon_logo,R.drawable.geo_logo,
                R.drawable.david_logo,R.drawable.ivane_logo};
        georgia = new JSONArray();
        for(int i = 0; i< college_georgia.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_georgia[i]);
            obj.put("image_logo",images_georgia[i]);
            georgia.put(obj);
        }
//////////////////////////////////////////
        String[] college_kazakshtan ={"SEMEY STATE MEDICAL UNIVERSITY"};
        int[] images_kazakshtan = { R.drawable.semey_logo};
        kazakshtan = new JSONArray();
        for(int i = 0; i< college_kazakshtan.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_kazakshtan[i]);
            obj.put("image_logo",images_kazakshtan[i]);
            kazakshtan.put(obj);
        }

//////////////////////////////////////////
        String[] college_kyragyzstan ={"JALALABAD STATE UNIVERSITY","INTERNATIONAL SCHOOL OF MEDICINE",
                "OSH STATE UNIVERSITY","KYRGYZ STATE MEDICAL ACADEMY"};
        int[] images_kyragyzstan = { R.drawable.jalalabad_logo,R.drawable.international_logo,R.drawable.osh_logo,
                R.drawable.kyrgyz_logo};
        kyragyzstan = new JSONArray();
        for(int i = 0; i< college_kyragyzstan.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_kyragyzstan[i]);
            obj.put("image_logo",images_kyragyzstan[i]);
            kyragyzstan.put(obj);
        }

//////////////////////////////////////////
        String[] college_nepal ={"B.P. KOIRALA INSTITUTE OF HEALTH SCIENCES","INTERNATIONAL SCHOOL OF MEDICINE","MANIPAL COLLEGE OF MEDICAL SCIENCE",
                "KATHMANDU MEDICAL COLLEGE","NEPALGANJ MEDICAL COLLEGE","COLLEGE OF MEDICAL SCIENCE"};
        int[] images_nepal = { R.drawable.bp_logo,R.drawable.international_nepal_logo,R.drawable.manipal_logo,
                R.drawable.kathmandu_logo, R.drawable.nepalganj_logo ,R.drawable.college_logo};
        nepal = new JSONArray();
        for(int i = 0; i< college_nepal.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_nepal[i]);
            obj.put("image_logo",images_nepal[i]);
            nepal.put(obj);
        }
//////////////////////////////////////////
        String[] college_phillipines ={"AMA COLLEGE OF MEDICINE MAKATI METRO MANILA PHILIPPINES","UNIVERSITY OF PERPETUAL HELP LAS PINAS",
                "CAGAYAN STATE UNIVERSITY", "LYCEUM NORTHWESTERN UNIVERSITY",
                "EMILIO AGUINALDO COLLEGE","OUR LADY OF FATIMA MEDICAL COLLEGE PHILIPPINES (OLFU)"};
        int[] images_phillipines = { R.drawable.ama_logo,R.drawable.perpetual_logo,R.drawable.cagayan_logo,
                R.drawable.lyceum_logo,R.drawable.emilio_logo,R.drawable.fatima_logo};
        phillipines = new JSONArray();
        for(int i = 0; i< college_phillipines.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_phillipines[i]);
            obj.put("image_logo",images_phillipines[i]);
            phillipines.put(obj);
        }

//////////////////////////////////////////
        String[] college_poland ={"MEDICAL UNIVERSITY OF GDANSK (MUG), POLAND"};
        int[] images_poland = { R.drawable.medical_logo};
        poland = new JSONArray();
        for(int i = 0; i< college_poland.length;i++) {
            JSONObject obj = new JSONObject();
            obj.put("name",college_poland[i]);
            obj.put("image_logo",images_poland[i]);
            poland.put(obj);
        }



//////////////////////////////////////////////////
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

///////////////////////////////////////////////////////////////////

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



        String[] allUniversities = {"ANWER KHAN MODERN MEDICAL COLLEGE","DHAKA CENTRAL INT MEDICAL COLLEGE",
                "JALALABAD RAGIB-RABEYA MEDICAL COLLEGE","NORTH EAST MEDICAL COLLEGE","PARK VIEW MEDICAL COLLEGE",
                "SYLHET WOMEN'S MEDICAL COLLEGE","GRODON STATE MEDICAL UNIVERSITY","BELARUSSIAN STATE MEDICAL UNIVERSITY",
                "VITEBSK STATE MEDICAL UNIVERSITY","GOMEL STATE MEDICAL UNIVERSITY","HUBEI UNIVERSITY OF MEDICINE","JILIN MEDICAL UNIVERSITY",
                "KUNMING MEDICAL UNIVERSITY","JIUJIANG UNIVERSITY","YUNNAN UNIVERSITY","BEIHUA MEDICAL UNIVERSITY",
                "CAPITAL MEDICAL UNIVERSITY","UNIVERSITY OF SOUTH CHINA (USC)","CHINA MEDICAL UNIVERSITY" ,
                "CHINA THREE GORGES UNIVERSITY","BATUNI SHOTA RUSTAVELI MEDICAL UNIVERSITY","TBILISI STATE MEDICAL UNIVERSITY",
                "NEW VISION UNIVERSITY","CAUCASUS INTERNATIONAL UNIVERSITY","EUROPEAN UNIVERSITY",
                "GEO MEDI MEDICAL UNIVERSITY","DAVID TVILDIANI MEDICAL UNIVERSITY",
                "IVANE JAVAKHISHVILI TBILISI STATE UNIVERSITY","SEMEY STATE MEDICAL UNIVERSITY","JALALABAD STATE UNIVERSITY","INTERNATIONAL SCHOOL OF MEDICINE",
                "OSH STATE UNIVERSITY","KYRGYZ STATE MEDICAL ACADEMY","B.P. KOIRALA INSTITUTE OF HEALTH SCIENCES","INTERNATIONAL SCHOOL OF MEDICINE","MANIPAL COLLEGE OF MEDICAL SCIENCE",
                "KATHMANDU MEDICAL COLLEGE","NEPALGANJ MEDICAL COLLEGE","COLLEGE OF MEDICAL SCIENCE","AMA COLLEGE OF MEDICINE MAKATI METRO MANILA PHILIPPINES","UNIVERSITY OF PERPETUAL HELP LAS PINAS",
                "CAGAYAN STATE UNIVERSITY", "LYCEUM NORTHWESTERN UNIVERSITY",
                "EMILIO AGUINALDO COLLEGE","OUR LADY OF FATIMA MEDICAL COLLEGE PHILIPPINES (OLFU)","MEDICAL UNIVERSITY OF GDANSK (MUG), POLAND","Moscow State University","PEOPLES' FRIENDSHIP UNIVERSITY OF RUSSIA",
                "STAVROPOL STATE MEDICAL UNIVERSITY", "SMOLENSK STATE MEDICAL UNIVERSITY",
                "KURSK STATE MEDICAL UNIVERSITY","BASHKIR STATE MEDICAL UNIVERSITY","KAZAN STATE MEDICAL UNIVERSITY",
                "VOLGOGRAD STATE MEDICAL UNIVERSITY","KIROV STATE MEDICAL UNIVERSITY","BOGOMOLETS NATIONALMEDICAL UNIVERSITY","Kharkiv National Medical University","Vinnitsa National Medical University",
                "ODESSA NATIONAL MEDICAL UNIVERSITY UKRAINE (KIEV)","Kiev Medical University UAFM","Dnipropetrovsk State Medical Academy",
                "V. N. Karazin Kharkiv National Medical University","ZAPOROZHYE STATE MEDICAL UNIVERSITY UKRAINE "};
        int[] images_allUniversities = { R.drawable.anwer_logo, R.drawable.dhaka_logo,
                R.drawable.jalalabad_ragib_logo, R.drawable.north_logo, R.drawable.park_logo, R.drawable.sylhet_logo, R.drawable.grodon_logo,R.drawable.belarussian_logo,R.drawable.vitebsk_logo,
                R.drawable.gomel_logo,R.drawable.hubei_logo,R.drawable.jilin_logo,R.drawable.kunming_logo,
                R.drawable.jiujiang_logo,
                R.drawable.yunnan_logo,R.drawable.beihua_logo,R.drawable.capital_logo,
                R.drawable.usc_logo,R.drawable.china_logo,R.drawable.three_logo,R.drawable.batuni_logo,R.drawable.tabilisi_logo,R.drawable.new_logo,
                R.drawable.caucasus_logo,R.drawable.europeon_logo,R.drawable.geo_logo,
                R.drawable.david_logo,R.drawable.ivane_logo, R.drawable.semey_logo,R.drawable.jalalabad_logo,R.drawable.international_logo,R.drawable.osh_logo,
                R.drawable.kyrgyz_logo, R.drawable.bp_logo,R.drawable.international_nepal_logo,R.drawable.manipal_logo,
                R.drawable.kathmandu_logo, R.drawable.nepalganj_logo ,R.drawable.college_logo, R.drawable.ama_logo,R.drawable.perpetual_logo,R.drawable.cagayan_logo,
                R.drawable.lyceum_logo,R.drawable.emilio_logo,R.drawable.fatima_logo,R.drawable.medical_logo,R.drawable.moscow_logo,R.drawable.people_logo,R.drawable.stavropol_logo,
                R.drawable.smolensk_logo,R.drawable.kursk_logo,R.drawable.bashkir_logo,
                R.drawable.kazan_logo,R.drawable.volgograd_logo,R.drawable.kirov_logo,
                R.drawable.bogomolets_logo,R.drawable.kharkiv_logo,R.drawable.vinnitsa_logo,
                R.drawable.odessa_logo,R.drawable.kiev_logo,R.drawable.dnipropetrovsk_logo,
                R.drawable.vnkarazin_logo,R.drawable.zaporizhia_logo};


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
                obj.put("id",i);
                if(name.toLowerCase().contains(text.toLowerCase())){
                    filterList.put(obj);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        adapter=new CollegeRecycler_Card(this,filterList,"search");
        Popular_Product.setAdapter(adapter);
        //setPopularProduct(filterList);
    }

    private void setSearchView() {

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
        searchView.setVisibility(View.GONE);
        if(fromWhere.equals("Universities")){
            searchView.setVisibility(View.VISIBLE);
            tempArray = allUniversitiesList;
        }else if(fromWhere.equals("Countries")) {
            tempArray = countries;
        }else if(fromWhere.equals("0")){
            headerText.setText("Banladesh");
            tempArray = bangladesh;
        }else  if(fromWhere.equals("1")){
            headerText.setText("Belarus");
            tempArray = belarus;
        }else  if(fromWhere.equals("2")){
            headerText.setText("China");
            tempArray = china;
        }else  if(fromWhere.equals("3")){
            headerText.setText("Georgia");
            tempArray = georgia;
        }else  if(fromWhere.equals("4")){
            headerText.setText("Kazakhstan");
            tempArray = kazakshtan;
        }else  if(fromWhere.equals("5")){
            headerText.setText("Kyragyzstan");
            tempArray = kyragyzstan;
        }else  if(fromWhere.equals("6")){
            headerText.setText("Nepal");
            tempArray = nepal;
        }else  if(fromWhere.equals("7")){
            headerText.setText("Phillipines");
            tempArray = phillipines;
        }else  if(fromWhere.equals("8")){
            headerText.setText("Poland");
            tempArray = poland;
        }else  if(fromWhere.equals("9")){
            headerText.setText("Russia");
            tempArray = russia;
        }else  if(fromWhere.equals("10")){
            headerText.setText("Ukrain");
            tempArray = ukrain;
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
