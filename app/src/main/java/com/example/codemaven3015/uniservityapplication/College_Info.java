package com.example.codemaven3015.uniservityapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class College_Info extends AppCompatActivity {
TextView countryName,universityName,overview,introduction,eligibility,facilities,feeDetails,
        services,text1,text2,text3,text4,text5,text6,text7,text8;
ImageView logo,image;
Button applyNowBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college__info);
        try {
            getInfoData();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        setapplyNowBtn();

    }
    public void getInfoData() throws JSONException {
        JSONObject obj = new JSONObject();
        String countryId = getIntent().getStringExtra("menu");
        int collegeId = getIntent().getIntExtra("location",0);
        if(countryId.equals("0")){
            University_Details_Bangladesh bangladesh = new University_Details_Bangladesh(collegeId);
            obj= bangladesh.returnUniversityData();

        }else if(countryId.equals("1")){
            University_Details_Belarus belarus = new University_Details_Belarus(collegeId);
            obj= belarus.returnUniversityData();

        }else if(countryId.equals("2")){
            University_Details_China china = new University_Details_China(collegeId);
            obj= china.returnUniversityData();

        }else if(countryId.equals("3")){
            University_Details_Georgia georgia = new University_Details_Georgia(collegeId);
            obj= georgia.returnUniversityData();

        }else if(countryId.equals("4")){
            University_Details_KAZAKHSTAN kazakhstan = new University_Details_KAZAKHSTAN(collegeId);
            obj= kazakhstan.returnUniversityData();

        }else if(countryId.equals("5")){
            University_Details_KYRGYZSTAN kyrgyzstan = new University_Details_KYRGYZSTAN(collegeId);
            obj= kyrgyzstan.returnUniversityData();

        }else if(countryId.equals("6")){
            University_Details_Nepal nepal = new University_Details_Nepal(collegeId);
            obj= nepal.returnUniversityData();

        }else if(countryId.equals("7")){
            University_Details_PHILIPPINES philippines = new University_Details_PHILIPPINES(collegeId);
            obj= philippines.returnUniversityData();

        }else if(countryId.equals("8")){
            University_Details_POLAND poland= new University_Details_POLAND(collegeId);
            obj= poland.returnUniversityData();

        }else if(countryId.equals("9")){
            University_Details_Russia russia = new University_Details_Russia(collegeId);
            obj= russia.returnUniversityData();

        }else if(countryId.equals("10")){
            University_Details_Ukraine ukraine= new University_Details_Ukraine(collegeId);
            obj= ukraine.returnUniversityData();

        }


        Log.e("Details",obj.toString());
        setCollegeInfoDetails(obj);
    }
    private void setapplyNowBtn()
    {
        applyNowBtn=findViewById(R.id.applyNowBtn);
        applyNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(College_Info.this,Registration.class);
                startActivity(intent);
            }
        });
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
        logo = findViewById(R.id.logo);

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);
        text5=findViewById(R.id.text5);
        text6=findViewById(R.id.text6);
        text7=findViewById(R.id.text7);
        text8=findViewById(R.id.text8);

        image= findViewById(R.id.image);
        try {
            countryName.setText(obj.getString("country"));
            universityName.setText(obj.getString("name"));
            overview.setText(obj.getString("overview"));
            introduction.setText(obj.getString("intoduction"));
            eligibility.setText(obj.getString("Eligibility"));
            facilities.setText(obj.getString("facilities"));
            feeDetails.setText(obj.getString("feedetails"));
            services.setText(obj.getString("services"));
            logo.setImageResource(obj.getInt("logo"));
            image.setImageResource(obj.getInt("image"));
            //text1.setText(obj.getJSONArray("fee"));
            setTableData(obj.getJSONArray("fee"));


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void setTableData(JSONArray fee) throws JSONException {
        TableLayout stk = (TableLayout) findViewById(R.id.table);
        LinearLayout feeTables = findViewById(R.id.feeTables);
        if(fee.length()==2){
            feeTables.setVisibility(View.VISIBLE);
            stk.setVisibility(View.GONE);
            JSONObject feeFirstColumn = new JSONObject();
            feeFirstColumn = fee.getJSONObject(0);
            text1.setText(feeFirstColumn.getString("column2"));
            text2.setText(feeFirstColumn.getString("column3"));
            text3.setText(feeFirstColumn.getString("column4"));
            text4.setText(feeFirstColumn.getString("column5"));
            feeFirstColumn = new JSONObject();
            feeFirstColumn = fee.getJSONObject(1);
            text5.setText(feeFirstColumn.getString("column2"));
            text6.setText(feeFirstColumn.getString("column3"));
            text7.setText(feeFirstColumn.getString("column4"));
            text8.setText(feeFirstColumn.getString("column5"));


        }else if(fee.length()>0) {
            //JSONObject feeFirstColumn = new JSONObject();
           //feeFirstColumn = fee.getJSONObject(0);
            feeTables.setVisibility(View.GONE);
            stk.setVisibility(View.VISIBLE);

            TableRow.LayoutParams lp1 = (new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            lp1.weight = 1;

            TableRow tbrow0 = new TableRow(this);

            tbrow0.setLayoutParams(lp1);
            TableRow.LayoutParams lp = (new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT));

            lp.weight = 1;
            TextView tv0 = new TextView(this);
            tv0.setLayoutParams(lp);
            //tv0.setText(feeFirstColumn.getString("column1"));
            tv0.setText("Particulars");
            tv0.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            tv0.setTextColor(getResources().getColor(R.color.dark_purple));
            tv0.setGravity(Gravity.CENTER);
            tv0.setPadding(0, 30, 0, 30);
            tv0.setBackground(getResources().getDrawable(R.drawable.table_border));
            tbrow0.addView(tv0);

            TextView tv1 = new TextView(this);
            tv1.setLayoutParams(lp);
            tv1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            //tv1.setText(feeFirstColumn.getString("column2"));
            tv1.setText("1st year");
            tv1.setGravity(Gravity.CENTER);
            tv1.setTextColor(getResources().getColor(R.color.dark_purple));
            tv1.setPadding(0, 30, 0, 30);
            tv1.setBackground(getResources().getDrawable(R.drawable.table_border));
            tbrow0.addView(tv1);

            TextView tv2 = new TextView(this);
            tv2.setLayoutParams(lp);
            tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            //tv2.setText(feeFirstColumn.getString("column3"));
            tv2.setText("2nd  year");
            tv2.setGravity(Gravity.CENTER);
            tv2.setTextColor(getResources().getColor(R.color.dark_purple));
            tv2.setPadding(0, 30, 0, 30);
            tv2.setBackground(getResources().getDrawable(R.drawable.table_border));
            tbrow0.addView(tv2);

            TextView tv3 = new TextView(this);
            tv3.setLayoutParams(lp);
            tv3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            //tv3.setText(feeFirstColumn.getString("column4"));
            tv3.setText("3rd year");
            tv3.setGravity(Gravity.CENTER);
            tv3.setTextColor(getResources().getColor(R.color.dark_purple));
            tv3.setPadding(0, 30, 0, 30);
            tv3.setBackground(getResources().getDrawable(R.drawable.table_border));
            tbrow0.addView(tv3);

            TextView tv4 = new TextView(this);
            tv4.setLayoutParams(lp);
            tv4.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            //tv4.setText(feeFirstColumn.getString("column5"));
            tv4.setText("4th year ");
            tv4.setGravity(Gravity.CENTER);
            tv4.setTextColor(getResources().getColor(R.color.dark_purple));
            tv4.setPadding(0, 30, 0, 30);
            tv4.setBackground(getResources().getDrawable(R.drawable.table_border));
            tbrow0.addView(tv4);
            TextView tv5 = new TextView(this);
            tv5.setLayoutParams(lp);
            tv5.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            //tv5.setText(feeFirstColumn.getString("column5"));
            tv5.setText("5th year ");
            tv5.setGravity(Gravity.CENTER);
            tv5.setTextColor(getResources().getColor(R.color.dark_purple));
            tv5.setPadding(0, 30, 0, 30);
            tv5.setBackground(getResources().getDrawable(R.drawable.table_border));
            tbrow0.addView(tv5);
            TextView tv6 = new TextView(this);
            tv6.setLayoutParams(lp);
            tv6.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            //tv6.setText(feeFirstColumn.getString("column5"));
            tv6.setText("6th year");
            tv6.setGravity(Gravity.CENTER);
            tv6.setTextColor(getResources().getColor(R.color.dark_purple));
            tv6.setPadding(0, 30, 0, 30);
            tv6.setBackground(getResources().getDrawable(R.drawable.border_fill));
            tbrow0.addView(tv6);
            TextView tv7 = new TextView(this);
            tv7.setLayoutParams(lp);
            tv7.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f);
            //tv7.setText(feeFirstColumn.getString("column5"));
            tv7.setText("Total");
            tv7.setGravity(Gravity.CENTER);
            tv7.setTextColor(getResources().getColor(R.color.dark_purple));
            tv7.setPadding(0, 30, 0, 30);
            tv7.setBackground(getResources().getDrawable(R.drawable.table_border));
            tbrow0.addView(tv7);

            stk.addView(tbrow0);
            String tableRowList[] = {"Fee ($)", "Fee (₹)", "One Time" ,"Hostel & Food(₹)" ,"Total (₹)"};
            for (int i = 0; i < fee.length(); i++) {

               JSONObject obj = new JSONObject();
               obj = fee.getJSONObject(i);
                final TableRow tbrow = new TableRow(this);
                tbrow.setLayoutParams(lp1);
                //tbrow.setBackground(getResources().getDrawable(R.drawable.selector_focus));
                lp.weight =1;
                TextView t1v = new TextView(this);
                t1v.setLayoutParams(lp);
                //t1v.setText(obj.getString("column1"));
                t1v.setText(tableRowList[i]);
                t1v.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f);
                t1v.setTextColor(getResources().getColor(R.color.dark_purple));
                t1v.setGravity(Gravity.CENTER);
                t1v.setPadding(0, 30, 0, 30);
                t1v.setBackground(getResources().getDrawable(R.drawable.table_border));
                tbrow.addView(t1v);
                TextView t2v = new TextView(this);
                t2v.setLayoutParams(lp);
                //t2v.setText("09");
                t2v.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f);
                t2v.setText(obj.getString("column1"));
                t2v.setTextColor(Color.BLACK);
                t2v.setGravity(Gravity.CENTER);
                t2v.setPadding(0, 30, 0, 30);
                t2v.setBackground(getResources().getDrawable(R.drawable.table_border));

                tbrow.addView(t2v);
                TextView t3v = new TextView(this);
                t3v.setLayoutParams(lp);
                //t3v.setText("09");
                t3v.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f);
                t3v.setText(obj.getString("column2"));
                t3v.setTextColor(Color.BLACK);
                t3v.setGravity(Gravity.CENTER);
                t3v.setPadding(0, 30, 0, 30);
                t3v.setBackground(getResources().getDrawable(R.drawable.table_border));
                tbrow.addView(t3v);

                TextView t4v = new TextView(this);
                t4v.setLayoutParams(lp);
                //t4v.setText("09");
                t4v.setText(obj.getString("column3"));
                t4v.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f);
                t4v.setTextColor(Color.BLACK);
                t4v.setGravity(Gravity.CENTER);
                t4v.setPadding(0, 30, 0, 30);
                t4v.setBackground(getResources().getDrawable(R.drawable.table_border));
                tbrow.addView(t4v);

                TextView t5v = new TextView(this);
                t5v.setLayoutParams(lp);
                t5v.setText(obj.getString("column4"));
                //t5v.setText("09");
                t5v.setTextColor(Color.BLACK);
                t5v.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f);
                t5v.setGravity(Gravity.CENTER);
                t5v.setPadding(0, 30, 0, 30);
                t5v.setBackground(getResources().getDrawable(R.drawable.table_border));
                tbrow.addView(t5v);
                TextView t6v = new TextView(this);
                t6v.setLayoutParams(lp);
                t6v.setText(obj.getString("column5"));
                //t6v.setText("09");
                t6v.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f);
                t6v.setTextColor(Color.BLACK);
                t6v.setGravity(Gravity.CENTER);
                t6v.setPadding(0, 30, 0, 30);
                t6v.setBackground(getResources().getDrawable(R.drawable.table_border));
                tbrow.addView(t6v);
                TextView t7v = new TextView(this);
                t7v.setLayoutParams(lp);
                t7v.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f);
                t7v.setText(obj.getString("column6"));
                //t7v.setText("09");
                t7v.setTextColor(Color.BLACK);
                t7v.setGravity(Gravity.CENTER);
                t7v.setPadding(0, 30, 0, 30);
                t7v.setBackground(getResources().getDrawable(R.drawable.table_border));
                tbrow.addView(t7v);
                TextView t8v = new TextView(this);
                t8v.setLayoutParams(lp);
                t8v.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f);
                t8v.setText(obj.getString("column7"));
                //t8v.setText("09");
                t8v.setTextColor(Color.BLACK);
                t8v.setGravity(Gravity.CENTER);
                t8v.setPadding(0, 30, 0, 30);
                t8v.setBackground(getResources().getDrawable(R.drawable.table_border));
                tbrow.addView(t8v);
                stk.addView(tbrow);
            }
        }
    }
}

