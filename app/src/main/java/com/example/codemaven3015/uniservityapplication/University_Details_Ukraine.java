package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Admin on 5/7/2018.
 */

public class University_Details_Ukraine {
    private int varCollegeName;


    public University_Details_Ukraine(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException {
        JSONObject obj = new JSONObject();
        JSONObject obj_Kharkiv = new JSONObject();
        JSONObject obj_Vinnitsa = new JSONObject();
        JSONObject obj_ODESSA = new JSONObject();
        JSONObject obj_Kiev = new JSONObject();
        JSONObject obj_Dnipropetrovsk = new JSONObject();
        JSONObject obj_VN = new JSONObject();
        JSONObject obj_ZAPOROZHYE = new JSONObject();

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


            JSONObject temp_obj2 = new JSONObject();
            temp_obj2.put("column2", "$6000");
            temp_obj2.put("column3", "$1800");
            temp_obj2.put("column4", "$7800");
            temp_obj2.put("column5", "₹4,68,000");

            JSONObject temp_obj3 = new JSONObject();
            temp_obj3.put("column2", "$4500");
            temp_obj3.put("column3", "$1800");
            temp_obj3.put("column4", "$6300");
            temp_obj3.put("column5", "₹3,78,000");
            //feeArray.put(temp_obj1);
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

            feeArray = new JSONArray();

            temp_obj2 = new JSONObject();
            temp_obj2.put("column2", "$5300");
            temp_obj2.put("column3", "$1200");
            temp_obj2.put("column4", "$6500");
            temp_obj2.put("column5", "₹3,90,000");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column2", "$4300");
            temp_obj3.put("column3", "$1200");
            temp_obj3.put("column4", "$5500");
            temp_obj3.put("column5", "₹3,30,000");
            //feeArray.put(temp_obj1);
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

            feeArray = new JSONArray();
            temp_obj1 = new JSONObject();

            temp_obj2 = new JSONObject();
            temp_obj2.put("column2", "$5600");
            temp_obj2.put("column3", "$1000");
            temp_obj2.put("column4", "$6600");
            temp_obj2.put("column5", "₹3,96,000");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column2", "$4400");
            temp_obj3.put("column3", "$1000");
            temp_obj3.put("column4", "$5400");
            temp_obj3.put("column5", "₹3,24,000");
            //feeArray.put(temp_obj1);
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

            feeArray = new JSONArray();
            temp_obj1 = new JSONObject();

            temp_obj2 = new JSONObject();
            temp_obj2.put("column2", "$5500");
            temp_obj2.put("column3", "$1500");
            temp_obj2.put("column4", "$7000");
            temp_obj2.put("column5", "₹4,20,000");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column2", "$4000");
            temp_obj3.put("column3", "$1500");
            temp_obj3.put("column4", "$5500");
            temp_obj3.put("column5", "₹3,30,000");
            //feeArray.put(temp_obj1);
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

            feeArray = new JSONArray();
            temp_obj2 = new JSONObject();
            temp_obj2.put("column2", "$5200");
            temp_obj2.put("column3", "$1500");
            temp_obj2.put("column4", "$6700");
            temp_obj2.put("column5", "₹4,02,000 ");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column2", "$3500 ");
            temp_obj3.put("column3", "$500 ");
            temp_obj3.put("column4", "$4000 ");
            temp_obj3.put("column5", "₹2,40,000");
            //feeArray.put(temp_obj1);
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

            feeArray = new JSONArray();
            temp_obj2 = new JSONObject();
            temp_obj2.put("column2", "$4700");
            temp_obj2.put("column3", "$1200");
            temp_obj2.put("column4", "$5900");
            temp_obj2.put("column5", "₹30,50,000");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column2", "$3500");
            temp_obj3.put("column3", "$1200");
            temp_obj3.put("column4", "$4700");
            temp_obj3.put("column5", "₹2,82,000");
            //feeArray.put(temp_obj1);
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

            feeArray = new JSONArray();
            temp_obj2 = new JSONObject();
            temp_obj2.put("column2", "$5300 ");
            temp_obj2.put("column3", "$1200");
            temp_obj2.put("column4", "$6500 ");
            temp_obj2.put("column5", "₹3,90,000 ");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column2", "$4200 ");
            temp_obj3.put("column3", "$1200 ");
            temp_obj3.put("column4", "$5400 ");
            temp_obj3.put("column5", "₹3,34,000");
            //feeArray.put(temp_obj1);
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

            feeArray = new JSONArray();
            temp_obj2 = new JSONObject();
            temp_obj2.put("column2", "$5000 ");
            temp_obj2.put("column3", "$1200 ");
            temp_obj2.put("column4", "$6200 ");
            temp_obj2.put("column5", "₹3,72,000 ");

            temp_obj3 = new JSONObject();
            temp_obj3.put("column2", "$4000 ");
            temp_obj3.put("column3", "$1200 ");
            temp_obj3.put("column4", "$5200 ");
            temp_obj3.put("column5", "₹3,12,000");
            //feeArray.put(temp_obj1);
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


        } catch (JSONException e) {
            e.printStackTrace();
        }


        JSONArray allColleges = new JSONArray();
        allColleges.put(obj);
        allColleges.put(obj_Kharkiv);
        allColleges.put(obj_Vinnitsa);
        allColleges.put(obj_ODESSA);
        allColleges.put(obj_Kiev);
        allColleges.put(obj_Dnipropetrovsk);
        allColleges.put(obj_VN);
        allColleges.put(obj_ZAPOROZHYE);
        return allColleges.getJSONObject(varCollegeName);
    }
}


