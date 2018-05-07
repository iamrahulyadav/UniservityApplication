package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Admin on 5/7/2018.
 */

public class University_Details_JsonObject {
    private String varCollegeName;


    public University_Details_JsonObject(String varCollegeName){
        this.varCollegeName = varCollegeName;
    }
    public JSONObject returnUniversityData(){
        JSONObject obj = new JSONObject() ;
        try {
            obj.put("country","Ukraine");
            obj.put("name","BOGOMOLETS NATIONALMEDICAL UNIVERSITY");
            obj.put("overview","Founded in 1841, Location- Kyiv, Ukraine, Site - http://nmu.ua/en/\nMCI & WHO Approved");
            obj.put("logo","BOGOMOLETS NATIONALMEDICAL UNIVERSITY");
            obj.put("image","BOGOMOLETS NATIONALMEDICAL UNIVERSITY");
            obj.put("intoduction","•\tFormed 176 years ago with an aim of providing excellence.\n" +
                    "•\tThe official history of the establishment started in 1841 when the medical faculty was established at Saint Volodymyr Emperor University in Kyiv.\n" +
                    "•\tStudents from around 65 countries came here to study medicine.\n" +
                    "•\tWorld class reputation as a premium centre of learning.\n" +
                    "•\tThe student body of the medical school alone is 13,000 students strong.\n" +
                    "•\tTuition fees for MBBS/MD programmes vary from 3000$ and 4200$ per year.\n" +
                    "•\tExtraordinary medical feats are performed by its distinguished alumni\n" +
                    "•\tIt has the highest level of accreditations by the Ministry of Health and Education\n" +
                    "•\tNMU offers a multi-cultural environment to its students with international students.\n" +
                    "•\tThe admission procedure in this institution is very simple.\n" +
                    "•\tLectures are offered in English, Russian and Ukrainian medium.\n" +
                    "•\tThe University was acknowledged as the Leader of modern education.\n" +
                    "•\tInfrastructures of the Universities are far better than any other government colleges in Asia, Africa and other countries.\n" +
                    "•\tThe medical school is a conglomerate of 12 faculties, presiding over 7 institutions and 137 super specialty medical centres spread all over Kiev, 78 departments and 30 sub divisional departments.\n");
            obj.put("Eligibility","•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                    "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                    "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                    "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");
            obj.put("facilities","•\tLocal transportation is the foremost choice of 80 % of the scholars.\n" +
                    "•\tThe food provided by the hostel is very well cooked and served.\n" +
                    "•\tHigh-Quality Education and simple admission process.\n" +
                    "•\tSecurity is very high and there are very less crime registered.\n");

            JSONArray feeArray = new JSONArray();
            JSONObject temp_obj1 = new JSONObject();
            temp_obj1.put("column1","O.O BOGOMOLETS KIEV NATIONAL MEDICAL UNIVERSITY, UKRAINE");
            temp_obj1.put("column2","TUITION FEE / YEAR");
            temp_obj1.put("column3","HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4","TOTAL FEES IN USD");
            temp_obj1.put("column5","TOTAL FEE IN RUPEES");

            JSONObject temp_obj2 = new JSONObject();
            temp_obj2.put("column1","1st Year Fees");
            temp_obj2.put("column2","6000 US Dollars");
            temp_obj2.put("column3","1800 US Dollars/ year");
            temp_obj2.put("column4","7800 US Dollars");
            temp_obj2.put("column5","RS. 4,68,000 (approx.)");

            JSONObject temp_obj3 = new JSONObject();
            temp_obj3.put("column1","2nd to 6th year Fees");
            temp_obj3.put("column2","4500 US Dollars/year");
            temp_obj3.put("column3","1800 US Dollars/ year");
            temp_obj3.put("column4","6300 US Dollars/ year");
            temp_obj3.put("column5","RS. 3,78,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);
            obj.put("fee",feeArray);

            obj.put("feedetails","Fees include Tuition Fee, Health Insurance and Hostel Fee. Total fee for 6 years Rs.23, 58,000 (approx.). (1 USD = 60 Rupees approx for calculation) Actual Rate at the time of fees payment will be calculated.");
            obj.put("services","•\tStudent Visa Advice\n" +
                    "•\tDocumentation Assistance\n" +
                    "•\tPre Departure Assistance\n" +
                    "•\tPost Departure Guidance\n" +
                    "•\tPick up from Airport to the University\n" +
                    "•\tAccommodations Related complete Assistance.\n");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
