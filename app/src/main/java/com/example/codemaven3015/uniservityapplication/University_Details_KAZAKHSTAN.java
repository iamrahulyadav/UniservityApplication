package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class University_Details_KAZAKHSTAN {

    private final int varCollegeName;

    public University_Details_KAZAKHSTAN(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException {

/////////////////////////////////////////////////////
        JSONObject SEMEY = new JSONObject();

        SEMEY.put("country", "KAZAKHSTAN");

        SEMEY.put("name", "SEMEY STATE MEDICAL UNIVERSITY");

        SEMEY.put("overview", "SEMEY STATE MEDICAL UNIVERSITY was established in 1953\n" +
                "Google Rating -4.5 star\n" +
                "Address- Abaistreet 103, Semey 070000, Kazakhstan\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/grBUetf4arF2\n");

        SEMEY.put("logo", R.drawable.semey_logo);

        SEMEY.put("image", R.drawable.semey_img);

        SEMEY.put("intoduction", "History  Semey Medical University began September 1, 1953 with the opening of medical faculty, who were enrolled  the first 320 students. All the years of the existence of high school graduates  began  more  than  25 thousand people  who  are  working  successfully in Kazakhstan  and  abroad.  Including  3  of academician, deputies of the Parliament of Kazakhstan,  6  people  worked  rectors of medical  schools,  14  heads  of regional health  departments  and  other  prominent figures of science and practice. \n" +
                "Over  the  past  few  years  to  improve the organization  of  the  educational  process developed  a  scientific  medical potential, stronger material and technical base. University became known in the country and the world, is developing   intensively. Since 2009, it was granted the status of University.  Now  it  is  a multi-Medical University, educational and cultural center in the East Kazakhstan   and Pavlodar regions.In  order  to  achieve  high  goals  at the University   employs   more   than   1,500 professors, teachers, staff and  physicians. Every  year  more  than  600  students  are students  of University, the total number of students  exceeds  4,000. The   university foreign students from India, Pakistan, China, Mongolia, and Russia.\n" +
                "In 2018, Semey medical university celebrates its 65th anniversary. This is one of the largest medical university in Kazakhstan with its own hospital and branches in Pavlodar and UstKamenogorsk.\n" +
                "Semey medical university was established in 1953 (opening of general medicine faculty). 320 students were enrolled in 1953. Over the years of its existence, graduates of the university successfully work over the whole Kazakhstan, as well as near and far abroad. \n" +
                "Semey Medical university has the rich historical traditions, enormous potential and authoritative schools. We have make the substantial contribution to the development of medicine and population health support.  \n" +
                "MISSION\n" +
                "\"Contribution to improving health of Kazakhstan population through the quality training of competitive specialists by integrating best practices of education, clinics and science\"\n" +
                "VISION\n" +
                "\"The gem of Kazakhtan healthcare - successful composition of education, science and clinical practice\"\n");


        SEMEY.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        SEMEY.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        JSONArray feeArray = new JSONArray();
       JSONObject temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "5500");
        temp_obj2.put("column2", "5500");
        temp_obj2.put("column3", "5500");
        temp_obj2.put("column4", "5500");
        temp_obj2.put("column5", "5500");
        temp_obj2.put("column6", "5500");
        temp_obj2.put("column7", "33000");

        JSONObject temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "3,30,000");
        temp_obj3.put("column2", "3,30,000");
        temp_obj3.put("column3", "3,30,000");
        temp_obj3.put("column4", "3,30,000");
        temp_obj3.put("column5", "3,30,000");
        temp_obj3.put("column6", "3,30,000");
        temp_obj3.put("column7", "19,80,000");

        JSONObject temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "72,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        JSONObject temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "18,000");
        temp_obj5.put("column2", "18,000");
        temp_obj5.put("column3", "18,000");
        temp_obj5.put("column4", "18,000");
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "1,08,000");

        JSONObject  temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "4,20,000");
        temp_obj6.put("column2", "4,20,000");
        temp_obj6.put("column3", "4,20,000");
        temp_obj6.put("column4", "4,20,000");
        temp_obj6.put("column5", "4,20,000");
        temp_obj6.put("column6", "4,20,000");
        temp_obj6.put("column7", "18,12,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        SEMEY.put("fee", feeArray);

        SEMEY.put("feedetails", " ");
        SEMEY.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");






        JSONArray allColleges = new JSONArray();
        allColleges.put(SEMEY);


        return allColleges.getJSONObject(varCollegeName);
    }
}