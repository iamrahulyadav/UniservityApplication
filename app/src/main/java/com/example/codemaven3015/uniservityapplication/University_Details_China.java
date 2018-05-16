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

        HUBEI.put("logo", R.drawable.hubei_logo);

        HUBEI.put("image", R.drawable.hubei_img);

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

        JILIN.put("logo", R.drawable.jilin_logo);

        JILIN.put("image", R.drawable.jilin_img);

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

        KUNMING.put("logo", R.drawable.kunming_logo);

        KUNMING.put("image", R.drawable.kunming_img);

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

        JIUJIANG.put("logo", R.drawable.jiujiang_logo);

        JIUJIANG.put("image", R.drawable.jiujiang_img);

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

        YUNNAN.put("logo", R.drawable.yunnan_logo);

        YUNNAN.put("image", R.drawable.yunnan_img);

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

        BEIHUA.put("logo", R.drawable.beihua_logo);

        BEIHUA.put("image", R.drawable.beihua_img);

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
        JSONObject CAPITAL = new JSONObject();

        CAPITAL.put("country", "China");

        CAPITAL.put("name", "CAPITAL MEDICAL UNIVERSITY");

        CAPITAL.put("overview", "CAPITAL MEDICAL UNIVERSITYwas established in 1999\n" +
                "Google Rating -5 star\n" +
                "Address- China, Beijing Shi, Fengtai Qu 100054\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/GbyrqQ63R872\n");

        CAPITAL.put("logo", R.drawable.capital_logo);

        CAPITAL.put("image", R.drawable.capital_img);

        CAPITAL.put("intoduction", "Capital Medical University (CMU) formerly known as Beijing second medical college was founded in 1960. It ranks among the top academic medical institutions in China and is one of the key municipal universities in Beijing. Professor Wu Jieping, the founding president of the university, was a world famous urologist as well as a member of the Chinese Academy of Sciences and the Chinese Academy of Engineering. Today, six members of teaching staff are members of these prestigious academies, enhancing the university’s domestic reputation further.\n" +
                "CCMU consists of 10 Schools, 14 affiliated hospitals and 1 teaching institution. The university has over 9,000 enrolled students. CMU provides a wide range of educational programs in English language for Doctorates, Masters, Bachelors and certificates.\n" +
                "CMU is a well-known academic institution for its strong capacity in scientific research. It hosts many key national and municipal disciplines, laboratories and exchange stations for post-doctoral research. High-caliber national and municipal research and training centers and institutes are founded here, covering a wide range of fields including General Practitioner Training, Clinical Medicine, Basic Medicine, Neurosciences, Ophthalmology, Geriatrics, Urology, Cardiology, Pain Medicine, Toxicology, Biomedical Engineering, Traditional Chinese Medicine, Reproduction, Health Policy, etc.\n" +
                "University has achieved national and international recognitions in many areas such as Neurobiology, Cytobiology, Immunology, Medical Iconography, Neurology, Neurosurgery, Cardiology, Cardiac-vascular Surgery, Kidney Transplantation, Respiratory Disease, Digestive Medicine, Oral-Maxillofacial Surgery, Ophthalmology, Otolaryngology and PaediatricHaematology, among others.\n" +
                "Studying in Beijing-\n" +
                "Beijing is home to a great number of colleges and universities, including several well-regarded universities of international stature. Many international students from Japan, Korea, North America, Europe, Southeast Asia, and elsewhere come to Beijing to study every year. Living in Beijing, part of your daily commute to class might involve seeing some of the opulent palaces, pagodas, temples, iconic landmarks, tombs and gardens.\n" +
                "Beijing is certainly not a destination for those looking for a ‘small-town’ feel. But if you like the idea of studying in a city with strong international career opportunities, while keeping a finger to the pulse of one of the world’s fastest-developing countries, then this dynamic metropolis at the centre of the world’s most populous nation could be for you.\n" +
                "CMU is made up of six campuses located throughout the capital. The Main Campus and the CCMU International Campus both are located in Fengtai District, whiles Shunyi Campus in Shunyi District, Wanshoulu Campus in Haidian District, Hepingli Campus in Dongcheng District, and Dongsishitiao Campus in Dongcheng District. International students study and live mainly on the CCMU International Campus.\n" +
                "University campuses are within easy reach by public transportation and it consists of Library, International and Local Restaurants, Student Dining Hall, Tennis Courts, Soccer Fields, Gymnasium, Indoor Basketball Courts, Outdoor Basketball Courts and Indoor Swimming Pool.\n");


        CAPITAL.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        CAPITAL.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "39000");
        temp_obj2.put("column2", "39000");
        temp_obj2.put("column3", "39000");
        temp_obj2.put("column4", "39000");
        temp_obj2.put("column5", "39000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "1,95,000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "3,90,000");
        temp_obj3.put("column2", "3,90,000");
        temp_obj3.put("column3", "3,90,000");
        temp_obj3.put("column4", "3,90,000");
        temp_obj3.put("column5", "3,90,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "19,50,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "1,80,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "1,10,000");
        temp_obj5.put("column2", "1,10,000");
        temp_obj5.put("column3", "1,10,000");
        temp_obj5.put("column4", "1,10,000");
        temp_obj5.put("column5", "1,10,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "5,50,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "6,80,000");
        temp_obj6.put("column2", "5,00,000");
        temp_obj6.put("column3", "5,00,000");
        temp_obj6.put("column4", "5,00,000");
        temp_obj6.put("column5", "5,00,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "26,80,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        CAPITAL.put("fee", feeArray);

        CAPITAL.put("feedetails", " ");
        CAPITAL.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////////
        JSONObject USC = new JSONObject();

        USC.put("country", "China");

        USC.put("name", "UNIVERSITY OF SOUTH CHINA (USC)");

        USC.put("overview", "UNIVERSITY OF SOUTH CHINA (USC)was established in 1958\n" +
                "Google Rating -5 star\n" +
                "Address- China, Hunan Sheng, Hengyang Shi, Zhengxiang Qu, 28 Changsheng West Road\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/T2EwbScQ6Zk\n");

        USC.put("logo", R.drawable.usc_logo);

        USC.put("image", R.drawable.usc_img);

        USC.put("intoduction", "University of South China (hereafter USC or the University), is a comprehensive public university with a history of about 60 years, co-funded by Ministry of Industry and Information Technology, State Administration of Science, Technology and Industry for National Defense, China National Nuclear Corporation, China Nuclear Engineering Group Corporation, and the People’s Government of Hunan Province.\n" +
                "The University was merged in 2000 by Hengyang Medical College, founded in 1958 and administrated by Hunan Province, Central South Institute of Technology, in 1959, and the 6th Nuclear Institute, in 1962, both administrated by the former Ministry of Nuclear Industry.\n" +
                " One of the yiben, or first tier universities on the Mainland, China, USC enrolls students from the Mainland, Hongkong, Macao, Taiwan and other parts of the world. \n" +
                "The University is home to over 2,500 faculty members, and over 37,000 full-time students, of whom 33,000 are undergraduates and 4000, master or doctor degree candidates.\n" +
                "Situated in Hengyang, a historical and cultural city in central Hunan, China, with a total area of 200 hectares, USC comprises 26 colleges and schools, 4 affiliated hospitals and 21 teaching hospitals.\n" +
                "USC is a chartered training base for Reserve Naval Officers of the People’s Liberation Army. \n" +
                "Motto:    morals, knowledge, truth, and ambition\n" +
                "Vision: To become an education and research oriented institution with distinctive features--top-notch in the province, high-ranked in the country and well-known in the world.\n");


        USC.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        USC.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "16000");
        temp_obj2.put("column2", "16000");
        temp_obj2.put("column3", "16000");
        temp_obj2.put("column4", "16000");
        temp_obj2.put("column5", "16000");
        temp_obj2.put("column6", "16000");
        temp_obj2.put("column7", "80,000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "1,60,000");
        temp_obj3.put("column2", "1,60,000");
        temp_obj3.put("column3", "1,60,000");
        temp_obj3.put("column4", "1,60,000");
        temp_obj3.put("column5", "1,60,000");
        temp_obj3.put("column6", "1,60,000");
        temp_obj3.put("column7", "80,00,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "1,50,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "30,000");
        temp_obj5.put("column2", "30,000");
        temp_obj5.put("column3", "30,000");
        temp_obj5.put("column4", "30,000");
        temp_obj5.put("column5", "30,000");
        temp_obj5.put("column6", "30,000");
        temp_obj5.put("column7", "1,50,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,40,000");
        temp_obj6.put("column2", "1,90,000");
        temp_obj6.put("column3", "1,90,000");
        temp_obj6.put("column4", "1,90,000");
        temp_obj6.put("column5", "1,90,000");
        temp_obj6.put("column6", "1,90,000");
        temp_obj6.put("column7", "11,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        USC.put("fee", feeArray);

        USC.put("feedetails", " ");
        USC.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject CHINA_Medical = new JSONObject();

        CHINA_Medical.put("country", "China");

        CHINA_Medical.put("name", "CHINA MEDICAL UNIVERSITY");

        CHINA_Medical.put("overview", "UNIVERSITY OF SOUTH CHINA (USC) was established in 1958\n" +
                "Google Rating -5 star\n" +
                "Address- 77 Puhe Rd, ShenbeiXinqu, Shenyang Shi, Liaoning Sheng, China\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/34a5gBekyz92\n");

        CHINA_Medical.put("logo", R.drawable.china_logo);

        CHINA_Medical.put("image", R.drawable.china_img);

        CHINA_Medical.put("intoduction", "China Medical University is located in Shenyang, Liaoning province. It was the first medical school established by the Chinese Communist Party. It was the only school that had finished the entire 12,500 kilometerLong Marchwhile persisted in running the school. It was also one of the earliest schools that delivered college education of western medicine in China.\n" +
                "\n" +
                "The predecessor of the university was the Military Medical School of the Chinese Workers’ and Peasants’ Red Army. It was founded in October of 1931with the approval of The Central Military Commission in Ruijin of Jiangxi province which was the birthplace of the Provisional Central Government of the Soviet Republic of China. It was the first medical school established by the Chinese Communist Party. He Cheng, Chief of the General Military Medical Department of the Central Military Commission held a concurrent post as the principal. The opening ceremony was held in Yudu, Jiangxi province on February 22nd, 1932. Comrade Mao Zedong formulated the principles of “firm in political belief, outstanding at technical skills” and Commander-in-chief Zhu De made a speech. In October 1932, the Central Military Commission approved to change the name of the school to the Health School of the Chinese Workers’ and Peasants’ Red Army. In October 1934, as part of the division directly subordinated to the Military Commission, the school left Ruijin to join the famous 12,500 kilometer Long March and carried outrescue works while persisting in running the school, which makes a record unparalleled in history in both the histories of Chinese Communist Party and medical education of people’s army. \n" +
                "\n" +
                " In December 1935, the school arrived at the north of Shaanxi province and started running in Wayaobu. In January 1937, it moved to Yan’an and in August of the same year changed its name to the Health School of the Eighth Route Army. The school marched to the anti-Japanese front line with General Health Ministry. The faculty and students took active parts in the rescue work in Battle of Pingxingguan and Battle of Yangmingbu. In September 1940, proposed by Comrade Mao Zedong and approved by Central Committee of Chinese Communist Party, the school changed its name to China Medical University. In 1941, Comrade Mao Zedong wrote for the first graduates of China Medical University (14th graduates since the establishment of the school) the inscription “Heal the wounded, rescue the dying, and practice revolutionary humanitarianism.” This inscription has since become the action guide for CMU people and ultimately become the motto for all medical workers of the country. \n" +
                "\n" +
                "In November 1945, under the instructions of the Central Committee of Chinese Communist Party about establishing and consolidating northeastern revolutionary base, China Medical University pushed upwards to the Northeast from Yan’an. In July 1946, it arrived at Xingshan, Heilongjiang province(present Hegang city) and absorbed Northeast Military Medical University (former Harbin Army Medical School). In January 1947, it absorbed the Medical College of Northeast University and part of former Harbin Medical University and in 1948 it established four branch schools with the first and second branch schools later developed into present Harbin Medical University, the third branch moving back to university headquarter and the forth branch developed into present Chengde Medical College. \n" +
                "\n" +
                "In November 1948, the whole northeast of China was liberated and the university was ordered to move to Shenyang. It absorbed and took over the former national Shenyang Medical School (formerly known as the Manchuria Medical College established by the Japanese South Manchuria Railway in 1911) and the former private Liaoning Medical College (formerly known as Mukden Medical College, founded by the United Presbyterian Church of Scotland in 1883). In October 1952, according to the decision of the State Department of Education on the adjustment of departments, the school of pharmacy separated from the CMU and formed a new school as Northern-East pharmacy school (present Shenyang Pharmaceutical University). In August 1954, China Medical University was put under the administration of national Ministry of Health. In September 1956, China Medical University changed its name to Shenyang Medical College under the instructions of the State Council, but regained its name “ China Medical University” in January 1978. In 2000, the university started to be administrated jointly by Liaoning province and Ministry of Health of PRC; In December 2015, the university became a co-constructed university by Liaoning provincial government, National Health and Family Planning Commission and Ministry of Education.\n" +
                "China Medical University is now facing unprecedented development opportunities. The faculty and students will work together and dedicate themselves to striving to build a first-class national medical university with a worldwide reputation.\n");


        CHINA_Medical.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        CHINA_Medical.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "40000");
        temp_obj2.put("column2", "40000");
        temp_obj2.put("column3", "40000");
        temp_obj2.put("column4", "40000");
        temp_obj2.put("column5", "40000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "2,00,000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "4,00,000");
        temp_obj3.put("column2", "4,00,000");
        temp_obj3.put("column3", "4,00,000");
        temp_obj3.put("column4", "4,00,000");
        temp_obj3.put("column5", "4,00,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "20,00,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "2,80,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "75,000");
        temp_obj5.put("column2", "75,000");
        temp_obj5.put("column3", "75,000");
        temp_obj5.put("column4", "75,000");
        temp_obj5.put("column5", "75,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "3,78,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "7,55,000");
        temp_obj6.put("column2", "7,55,000");
        temp_obj6.put("column3", "7,55,000");
        temp_obj6.put("column4", "7,55,000");
        temp_obj6.put("column5", "7,55,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "26,55,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        CHINA_Medical.put("fee", feeArray);

        CHINA_Medical.put("feedetails", " ");
        CHINA_Medical.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject THREE = new JSONObject();

        THREE.put("country", "China");

        THREE.put("name", "CHINA THREE GORGES UNIVERSITY");

        THREE.put("overview", "CHINA THREE GORGES UNIVERSITYwas established in 2000\n" +
                "Google Rating -5 star\n" +
                "Address- 8 Daxue Rd, Xiling Qu, Yichang Shi, Hubei Sheng, China, 443003\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/naUwvDvBvqG2\n");

        THREE.put("logo", R.drawable.three_logo);

        THREE.put("image", R.drawable.three_img);

        THREE.put("intoduction", "Having been approved by the Ministry of Education, CTGU was founded in June 29, 2000, comprising the former Wuhan University of Hydraulic and Electric Engineering/Yichang and the former Hubei Sanxia College. The history of CTGU can be dated back to 1946, while the bachelor education started from 1978, and the postgraduate and international student education began from 1996. CTGU has the qualification to confer the degrees of bachelor, master and doctor, and to recruit international students of CSC scholarship and membership of UNAI. Moreover, the Ministry of Water Resources and the People’s Government of Hubei Province signed agreements in 2009 to build CTGU in joint effort. Beside, CTGU was awarded with “Advanced unit of opening up” by Hubei Provincial government in 2010; and was awarded with “Demonstration base of international student education”in 2014. By now, China Three Gorges University has become an comprehensive university with characteristic features of prominent discipline advantage, hydropower resources and great social reputation.  \n" +
                "\n" +
                "CTGU consists of 30 colleges, 72 undergraduate programs covering nine fields including science, engineering, medicine, arts, economics, management, law, education and fine arts. There are 5 national-level characteristic disciplines for undergraduates; 10 provincial-level branded disciplines for undergraduates; 7 disciplines selected as the instalment of “A plan for Educating and Training Outstanding Engineers” by the Ministry of Education, 10 disciplines taught in English; and 2 Chinese-foreign cooperative education programs; 2 primary discipline doctoral programs, 22primary discipline programs for graduate students, 184secondary discipline programs for graduate students, 17 professional program for graduate students (Engineering, MBA, MTI etc.) and 11 provincial key disciplines. CTGU has a large number of enrolled students, comprising more than 22,730 full-time undergraduate students, 4,131 postgraduate students and 1288 international students.\n" +
                "CTGU has 2 national level experimental teaching demonstration center; 2 national level Engineering practice education centers; 1 national wild scientific observation research station of landslide in the Three Gorges area, Hubei Province, 1 key laboratory of the Ministry of Education in the Three Gorges reservoir area, 1 engineering technology research center of the Ministry of Education in geological disaster of the Three Gorges reservoir area, 1 ecology and environment engineering technology center of the Ministry of Education in the  Three Gorges reservoir area, 1 collaborative innovation center with the joint effort from Hubei Provincial government in geological disaster and eco-environment of the Three Gorges reservoir area, 5 provincial and ministerial-level key laboratories on disaster prevention and reduction, construction and management of hydraulic project, design and maintenance of mechanical equipment, research and utilization of natural product, etc., 2 former key laboratories of State Power Corporation on hydropower station simulation and geotechnical study, 18 teaching experiment(training) centers, including 169 functional laboratories, 8 provincial-level teaching experiment demonstration centers, and over 160 practical training centers and cooperative bases between education and production.\n");


        THREE.put("Eligibility", "The student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        THREE.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "24000");
        temp_obj2.put("column2", "24000");
        temp_obj2.put("column3", "24000");
        temp_obj2.put("column4", "24000");
        temp_obj2.put("column5", "24000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "2,00,000");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,40,000");
        temp_obj3.put("column2", "2,40,000");
        temp_obj3.put("column3", "2,40,000");
        temp_obj3.put("column4", "2,40,000");
        temp_obj3.put("column5", "2,40,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "12,00,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "2,80,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "48,000");
        temp_obj5.put("column2", "48,000");
        temp_obj5.put("column3", "48,000");
        temp_obj5.put("column4", "48,000");
        temp_obj5.put("column5", "48,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "2,40,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "5,68,000");
        temp_obj6.put("column2", "2,88,000");
        temp_obj6.put("column3", "2,88,000");
        temp_obj6.put("column4", "2,88,000");
        temp_obj6.put("column5", "2,88,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "17,20,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        THREE.put("fee", feeArray);

        THREE.put("feedetails", " ");
        THREE.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        JSONArray allColleges = new JSONArray();
        allColleges.put(HUBEI);
        allColleges.put(JILIN);
        allColleges.put(KUNMING);
        allColleges.put(JIUJIANG);
        allColleges.put(YUNNAN);
        allColleges.put(BEIHUA);
        allColleges.put(CAPITAL);
        allColleges.put(USC);
        allColleges.put(CHINA_Medical);
        allColleges.put(THREE);

        return allColleges.getJSONObject(varCollegeName);
    }
}
