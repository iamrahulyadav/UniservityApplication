package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class University_Details_Russia {

    private int varCollegeName;


    public University_Details_Russia(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException {



        /////////////////////////////////////////////////

        JSONObject obj_Moscow = new JSONObject();

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

        JSONObject temp_obj4 = new JSONObject();
        JSONObject temp_obj5 = new JSONObject();
        JSONObject temp_obj6 = new JSONObject();
        JSONArray feeArray = new JSONArray();


        JSONObject temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "8000");
        temp_obj2.put("column2", "8000");
        temp_obj2.put("column3", "8000");
        temp_obj2.put("column4", "8000");
        temp_obj2.put("column5", "8000");
        temp_obj2.put("column6", "8000");
        temp_obj2.put("column7", "48000");

        JSONObject temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "5,20,000");
        temp_obj3.put("column2", "5,20,000");
        temp_obj3.put("column3", "5,20,000");
        temp_obj3.put("column4", "5,20,000");
        temp_obj3.put("column5", "5,20,000");
        temp_obj3.put("column6", "5,20,000");
        temp_obj3.put("column7", "31,20,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "1,56,000");
        temp_obj5.put("column2", "1,56,000");
        temp_obj5.put("column3", "1,56,000");
        temp_obj5.put("column4", "1,56,000");
        temp_obj5.put("column5", "1,56,000");
        temp_obj5.put("column6", "1,56,000");
        temp_obj5.put("column7", "9,86,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "6,76,000");
        temp_obj6.put("column2", "6,76,000");
        temp_obj6.put("column3", "6,76,000");
        temp_obj6.put("column4", "6,76,000");
        temp_obj6.put("column5", "6,76,000");
        temp_obj6.put("column6", "6,76,000");
        temp_obj6.put("column7", "40,56,000");


        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj_Moscow.put("fee", feeArray);

        obj_Moscow.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
        obj_Moscow.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////

        JSONObject obj_PEOPLES = new JSONObject();
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
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "7800");
        temp_obj2.put("column2", "7800");
        temp_obj2.put("column3", "7800");
        temp_obj2.put("column4", "7800");
        temp_obj2.put("column5", "7800");
        temp_obj2.put("column6", "7800");
        temp_obj2.put("column7", "46800");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "5,07,000");
        temp_obj3.put("column2", "5,07,000");
        temp_obj3.put("column3", "5,07,000");
        temp_obj3.put("column4", "5,07,000");
        temp_obj3.put("column5", "5,07,000");
        temp_obj3.put("column6", "5,07,000");
        temp_obj3.put("column7", "30,42,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "65,000");
        temp_obj5.put("column2", "65,000");
        temp_obj5.put("column3", "65,000");
        temp_obj5.put("column4", "65,000");
        temp_obj5.put("column5", "65,000");
        temp_obj5.put("column6", "65,000");
        temp_obj5.put("column7", "3,90,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "5,72,000");
        temp_obj6.put("column2", "5,72,000");
        temp_obj6.put("column3", "5,72,000");
        temp_obj6.put("column4", "5,72,000");
        temp_obj6.put("column5", "5,72,000");
        temp_obj6.put("column6", "5,72,000");
        temp_obj6.put("column7", "34,32,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj_PEOPLES.put("fee", feeArray);

        obj_PEOPLES.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
        obj_PEOPLES.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////

        JSONObject obj_STAVROPOL = new JSONObject();
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
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "4400");
        temp_obj2.put("column2", "4400");
        temp_obj2.put("column3", "4400");
        temp_obj2.put("column4", "4400");
        temp_obj2.put("column5", "4400");
        temp_obj2.put("column6", "4400");
        temp_obj2.put("column7", "26,400");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,86,000");
        temp_obj3.put("column2", "2,86,000");
        temp_obj3.put("column3", "2,86,000");
        temp_obj3.put("column4", "2,86,000");
        temp_obj3.put("column5", "2,86,000");
        temp_obj3.put("column6", "2,86,000");
        temp_obj3.put("column7", "17,16,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");


        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "45,500");
        temp_obj5.put("column2", "45,500");
        temp_obj5.put("column3", "45,500");
        temp_obj5.put("column4", "45,500");
        temp_obj5.put("column5", "45,500");
        temp_obj5.put("column6", "45,500");
        temp_obj5.put("column7", "2,73,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,31,500");
        temp_obj6.put("column2", "3,31,500");
        temp_obj6.put("column3", "3,31,500");
        temp_obj6.put("column4", "3,31,500");
        temp_obj6.put("column5", "3,31,500");
        temp_obj6.put("column6", "3,31,500");
        temp_obj6.put("column7", "19,89,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj_STAVROPOL.put("fee", feeArray);

        obj_STAVROPOL.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
        obj_STAVROPOL.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////

        JSONObject obj_SMOLENSK = new JSONObject();
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
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "5200");
        temp_obj2.put("column2", "5200");
        temp_obj2.put("column3", "5200");
        temp_obj2.put("column4", "5200");
        temp_obj2.put("column5", "5200");
        temp_obj2.put("column6", "5200");
        temp_obj2.put("column7", "31200");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "3,38,000");
        temp_obj3.put("column2", "3,38,000");
        temp_obj3.put("column3", "3,38,000");
        temp_obj3.put("column4", "3,38,000");
        temp_obj3.put("column5", "3,38,000");
        temp_obj3.put("column6", "3,38,000");
        temp_obj3.put("column7", "20,28,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");


        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "32,500");
        temp_obj5.put("column2", "32,500");
        temp_obj5.put("column3", "32,500");
        temp_obj5.put("column4", "32,500");
        temp_obj5.put("column5", "32,500");
        temp_obj5.put("column6", "32,500");
        temp_obj5.put("column7", "1,98,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "370500");
        temp_obj6.put("column2", "370500");
        temp_obj6.put("column3", "370500");
        temp_obj6.put("column4", "370500");
        temp_obj6.put("column5", "370500");
        temp_obj6.put("column6", "370500");
        temp_obj6.put("column7", "22,23,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj_SMOLENSK.put("fee", feeArray);

        obj_SMOLENSK.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
        obj_SMOLENSK.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////

        JSONObject obj_KURSK = new JSONObject();
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
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "5000");
        temp_obj2.put("column2", "5000");
        temp_obj2.put("column3", "5000");
        temp_obj2.put("column4", "5000");
        temp_obj2.put("column5", "5000");
        temp_obj2.put("column6", "5000");
        temp_obj2.put("column7", "30,000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "3,25,000");
        temp_obj3.put("column2", "3,25,000");
        temp_obj3.put("column3", "3,25,000");
        temp_obj3.put("column4", "3,25,000");
        temp_obj3.put("column5", "3,25,000");
        temp_obj3.put("column6", "3,25,000");
        temp_obj3.put("column7", "19,50,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "78,000");
        temp_obj5.put("column2", "78,000");
        temp_obj5.put("column3", "78,000");
        temp_obj5.put("column4", "78,000");
        temp_obj5.put("column5", "78,000");
        temp_obj5.put("column6", "78,000");
        temp_obj5.put("column7", "4,68,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "4,03,000");
        temp_obj6.put("column2", "4,03,000");
        temp_obj6.put("column3", "4,03,000");
        temp_obj6.put("column4", "4,03,000");
        temp_obj6.put("column5", "4,03,000");
        temp_obj6.put("column6", "4,03,000");
        temp_obj6.put("column7", "24,18,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj_KURSK.put("fee", feeArray);

        obj_KURSK.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
        obj_KURSK.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");

        /////////////////////////////////////////////////

        JSONObject obj_BASHKIR = new JSONObject();
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
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "5500");
        temp_obj2.put("column2", "5500");
        temp_obj2.put("column3", "5500");
        temp_obj2.put("column4", "5500");
        temp_obj2.put("column5", "5500");
        temp_obj2.put("column6", "5500");
        temp_obj2.put("column7", "19000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "3,57,500");
        temp_obj3.put("column2", "3,57,500");
        temp_obj3.put("column3", "3,57,500");
        temp_obj3.put("column4", "3,57,500");
        temp_obj3.put("column5", "3,57,500");
        temp_obj3.put("column6", "3,57,500");
        temp_obj3.put("column7", "12,85,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "16250");
        temp_obj5.put("column2", "16250");
        temp_obj5.put("column3", "16250");
        temp_obj5.put("column4", "16250");
        temp_obj5.put("column5", "16250");
        temp_obj5.put("column6", "16250");
        temp_obj5.put("column7", "97,500");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,75,750");
        temp_obj6.put("column2", "3,75,750");
        temp_obj6.put("column3", "3,75,750");
        temp_obj6.put("column4", "3,75,750");
        temp_obj6.put("column5", "3,75,750");
        temp_obj6.put("column6", "3,75,750");
        temp_obj6.put("column7", "13,32,500");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj_BASHKIR.put("fee", feeArray);

        obj_BASHKIR.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
        obj_BASHKIR.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");

        /////////////////////////////////////////////////

        JSONObject obj_KAZAN = new JSONObject();
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
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "4500");
        temp_obj2.put("column2", "4500");
        temp_obj2.put("column3", "4500");
        temp_obj2.put("column4", "4500");
        temp_obj2.put("column5", "4500");
        temp_obj2.put("column6", "4500");
        temp_obj2.put("column7", "27000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,70,000");
        temp_obj3.put("column2", "2,70,000");
        temp_obj3.put("column3", "2,70,000");
        temp_obj3.put("column4", "2,70,000");
        temp_obj3.put("column5", "2,70,000");
        temp_obj3.put("column6", "2,70,000");
        temp_obj3.put("column7", "15,20,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "18,000");
        temp_obj5.put("column2", "18,000");
        temp_obj5.put("column3", "18,000");
        temp_obj5.put("column4", "18,000");
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "1,08,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "2,88,000");
        temp_obj6.put("column2", "2,88,000");
        temp_obj6.put("column3", "2,88,000");
        temp_obj6.put("column4", "2,88,000");
        temp_obj6.put("column5", "2,88,000");
        temp_obj6.put("column6", "2,88,000");
        temp_obj6.put("column7", "17,28,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj_KAZAN.put("fee", feeArray);

        obj_KAZAN.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
        obj_KAZAN.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");


        /////////////////////////////////////////////////

        JSONObject obj_VOLGOGRAD = new JSONObject();
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
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "5630");
        temp_obj2.put("column2", "5630");
        temp_obj2.put("column3", "5630");
        temp_obj2.put("column4", "5630");
        temp_obj2.put("column5", "5630");
        temp_obj2.put("column6", "5630");
        temp_obj2.put("column7", "33780");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "365950");
        temp_obj3.put("column2", "365950");
        temp_obj3.put("column3", "365950");
        temp_obj3.put("column4", "365950");
        temp_obj3.put("column5", "365950");
        temp_obj3.put("column6", "365950");
        temp_obj3.put("column7", "21,95700");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "35750");
        temp_obj5.put("column2", "35750");
        temp_obj5.put("column3", "35750");
        temp_obj5.put("column4", "35750");
        temp_obj5.put("column5", "35750");
        temp_obj5.put("column6", "35750");
        temp_obj5.put("column7", "35750");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "401700");
        temp_obj6.put("column2", "401700");
        temp_obj6.put("column3", "401700");
        temp_obj6.put("column4", "401700");
        temp_obj6.put("column5", "401700");
        temp_obj6.put("column6", "401700");
        temp_obj6.put("column7", "24,102,00");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj_VOLGOGRAD.put("fee", feeArray);

        obj_VOLGOGRAD.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
        obj_VOLGOGRAD.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////

        JSONObject obj_KIROV = new JSONObject();
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
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "4200");
        temp_obj2.put("column2", "4200");
        temp_obj2.put("column3", "4200");
        temp_obj2.put("column4", "4200");
        temp_obj2.put("column5", "4200");
        temp_obj2.put("column6", "4200");
        temp_obj2.put("column7", "25200");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,78,000");
        temp_obj3.put("column2", "2,78,000");
        temp_obj3.put("column3", "2,78,000");
        temp_obj3.put("column4", "2,78,000");
        temp_obj3.put("column5", "2,78,000");
        temp_obj3.put("column6", "2,78,000");
        temp_obj3.put("column7", "16,38,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "26000");
        temp_obj5.put("column2", "26000");
        temp_obj5.put("column3", "26000");
        temp_obj5.put("column4", "26000");
        temp_obj5.put("column5", "26000");
        temp_obj5.put("column6", "26000");
        temp_obj5.put("column7", "1,56,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "2,99,000");
        temp_obj6.put("column2", "2,99,000");
        temp_obj6.put("column3", "2,99,000");
        temp_obj6.put("column4", "2,99,000");
        temp_obj6.put("column5", "2,99,000");
        temp_obj6.put("column6", "2,99,000");
        temp_obj6.put("column7", "17,94,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj_KIROV.put("fee", feeArray);

        obj_KIROV.put("feedetails", "Fees include Tuition Fee, Health Insurance and Hostel Fee. \n" +
                " (1 USD = 60 Rupees approx. for calculation) Actual Rate at the time of fees payment will be calculated.\n");
        obj_KIROV.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        JSONArray allColleges = new JSONArray();
        allColleges.put(obj_Moscow);
        allColleges.put(obj_PEOPLES);
        allColleges.put(obj_STAVROPOL);
        allColleges.put(obj_SMOLENSK);
        allColleges.put(obj_KURSK);
        allColleges.put(obj_BASHKIR);
        allColleges.put(obj_KAZAN);
        allColleges.put(obj_VOLGOGRAD);
        allColleges.put(obj_KIROV);

        return allColleges.getJSONObject(varCollegeName);
    }
}
