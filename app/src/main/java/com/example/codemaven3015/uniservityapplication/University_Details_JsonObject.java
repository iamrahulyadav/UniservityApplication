package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Admin on 5/7/2018.
 */

public class University_Details_JsonObject {
    private int varCollegeName;


    public University_Details_JsonObject(int varCollegeName){
        this.varCollegeName = varCollegeName;
    }
    public JSONObject returnUniversityData() {
        JSONObject obj = new JSONObject();
        JSONObject obj_Kharkiv = new JSONObject();
        JSONObject obj_Vinnitsa = new JSONObject();
        JSONObject obj_ODESSA = new JSONObject();
        JSONObject obj_Kiev = new JSONObject();
        JSONObject obj_Dnipropetrovsk = new JSONObject();
        JSONObject obj_VN = new JSONObject();
        JSONObject obj_ZAPOROZHYE = new JSONObject();
        JSONObject obj_Moscow = new JSONObject();
        JSONObject obj_PEOPLES = new JSONObject();
        JSONObject obj_STAVROPOL = new JSONObject();
        JSONObject obj_SMOLENSK = new JSONObject();
        JSONObject obj_KURSK = new JSONObject();
        JSONObject obj_BASHKIR = new JSONObject();
        JSONObject obj_KAZAN = new JSONObject();
        JSONObject obj_VOLGOGRAD = new JSONObject();
        JSONObject obj_KIROV = new JSONObject();
        try {
            obj.put("country", "Ukraine");
            obj.put("name", "BOGOMOLETS NATIONALMEDICAL UNIVERSITY");
            obj.put("overview", "Founded in 1841, Location- Kyiv, Ukraine, Site - http://nmu.ua/en/\nMCI & WHO Approved");
            obj.put("logo", R.drawable.bogomolets_logo);
            obj.put("image", R.drawable.bogomolets);
            obj.put("intoduction", "•\tFormed 176 years ago with an aim of providing excellence.\n" +
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
            obj.put("Eligibility", "•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                    "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                    "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                    "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");
            obj.put("facilities", "•\tLocal transportation is the foremost choice of 80 % of the scholars.\n" +
                    "•\tThe food provided by the hostel is very well cooked and served.\n" +
                    "•\tHigh-Quality Education and simple admission process.\n" +
                    "•\tSecurity is very high and there are very less crime registered.\n");

            JSONArray feeArray = new JSONArray();
            JSONObject temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "O.O BOGOMOLETS KIEV NATIONAL MEDICAL UNIVERSITY, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            JSONObject temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "6000 US Dollars");
            temp_obj2.put("column3", "1800 US Dollars/ year");
            temp_obj2.put("column4", "7800 US Dollars");
            temp_obj2.put("column5", "RS. 4,68,000 (approx.)");

            JSONObject temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4500 US Dollars/year");
            temp_obj3.put("column3", "1800 US Dollars/ year");
            temp_obj3.put("column4", "6300 US Dollars/ year");
            temp_obj3.put("column5", "RS. 3,78,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);
            obj.put("fee", feeArray);

            obj.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. Total fee for 6 years Rs.23, 58,000 (approx.). (1 USD = 60 Rupees approx for calculation) Actual Rate at the time of fees payment will be calculated.");
            obj.put("services", "•\tStudent Visa Advice\n" +
                    "•\tDocumentation Assistance\n" +
                    "•\tPre Departure Assistance\n" +
                    "•\tPost Departure Guidance\n" +
                    "•\tPick up from Airport to the University\n" +
                    "•\tAccommodations Related complete Assistance.\n");



                obj_Kharkiv.put("country", "Ukraine");

                obj_Kharkiv.put("name", "Kharkiv National Medical University");

                obj_Kharkiv.put("overview", " Established in the year 1805, Location- Kyiv, Ukraine, Site – http://www.knmu.kharkov.ua/\n MCI & WHO Approved");

                obj_Kharkiv.put("logo", R.drawable.kharkiv_logo);
                obj_Kharkiv.put("image", R.drawable.kharkiv);

                obj_Kharkiv.put("intoduction", "•\tone of the best MBBS Universities in Ukraine and boasts to accommodate and provide best in class education to nearly 7000 students every year on their campus.\n" +
                        "•\tMore than 4000 foreign students have been trained by the institute till now and are working in many public and private organisations around the world.\n" +
                        "•\tKharkiv National Established in the year 1805 Kharkiv National Medical University (KNMU).\n" +
                        "•\tIt is Medical University has Faculty of Medicine, Faculty of Pharmacy, Faculty of Dentistry, Faculty of Nursing and Faculty of Postgraduate.The student body of the medical school alone is 13,000 students strong.\n" +
                        "•\t5 specialised academic councils for the purpose of defending the thesis in various medical specialities\n" +
                        "•\tIt is also a member of UNESCO and International Associate of Universities.\n" +
                        "•\tIt has the highest level of accreditations by the Ministry of Health and Education\n" +
                        "•\tThere are 56 departments under the faculties which provide theoretical and practical knowledge to the students.\n" +
                        "•\tThe admission procedure in this institution is very simple.\n" +
                        "•\tThere are more than 630 teaching staffs whose are qualified Candidates of Medical Science.\n" +
                        "•\tThe University was acknowledged as the Leader of modern education.\n" +
                        "•\tUniversity also has a collection of over 1 million researches and journals in its scientific library which is having 11 reading halls.\n" +
                        "•\tthere are total 6 hostels in the campus of the university. Hostels are equipped with all necessary things for the healthy living like a comfortable bed, table and chair, internet access and geyser.\n");


                obj_Kharkiv.put("Eligibility", "•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                        "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                        "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                        "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");


                obj_Kharkiv.put("facilities", "•\tLocal transportation is the foremost choice of 80 % of the scholars.\n" +
                        "•\tThe food provided by the hostel is very well cooked and served.\n" +
                        "•\tHigh-Quality Education and simple admission process.\n" +
                        "•\tSecurity is very high and there are very less crime registered.\n");

                 feeArray= new JSONArray();
                temp_obj1 = new JSONObject();
                temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
                temp_obj1.put("column2", "TUITION FEE / YEAR");
                temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
                temp_obj1.put("column4", "TOTAL FEES IN USD");
                temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

                 temp_obj2 = new JSONObject();
                temp_obj2.put("column1", "1st Year Fees");
                temp_obj2.put("column2", "5300 US Dollars");
                temp_obj2.put("column3", "1200 US Dollars/ year");
                temp_obj2.put("column4", "6500 US Dollars	");
                temp_obj2.put("column5", "RS. 3,90,000 (approx.)");

                 temp_obj3 = new JSONObject();
                temp_obj3.put("column1", "2nd to 6th year Fees");
                temp_obj3.put("column2", "4300  US Dollars/year");
                temp_obj3.put("column3", "1200  US Dollars/ year");
                temp_obj3.put("column4", "5500  US Dollars/ year");
                temp_obj3.put("column5", "RS. 3,30,000/ Year (approx.)");
                feeArray.put(temp_obj1);
                feeArray.put(temp_obj2);
                feeArray.put(temp_obj3);
                obj_Kharkiv.put("fee", feeArray);

                obj_Kharkiv.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                        " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
                obj_Kharkiv.put("services", "•\tStudent Visa Advice\n" +
                        "•\tDocumentation Assistance\n" +
                        "•\tPre Departure Assistance\n" +
                        "•\tPost Departure Guidance\n" +
                        "•\tPick up from Airport to the University\n" +
                        "•\tAccommodations Related complete Assistance.\n");


///////////////////////////////////////////////////////////////////////////////////////

            obj_Vinnitsa.put("country", "Ukraine");

            obj_Vinnitsa.put("name", "Vinnitsa National Medical University");

            obj_Vinnitsa.put("overview", "Established in the year 1921, Location- Pyrohova St, 56, Vinnytsia, Vinnyts'ka oblast, Ukraine\n" +
                    "Site – https://www.vnmu.edu.ua/en\n" +
                    "MCI & WHO Approved\n");

            obj_Vinnitsa.put("logo", R.drawable.vinnitsa_logo);
            obj_Vinnitsa.put("image", R.drawable.vinnitsa);

            obj_Vinnitsa.put("intoduction", "•\tVinnitsa National Medical University was founded in 1921\n" +
                    "•\tSince 1994, the Vinnitsa Medical Institute has been certified and accredited to the IV level of accreditation and has been granted the status of the University.\n" +
                    "•\tAlmost every sixth lecturer at the university is a doctor of sciences, a professor. Students are taught by 126 doctors of sciences and 677 candidates of sciences.\n" +
                    "•\tThere are 25 Honoured Scientists and Technicians of Ukraine, Honoured Workers of Higher Education and Education of Ukraine, 3 academicians of the Academy of Sciences of Ukraine, 12 Honoured Doctors of Ukraine, and 5 Winners of the State Prize of Ukraine.\n" +
                    "•\tIn the educational process and management of the university, computer technologies are widely implemented. There are 26 computer classes, 4 channels of the Internet network.\n" +
                    "•\tThe University has 12 scientific schools. The University supports creative contacts and collaborates with the medical faculties of universities of 19 foreign countries (including the USA, Germany, France, England, Russia, etc.).\n" +
                    "•\tThe University is being internationally known and has lately become one of the leading Universities in Ukraine.\n" +
                    "•\tVNMU is associated with many pharmaceutical institutions, research centres and educational intuitions.\n" +
                    "•\tUniversity focuses majorly over various scientific researches for the Upliftment of medicine and technology.\n" +
                    "•\tTotal area allocated to the university is about 81000 square meters and the buildings and learning centres have been constructed in more than 41000 square meters.\n" +
                    "•\tFor students, there are 5 hostels in the campus with more than 3000 capacity.\n" +
                    "•\tUniversity also has a collection of over 1 million researches and journals in its scientific library which is having 11 reading halls.\n");


            obj_Vinnitsa.put("Eligibility", "•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                    "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                    "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                    "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");


            obj_Vinnitsa.put("facilities", "•\tLocal transportation is the foremost choice of 80 % of the scholars.\n" +
                    "•\tThe food provided by the hostel is very well cooked and served.\n" +
                    "•\tHigh-Quality Education and simple admission process.\n" +
                    "•\tSecurity is very high and there are very less crime registered.\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Vinnitsa National Medical University,  UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);
            obj_Vinnitsa.put("fee", feeArray);

            obj_Vinnitsa.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_Vinnitsa.put("services", "•\tStudent Visa Advice\n" +
                    "•\tDocumentation Assistance\n" +
                    "•\tPre Departure Assistance\n" +
                    "•\tPost Departure Guidance\n" +
                    "•\tPick up from Airport to the University\n" +
                    "•\tAccommodations Related complete Assistance.\n");


//////////////////////////////////////////////////////////////////////////////

            obj_ODESSA.put("country", "Ukraine");

            obj_ODESSA.put("name", "ODESSA NATIONAL MEDICAL UNIVERSITY UKRAINE (KIEV)");

            obj_ODESSA.put("overview", "Established in the year 1900, Location- Kyiv, Ukraine, Site – http://onmedu.edu.ua/\n" +
                    "MCI & WHO Approved\n");

            obj_ODESSA.put("logo", R.drawable.odessa_logo);

            obj_ODESSA.put("image", R.drawable.odessa);

            obj_ODESSA.put("intoduction", "•\tEstablished in the year 1900 Odessa National Medical University (ONMU).\n" +
                    "•\tOdessa National Medical University is a member of Medical Education In Europe (MEDINE).\n" +
                    "•\tOdessa National Medical University started the education in English medium in the year 1996 and become the first university to impart education in English medium in Ukraine.\n" +
                    "•\tUniversity has trained more than 90000 doctors in their more than a century time frame.\n" +
                    "•\tUniversity has trained more than 700 PhD Doctors and 4000 Candidate of Science.\n" +
                    "•\tHighly specialised medical departments and scientific research centres have been established by the university.\n" +
                    "•\tWith the approval of Ministry of Health of Ukraine, the university has also created the diagnostic centres of Cardio hematology, Eye Microsurgery, Synthesis, Pediatric Cardiology, Endoscopy, Toxicology, Laser Surgery etc.\n" +
                    "•\tOdessa National Medical University in Ukraine has the most advanced physical infrastructure for both medical treatment and medical education in Ukraine.\n" +
                    "•\tUniversity also has a computer park with around 700 latest technology computers for staffs and students.\n" +
                    "•\tThe Odessa National Medical University has been built over 28000 square meters of area and consists of 12 academic blocks, scientific laboratories, and more than 600 classrooms.\n" +
                    "•\tIt must be noted that more than 9000 students have already graduated from the university which consists of 8 faculties, 45 clinical departments and 58 theoretical departments.\n" +
                    "•\tUniversity has hired more than 100 professors and 400 PhD associate professors having experience and expertise in various specialities.\n" +
                    "•\tThe university is fully governed by the state and follows the directions as per approval of Ministry of Education and Science of Ukraine and Ministry of Health of Ukraine.\n");


            obj_ODESSA.put("Eligibility", "•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                    "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                    "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                    "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");


            obj_ODESSA.put("facilities", "•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                    "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                    "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                    "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Odessa National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);
            obj_ODESSA.put("fee", feeArray);

            obj_ODESSA.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_ODESSA.put("services", "•\tStudent Visa Advice\n" +
                    "•\tDocumentation Assistance\n" +
                    "•\tPre Departure Assistance\n" +
                    "•\tPost Departure Guidance\n" +
                    "•\tPick up from Airport to the University\n" +
                    "•\tAccommodations Related complete Assistance.\n");

/////////////////////////////////////////////////

            obj_Kiev.put("country", "Ukraine");

            obj_Kiev.put("name", "Kiev Medical University UAFM");

            obj_Kiev.put("overview", "Established in the year 1992, Location- Kyiv, Ukraine, Site – http://knmu-edu.com.ua/\n" +
                    "MCI & WHO Approved\n");

            obj_Kiev.put("logo", R.drawable.kiev_logo);

            obj_Kiev.put("image", R.drawable.kiev);

            obj_Kiev.put("intoduction", "•\tEstablished in the year 1992 Kyiv Medical University of UAFM.\n" +
                    "•\tMore than 10000 doctors have graduated from the university till now in various speciality courses of General Medicine, Pharmacists and Dentistry.\n" +
                    "•\tTill now more than 1000 foreign students have already graduated from the university.\n" +
                    "•\tInternational Medical Education Directory (IMED), Medical Council of Canada, and ECFMG (Education Commission for Foreign Medical Graduates has also recognised the Kyiv National Medical University UAFM.\n" +
                    "•\tMore than 160 teaching staffs having experience and expertise in their specialised fields have been employed by the university.\n" +
                    "•\tThe teaching staff includes more than 35 doctors of medicines, around 100 associate professors, honoured doctors of Ukraine and scientists and specialists.\n" +
                    "•\tUniversity provides the hostel facility to students very close to its campus area.\n" +
                    "•\tHostels provided by the university are equipped with comfortable beds and mattresses, geyser, cleaning services etc.\n" +
                    "•\tFaculties in the Kiev National Medical University UAFM are Faculty of General Medicine, Faculty of Stomatology (dentistry), and Preparatory Faculty.\n" +
                    "•\tKyiv Medical University UAFM has been making some great efforts in making new collaboration with many renowned organisations of the world.\n" +
                    "•\tThe university is fully governed by the state and follows the directions as per approval of Ministry of Education and Science of Ukraine and Ministry of Health of Ukraine.\n");


            obj_Kiev.put("Eligibility", "•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                    "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                    "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                    "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");


            obj_Kiev.put("facilities", "•\tLocal transportation is the foremost choice of 80 % of the scholars.\n" +
                    "•\tThe food provided by the hostel is very well cooked and served.\n" +
                    "•\tHigh-Quality Education and simple admission process.\n" +
                    "•\tSecurity is very high and there are very less crime registered.\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);
            obj_Kiev.put("fee", feeArray);

            obj_Kiev.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_Kiev.put("services", "•\tStudent Visa Advice\n" +
                    "•\tDocumentation Assistance\n" +
                    "•\tPre Departure Assistance\n" +
                    "•\tPost Departure Guidance\n" +
                    "•\tPick up from Airport to the University\n" +
                    "•\tAccommodations Related complete Assistance.\n");



/////////////////////////////////////////////////

            obj_Dnipropetrovsk.put("country", "Ukraine");

            obj_Dnipropetrovsk.put("name", "Dnipropetrovsk State Medical Academy");

            obj_Dnipropetrovsk.put("overview", "Established in the year 1916, Location- Dnipropetrovsk Oblast, Ukraine,\n" +
                    " Site – http://www.dsma.dp.ua/en/eng\n" +
                    "MCI & WHO Approved\n");

            obj_Dnipropetrovsk.put("logo", R.drawable.dnipropetrovsk_logo);

            obj_Dnipropetrovsk.put("image", R.drawable.dnipropetrovsk);

            obj_Dnipropetrovsk.put("intoduction", "•\tEstablished in the year 1916 Dnipropetrovsk State Medical Academy..\n" +
                    "•\tEarlier known as Ekaterynoslavsky Higher Female Courses Institute, the academy was founded in the year 1916.\n" +
                    "•\tAcademy has till now trained around 50000 doctors including general medicine, dentists, pharmacists and nurses till its inception. \n" +
                    "•\tIn last 5 years, more than 165 master’s theses and the doctoral has been defended by Dnipropetrovsk State Medical Academy.\n" +
                    "•\tMore than 265 patents are in the name of Academy and have even published 516 articles internationally and more than 6500 within the country.\n" +
                    "•\tUniversity trains international students in various medical specialities so that trained doctors may help in the advancement of the medical facility in their country.\n" +
                    "•\tThe scientific journals – “Medical Perspectives”, “Urology” and “dermatovenereology, cosmetology, sexual pathology” are being printed by the Academy itself.\n" +
                    "•\tThe academy has clinical departments in more than 25 hospitals in the city of Dnipropetrovsk, the count of clinics is more than 40 in numbers.\n" +
                    "•\tMore than 15000 beds are being monitored under the clinics of the academy in these hospitals.\n" +
                    "•\tEducation in the university is being directed by the Ministry of Education and Ministry of Health of Ukraine.\n" +
                    "•\tUniversity has employed more than 1100 staff members out of which there are more than 600 teachers for imparting quality education in various departments.\n" +
                    "•\tAcademy has specialised well-qualified teaching staffs which include around 350 Candidates of Medical Science, around 100 Doctors of Medical Science, and many others workers of Science and technology.\n" +
                    "•\tThe university is fully governed by the state and follows the directions as per approval of Ministry of Education and Science of Ukraine and Ministry of Health of Ukraine.\n");


            obj_Dnipropetrovsk.put("Eligibility", "•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                    "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                    "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                    "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");


            obj_Dnipropetrovsk.put("facilities", "•\tLocal transportation is the foremost choice of 80 % of the scholars.\n" +
                    "•\tThe food provided by the hostel is very well cooked and served.\n" +
                    "•\tHigh-Quality Education and simple admission process.\n" +
                    "•\tSecurity is very high and there are very less crime registered.\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);
            obj_Dnipropetrovsk.put("fee", feeArray);

            obj_Dnipropetrovsk.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 65 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_Dnipropetrovsk.put("services", "•\tStudent Visa Advice\n" +
                    "•\tDocumentation Assistance\n" +
                    "•\tPre Departure Assistance\n" +
                    "•\tPost Departure Guidance\n" +
                    "•\tPick up from Airport to the University\n" +
                    "•\tAccommodations Related complete Assistance.\n");


            /////////////////////////////////////////////////

            obj_VN.put("country", "Ukraine");

            obj_VN.put("name", "V. N. Karazin Kharkiv National Medical University");

            obj_VN.put("overview", "Established in the year 1804, Location- Kharkiv, Kharkiv Oblast, Ukraine,\n" +
                    " Site – http://www.univer.kharkov.ua/\n" +
                    "MCI & WHO Approved\n");

            obj_VN.put("logo", R.drawable.vnkarazin_logo);

            obj_VN.put("image", R.drawable.vnkarazin);

            obj_VN.put("intoduction", "•\tEstablished in the year 1804.\n" +
                    "•\tIt is also called by the name Karazin University in Ukraine.\n" +
                    "•\tThe university is also the second oldest MBBS University in Ukraine. \n" +
                    "•\tMore than 150,000 students have already graduated in various medical specialities from the university.\n" +
                    "•\tThe university is also a member of European Nuclear Education Network, International Association of Universities and European University Association.\n" +
                    "•\tThere are about 300 Doctors of Sciences, around 800 PhDs and more than 15 corresponding members of National Academy of Sciences of Ukraine.\n" +
                    "•\tThe university has a huge campus having many buildings of Central Scientific Building, Main and Northern Building, the students’ hostel.\n" +
                    "•\tIt also has the botanical garden, 3 research institutes, and 3 museums which are Museum of Natural History, the University History Museum and the Archaeology and Ethnography Museum.\n" +
                    "•\tFor MBBS Ukraine, the university serves as one of the best choices as it is being ranked 3rd by UNESCO in Top-200 Ukraine MBBS universities in the year 2016.\n" +
                    "•\tThere are total 20 scientific schools in the campus with 125 departments to impart education in speciality subjects. University has recruited some of the best scientists, specialists and academicians for providing training to the students.\n" +
                    "•\tUniversity publishes more than 300 manuals, 60 textbooks and monographs, over 2500 scientific articles, around 80 issues of University Bulletin.\n" +
                    "•\tEducation in the university is being directed by the Ministry of Education and Ministry of Health of Ukraine.\n" +
                    "•\tUniversity has employed more than 1100 staff members out of which there are more than 600 teachers for imparting quality education in various departments.\n" +
                    "•\tAcademy has specialised well-qualified teaching staffs which include around 350 Candidates of Medical Science, around 100 Doctors of Medical Science, and many others workers of Science and technology.\n" +
                    "•\tThe university is fully governed by the state and follows the directions as per approval of Ministry of Education and Science of Ukraine and Ministry of Health of Ukraine.\n");


            obj_VN.put("Eligibility", "•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                    "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                    "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                    "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");


            obj_VN.put("facilities", "•\tLocal transportation is the foremost choice of 80 % of the scholars.\n" +
                    "•\tThe food provided by the hostel is very well cooked and served.\n" +
                    "•\tHigh-Quality Education and simple admission process.\n" +
                    "•\tSecurity is very high and there are very less crime registered.\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);
            obj_VN.put("fee", feeArray);

            obj_VN.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 65 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_VN.put("services", "•\tStudent Visa Advice\n" +
                    "•\tDocumentation Assistance\n" +
                    "•\tPre Departure Assistance\n" +
                    "•\tPost Departure Guidance\n" +
                    "•\tPick up from Airport to the University\n" +
                    "•\tAccommodations Related complete Assistance.\n");

            /////////////////////////////////////////////////

            obj_ZAPOROZHYE.put("country", "Ukraine");

            obj_ZAPOROZHYE.put("name", "ZAPOROZHYE STATE MEDICAL UNIVERSITY UKRAINE ");

            obj_ZAPOROZHYE.put("overview", "Established in the year 1903, Location-  Zaporizhia,, Ukraine,\n" +
                    " Site – http://zsmu.edu.ua/\n" +
                    "MCI & WHO Approved\n");

            obj_ZAPOROZHYE.put("logo", R.drawable.zaporizhia_logo);

            obj_ZAPOROZHYE.put("image", R.drawable.zaporizhia);

            obj_ZAPOROZHYE.put("intoduction", "•\tEstablished in the year 1903.\n" +
                    "•\t1921, the institute was reorganised into Chemical-Pharmaceutical Institute.\n" +
                    "•\tIn the year 1994 Government of Ukraine provided the university with the highest level of accreditation of Level IV University. \n" +
                    "•\tMany foreign students visit this MBBS University in Ukraine to take education in Medical and Pharmaceutical speciality courses.\n" +
                    "•\tUniversity has its own Medical Clinic for more than 150 patients and a Polyclinic for around 250 consultations.\n" +
                    "•\t1200 computers have been installed in over 40 computer halls fully equipped with latest multimedia software and academic curriculum.\n" +
                    "•\tZaporozhye State Medical University has been constructed over the beautiful Dnieper river bank.\n" +
                    "•\tUniversity has 5 academic buildings will lecture halls, classrooms, library, computer hall, medical room etc.\n" +
                    "•\tUniversity has also constructed 5 hostels within the campus with all facilities.\n" +
                    "•\tThere are more than 650 lecturers in the university to provide education to the students.\n" +
                    "•\tUniversity has employed more than 400 associate professors and PhDs and more than 100 doctors of sciences.\n" +
                    "•\tMore than 10000 students study different courses and medical specialities. More than 2000 foreign students reside in the campus to study various speciality courses for MBBS in Ukraine.\n" +
                    "•\tThey have conducted more than 500 transplantation of kidney, liver, heart transplant etc.\n" +
                    "•\tThe university is fully governed by the state and follows the directions as per approval of Ministry of Education and Science of Ukraine and Ministry of Health of Ukraine.\n");


            obj_ZAPOROZHYE.put("Eligibility", "•\tThe students must be 17 years of age on or before 31st December of the year of admission to the MBBS course.\n" +
                    "•\tYou must have 50% marks in aggregate in Physics, Chemistry, and Biology in the 12th standard.\n" +
                    "•\tFor SC/ST/OBC or other backward classes, an aggregate of 40% will be considered.\n" +
                    "This is the requirement for Admission as prescribed by MCI which is needed in order to study MBBS in Ukraine.\n");


            obj_ZAPOROZHYE.put("facilities", "•\tLocal transportation is the foremost choice of 80 % of the scholars.\n" +
                    "•\tThe food provided by the hostel is very well cooked and served.\n" +
                    "•\tHigh-Quality Education and simple admission process.\n" +
                    "•\tSecurity is very high and there are very less crime registered.\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_ZAPOROZHYE.put("fee", feeArray);

            obj_ZAPOROZHYE.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 65 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_ZAPOROZHYE.put("services", "•\tStudent Visa Advice\n" +
                    "•\tDocumentation Assistance\n" +
                    "•\tPre Departure Assistance\n" +
                    "•\tPost Departure Guidance\n" +
                    "•\tPick up from Airport to the University\n" +
                    "•\tAccommodations Related complete Assistance.\n");


            /////////////////////////////////////////////////


            obj_Moscow.put("country", "Russia");

            obj_Moscow.put("name", "Moscow State University ");

            obj_Moscow.put("overview", "Moscow State University was established in 1755\n" +
                    "Google Rating -5 star\n" +
                    "Address- Bol'shaya Pirogovskaya Ulitsa, 19с1, Moskva, Russia, 119146\n" +
                    "MCI Approved\n" +
                    "WHO Approved\n" +
                    "Google map - https://goo.gl/maps/4MgKZRUC6Sz\n");

            obj_Moscow.put("logo", R.drawable.moscow_logo);

            obj_Moscow.put("image", R.drawable.moscow);

            obj_Moscow.put("intoduction", "•\tOne of the oldest Russian institutions of higher education, Moscow University was established in 1755. In 1940 it was named after Academician Mikhail Lomonosov (1711 - 1765), an outstanding Russian scientist, who greatly contributed to the establishment of the university in Moscow.\n" +
                    "•\tIn January 2005 Lomonosov Moscow State University celebrated its 250th anniversary, over 800 various events being held on the occasion. Founded in the XVIII century, the University has been constantly growing and enco mpassing new branches of learning and research.\n" +
                    "•\tEvery year Moscow University enrolls about 4 000 international students and postgraduates from all over the world.\n" +
                    "•\tMoscow University campus is an extremely complex system, with its 1 000 000 m2 floor area in 1 000 buildings and structures, with its 8 dormitories housing over 12 000 students and 300 km of utility lines.\n" +
                    "•\tMSU library system is one of the largest in Russia, with its 9,000,000 books, 2,000,000 of them in foreign languages, and the average number of readers 55,000, using 5,500,000 books a year.\n" +
                    "\n" +
                    "Prospective students\n" +
                    "E-mail: international@rector.msu.ru\n" +
                    "General information\n" +
                    "The academic year at MSU starts in September and ends in June (01.09-30.06).\n" +
                    "All faculties provide full-time studies for BS, MS and Specialist programs. Post-graduate studies can be full-time or part-time.\n");


            obj_Moscow.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                    "•\tThe student should have obtained 50% marks in the 12th standard examination." +
                    " Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                    "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator." +
                    " And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad." +
                    " To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category." +
                    " This condition will be mandatory for the students from May 01, 2018 onwards.\n");


            obj_Moscow.put("facilities", "••\tfood \n" +
                    "•\tHostel\n" +
                    "•\tHospital\n" +
                    "•\tLibrary\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_Moscow.put("fee", feeArray);

            obj_Moscow.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_Moscow.put("services", "Pre- Departure\n" +
                    "                                        Post Departure\n" +
                    "                                        Documentation Assistance\n" +
                    "                                        Visa process\n");



            /////////////////////////////////////////////////


            obj_PEOPLES.put("country", "Russia");

            obj_PEOPLES.put("name", "PEOPLES' FRIENDSHIP UNIVERSITY OF RUSSIA ");

            obj_PEOPLES.put("overview", "- PEOPLES' FRIENDSHIP UNIVERSITY OF RUSSIA was  Established in 1960\n" +
                    "Google Rating -4.4 star\n" +
                    "Address- Ulitsa Miklukho-Maklaya, 6, Moskva, Russia, 117198\n" +
                    "MCI Approved\n" +
                    "WHO Approved\n" +
                    "Google map - https://goo.gl/maps/RLu343SnfqF2\n");

            obj_PEOPLES.put("logo", R.drawable.people_logo);

            obj_PEOPLES.put("image", R.drawable.people);

            obj_PEOPLES.put("intoduction", "The University was founded on 5th February, 1960 by the USSR Government. On 22nd February, 1961, the RUDN University was named after Patrice Lumumba — one of the symbols of the African peoples’ fight for independence. Students and academics could be free to pursue their learning, teaching, and research activities at, without being subject to political context, but firmly directed to the grand principles of friendship and mutual support. On February 5, 1992, by the decision of the Government of Russia, the University was renamed to Peoples' Friendship University of Russia.\n" +
                    "•\tMultinationalism and international cooperation.\n" +
                    "•\tFaculty, researchers, students and alumni’ input in the world community development.\n" +
                    "•\tMulti-profiled education and research.\n" +
                    "•\tEqual opportunities.\n" +
                    "•\tCommitment to studies, research and public activities.\n" +
                    "The academic year is divided in 2 terms of 18 weeks. The first semester starts in September 1st and the second in February; students have vacations of 2 weeks in January and of 6 weeks in July-August.\n" +
                    "Full-time programs (Undergraduate, Graduate and Postgraduate), part-time (evening courses), dual degrees, short term upgrade courses etc.\n" +
                    "At this time more than 28000 students of undergraduate, graduate, postgraduate courses representing about 1000 nations and nationalities from 152 countries of the world study at the University. " +
                    "These are young people from Asia, Africa, Latin America and Europe, almost from all republics of the former Soviet Union as well as representatives of autonomies and regions of multinational Russia. International students are organized in students associations by country and regions.\n" +
                    "PFUR student campus is the winner of the “Best campus’ Moscow Mayor’s Prize." +
                    " The university has also won the title “Best student hostel” at the all-Russia contest." +
                    " The campus occupies 50 hectares of land near a large park and hosts 27 buildings.\n");


            obj_PEOPLES.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                    "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                    "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category." +
                    " This condition will be mandatory for the students from May 01, 2018 onwards.\n");


            obj_PEOPLES.put("facilities", "•\tfood \n" +
                    "•\tHostel\n" +
                    "•\tHospital\n" +
                    "•\tLibrary\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_PEOPLES.put("fee", feeArray);

            obj_PEOPLES.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_PEOPLES.put("services", "Pre- Departure\n" +
                    "                                        Post Departure\n" +
                    "                                        Documentation Assistance\n" +
                    "                                        Visa process\n");



            /////////////////////////////////////////////////


            obj_STAVROPOL.put("country", "Russia");

            obj_STAVROPOL.put("name", "STAVROPOL STATE MEDICAL UNIVERSITY");

            obj_STAVROPOL.put("overview", "- Stavropol State Medical University was founded in 1938\n" +
                    "Google Rating -4.7 star\n" +
                    "Address- Ulitsa Mira, 310, Stavropol, Stavropolskiy kray, Russia, 355017\n" +
                    "MCI Approved\n" +
                    "WHO Approved\n" +
                    "Google map - https://goo.gl/maps/d9ayHQwTE2u\n");

            obj_STAVROPOL.put("logo", R.drawable.stavropol_logo);

            obj_STAVROPOL.put("image", R.drawable.stavropol);

            obj_STAVROPOL.put("intoduction", "Stavropol State Medical University was founded in 1938. Since that time thousands of highly skilled specialists working all over the world were prepared at the University. Their successful career growth is the pride of our University. The University is situated in the large administrative, industrial, agricultural, scientific and cultural centre – the city of Stavropol which is considered a pearl of the South of Russia. Throughout several centuries the representatives of more than 100 nationalities with their original culture and traditions live there in peace and confidence. Nowadays, the University is one of the authoritative educational and scientific medical centres of our country. In 2010 all activity spheres of the University were licensed and the State Accreditation Certificate was received.\n" +
                    "The University has 75 chairs where 97 Doctors of Sciences, more than 300 Candidates of Sciences, 47 Honoured Physicians of the Russian Federation, 4 Honoured Scientists of the Russian Federation work. There are 7 faculties in the University where 4 500 Russian and foreign students from 33 countries of the world are trained. In 2011 in Stavropol State Medical University new lines for preparation of specialists are opened: defect ology, biology, biotechnology, physical training for persons with health deviations, economics, and social work.\n" +
                    "The University has 7 computer classes, a modern library, which numbers about 500 000 copies of books and periodicals, its own editions, the newspaper “Medicus” and a scientific practice magazine. There is an Internet centre within the library.\n" +
                    "In 2005, the English-speaking Medium was opened in the University, where the training is conducted in English.\n" +
                    "The course of study at the faculty is 6 years. During two years students master the humanitarian and medico biological subjects. From the third course students begin to study clinical disciplines," +
                    " such as Propaedeutic of Internal Diseases and General Surgery.\n• 1 st autumn semester lasts from 01.09 up to 15.01 incl. exams.\n" +
                    "• 2nd spring semester lasts from 1.02 up to 30.06 incl. exams.\n");


            obj_STAVROPOL.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                    "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                    "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. " +
                    "This condition will be mandatory for the students from May 01, 2018 onwards.\n");

                      obj_STAVROPOL.put("facilities", "Medical Faculty\n" +
                    "Faculty of Paediatrics\n" +
                    "Faculty of Dentistry\n" +
                    "Faculty of Humanities and of Medical and Biological Education\n" +
                    "Faculty of additional professional education\n" +
                    "Faculty of Foreign Students\n" +
                    "Faculty of Humanities\n" +
                    "Faculty training of highly qualified personnel\n" +
                    "Faculty of secondary vocational and pre-university education\n" +
                    "food \n" +
                    "Hostel\n" +
                    "Hospital\n" +
                    "Library\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_STAVROPOL.put("fee", feeArray);

            obj_STAVROPOL.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_STAVROPOL.put("services", "Pre- Departure\n" +
                    "                                        Post Departure\n" +
                    "                                        Documentation Assistance\n" +
                    "                                        Visa process\n");



            /////////////////////////////////////////////////


            obj_SMOLENSK.put("country", "Russia");

            obj_SMOLENSK.put("name", "SMOLENSK STATE MEDICAL UNIVERSITY");

            obj_SMOLENSK.put("overview", "Smolensk State Medical University was founded in 1920.\n" +
                    "Google Rating -4.7 star\n" +
                    "Address- Ulitsa Krupskoy, 28, Smolensk, Smolenskaya oblast', Russia, 214019\n" +
                    "MCI Approved\n" +
                    "WHO Approved\n" +
                    "Google map - https://goo.gl/maps/B5v3FyCij4R2\n");

            obj_SMOLENSK.put("logo", R.drawable.smolensk_logo);

            obj_SMOLENSK.put("image", R.drawable.smolensk);

            obj_SMOLENSK.put("intoduction", "• The Smolensk State Medical University is a government medical college recognized by WHO and all countries of the world including USA, UK and India. \n" +
                    "• in the international rating the Smolensk State Medical University is placed on the 22nd position. \n" +
                    "• today the acting Chancellor of the Smolensk State Medical University is Professor Dr. R.S. Kozlov.\n" +
                    "•  Students from more than 50 countries study here: from India, Germany, Italy, Poland, Sri Lanka and other countries of African, Asian and South American continents. \n" +
                    "• For foreign student’s education is carried out in English medium. \n" +
                    "• Cosmos Educational Consultants is the only firm authorized by the Smolensk State Medical University to recruit foreign students to the Faculty of Foreign Students for studies in English Medium at the Smolensk State Medical University. This is hereby certified that no other firm is authorized by the Smolensk State Medical University to recruit foreign students to the Faculty of Foreign Students for studies in English Medium at the Smolensk State Medical University. \n" +
                    "• The Smolensk State Medical University has 8 faculties: \n" +
                    "•\tFaculty of General Medicine\n" +
                    "•\tFaculty of Dentistry\n" +
                    "•\tFaculty of Paediatrics\n" +
                    "•\tFaculty for Foreign Students\n" +
                    "•\tFaculty of Pharmaceutics\n" +
                    "•\tFaculty of Clinical Psychology and Social Work\n" +
                    "•\tFaculty of Post Graduate Studies\n" +
                    "•\tFaculty of Higher Nursing\n" +
                    "• the number of seats in faculty of Medicine per year is 1000, out of which 270 seats are reserved for foreign students. \n" +
                    "• there are 65 departments, where 450 highly qualified teachers are working. \n" +
                    "•  All the above faculties and departments are well equipped with Electronic Microscopes, Bio-Chemical Laboratories, Radio-Isotope Laboratories and lecture halls equipped with Tele-video and multimedia apparatuses. \n" +
                    "• there are 31 hospitals working under the Smolensk State Medical University out of them 8 hospitals with about 6000 beds are used for education of students. \n" +
                    "• today this University is a big scientific establishment where fundamental, applied and methodical scientific researches are carried out.\n" +
                    "Campus: The Smolensk State Medical University is constructed in a campus system i.e. educational buildings, library, mess, hostels, sport complexes, playground, cultural complexes and park are situated in one campus. The Smolensk State Medical University has its own security surveillance system with its own security guards for the safety of its students and campus.\n");


            obj_SMOLENSK.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                    "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                    "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. " +
                    "This condition will be mandatory for the students from May 01, 2018 onwards.\n");

            obj_SMOLENSK.put("facilities", "•\tfood \n" +
                    "•\tHostel\n" +
                    "•\tHospital\n" +
                    "•\tLibrary\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_SMOLENSK.put("fee", feeArray);

            obj_SMOLENSK.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_SMOLENSK.put("services", "Pre- Departure\n" +
                    "                                        Post Departure\n" +
                    "                                        Documentation Assistance\n" +
                    "                                        Visa process\n");



            /////////////////////////////////////////////////


            obj_KURSK.put("country", "Russia");

            obj_KURSK.put("name", "KURSK STATE MEDICAL UNIVERSITY");

            obj_KURSK.put("overview", "KURSK STATE MEDICAL UNIVERSITY Established in 1935\n" +
                    "Google Rating -5 star\n" +
                    "Address- 305041, Ulitsa Karla Marksa, 3, Kursk, Kursk Oblast, Russia, 305004\n" +
                    "MCI Approved\n" +
                    "WHO Approved\n" +
                    "Google map - https://goo.gl/maps/tDYJVKyny1w\n");

            obj_KURSK.put("logo", R.drawable.kursk_logo);

            obj_KURSK.put("image", R.drawable.kursk);

            obj_KURSK.put("intoduction", "Kursk – is one of the oldest Russian cities (the first annalistic mention of Kursk dates from 1032) and there are many famous events of the history of Russia related to Kursk for centuries.\n" +
                    "Almost one thousand years ago Kursk was the boundary fortress of the Russian land. From the earliest times it was the guardian of the borders in the south of Russia.\n" +
                    "Kursk region is situated in the center of the European part of the USSR, within the forest-steppe zone. The terrain – is a low hilly steppe plain, dissected by beams, ravines and river valleys. The climate is moderate continental.\n" +
                    "In 2013 8,036 students are trained in the university. 5,498 of them get their higher education; 791 get secondary vocational education; 1,122 are interns and graduate students; 762 are health care workers which get additional postgraduate education. Every year 1,000 applicants become students of the university. The instruction is offered at 14 faculties.\n" +
                    "The campus of the university includes 7 training buildings and 6 dormitories.  There are 67 (57) departments in the university. The academic staff of 752 specialists comprises 115 D.Sc. and 408 Ph.D.\n" +
                    "\n" +
                    "The structure of the university also includes the Center of Practical Training of Students, the Center of International Education and Language Communication “Languages and Culture”, Research Institute of Environmental Medicine, University Placement Office, a library, a consulting diagnostic policlinic, 4 gymnasiums, a canteen," +
                    " a café and buffets in the training buildings and dormitories.\n");


            obj_KURSK.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                    "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                    "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category." +
                    " This condition will be mandatory for the students from May 01, 2018 onwards.\n");

            obj_KURSK.put("facilities", "•\tfood \n" +
                    "•\tHostel\n" +
                    "•\tHospital\n" +
                    "•\tLibrary\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_KURSK.put("fee", feeArray);

            obj_KURSK.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_KURSK.put("services", "Pre- Departure\n" +
                    "                                        Post Departure\n" +
                    "                                        Documentation Assistance\n" +
                    "                                        Visa process\n");

            /////////////////////////////////////////////////


            obj_BASHKIR.put("country", "Russia");

            obj_BASHKIR.put("name", "BASHKIR STATE MEDICAL UNIVERSITY");

            obj_BASHKIR.put("overview", "BASHKIR STATE MEDICAL UNIVERSITY Established in 1932\n" +
                    "Google Rating -4 star\n" +
                    "Address- Ulitsa Zaki Validi, 32, Ufa, Respublika Bashkortostan, Russia, 450076\n" +
                    "MCI Approved\n" +
                    "WHO Approved\n" +
                    "Google map - https://goo.gl/maps/dgah3yyyCDF2\n");

            obj_BASHKIR.put("logo", R.drawable.bashkir_logo);

            obj_BASHKIR.put("image", R.drawable.bashkir);

            obj_BASHKIR.put("intoduction", "Bashkir State Medical University is one of the top Universities of Russia to study medicine. It is considered to be the centre of medical and pharmaceutical science of Bashkortostan Republic. This University is located in the Ufa City. For the last 80 years, Bashkir State Medical University has been training specialists for healthcare, scientific, and pedagogical work in the field of professional medical and pharmaceutical education of the Russian Federation. Among the Indian students, BMSU is one of the popular Universities for many years to pursue MBBS in Russia.\n" +
                    "The faculty of BSMU has famous scholars and medical practitioners who take care of teaching, medical, scientific and innovative activity. The University retains the study material and technical resources, training facilities, and a large library stock.\n" +
                    "There are over 8000 medical students, including more than 850 foreign students from 40 countries, about 1000 clinical residences and PhD programs and 7000 postgraduate professional trainings in our University. BSMU also includes the medical college, which offers vocational secondary education in specialties of Nursing and Prosthetic Dentistry.\n" +
                    "\n" +
                    "The Bashkir State Medical University has 7 Faculties\n" +
                    "    General Medical Faculty\n" +
                    "    Paediatric Faculty\n" +
                    "    Dentistry Faculty\n" +
                    "    Faculty of Pharmacy\n" +
                    "    Faculty of Preventive Medicine\n");


            obj_BASHKIR.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                    "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                    "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. " +
                    "This condition will be mandatory for the students from May 01, 2018 onwards.\n");

            obj_BASHKIR.put("facilities", "•\tfood \n" +
                    "•\tHostel\n" +
                    "•\tHospital\n" +
                    "•\tLibrary\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_BASHKIR.put("fee", feeArray);

            obj_BASHKIR.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_BASHKIR.put("services", "Pre- Departure\n" +
                    "                                        Post Departure\n" +
                    "                                        Documentation Assistance\n" +
                    "                                        Visa process\n");

            /////////////////////////////////////////////////


            obj_KAZAN.put("country", "Russia");

            obj_KAZAN.put("name", "KAZAN STATE MEDICAL UNIVERSITY");

            obj_KAZAN.put("overview", "KAZAN STATE MEDICAL UNIVERSITYEstablished in 1814\n" +
                    "Google Rating -5 star\n" +
                    "Address- Ulitsa Butlerova, 49, Kazan, Respublika Tatarstan, Russia, 420012\n" +
                    "MCI Approved\n" +
                    "WHO Approved\n" +
                    "Google map - https://goo.gl/maps/XP78xaxajxu\n");

            obj_KAZAN.put("logo", R.drawable.kazan_logo);

            obj_KAZAN.put("image", R.drawable.kazan);

            obj_KAZAN.put("intoduction", "Founded in 1814, Kazan State Medical University is a non-profit public higher education institution located in the urban setting of the large city of Kazan (population range of 1,000,000-5,000,000 inhabitants), Tatarstan Republic. This institution has also branch campuses in the following location(s): Naberegnie Chelni. Officially accredited and/or recognized by the Ministry of Education and Science of the Russian Federation, Kazan State Medical University (KSMU) is a small (uni Rank enrolment range: 4,000-4,999 students) coeducational higher education institution. Kazan State Medical University (KSMU) offers courses and programs leading to officially recognized higher education degrees such as bachelor degrees, master degrees, and doctorate degrees in several areas of study. See the uni Rank degree levels and areas of study matrix below for further details. This 204 years old higher-education institution has a selective admission policy based on entrance examinations and students' past academic record and grades. The admission rate range is 40-50% making this Russian higher education organization a averagely selective institution. International students are welcome to apply for enrolment.\n" +
                    "With 200 years of experience in medical training, KSMU is justifiably an international University. Around 700 students from more than 57 countries around the world study here and half of them study in English. Moreover, we have a large group of students from neighbouring and remote regions of Russia. We are proud that Kazan medical school is attractive for young people from different parts of the world. That is why our priority is support and care for international students.\n" +
                    "The founders of the Medical Faculty and of the first departments were anatomists I.O. Braun (the first elected rector of the University) and E.F. Aristov, physicians F.Kh. Erdman (the first Dean of the Medical Faculty), K.F. Fuchs, N.A. Skandovsky, surgeons P.A. Dubovitskii, F.O. Elacic, A.A. Kitter, obstetrician A.E. Lentovsky. The opening of the Anatomy Theater (1837), the University’s «old» clinic (1840) and of the Physiology Building (1890) played an important role in the development of Medical Faculty.\n" +
                    "KSMU today:\n" +
                    "    More than 5500 medical students, clinical residents and interns\n" +
                    "    9 faculties\n" +
                    "    65 departments\n" +
                    "    Staff of more than 1500\n" +
                    "Academic year: Each academic year begins on 1st of September.\n" +
                    "Semester:\n" +
                    "There are 2 Semesters in the academic year:\n" +
                    "    Autumn Semester — From September to January,\n" +
                    "    Spring Semester — From February to June.\n");


            obj_KAZAN.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                    "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                    "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. " +
                    "This condition will be mandatory for the students from May 01, 2018 onwards.\n");


            obj_KAZAN.put("facilities", "•\tfood \n" +
                    "•\tHostel\n" +
                    "•\tHospital\n" +
                    "•\tLibrary\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_KAZAN.put("fee", feeArray);

            obj_KAZAN.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_KAZAN.put("services", "Pre- Departure\n" +
                    "                                        Post Departure\n" +
                    "                                        Documentation Assistance\n" +
                    "                                        Visa process\n");


            /////////////////////////////////////////////////


            obj_VOLGOGRAD.put("country", "Russia");

            obj_VOLGOGRAD.put("name", "VOLGOGRAD STATE MEDICAL UNIVERSITY");

            obj_VOLGOGRAD.put("overview", "- VOLGOGRAD STATE MEDICAL UNIVERSITY established in 1935\n" +
                    "Google Rating -5 star\n" +
                    "Address- Ploshchad' Pavshikh Bortsov, 1, Volgograd, Volgogradskaya oblast', Russia, 400008\n" +
                    "MCI Approved\n" +
                    "WHO Approved\n" +
                    "Google map - https://goo.gl/maps/24w49bHVK9s\n");

            obj_VOLGOGRAD.put("logo", R.drawable.volgograd_logo);

            obj_VOLGOGRAD.put("image", R.drawable.volgograd);

            obj_VOLGOGRAD.put("intoduction", "The University started as Stalingrad Medical Institute founded in 1935. In 1993 it got the status of the Academy, and in 2003 it was granted the status of the University. The University is currently headed by the prominent Russian scientist, Academician of the Russian Academy for Medical Sciences, Professor Vladimir I. Petrov.\n" +
                    "The Volgograd State Medical University is an active participant of a number of international projects promoting medical research and clinical practice. This accounts for a genuine interest in the activities of the University on the part of government officials of various countries. It has recently been visited by the ambassadors of the USA, Malaysia, India, the People’s Republic of China, Brunei, Bangladesh, etc., top officials of Medical and Dental Councils of different countries.\n" +
                    "The Volgograd State Medical University has built up relationships with a number of foreign universities - the University of Arkansas for Medical Sciences (USA), Albert Ludwigs Universitaet (Freiburg, Germany), Martin-Luther Halle-Wittenberg Universities (Germany), Belgian, French, Chinese universities, etc. This collaboration has been fostering the advance of medical science in such fields as family medicine, poison control, family planning and reproductive health, arterial hypertension, epidemiology, tuberculosis diagnosis and treatment, pharmacology, pharmacy, etc. One of the latest developments is the newly set up Russian-American Family Practice Clinic which is a unique clinic of this type in the whole of the south of Russia.\n" +
                    "The University has been collaborating with the World Federation for Medical Education, with the World Health Organisation (WHO), with UNESCO, with the British Council, with the United States Agency for International Development, with the American International Health Alliance, and participating in a wide range of joint international research projects\n" +
                    "Faculties-\n" +
                    "•\tFaculty of General Medicine; \n" +
                    "•\tFaculty of Dentistry; \n" +
                    "•\tFaculty of Paediatrics; \n" +
                    "•\tFaculty of Pharmacy; \n" +
                    "•\tFaculty of Medical Biochemistry; \n" +
                    "•\tFaculty of Social Work and Clinical Psychology; \n" +
                    "•\tDepartment for International Students; \n" +
                    "•\tCollege for Postgraduate and Continuous Education; \n" +
                    "•\tDepartment for Foundation Courses. \n");


            obj_VOLGOGRAD.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                    "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                    "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category." +
                    "This condition will be mandatory for the students from May 01, 2018 onwards.\n");


            obj_VOLGOGRAD.put("facilities", "•\tfood \n" +
                    "•\tHostel\n" +
                    "•\tHospital\n" +
                    "•\tLibrary\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_VOLGOGRAD.put("fee", feeArray);

            obj_VOLGOGRAD.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_VOLGOGRAD.put("services", "Pre- Departure\n" +
                    "                                        Post Departure\n" +
                    "                                        Documentation Assistance\n" +
                    "                                        Visa process\n");



            /////////////////////////////////////////////////


            obj_KIROV.put("country", "Russia");

            obj_KIROV.put("name", "KIROV STATE MEDICAL UNIVERSITY");

            obj_KIROV.put("overview", "KIROV STATE MEDICAL UNIVERSITY established in 1987\n" +
                    "Google Rating -4 star\n" +
                    "Address- Ulitsa Karla Marksa, 112, Kirov, Kirovskaya oblast', Russia, 610027\n" +
                    "MCI Approved\n" +
                    "WHO Approved\n" +
                    "Google map - https://goo.gl/maps/nEVUCjRq6tj\n");

            obj_KIROV.put("logo", R.drawable.kirov_logo);

            obj_KIROV.put("image", R.drawable.kirov);

            obj_KIROV.put("intoduction", "The History of Kirov State Medical University starts on the 2nd of August, 1987, when by the order of the Ministry Council of the USSR an affiliate of Perm State Medical Institute was founded in Kirov. The resolution of creating the branch was carried after a working visit of a government commission headed by the Minister of Healthcare of RSFSR A.I. Potapov and the rector of Perm SMI E.A. Vagner in Kirov. Thanks to the great support of the first secretary of Kirov Regional Committee of Communist Party of Soviet Union V.V. Bakatin and the head of regional healthcare department G.F. Shulyatiev the affiliate was given a number of buildings for the placement of theoretical and biology departments, administrative and utility services.\n" +
                    "In 2002 Kirov State Medical Academy marked 15 years and a 10th group of doctors graduated from the Academy. The same year prof. V.S. Melnikov M.D. became the head of the Academy. The academy traditionally cooperated with practical healthcare, developed scientific and research activity. Two years later Viktor Sergeevich Melnikov died from a severe disease.\n" +
                    "Since December 2017, the Acting Rector of the University was appointed Zheleznov Lev Mikhailovich, Honorary Higher Education Scholar of the Russian Federation, Higher Education Professor, Ph.D., M.D.\n" +
                    "Having a diploma of Kirov SMU is becoming more and more prestigious. Its graduates, who have become outstanding doctors, famous scientists, are valued and respected in the region and beyond. 'Art and humanity, labor and knowledge \" - is not only the motto of the Kirov State Medical University, but the commandment of all those who dedicate their lives to medicine and the most humane profession on the Earth – a profession of a doctor.\n" +
                    "Faculties-\n" +
                    "Faculty of general medicine\n" +
                    "Faculty of paediatrics\n" +
                    "Faculty of social work and economics\n" +
                    "Faculty of stomatology (Dentistry\n");


            obj_KIROV.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                    "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                    "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. " +
                    "This condition will be mandatory for the students from May 01, 2018 onwards.\n");


            obj_KIROV.put("facilities", "•\tfood \n" +
                    "•\tHostel\n" +
                    "•\tHospital\n" +
                    "•\tLibrary\n");

            feeArray= new JSONArray();
            temp_obj1 = new JSONObject();
            temp_obj1.put("column1", "Kharkiv National Medical University, UKRAINE");
            temp_obj1.put("column2", "TUITION FEE / YEAR");
            temp_obj1.put("column3", "HOSTEL FEE + HEALTH INSURANCE / YEAR");
            temp_obj1.put("column4", "TOTAL FEES IN USD");
            temp_obj1.put("column5", "TOTAL FEE IN RUPEES");

            temp_obj2 = new JSONObject();
            temp_obj2.put("column1", "1st Year Fees");
            temp_obj2.put("column2", "5600  US Dollars");
            temp_obj2.put("column3", "1000  US Dollars/ year");
            temp_obj2.put("column4", "6600  US Dollars	");
            temp_obj2.put("column5", "RS.3,96,000(approx.)");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column1", "2nd to 6th year Fees");
            temp_obj3.put("column2", "4400 US Dollars/year");
            temp_obj3.put("column3", "1000 US Dollars/ year");
            temp_obj3.put("column4", "5400 US Dollars/ year");
            temp_obj3.put("column5", "RS.3,24,000/ Year (approx.)");
            feeArray.put(temp_obj1);
            feeArray.put(temp_obj2);
            feeArray.put(temp_obj3);

            obj_KIROV.put("fee", feeArray);

            obj_KIROV.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                    " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
            obj_KIROV.put("services", "Pre- Departure\n" +
                    "                                        Post Departure\n" +
                    "                                        Documentation Assistance\n" +
                    "                                        Visa process\n");


        } catch (JSONException e) {
                e.printStackTrace();
            }
            //return obj;
        switch (varCollegeName){
            case 0:
                return obj;
                //break;
            case 1:
                return obj_Kharkiv;
               //break;
            case 2:
                return obj_Vinnitsa;
                //break;
            case 3:
                return obj_ODESSA;
                //break;
            case 4:
                return obj_Kiev;
                //break;
            case 5:
                return obj_Dnipropetrovsk ;
                //break;
            case 6:
                return obj_VN;
                //break;
            case 7:
                return obj_ZAPOROZHYE;
                //break;
            case 8:
                return obj_Moscow;
                //break;
            case 9:
                return obj_PEOPLES;
                //break;
            case 10:
                return obj_STAVROPOL;
                //break;
            case 11:
                return obj_SMOLENSK;
                //break;
            case 12:
                return obj_KURSK;
                //break;
            case 13:
                return obj_BASHKIR;
                //break;
            case 14:
                return obj_KAZAN;
                //break;
            case 15:
                return  obj_VOLGOGRAD ;
                //break;

            case 16:
                return obj_KIROV;
                //break;
            default:
                return obj;
        }
        }

    }


