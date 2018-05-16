package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class University_Details_POLAND {

    private final int varCollegeName;

    public University_Details_POLAND(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException {

        /////////////////////////////////////////////////////
        JSONObject GDANSK = new JSONObject();

        GDANSK.put("country", "POLAND");

        GDANSK.put("name", "MEDICAL UNIVERSITY OF GDANSK (MUG), POLAND");

        GDANSK.put("overview", "- MEDICAL UNIVERSITY OF GDANSK (MUG), POLAND was established in 1945\n" +
                "Google Rating -4.8 star\n" +
                "Address- MariiSkłodowskiej-Curie 3A, 80-210 Gdańsk, Poland\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/BPtp57ThnT62\n");

        GDANSK.put("logo", R.drawable.medical_logo);

        GDANSK.put("image", R.drawable.medical_img);

        GDANSK.put("intoduction", "The AkademiaLekarska in Gdańsk was founded on October 8th, 1945. Its history is related to the centuries-old tradition of medical practice of surgeons associated in the Surgeons Guild (active since 1454), as well as teaching and medical and scientific research, particularly in GdańskieGimnazjumAkademickie (AtheneumGedanese) established in 1558. This institution set up the Department of Science and Medicine (physicesetmedicinae), which was managed and supervised by eminent scholars. Among the most famous lecturers were: Joachim Oelhafius, a native of Gdańsk, who in 1613 was the first to perform a public autopsy of a newborn child in Northern Europe, and doctor Jan Adam Kulmus, the author of the anatomical atlas “Tabulaeanatomicae”, published in 1932. The work was released in numerous editions and was translated into many languages. The GimnazjumAkademickie represented a high standard of achievement and its graduates were accepted in the third year of medical studies at universities in Western Europe. After the closing of the GimnazjumAkademickie at the beginning of the 19th century, it was not until the first years of the 20th century that another academic school was established.\n" +
                "The traditions of pharmaceutical sciences in Gdańsk date back to the times of Johannes Placotomus, the author of superb books and founder of the first pharmacy in Gdańsk in 1527, and Johannes Schmiedt, alias Fabritius, the co-author of the oldest Polish pharmacopoeia, published in 1665.\n" +
                "In 1935 the Gdańsk Senate, already represented mostly by German nationalists (members of NSDAP) went about establishing AkademiaMedycynyPraktycznej (Die Staatliche AkademiefürPraktischeMedizinzu Danzig) on the basis of the municipal hospital built between 1907 and 1911. Teaching medicine in the newly opened college involved clinical courses. In 1940, following the introduction of pre-clinical courses, the college’s name was changed to MedizinischeAkademie in Danzig, making it full 5-year medical studies.\n" +
                "After the end of World War II, AkademiaLekarska was founded in Gdańsk. In 1950 its name was changed to AkademiaMedyczna (The Medical University of Gdansk). Among the professors of the newly established college, there were many eminent Polish scholars from the University of Stefan Batory in Vilnius, who had come to Gdańsk after Vilnius was incorporated into the Soviet Union, and a handful of scholars from other pre-war Polish academic centers. Initially, AkademiaLekarska conducted studies in two majors: medical and pharmaceutical. In May 1947 the Faculty of Stomatology was created and later on in January 1950 the name was changed to the Subfaculty of Dentistry at the Faculty of Medicine. In 1975 Medical University of Gdansk (MUG) opened a branch in Bydgoszcz, which in 1984 became an independent college. In 1993, as a joint unit of Medical University of Gdansk and Gdańsk University, the Intercollegiate Faculty of Biotechnology was founded. In the academic year 2005/2006 Medical University started the Faculty of Health Sciences.\n" +
                "Ever since its creation, Medical University of Gdańsk has paid special attention to the development of its teaching and clinical framework. Many new research institutes and clinics have been established, the equipment has been modernized, new facilities have been created and all the buildings including the campus have been equipped with computers and a computer network. Currently, MUG offers education in nearly all medical professions and classes can also be conducted in English.\n");


        GDANSK.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        GDANSK.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        JSONArray feeArray = new JSONArray();
        JSONObject temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "43000");
        temp_obj2.put("column2", "43000");
        temp_obj2.put("column3", "43000");
        temp_obj2.put("column4", "43000");
        temp_obj2.put("column5", "43000");
        temp_obj2.put("column6", "43000");
        temp_obj2.put("column7", "65,000");

        JSONObject temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "6,88,000");
        temp_obj3.put("column2", "6,88,000");
        temp_obj3.put("column3", "6,88,000");
        temp_obj3.put("column4", "6,88,000");
        temp_obj3.put("column5", "6,88,000");
        temp_obj3.put("column6", "6,88,000");
        temp_obj3.put("column7", "41,28,000");

        JSONObject temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        JSONObject temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        JSONObject temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "-");
        temp_obj6.put("column2", "-");
        temp_obj6.put("column3", "-");
        temp_obj6.put("column4", "-");
        temp_obj6.put("column5", "-");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "-");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        GDANSK.put("fee", feeArray);

        GDANSK.put("feedetails", " ");
        GDANSK.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        JSONArray allColleges = new JSONArray();
        allColleges.put(GDANSK);


        return allColleges.getJSONObject(varCollegeName);

    }
}
