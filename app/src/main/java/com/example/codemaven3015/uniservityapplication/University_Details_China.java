package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class University_Details_China
{
    private final int varCollegeName;

    public University_Details_China(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException
    {
        /////////////////////////////////////////////////////
        JSONObject HUBEI = new JSONObject();

        HUBEI.put("country", "China");

        HUBEI.put("name", "HUBEI UNIVERSITY OF MEDICINE");

        HUBEI.put("overview", "HUBEI UNIVERSITY OF MEDICINE was established in 1965\n" +
                "Google Rating -5 star\n" +
                "Address- China, Hubei Sheng, Shiyan Shi, Maojian Qu, Renmin Middle Rd, Renminnan Rd 30 Postal Code: 442000\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/ad7qpXFi7Wv\n");

        HUBEI.put("logo", R.drawable.kirov_logo);

        HUBEI.put("image", R.drawable.kirov);

        HUBEI.put("intoduction", "Introduction- Hubei University of Medicine (HUM) was founded as Wuhan Medical College, Yunyang School in November 1965 and renamed Tongji Medical University, Yunyang Medical College in 1986. In 1994, HUM was independently instituted as Yunyang Medical College under the Approval of the State Education Commission. In 1996, Yunyang Medical College passed the National Undergraduate Teaching Quality Assessment (TQA) an accreditation organized by the State Education Commission. In 2006 Yunyang Medical College was evaluated as “Excellent” in the TQA conducted by the Ministry of Education. In 2010, Yunyang Medical College was renamed Hubei University of Medicine under the approval of Hubei Provincial Government and the Ministry of Education. In 2012, HUM was authorized by the State Council to be qualified of granting Master’s Degrees as well as to enroll international students. After 50 years development, HUM is becoming the premier medical university located in the joint area of central China and west China, the adjacent area of Hubei, Chongqing, Shanxi and Henan province, where the population is around 26,000,000.\n" +
                "HUM’s campus covers 1,175,400 square meters, of which 390,000 square meters are for teaching and administration. The fixed assets amount to 2.683 billion RMB, with the teaching and research facilities making up 455 million RMB in assets. The HUM library has a collection of 840,000 volumes. The campus network is the only node for the China Education and Research network (CERNET) in the northwest of Hubei Province.\n" +
                "HUM has 908 full-time faculty, of which 180 are professors and 277 associate professors. The HUM staff holds 714 post-bachelorette degrees. HUM has 3 Experts of Provincial “100 Scientific and Technological Talents Plan”, 1 researcher from the Provincial “111 Project”, 11 Chutian Scholars, 36 experts with the State Council or the Provincial Government Special Allowance, 45 experts with the title of Provincial or Municipal Outstanding Contributor, and 68 Provincial or Municipal Research Leaders. The University has appointed over 70 distinguished scholars and experts as Honorary Professors, Visiting Professors, Special Professors or Chief Research Leaders, including Mr. Ferid Murad (Nobel laureate and member of the U.S. National Academy of Sciences) and Academician Mr. Qian Xue.\n" +
                "HUM’s enrollment includes 15,000 full-time students. HUM has the authority to grant Bachelor’s Degrees in medicine, engineering, management and science. There are currently 12 programs for undergraduates including Clinical Medicine, Nursing, Pharmacy, and Anesthesiology. Anesthesiology and Nursing majors are National Distinction Majors under implementation and Hubei Provincial Brand Majors. Dentistry, Pharmacy and Clinical Medicine are Hubei Provincial Distinction Majors. The five affiliated hospitals are the highest Level Three hospitals in the country, with 6 million out-patients and 300,000 in-patients annually.\n");


        HUBEI.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        HUBEI.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        JSONArray feeArray = new JSONArray();
        JSONObject temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "15000");
        temp_obj2.put("column2", "15000");
        temp_obj2.put("column3", "15000");
        temp_obj2.put("column4", "15000");
        temp_obj2.put("column5", "15000");
        temp_obj2.put("column6", "15000");
        temp_obj2.put("column7", "75000");

        JSONObject temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "1,50,000");
        temp_obj3.put("column2", "1,50,000");
        temp_obj3.put("column3", "1,50,000");
        temp_obj3.put("column4", "1,50,000");
        temp_obj3.put("column5", "1,50,000");
        temp_obj3.put("column6", "1,50,000");
        temp_obj3.put("column7", "7,50,000");

        JSONObject temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "1,50,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        JSONObject temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "70,000");
        temp_obj5.put("column2", "70,000");
        temp_obj5.put("column3", "70,000");
        temp_obj5.put("column4", "70,000");
        temp_obj5.put("column5", "70,000");
        temp_obj5.put("column6", "70,000");
        temp_obj5.put("column7", "3,50,000");

        JSONObject temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,70,000");
        temp_obj6.put("column2", "3,70,000");
        temp_obj6.put("column3", "3,70,000");
        temp_obj6.put("column4", "3,70,000");
        temp_obj6.put("column5", "3,70,000");
        temp_obj6.put("column6", "3,70,000");
        temp_obj6.put("column7", "12,50,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        HUBEI.put("fee", feeArray);

        HUBEI.put("feedetails", " ");
        HUBEI.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject JILIN = new JSONObject();

        JILIN.put("country", "China");

        JILIN.put("name", "JILIN MEDICAL UNIVERSITY");

        JILIN.put("overview", "JILIN MEDICAL UNIVERSITYwas established in 1946\n" +
                "Google Rating -4 star\n" +
                "Address- Guilin Road, Chaoyang, Changchun, China, 130021\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/9NoUWAvEo8p\n");

        JILIN.put("logo", R.drawable.kirov_logo);

        JILIN.put("image", R.drawable.kirov);

        JILIN.put("intoduction", "JILIN MEDICAL UNIVERSITYwas established in 1946\n" +
                "Google Rating -4 star\n" +
                "Address- Guilin Road, Chaoyang, Changchun, China, 130021\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/9NoUWAvEo8p\n");


        JILIN.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        JILIN.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "15000");
        temp_obj2.put("column2", "15000");
        temp_obj2.put("column3", "15000");
        temp_obj2.put("column4", "15000");
        temp_obj2.put("column5", "15000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "15000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "1,50,000");
        temp_obj3.put("column2", "1,50,000");
        temp_obj3.put("column3", "1,50,000");
        temp_obj3.put("column4", "1,50,000");
        temp_obj3.put("column5", "1,50,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "7,50,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "1,20,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "36,000");
        temp_obj5.put("column2", "35,000");
        temp_obj5.put("column3", "35,000");
        temp_obj5.put("column4", "35,000");
        temp_obj5.put("column5", "35,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "1,75,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,05,000");
        temp_obj6.put("column2", "1,85,000");
        temp_obj6.put("column3", "1,85,000");
        temp_obj6.put("column4", "1,85,000");
        temp_obj6.put("column5", "1,85,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "10,45,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        JILIN.put("fee", feeArray);

        JILIN.put("feedetails", " ");
        JILIN.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject KUNMING = new JSONObject();

        KUNMING.put("country", "China");

        KUNMING.put("name", "KUNMING MEDICAL UNIVERSITY");

        KUNMING.put("overview", "KUNMING MEDICAL UNIVERSITY was established in 1933\n" +
                "Google Rating -3.5 star\n" +
                "Address- 191 Renmin W Rd, Xishan Qu, Kunming Shi, Yunnan Sheng, China, 650221\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/ieABnxqkExp \n");

        KUNMING.put("logo", R.drawable.kirov_logo);

        KUNMING.put("image", R.drawable.kirov);

        KUNMING.put("intoduction", "In 1933, Donglu University initiated a specialized associate program in medicine and this has ever since evolved and grown into Kunming Medical University (KMU) of today. \n" +
                "\n" +
                "\n" +
                "In 1937, the program was expanded and became known as the School of Medicine of Yunnan University, formerly known as Donglu University. In 1956, the School became an independent medical education institution, known as Kunming Medical College ever since. In 1993, Kunming Medical College was listed among the six keys higher education institutions in the province. Since its inception, Kunming Medical University had over 80,000 graduates, and it has established itself as the largest specialized medical university in Yunnan and led the way in medical education, scientific research and medical services.  \n" +
                "Campus- \n" +
                "The university campus occupies 109 hectares. It has over 15,000 students, of which more than 2,000 are postgraduate students. The university has 6,750 staff and faculties, and over 1,450 are professors and associate professors.  \n" +
                "KMU has 17 schools, offering 4 disciplines in medicine, science, management and social science，17 Bachelor's Degree programs, 42 Master's Degree programs, and 1 Doctor's Degree program (including 17 fields). It has 7 research institutes, 11 affiliated hospitals, 9 teaching hospitals, 38practice hospitals, 9 forensic medicine sites, 6 preventive medicine practice sites, 4 pharmaceutical practice sites, and 2 optical practice sites. All of these provide KMU students with a stable learning and practicing network and environment.  \n" +
                "With a collection of nearly 1,413,500 paper books and 9 digital databases with medical literature in English, the university library has been designated as a part of Yunnan's Central Sharing Library Network of National Literature. It is also a First-class Repository for Chinese Medical and Academic Literature. KMU is a National Trial Center of Clinical Medicine, and Yunnan Provincial Expert Testimony Center.  \n" +
                "The 11 affiliated hospitals of Kunming Medical University have more than 10,000 patient beds. Eight of them are accredited as being Level-A Tertiary Hospitals of China. The other three affiliated hospitals are specialized at oncology, child’s diseases and stomatology.  \n" +
                "International Exchange -\n" +
                "Kunming Medical University has made remarkable achievements in the area of international exchange and cooperation. It has launched inter-institutional academic partnerships and exchange programs with medical schools and institutions in more than 30 countries worldwide, such as France, the U.S.A, Germany, Australia, Japan, Singapore and Thailand et al.  \n" +
                "Since 1998, KMU has enrolled and trained postgraduate students, undergraduate students, advanced medical students and Chinese language students from 27 countries and regions, such as USA, the UK, France, Japan, Germany, India, Hong Kong, Macao and Taiwan. \n");


        KUNMING.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        KUNMING.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "23000");
        temp_obj2.put("column2", "23000");
        temp_obj2.put("column3", "23000");
        temp_obj2.put("column4", "23000");
        temp_obj2.put("column5", "23000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "1,15,000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,30,000");
        temp_obj3.put("column2", "2,30,000");
        temp_obj3.put("column3", "2,30,000");
        temp_obj3.put("column4", "2,30,000");
        temp_obj3.put("column5", "2,30,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "11,50,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "1,00,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "50,000");
        temp_obj5.put("column2", "50,000");
        temp_obj5.put("column3", "50,000");
        temp_obj5.put("column4", "50,000");
        temp_obj5.put("column5", "50,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "2,50,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,80,000");
        temp_obj6.put("column2", "2,80,000");
        temp_obj6.put("column3", "2,80,000");
        temp_obj6.put("column4", "2,80,000");
        temp_obj6.put("column5", "2,80,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "15,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        KUNMING.put("fee", feeArray);

        KUNMING.put("feedetails", " ");
        KUNMING.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject JIUJIANG = new JSONObject();

        JIUJIANG.put("country", "China");

        JIUJIANG.put("name", "JIUJIANG UNIVERSITY");

        JIUJIANG.put("overview", "JIUJIANG UNIVERSITY was established in 1901\n" +
                "Google Rating -3.5 star\n" +
                "Address- 17 Lufeng Rd, Xunyang Qu, Jiujiang Shi, Jiangxi Sheng, China, 332000.\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/LtghNcZCmHA2\n");

        JIUJIANG.put("logo", R.drawable.kirov_logo);

        JIUJIANG.put("image", R.drawable.kirov);

        JIUJIANG.put("intoduction", "Jiujiang University is a comprehensive public university authorized by the Chinese Ministry of Education, enrolling students from 30 provinces of China with many different backgrounds. Its history can be traced back to 1901 when it existed as Danforth Hospital Nursing School.\n" +
                "\n" +
                "Jiujiang University is located in Jiujiang City, Jiangxi Province of the People’s Republic of China. Its advantageous location with profound history and culture provides Jiujiang University with a rich cultural and academic atmosphere.\n" +
                "\n" +
                "Jiujiang University has four beautiful campuses covering an area of about 184 hectares with a total space of buildings being 780,000 square meters. There are over 30,000 full-time Chinese students, 100 foreign students, 1683 full-time teachers, 21 faculties or colleges offering a total of 159 programs and a library collecting over 2.46 million books.\n" +
                "\n" +
                "Jiujiang University is one of the 25 Chinese Language Education Centres approved by Office of Overseas Chinese Affairs under the State Council of P. R. China. Jiujiang University has been entitled to enrolling overseas students and established collaborative relationship with universities of more than 10 countries around the world.\n");


        JIUJIANG.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        JIUJIANG.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "15000");
        temp_obj2.put("column2", "15000");
        temp_obj2.put("column3", "15000");
        temp_obj2.put("column4", "15000");
        temp_obj2.put("column5", "15000");
        temp_obj2.put("column6", "15000");
        temp_obj2.put("column7", "75,000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "1,50,000");
        temp_obj3.put("column2", "1,50,000");
        temp_obj3.put("column3", "1,50,000");
        temp_obj3.put("column4", "1,50,000");
        temp_obj3.put("column5", "1,50,000");
        temp_obj3.put("column6", "1,50,000");
        temp_obj3.put("column7", "7,50,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "1,50,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "50,000");
        temp_obj5.put("column2", "50,000");
        temp_obj5.put("column3", "50,000");
        temp_obj5.put("column4", "50,000");
        temp_obj5.put("column5", "50,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "2,50,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,40,000");
        temp_obj6.put("column2", "2,00,000");
        temp_obj6.put("column3", "2,00,000");
        temp_obj6.put("column4", "2,00,000");
        temp_obj6.put("column5", "2,00,000");
        temp_obj6.put("column6", "2,00,000");
        temp_obj6.put("column7", "11,50,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        JIUJIANG.put("fee", feeArray);

        JIUJIANG.put("feedetails", " ");
        JIUJIANG.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject YUNNAN = new JSONObject();

        YUNNAN.put("country", "China");

        YUNNAN.put("name", "YUNNAN UNIVERSITY");

        YUNNAN.put("overview", "YUNNAN UNIVERSITY was established in 1923\n" +
                "Google Rating -3.5 star\n" +
                "Address- 219 Wuyi Rd, Wuhua Qu, Kunming Shi, Yunnan Sheng, China, 650221\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/cEozYGtub1t\n");

        YUNNAN.put("logo", R.drawable.kirov_logo);

        YUNNAN.put("image", R.drawable.kirov);

        YUNNAN.put("intoduction", "Yunnan University, founded in 1923, is one of the oldest universities in China and was put into the world-known Concise Encyclopaedia Britannia as one of the fifteen internationally prestigious universities in China. Yunnan University has been developing rapidly by availing itself of “Project 211” (100 institutions of higher education and key disciplinary areas strengthened as a national priority for the 21st century) membership status. Yunnan University receives intensive support from the national government in teaching Chinese as a foreign language and was conferred as one of the ten key institutions that facilitate Chinese teaching in neighbouring countries under the guidance of the Office of Chinese Language Council International. The university is one of the few HSK (Chinese Proficiency Test) centers for all levels. The university attaches importance to enhancing the mutual understanding and friendship between the Chinese people and other peoples of the neighbouring countries, and promoting economic and trade cooperation as well as scientific, technological and cultural exchanges between them. College of International Students is a professional institution of Yunnan University where international students register to learn Chinese language and culture. It is responsible for teaching international students Chinese and offering them help.\n" +
                "College of International Students of Yunnan University has hosted more than 15,000 students and overseas Chinese teachers from some 30 countries. Currently, there are more than 30 full-time teachers in the college, among whom there are 4 senior professors, 6 associate professors. 4 of the staff hold doctorate degrees, while 10 hold master’s degrees. Most of the teachers have taught or studied in Spain, the United States of America, Australia, Italy, Japan and Thailand. The teachers are experienced in teaching Chinese as a foreign language and have saturated in diversified cultural contexts  College of International Students of Yunnan University boasts excellent teachers, fresh air, convenient entertainment and living facilities. With an international and diversified cultural environment, the college is the very place for international students to learn Chinese language and culture.\n");


        YUNNAN.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        YUNNAN.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "15000");
        temp_obj2.put("column2", "15000");
        temp_obj2.put("column3", "15000");
        temp_obj2.put("column4", "15000");
        temp_obj2.put("column5", "15000");
        temp_obj2.put("column6", "15000");
        temp_obj2.put("column7", "75,000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "1,50,000");
        temp_obj3.put("column2", "1,50,000");
        temp_obj3.put("column3", "1,50,000");
        temp_obj3.put("column4", "1,50,000");
        temp_obj3.put("column5", "1,50,000");
        temp_obj3.put("column6", "1,50,000");
        temp_obj3.put("column7", "7,50,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "1,50,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "50,000");
        temp_obj5.put("column2", "50,000");
        temp_obj5.put("column3", "50,000");
        temp_obj5.put("column4", "50,000");
        temp_obj5.put("column5", "50,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "2,50,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,40,000");
        temp_obj6.put("column2", "2,00,000");
        temp_obj6.put("column3", "2,00,000");
        temp_obj6.put("column4", "2,00,000");
        temp_obj6.put("column5", "2,00,000");
        temp_obj6.put("column6", "2,00,000");
        temp_obj6.put("column7", "11,50,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        YUNNAN.put("fee", feeArray);

        YUNNAN.put("feedetails", " ");
        YUNNAN.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////////
        JSONObject BEIHUA = new JSONObject();

        BEIHUA.put("country", "China");

        BEIHUA.put("name", "BEIHUA MEDICAL UNIVERSITY");

        BEIHUA.put("overview", "BEIHUA MEDICAL UNIVERSITY was established in 1999\n" +
                "Google Rating -2.5 star\n" +
                "Address- Fengman, Jilin, China\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/1ADkV5CcjpR2\n");

        BEIHUA.put("logo", R.drawable.kirov_logo);

        BEIHUA.put("image", R.drawable.kirov);

        BEIHUA.put("intoduction", "Beihua University is a province-owned comprehensive university whose scope is the most extensive one. Approved by the Ministry of Education, it was founded in 1999 by the combination of the original Jilin Teacher's college, Jilin Medical College, Jilin Forestry College and Jilin Electrification Academy. It is situated in the Rime Metropolis and Charming City --- Jilin.\n" +
                "　　 The university has four campuses: the south, the north, the east, and the west campus, which totally occupies an area of 1,263,700 square meters with a floor space up to 830,300square meters. The gross value of its equipments is 184,000,000 RMB. The total collection of the university library reaches 2,562,700 volumes. Currently, the University has the total enrollments of 22,100 students, including 18,803 undergraduate students. The University has 27 academic colleges (Law School, School of Education Science, College of Physical Education, School of Chinese Language and Culture, Foreign Languages' College, College of Music, College of Fine Arts, College of History and Culture, College of Mathematics, College of Physics, College of Chemistry and Biology, College of Mechanical Engineering, College of Electrical and Information Engineering, School of Computer science and Technology, College of Software, College of Transportation and Civil Engineering, College of Forestry, College of Basic Medicine, College of Public Health, No. 1 Clinical Medical College (Affiliated Hospital), College of Medical Test, College of Stomatology, College of Nursing, College of Pharmacy, School of Economic Management, College of Adults and Continuing Education and International Education and Exchange Institute), besides, 3 departments (centers) (College Foreign Languages’ Department, Educational Technology Center, Engineering Training Center), it offers 70 undergraduate specialties, containing 10 kinds of specialties (Economics, Law, Education, Literature, History, Science, Engineering, Agriculture, Medicine and Management); 38 Master's programs, 1 Professional Master’s program (of Medicine), containing 9 kinds of specialties, 21 courses of first class; 1 national Forestry key specialty (Forest Cultivation); 6 provincial key specialty ((Forest Cultivation, Clinical Test and Diagnosis, Special History, Medicine, Power Electronics and Electric Transmission, Curriculum and Teaching Theory); 1 provincial key lab ( Forest and Ecological Environment); 1 provincial key research base of Human Social Science (East Asia History and Culture Research Center); 1 provincial base for Post-Doctoral science research and innovative undertaking; 1 provincial demonstration center for college experiments and teaching( Basic Experiment and Teaching Center for Medical and Examination and Test ); 1 provincial key constructing experiment center (Engineering Training Center); it is the base of cultural quality education for national college students; which is the sole educational and training base of psychological health for provincial college students. " +
                "Among 1,559 faculties, there have been 212 professors, 539 associate professors, 1 provincial famous master, 1 provincial chief professor, 1 provincial key professor, 5 provincial fine young and middle-aged mainstays, 1 provincial advanced expert, 6 provincial young and middle-aged professional and technical personnel with outstanding contributions, 12 provincial top-notch innovative personnel, 30 winners of special State Council allowance, 11 famous masters of university, 65 pioneers of their courses and 97 fine young and middle-aged mainstays of the school, at the end of September, 2007.\n");


        BEIHUA.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        BEIHUA.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "21000");
        temp_obj2.put("column2", "21000");
        temp_obj2.put("column3", "21000");
        temp_obj2.put("column4", "21000");
        temp_obj2.put("column5", "21000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "1,50,000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,10,000");
        temp_obj3.put("column2", "2,10,000");
        temp_obj3.put("column3", "2,10,000");
        temp_obj3.put("column4", "2,10,000");
        temp_obj3.put("column5", "2,10,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "10,50,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "1,80,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "60,000");
        temp_obj5.put("column2", "60,000");
        temp_obj5.put("column3", "60,000");
        temp_obj5.put("column4", "60,000");
        temp_obj5.put("column5", "60,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "60,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "4,50,000");
        temp_obj6.put("column2", "2,70,000");
        temp_obj6.put("column3", "2,70,000");
        temp_obj6.put("column4", "2,70,000");
        temp_obj6.put("column5", "2,70,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "15,80,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        BEIHUA.put("fee", feeArray);

        BEIHUA.put("feedetails", " ");
        BEIHUA.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "CAPITAL MEDICAL UNIVERSITY");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject DHAKA = new JSONObject();

        obj.put("country", "China");

        obj.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        obj.put("overview", "");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "");


        obj.put("Eligibility", "");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "-");
        temp_obj5.put("column2", "-");
        temp_obj5.put("column3", "-");
        temp_obj5.put("column4", "-");
        temp_obj5.put("column5", "-");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "-");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        obj.put("fee", feeArray);

        obj.put("feedetails", " ");
        obj.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");







        return null;
    }
}
