package com.example.codemaven3015.uniservityapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class College_Info extends AppCompatActivity {
TextView countryName,universityName,overview,introduction,eligibility,facilities,feeDetails,services;
ImageView logo,image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college__info);
        JSONObject obj = new JSONObject();
        University_Details_JsonObject university_details_jsonObject= new University_Details_JsonObject("one");
        obj = university_details_jsonObject.returnUniversityData();
        Log.e("Details",obj.toString());
        setCollegeInfoDetails(obj);

    }

    private void setCollegeInfoDetails(JSONObject obj) {
        countryName = findViewById(R.id.countryName);
        universityName = findViewById(R.id.universityName);
        overview= findViewById(R.id.overview);
        introduction= findViewById(R.id.introduction);
        eligibility = findViewById(R.id.eligibility);
        facilities = findViewById(R.id.facilities);
        feeDetails = findViewById(R.id.feeDetails);
        services = findViewById(R.id.services);
        try {
            countryName.setText(obj.getString("country"));
            universityName.setText(obj.getString("name"));
            overview.setText(obj.getString("overview"));
            introduction.setText(obj.getString("intoduction"));
            eligibility.setText(obj.getString("Eligibility"));
            facilities.setText(obj.getString("facilities"));
            feeDetails.setText(obj.getString("feedetails"));
            services.setText(obj.getString("services"));
            setTableData(obj.getJSONArray("fee"));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void setTableData(JSONArray fee) throws JSONException {
        if(fee.length()>0) {
            JSONObject feeFirstColumn = new JSONObject();
            feeFirstColumn = fee.getJSONObject(0);
            TableLayout stk = (TableLayout) findViewById(R.id.table);
            TableRow.LayoutParams lp1 = (new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            lp1.weight = 1;

            TableRow tbrow0 = new TableRow(this);

            tbrow0.setLayoutParams(lp1);
            TableRow.LayoutParams lp = (new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

            lp.weight = 0.2f;
            TextView tv0 = new TextView(this);
            tv0.setLayoutParams(lp);
            tv0.setText(feeFirstColumn.getString("column1"));
            tv0.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            tv0.setTextColor(Color.RED);
            tv0.setGravity(Gravity.CENTER);
            tv0.setPadding(0, 30, 0, 30);
            tv0.setBackground(getResources().getDrawable(R.drawable.border_fill));
            tbrow0.addView(tv0);

            TextView tv1 = new TextView(this);
            tv1.setLayoutParams(lp);
            tv1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            tv1.setText(feeFirstColumn.getString("column2"));
            tv1.setGravity(Gravity.CENTER);
            tv1.setTextColor(Color.RED);
            tv1.setPadding(0, 30, 0, 30);
            tv1.setBackground(getResources().getDrawable(R.drawable.border_fill));
            tbrow0.addView(tv1);

            TextView tv2 = new TextView(this);
            tv2.setLayoutParams(lp);
            tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            tv2.setText(feeFirstColumn.getString("column3"));
            tv2.setGravity(Gravity.CENTER);
            tv2.setTextColor(Color.RED);
            tv2.setPadding(0, 30, 0, 30);
            tv2.setBackground(getResources().getDrawable(R.drawable.border_fill));
            tbrow0.addView(tv2);

            TextView tv3 = new TextView(this);
            tv3.setLayoutParams(lp);
            tv3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            tv3.setText(feeFirstColumn.getString("column4"));
            tv3.setGravity(Gravity.CENTER);
            tv3.setTextColor(Color.RED);
            tv3.setPadding(0, 30, 0, 30);
            tv3.setBackground(getResources().getDrawable(R.drawable.border_fill));
            tbrow0.addView(tv3);

            TextView tv4 = new TextView(this);
            tv4.setLayoutParams(lp);
            tv4.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            tv4.setText(feeFirstColumn.getString("column5"));
            tv4.setGravity(Gravity.CENTER);
            tv4.setTextColor(Color.RED);
            tv4.setPadding(0, 30, 0, 30);
            tv4.setBackground(getResources().getDrawable(R.drawable.border_fill));
            tbrow0.addView(tv4);

            stk.addView(tbrow0);
            for (int i = 1; i < fee.length(); i++) {

               JSONObject obj = new JSONObject();
               obj = fee.getJSONObject(i);
                final TableRow tbrow = new TableRow(this);
                tbrow.setLayoutParams(lp1);
                //tbrow.setBackground(getResources().getDrawable(R.drawable.selector_focus));
                lp.weight = 0.2f;
                TextView t1v = new TextView(this);
                t1v.setLayoutParams(lp);
                t1v.setText(obj.getString("column1"));
                t1v.setTextColor(Color.BLACK);
                t1v.setGravity(Gravity.CENTER);
                t1v.setPadding(0, 30, 0, 30);
                t1v.setBackground(getResources().getDrawable(R.drawable.border));
                tbrow.addView(t1v);
                TextView t2v = new TextView(this);
                t2v.setLayoutParams(lp);
                t2v.setText(obj.getString("column2"));
                t2v.setTextColor(Color.BLACK);
                t2v.setGravity(Gravity.CENTER);
                t2v.setPadding(0, 30, 0, 30);
                t2v.setBackground(getResources().getDrawable(R.drawable.border));

                tbrow.addView(t2v);
                TextView t3v = new TextView(this);
                t3v.setLayoutParams(lp);
                t3v.setText(obj.getString("column3"));
                t3v.setTextColor(Color.BLACK);
                t3v.setGravity(Gravity.CENTER);
                t3v.setPadding(0, 30, 0, 30);
                t3v.setBackground(getResources().getDrawable(R.drawable.border));
                tbrow.addView(t3v);

                TextView t4v = new TextView(this);
                t4v.setLayoutParams(lp);
                t4v.setText(obj.getString("column4"));
                t4v.setTextColor(Color.BLACK);
                t4v.setGravity(Gravity.CENTER);
                t4v.setPadding(0, 30, 0, 30);
                t4v.setBackground(getResources().getDrawable(R.drawable.border));
                tbrow.addView(t4v);

                TextView t5v = new TextView(this);
                t5v.setLayoutParams(lp);
                t5v.setText(obj.getString("column5"));
                t5v.setTextColor(Color.BLACK);
                t5v.setGravity(Gravity.CENTER);
                t5v.setPadding(0, 30, 0, 30);
                t5v.setBackground(getResources().getDrawable(R.drawable.border));
                tbrow.addView(t5v);
                stk.addView(tbrow);
            }
        }
    }
}

