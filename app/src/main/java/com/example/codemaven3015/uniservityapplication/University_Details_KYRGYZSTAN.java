package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class University_Details_KYRGYZSTAN {

    private final int varCollegeName;

    public University_Details_KYRGYZSTAN(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException {

        /////////////////////////////////////////////////////
        JSONObject JALALABAD = new JSONObject();

        JALALABAD.put("country", "KYRGYZSTAN");

        JALALABAD.put("name", "JALALABAD STATE UNIVERSITY");

        JALALABAD.put("overview", "JALALABAD STATE UNIVERSITY was established in 1993\n" +
                "Google Rating -4.5 star\n" +
                "Address- 57, 715600, Lenin St, Jalal-Abad, Kyrgyzstan\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/gsZEgzxxToS2\n");

        JALALABAD.put("logo", R.drawable.jalalabad_logo);

        JALALABAD.put("image", R.drawable.jalalabad_img);

        JALALABAD.put("intoduction", "Jalal-Abad State University (JASU) was founded on April 2, 1993 on the basis of already functioning educational institutions:\n" +
                "• Pedagogical school was founded in 1926 and zoo veterinary technical school was formed in 1947 (Jalal-Abad city).\n" +
                "• Branches of Frunze polytechnic institute in Kara-Kul were founded in 1963 ; in Tash-Komur was founded in 1990;\n" +
                "• An engineering technical school was founded in 1981 (Kochkor-Ata);\n" +
                "• and electromechanical technical school was founded in 1965 (Mailu-Suu).\n" +
                "Jalal-Abad State University is not just a institution which imparts world-class education, but an experience where everyone associated is part of a dream, a mission to see that we nurture truly great leaders. The medical faculty of Jalal-Abad State University is affiliated with the Ministry of Health and Science Education, Kyrgyz Republic. Jalal-Abad State University was opened by the president of Kyrgyz Republic on April 2 1993 as a state educational institution designed to provide training for specialists with basic and complete higher education in such areas as electronics, energy, construction, medicine, education, and also specialists for the agro-industrial complex. The opening of the State University in the city of Jalal-Abad was welcomed with great joy by the inhabitants of the region.\n" +
                "Lecture Halls and Seminar Room\n" +
                "Considering the premises as an entrance into a new world for our budding doctors, the institute manages well equipped lecture theatres with Wi-Fi & AV facilities including LCD projector etc. for a technology based learning experience.\n" +
                "Library\n" +
                "To give soul to the infrastructure, the institute maintained a well-stocked library with large number of books, magazines, titles, journals, research works along with facilities of E-Library.\n" +
                "Co-curricular Activities\n" +
                "In order to prepare students practically for future different activities like quizzes, debates, seminars, exhibitions, socio-cultural programs and events are organized on continual basis. Such exposures provide opportunities to students to work in team, to exercise leadership and to take initiatives themselves.\n");


        JALALABAD.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        JALALABAD.put("facilities", "•\tfood \n" +
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

        JSONObject temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "4,20,000");
        temp_obj6.put("column2", "3,48,000");
        temp_obj6.put("column3", "3,48,000");
        temp_obj6.put("column4", "3,48,000");
        temp_obj6.put("column5", "3,48,000");
        temp_obj6.put("column6", "3,48,000");
        temp_obj6.put("column7", "21,60,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        JALALABAD.put("fee", feeArray);

        JALALABAD.put("feedetails", " ");
        JALALABAD.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




/////////////////////////////////////////////////////
        JSONObject INTERNATIONAL = new JSONObject();

        INTERNATIONAL.put("country", "KYRGYZSTAN");

        INTERNATIONAL.put("name", "INTERNATIONAL SCHOOL OF MEDICINE");

        INTERNATIONAL.put("overview", "INTERNATIONAL SCHOOL OF MEDICINE\n" +
                "Overview - INTERNATIONAL SCHOOL OF MEDICINE was established in 2003\n" +
                "Google Rating -4.5 star\n" +
                "Address- Bishkek, Kyrgyzstan\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/jZUVtrGjdFM2\n");

        INTERNATIONAL.put("logo", R.drawable.international_logo);

        INTERNATIONAL.put("image", R.drawable.international_img);

        INTERNATIONAL.put("intoduction", "INTERNATIONAL SCHOOL OF MEDICINE, established in 2003, was made a part of the International University of Kyrgyzstan according to the Kyrgyz Republic’s Government resolution # 60 dated 05.02.2004 as a currently operating higher school of education. At present, the school has about 3000 students, mostly from Central and South Asia. Only citizens of foreign countries are trained in ISM: India, Pakistan, South Korea, USA, Afghanistan, Japan, Nepal, Bangladesh, Turkey, Great Britain, Russia, Ukraine and Syria. In this regard, the training is conducted in English. \n" +
                "The basic mission of the school is:\n" +
                "to train highly qualified specialists, conduct scientific research in medicine of the mountains, and provide health services to the people of the Kyrgyz Republic and neighboring countries. Training at ISM is conducted with the most up-to-date educational technologies used to ensure highly efficient training of doctors. ISM’s primary goal is to produce highly qualified doctors able to successfully work in any part of the globe.\n" +
                "Registration:\n" +
                "Currently, the International School of Medicine of IUK is a modern university with an extensive infrastructure, which trains students on a recognized educational program of international level.\n" +
                "The International School of Medicine of IUK is an official state educational institution with the license from Ministry of Education and Science of the Kyrgyz Republic for health education in General Medicine. Duration of studies is 5 years. (Official license No.LD 170000949).\n" +
                "The International School of Medicine is officially registered at:\n" +
                "    World Health Organization (WHO –http://www.who.int/hrh/wdms)\n" +
                "    Institute for International Medical Education (IIME – http://www.iime.org/database)\n" +
                "    Foundation for advancement of International Medical Education and Research (FAIMER – imed.faimer.org)\n" +
                "    Organisation for PhD education in Biomedicine and Health Sciences in the European System (ORPHEUS – http://www.orpheus-med.org)\n");


        INTERNATIONAL.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        INTERNATIONAL.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "5500");
        temp_obj2.put("column2", "5500");
        temp_obj2.put("column3", "5500");
        temp_obj2.put("column4", "5500");
        temp_obj2.put("column5", "5500");
        temp_obj2.put("column6", "5500");
        temp_obj2.put("column7", "33000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "3,30,000");
        temp_obj3.put("column2", "3,30,000");
        temp_obj3.put("column3", "3,30,000");
        temp_obj3.put("column4", "3,30,000");
        temp_obj3.put("column5", "3,30,000");
        temp_obj3.put("column6", "3,30,000");
        temp_obj3.put("column7", "19,80,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "72,000");
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
        temp_obj6.put("column1", "4,20,000");
        temp_obj6.put("column2", "3,48,000");
        temp_obj6.put("column3", "3,48,000");
        temp_obj6.put("column4", "3,48,000");
        temp_obj6.put("column5", "3,48,000");
        temp_obj6.put("column6", "3,48,000");
        temp_obj6.put("column7", "21,60,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        INTERNATIONAL.put("fee", feeArray);

        INTERNATIONAL.put("feedetails", " ");
        INTERNATIONAL.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




/////////////////////////////////////////////////////
        JSONObject OSH = new JSONObject();

        OSH.put("country", "KYRGYZSTAN");

        OSH.put("name", "OSH STATE UNIVERSITY");

        OSH.put("overview", "OSH STATE UNIVERSITY  was established in 1939\n" +
                "Google Rating -4.7 star\n" +
                "Address- 723500, 331 Lenin Avenue, Osh, Kyrgyzstan\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/EbE7fgVHE4p\n");

        OSH.put("logo", R.drawable.osh_logo);

        OSH.put("image", R.drawable.osh_img);

        OSH.put("intoduction", "Osh Pedagogical Institute (OMİ) (1939-1951).\n" +
                "\n" +
                "In 1939, in the south of Kyrgyzstan in order to overcome the lack of teachers in schools and pedagogical training institute for teachers in the city of Osh was opened. The Institute has a term of 2 years, history and philology. Physics, mathematics and natural sciences, geography, completed 10-month training courses in subject and pedagogical college graduates cannot accept.\n" +
                "\n" +
                "Osh State Pedagogical Institute (1951-1992).\n" +
                "\n" +
                "Education in this state, the basis of the various socio-economic and spiritual development is undeniable. May 24, 1951, in accordance with the resolution of the Council of Ministers of the USSR, June 26, 1951, in №511-193 / 1 Committee and the RSFSR Council of Ministers in accordance with the resolution of the two-year teachers' institute - the first university in southern Osh State Pedagogical Institute Address was created.\n" +
                "\n" +
                "1955-1956 academic year, the first graduates of the departments. To them, German, Russian, English language, mathematics, physics, chemistry, biology teacher diploma, specialty care.\n" +
                "\n" +
                "\"In 1957 the Council of Ministers of the Republic of Kirghizia, and some high-school education, the adoption of the resolution\" On improvement of the material base for OMPİ big event. For the basis of this resolution, in 1961, built a new pedinstitutunun Corps.\n" +
                "\n" +
                "Increasing year by year, the number of teachers from the school. 1970-1971 academic years, 269 teachers, PhDs has doubled. In all, 112 teachers from 16 ethnic nationalities.\n" +
                "\n" +
                "1975-1976 academic year, professors, faculty members and 324 people. Of them, 2 doctors, professors, 44 candidates of science, associate professors, 107 senior lecturers.\n" +
                "\n" +
                "At the end of the 1980s, the institute's faculty staff of 435 people, including 4 doctors, professors, 136 candidates of science, associate professors and senior lecturers, 295 instructors. At that time, chapter 26, 39 post-graduate training, their time, 134 home study course.\n" +
                "Osh State University (since 1992)\n" +
                "\n" +
                "South of the Kyrgyz Republic territory, to ensure the socio-economic and cultural development, and on June 17, 1992 by the Decree of the President of the Kyrgyz Republic Osh Osh State Pedagogical Institute and State University, and is talented, he served as rector of the Osh State Pedagogical Institute ryAntonova Osh State University Rector was appointed on this position he worked until 1998.\n" +
                "\n" +
                "Bronze rapid pace of development and the training of highly qualified specialists to meet the requirements of the labor market will be divided attention, and new departments: History and Law (1992), the Kyrgyz and Uzbek Philology (1992) and Medicine (1993), theology (1993), management and (1996), a legal business (1997).\n");


        OSH.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        OSH.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
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
        temp_obj3.put("column7", "16,20,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "72000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "18000");
        temp_obj5.put("column2", "18000");
        temp_obj5.put("column3", "18000");
        temp_obj5.put("column4", "18000");
        temp_obj5.put("column5", "18000");
        temp_obj5.put("column6", "18000");
        temp_obj5.put("column7", "1,08,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,60,000");
        temp_obj6.put("column2", "2,88,000");
        temp_obj6.put("column3", "2,88,000");
        temp_obj6.put("column4", "2,88,000");
        temp_obj6.put("column5", "2,88,000");
        temp_obj6.put("column6", "2,88,000");
        temp_obj6.put("column7", "18,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        OSH.put("fee", feeArray);

        OSH.put("feedetails", " ");
        OSH.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




/////////////////////////////////////////////////////
        JSONObject KYRGYZ = new JSONObject();

        KYRGYZ.put("country", "KYRGYZSTAN");

        KYRGYZ.put("name", "KYRGYZ STATE MEDICAL ACADEMY");

        KYRGYZ.put("overview", "KYRGYZ STATE MEDICAL ACADEMYwas established in 1930\n" +
                "Google Rating -4.7 star\n" +
                "Address- 92 Akhunbayev St, Bishkek, Kyrgyzstan\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/AsUTY6UYk652\n");

        KYRGYZ.put("logo", R.drawable.kyrgyz_logo);

        KYRGYZ.put("image", R.drawable.kyrgyz_img);

        KYRGYZ.put("intoduction", "On July 5, 1996 by the Decree of the President of the Kyrgyz Republic the Kyrgyz State Medical Institute was transformed into the Kyrgyz State Medical Academy. In the Institute organization invaluable assistance showed the 1st Moscow, Leningrad, Almaty, Tashkent and other medical institutes. They rendered advisory and organizational assistance, provided with medical literature and directed pedagogical cadres for permanent job at institute. There were organized chairs of CPSU history and political economy, normal anatomy, biology, histology, general chemistry, physics, foreign languages and others for which worked 16 teachers. During the Great Patriotic War to Kyrgyzstan were evacuated the 2nd Kharkov medical and stomatologic institute and the Moscow stomatologic institute which joined KSMI. Burdens of a wartime complicated institute work. Training terms were reduced till 4-4,5 years.\n" +
                "In 1943 took place the first graduation of students of our institute in a number of 120 people, and totally at this year were graduated 250 doctors. After the end of war since 1948 began transition to 6 – year term of training. On the 2nd course were entered the state end-of-year examinations in anatomy, histology, physiology and biochemistry.\n" +
                " In the 50s enrollment of students increased and began transition to profile preparation of doctors. In the 60s at the Institute was entered the programmed control of knowledge with use of technical means. Were developed scientific bases of studying of disciplines: educational elements, levels of their assimilation, graphological structures, etc.\n" +
                "In the 70s in the solution of problems of physiology, pathology, adaptation of an organism to mountain conditions the medical institute becomes the leader in the USSR. Communications with scientific Institutes of the Soviet republics were developed on qualitatively new basis: were formed agreements on creative cooperation with many scientific research institutes and country’s higher education institutions. On republican research bases and laboratories under the leadership of scientists of our institute were carried out joint scientific expeditions.\n" +
                "In the 80s educational, methodical and research process is considerably improved. KSMI on problems of studying of mountain medicine comes to the international scene that promoted strengthening of integration scientific communications. In connection with structural changes in 1996 by the Decree of the President of the Kyrgyz Republic the Institute is reorganized into the Kyrgyz State Medical Academy. The rectorate carries out measures for academy transition to conditions of market economy. There is a contract system of training. There is a modernization of educational, methodical and scientific research process.\n" +
                " Since 2000 in KSMA begun introduction of the new training programs adapted for the international standards. Now in KSMA there are medical, pediatric, stomatologic faculties, faculty on training of foreign citizens and Institute of the pharmacy, higher nursing education, management and public health care, medical school. Besides, the Institute of post-graduate training of KSMA, Research institute of fundamental problems of medicine and biology and the Center of the International cooperation are functioning. The academy prepares doctors for the countries of far and near abroad; training is conducted in Russian and English languages.\n");


        KYRGYZ.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        KYRGYZ.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
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
        temp_obj3.put("column7", "16,20,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "72000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "18000");
        temp_obj5.put("column2", "18000");
        temp_obj5.put("column3", "18000");
        temp_obj5.put("column4", "18000");
        temp_obj5.put("column5", "18000");
        temp_obj5.put("column6", "18000");
        temp_obj5.put("column7", "1,08,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,60,000");
        temp_obj6.put("column2", "2,88,000");
        temp_obj6.put("column3", "2,88,000");
        temp_obj6.put("column4", "2,88,000");
        temp_obj6.put("column5", "2,88,000");
        temp_obj6.put("column6", "2,88,000");
        temp_obj6.put("column7", "18,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        KYRGYZ.put("fee", feeArray);

        KYRGYZ.put("feedetails", " ");
        KYRGYZ.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");





     JSONArray allColleges = new JSONArray();
     allColleges.put(JALALABAD);
     allColleges.put(INTERNATIONAL);
     allColleges.put(OSH);
     allColleges.put(KYRGYZ);

     return allColleges.getJSONObject(varCollegeName);
    }
}
