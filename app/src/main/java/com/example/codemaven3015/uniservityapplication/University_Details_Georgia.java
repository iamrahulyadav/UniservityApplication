package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by DELL on 5/14/2018.
 */

public class University_Details_Georgia {

    private final int varCollegeName;

    public University_Details_Georgia(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException {


        /////////////////////////////////////////////////////////////

        JSONObject BATUNI = new JSONObject();
        BATUNI.put("country", "Georgia");
        BATUNI.put("name", "BATUNI SHOTA RUSTAVELI MEDICAL UNIVERSITY");
        BATUNI.put("overview", "BATUNI SHOTA RUSTAVELI MEDICAL UNIVERSITY was established in 1958\n" +
                "Google Rating -4.7 star\n" +
                "Address- 35/32 Ninoshvili/Rustaveli str., Batumi 6010, Georgia\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/dSnKPNUgj3M2\n");
        BATUNI.put("logo", R.drawable.batuni_logo);
        BATUNI.put("image", R.drawable.batuni_img);
        BATUNI.put("intoduction", "Batumi Shota Rustaveli State University is an important educational, scientific and cultural center of our country. It has a 80-year-long history.\n" +
                "\n" +
                "The establishment and development of the educational system in Adjara was a long-time endeavor of the Georgian community. In 1893 the issue was raised to open a Boys’ Gymnasium in Batumi. On 26-27 June, 1893 the Municipality of the city granted 2 623, 95 sq/m area of land for the Boys’ Gymnasium at the seaside. The project was designed by a military engineer Sedelnikov. The first floor of the building allocated a gym while the second floor contained the church, assembly hall, eight classrooms, art classroom, physics study-room, laboratory and a library. The Boys’ Gymnasium started functioning in July, 1897. On 26 September, 1900 it became possible to open a Women’s Gymnasium as well. Later, by 1923, a Pedagogical Institute was founded in the building of former Women’s Gymnasium (present Public School №2) which afterwards turned into a Pedagogical College. It used to prepare the first stage school teachers.\n" +
                "In the building of the Boys’ Gymnasium in 1935 a 2-year Teacher’s Institute was opened with 4 faculties: Georgian Language and Literature, Physics-Mathematics, History and Natural Sciences-Geography. To this the faculty of Physical Education was added in 1936 and a faculty of Russian Language and Literature – in 1938. In 1938 the Institute was named after Shota Rustaveli.\n" +
                "The first director of the Teachers’ Institute was KhuseinNakaidze. A significant assistance was rendered to the Institute in providing the scientific personnel by other higher educational institutions of Georgia, first and foremost – Tbilisi State University. The following outstanding representatives of the Georgian academia conducted fruitful activities within the walls of the Batumi Shota Rustaveli State University (that time Teachers’ Institute): Giorgi Akhvlediani, Giorgi Tsereteli, IaseTsintsadze, SargisKakabadze, Simon Kaukhchishvili, Giorgi Tavzishvili, RazhdenKhutsishvili, Dimitri Gedevanishvili, Giorgi Javakhishvili, VukolBeridze, Shota Dzidziguri and others. It is owing to them as well that the newly established higher institution soon gained the reputation – a system of teaching and research activities was formed and the preparation of local academic staff took its beginnings – by 1943 there were 5 candidates of sciences at the Institute already.\n" +
                "In July 1935 the preparatory courses were created that particularly fostered the attraction of high school applicants from Adjara highlands. According to the statistics 600 school leavers submitted applications to the Institute in the first year; 219 applicants were admitted to the Institute.\n" +
                "In June 1945 a Pedagogical Institute was founded on the basis of Batumi Teachers’ Institute that was followed by reconstruction process and improvement of the facilities and equipment. In 1956 the renovated building entered into exploitation. However, it was not sufficient for the growth of the Institute and in 1977 the construction of a new 5-storeyed building began that was finished in 1982.\n" +
                "The collapse of the Soviet Empire and Georgia’s fight for independence made it possible to realize the wish of great IvaneJavakhishvili who said: “If there is to be another university in Georgia, it should be in Batumi.”\n" +
                "Batumi Shota Rustaveli State University is oriented towards the demands of the society and the state. Its first and foremost mission is:\n" +
                "    To offer high quality education to all the interested individuals despite nationality, religion and political status;\n" +
                "    To educate highly-qualified, competitive and adaptive specialists to the changing professional environment, with the competences relevant to the modern requirements, who will be the free personalities with high civic understanding and activity, bearers of the principles of humanism, democracy and liberal values;\n" +
                "    To accomplish fundamental and applied research in natural sciences, humanities, social sciences, law, mathematics and computer technologies as well as in the branches of engineering and technology, business, public health and agriculture for the purpose of welfare of the population, economic strength, defense ability, establishment of democratic principles and raising spirituality.\n");


        BATUNI.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        BATUNI.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");
        JSONArray feeArray = new JSONArray();
        JSONObject temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "4500");
        temp_obj2.put("column6", "4500");
        temp_obj2.put("column7", "27000");
        JSONObject temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "2,70,000");
        temp_obj3.put("column6", "2,70,000");
        temp_obj3.put("column7", "16,20,000");
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
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "1,08,000");
        JSONObject temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "2,88,000");
        temp_obj6.put("column6", "2,88,000");
        temp_obj6.put("column7", "18,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        BATUNI.put("fee", feeArray);
        BATUNI.put("feedetails", " ");
        BATUNI.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");

        //////////////////////////////////////////////////////////////////////////////////

        JSONObject TBILISI = new JSONObject();
        TBILISI.put("country", "Georgia");
        TBILISI.put("name", "TBILISI STATE MEDICAL UNIVERSITY");
        TBILISI.put("overview", "TBILISI STATE MEDICAL UNIVERSITY was established in 1918\n" +
                "Google Rating -4.7 star\n" +
                "Address- 33 VazhaPshavela Ave, Tbilisi, Georgia\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/6Bg7wwgVnbm\n");
        TBILISI.put("logo", R.drawable.tabilisi_logo);
        TBILISI.put("image", R.drawable.tabilisi_img);
        TBILISI.put("intoduction", "The University was solemnly opened on 8th of February, 1918 (old style 26th of January), the day of remembrance of the Georgian King David the Builder. Since that, this day remains one of the most significant events in the history of the nation. \n" +
                "The founders of the Georgian University well understand the importance of introduction Higher Medical Education. The primary initiator of the university foundation, the reverend Professor IvaneJavakhishvili, had been speaking about the reasons of establishment of Medical Faculty “We still need to carry out research on the endemic flora and fauna in our country. Many human diseases have various characters and most are as yet unstudied. Consequently, scientific workers at our University’s Medical and Natural Sciences Faculties have a broad challenge area”.\n" +
                "The first Rector of University Professor PetreMelikishvili was an active supporter of medical faculty creation. On the meeting of “Georgian Physicians and Natural Sciences Society” (12th of October, 1917), he has expressed his opinion about the necessity of opening the medical and natural sciences faculty.\n" +
                "On February 27th, 1918, University Professors Faculty Council confirmed the exigency of creation of Medical Faculty. In June 17th, the same Council of Georgian doctors and Natural Scientists in the presence of the Chairman SpiridonVirsaladze decided to open Mathematics-Natural Sciences and Medical faculty.\n" +
                "\n" +
                "In June 10, 1930 the Tbilisi State University was reorganized and Tbilisi State Medical University was founded. This has become a powerful stimulus of development Higher Medical Education and Medical Sciences in Georgia.\n" +
                "Tbilisi State Medical University at the foundation consisted of three faculties: Medical- Preventive (including Division of Stomatology), Sanitary- Preventive and Pharmacochemistry.\n" +
                "During the 80 years long history of the University in different periods of time were founded and functioning the following faculties: Paediatrics (since 1931), Stomatology (since 1936), Military Medicine (since 1993), Medical-Biology (since1994), Psychosomatic medicine and Psychotherapy (since1996).\n" +
                "To date Tbilisi State Medical University has five faculties: Medicine, Stomatology, Pharmacy, Public health, Physical medicine and rehabilitation. Tbilisi State Medical University runs four Higher Education Programs: General Practice Nurse, Midwifery, Medical Devices Technician, and Pharmacy Technician.\n" +
                "The analysis of objective, sometimes revolutionary, political and ideological changes in the country and Society that took place in the decades of the 90’s of the last century, revealed that for the achievement of University goals the establishment of larger space is necessary. The newly acquired autonomy would have been merged with new University structure that was the way for transformation of Medical Institute into University and for that the preconditions were already existed. The Author of this objective and well founded request was Tbilisi State Medical University itself.\n" +
                "24th of November 1992 is the historic day for Higher Medical Education in Georgia. The new stage was launched by the transformation of Tbilisi State Medical Institute into Tbilisi State Medical University.\n" +
                "Tbilisi State Medical University from the very beginning found itself in the forefront of overcoming the XXI century challenges of reforming medical education. In 1997 University has already developed a strategy of outcome-oriented teaching methodology implementation. The strategy has been developed on the bases of European experts recommendations. After all, University is a member of the Association of Medical European Education (AMEE), also a member of the World Federation for Medical Education (WFME) and cofounder of the East–European Association of Medical Education (EEAME). University is not only the executor of legislative and recommendatory regulations of these International Organizations, but also participated in the recommendations systematization process.\n" +
                "According to above mentioned experts modern, competitive International Medical education considers the following main points: Critical thinking, Information management and Comunicative skills. These are the basis for development of basic sciences and public health, professional values and relations.\n" +
                "\n" +
                "By 2006, the necessity of implementation already existing Law on Higher Education of Georgia on the one hand, and the need of implementation full coverage of European and global advantages of medical education together with international commitments to reform the system of medical education on the other hand, have put the medical community to face the objective challenges.\n" +
                "The health care system with the old regulatory and financial mechanisms was poorly manageable. Accordingly, the traditional forms of training of qualified medical professionals required innovative changes. A three-stage system of higher education (baccalaureate, magistracy and doctorate) called for coordination with the process of post-graduate education. All this would make it possible to implement harmoniously the “life-long learning principles”, although it’s clear that the creation of such a continuum requires appropriate material and human resources.                                                                                               \n" +
                "All the aforesaid have caused a very significant step in Georgia's system of higher medical education - in 2006 Tbilisi State Medical Academy was integrated into Tbilisi State Medical University. The merging of these traditional medical schools in TSMU as one Medical Institution united also undergraduate and postgraduate medical education facilitated multilateral development of traditional medical and entire natural sciences.\n" +
                "By 2007, the faculty of Therapeutic Physical Training and Rehabilitation of the State Academy of Physical Culture and Sport joined TSMU.\n");


        TBILISI.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        TBILISI.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");
        feeArray = new JSONArray();


        temp_obj2.put("column1", "5000");
        temp_obj2.put("column2", "5000");
        temp_obj2.put("column3", "5000");
        temp_obj2.put("column4", "5000");
        temp_obj2.put("column5", "5000");
        temp_obj2.put("column6", "5000");
        temp_obj2.put("column7", "30000");

        temp_obj3.put("column1", "3,00,000");
        temp_obj3.put("column2", "3,00,000");
        temp_obj3.put("column3", "3,00,000");
        temp_obj3.put("column4", "3,00,000");
        temp_obj3.put("column5", "3,00,000");
        temp_obj3.put("column6", "3,00,000");
        temp_obj3.put("column7", "18,00,000");

        temp_obj4.put("column1", "72,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5.put("column1", "18,000");
        temp_obj5.put("column2", "18,000");
        temp_obj5.put("column3", "18,000");
        temp_obj5.put("column4", "18,000");
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "1,08,000");

        temp_obj6.put("column1", "3,90,000");
        temp_obj6.put("column2", "3,90,000");
        temp_obj6.put("column3", "3,90,000");
        temp_obj6.put("column4", "3,90,000");
        temp_obj6.put("column5", "3,90,000");
        temp_obj6.put("column6", "3,90,000");
        temp_obj6.put("column7", "19,80,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        TBILISI.put("fee", feeArray);
        TBILISI.put("feedetails", " ");
        TBILISI.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");


        /////////////////////////////////////////////////////////////

        JSONObject VISION = new JSONObject();
        VISION.put("country", "Georgia");
        VISION.put("name", "NEW VISION UNIVERSITY");
        VISION.put("overview", "NEW VISION UNIVERSITYwas established in 20113\n" +
                "Google Rating -5 star\n" +
                "Address- Evgeni Mikeladze St, Tbilisi 0159, Georgia\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map -https://goo.gl/maps/t7YfoppPErs\n");
        VISION.put("logo", R.drawable.new_logo);
        VISION.put("image", R.drawable.new_img);
        VISION.put("intoduction", "The nonprofit New Vision University Hospital aims to provide medical service based on individual needs and ethical values through the implementation of treatment methods at the international standards. Development, implementation and enhancement of quality of medical practices are carried out along with educational and research programs.\n" +
                "The hospital is a rare exception in the reality of Georgia, which is established as a nonprofit legal entity and operates for the benefit of the public. This is expressed through numerous free screening programs, as well as, by the so-called development of non-profit directions. For example, in 2017, the palliative department has been formed and expanded several times.\n" +
                "The nonprofit New Vision University Hospital replaced, Ltd. company functioning under the same name, which was founded as a result of a reorganization in Ltd. Cancer Research Center- Martin D. Abeloff Laboratory  (established on April 20, 2012) and September 2015 merger of Ltd. Geoclinic. In October 2017, another autonomously operating unit purchased from the hospital \"Davit Gagua Clinic\" joined the hospital. Accordingly, the number of hospital beds increased to 125.\n" +
                "Since September 1, 2016, management of the hospital and the School of Medicine has been united making the Dean of the School of Medicine head of the hospital subsequently.\n" +
                " The assessment of the educational and scientific-research activities as well as of professional development of the Institution personnel shall be undertaken by Quality Assurance Office. Quality assurance is the part of the terms and conditions set by the Academic Board for carrying out the educational and scientific-research activities and is based on the principle: “plan–do–check–act” (PDCA). It shall also provide for the existence of quality assurance system at School level as well. The Quality Assurance Office shall promote the introduction of the state-of-art teaching and evaluation methods, annual self-evaluation of the Institution and develop recommendations, which are reflected in the Institution strategic development plan. The Head of the Quality Assurance Office shall be elected and dismissed by the Academic Board.\n");


        VISION.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        VISION.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();

        temp_obj2.put("column1", "4500");
        temp_obj2.put("column2", "4500");
        temp_obj2.put("column3", "4500");
        temp_obj2.put("column4", "4500");
        temp_obj2.put("column5", "4500");
        temp_obj2.put("column6", "4500");
        temp_obj2.put("column7", "22500");

        temp_obj3.put("column1", "2,70,000");
        temp_obj3.put("column2", "2,70,000");
        temp_obj3.put("column3", "2,70,000");
        temp_obj3.put("column4", "2,70,000");
        temp_obj3.put("column5", "2,58,000");
        temp_obj3.put("column6", "2,70,000");
        temp_obj3.put("column7", "13,50,000");

        temp_obj4.put("column1", "72000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5.put("column1", "18000");
        temp_obj5.put("column2", "18000");
        temp_obj5.put("column3", "18000");
        temp_obj5.put("column4", "18000");
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "90,000");

        temp_obj6.put("column1", "3,60,000");
        temp_obj6.put("column2", "2,88,000");
        temp_obj6.put("column3", "2,88,000");
        temp_obj6.put("column4", "2,88,000");
        temp_obj6.put("column5", "2,88,000");
        temp_obj6.put("column6", "2,88,000");
        temp_obj6.put("column7", "15,12,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        VISION.put("fee", feeArray);
        VISION.put("feedetails", " ");
        VISION.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");
/////////////////////////////////////////////////////////////

        JSONObject CAUCASUS = new JSONObject();
        CAUCASUS.put("country", "Georgia");
        CAUCASUS.put("name", "CAUCASUS INTERNATIONAL UNIVERSITY");
        CAUCASUS.put("overview", "CAUCASUS INTERNATIONAL UNIVERSITY was established in 1995\n" +
                "Google Rating -4 star\n" +
                "Address- 73 Chargali St, Tbilisi, Georgia\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/XontypTHuNR2\n");
        CAUCASUS.put("logo", R.drawable.caucasus_logo);
        CAUCASUS.put("image", R.drawable.caucasus_img);
        CAUCASUS.put("intoduction", "Everything started 23 years ago from the idea which seemed utopian at first glance! In 1995, against the background of harsh social and political conditions, several people’s idea became reality and a higher educational institution was founded in Georgia, which became one of the leading universities within the next ten years. The quality of academic staff was gradually improving, the number of faculties was increasing, and the infrastructure was developing. Consequently, these led to an increase in student number. In 2005-2007 the university was granted the status of accredited institution. In 2012 all university programmes successfully passed authorization and accreditation for the period of five years and it gained the status of higher education institution-university, i.e. the three-cycle higher education system has been implemented at the university (CIU) and the vacancies have been defined by 3500 students.\n" +
                "By the decision of the Authorization Council of National Centre for Educational Quality Enhancement made on 14 July, 2015 Caucasus International University application has been approved and in accordance to the decision of the council the number of university students has been defined by 4700.\n" +
                "CIU offers Bachelor, One-step (in Georgian, English and Russian), Master and Doctoral programmes.\n" +
                "Despite the fact that there are a number of universities of international standard in our country, there was still a demand for creating a university of western standards; Caucasus International University set this goal; five faculties have been introduced. They are distinguished by high-qualified academic staff and scientific-research centres which meet modern, international standards. CIU offers the following faculties:\n" +
                "    Business;\n" +
                "    Social Sciences;\n" +
                "    Law;\n" +
                "    Medicine;\n" +
                "    Viticulture-Winemaking.\n" +
                "A number of changes have taken place since the establishment of the university. Various scholarly novelty have been introduced, existing structures and departments have been developed. The University has constantly been striving to improve and refine the teaching process as well as its management. \n" +
                "For years, one of the priorities of the university has been the students’ employment programmes. During studying process emphasis is placed on developing students’ professional skills and obtaining profound knowledge in their field.  \n" +
                "CIU constantly seeks collaboration with universities which will enable students and academic staff to familiarize with the commercial and cultural sides of partners’ business activities; in addition, successful students are given an opportunity to pursue their studies abroad at partner universities.\n" +
                "In 2012-2013 a new building was constructed which fully meets modern standards. Classes of European standard, a library, cafeteria, sport halls and a garden create the best teaching environment.\n" +
                "In order to prepare qualified professionals, CIU constantly improves teaching methods and adapts programmes; new educational programmes and courses have been introduced, research and teaching laboratories have been established. The above mentioned served as the basis for the approval of CIU educational programmes and its engagement in European educational system. Modern technologies that are available at the university make it possible to organize video-conferences, introduce distance learning and contact different educational and scientific centres.\n" +
                "In order to improve teaching quality the university focuses on students’ feedback. They are actively involved in the assessment of the academic process.\n" +
                "Library equipped with electronic technologies and contemporary literature facilitates students’ professional development. The university has established contacts with international organizations in Georgia, state institutions and private companies. Within the frameworks of the programme  “Invited Guest” students have an opportunity to meet representatives from political, business and non-governmental sectors. Students are given complete freedom to choose their learning and research spheres. They have created self-government. With the participation of the academic staff and students the university defines its teaching and research priorities.\n" +
                "Since 2009 CIU has published a quarterly, peer-reviewed scholarly journal “Caucasus International University Herald”. Leading Georgian and foreign scholars publish their works there; Since 2011 the university has released a quarterly periodical newspaper “Caucasus International University”, which is of informative and recreational character and reflects CIU scholarly and cultural-educational routine. In addition, the university publishes student journal.  \n" +
                "During years, Caucasus International University has established partnership with a number of universities, therefore facilitating its integration in the world educational system.\n");


        CAUCASUS.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        CAUCASUS.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();

        temp_obj2.put("column1", "3500");
        temp_obj2.put("column2", "3500");
        temp_obj2.put("column3", "3500");
        temp_obj2.put("column4", "3500");
        temp_obj2.put("column5", "3500");
        temp_obj2.put("column6", "3500");
        temp_obj2.put("column7", "21000");

        temp_obj3.put("column1", "2,10,000");
        temp_obj3.put("column2", "2,10,000");
        temp_obj3.put("column3", "2,10,000");
        temp_obj3.put("column4", "2,10,000");
        temp_obj3.put("column5", "2,10,000");
        temp_obj3.put("column6", "2,10,000");
        temp_obj3.put("column7", "12,60,000");

        temp_obj4.put("column1", "72,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5.put("column1", "18,000");
        temp_obj5.put("column2", "18,000");
        temp_obj5.put("column3", "18,000");
        temp_obj5.put("column4", "18,000");
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "1,08,000");

        temp_obj6.put("column1", "3,00,000");
        temp_obj6.put("column2", "2,28,000");
        temp_obj6.put("column3", "2,28,000");
        temp_obj6.put("column4", "2,28,000");
        temp_obj6.put("column5", "2,88,000");
        temp_obj6.put("column6", "2,88,000");
        temp_obj6.put("column7", "14,40,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        CAUCASUS.put("fee", feeArray);
        CAUCASUS.put("feedetails", " ");
        CAUCASUS.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");
/////////////////////////////////////////////////////////////

        JSONObject EUROPEAN = new JSONObject();
        EUROPEAN.put("country", "Georgia");
        EUROPEAN.put("name", "EUROPEAN UNIVERSITY");
        EUROPEAN.put("overview", "EUROPEAN UNIVERSITY was established in 2012\n" +
                "Google Rating -4 star\n" +
                "Address- 76 David Guramishvili Ave, Tbilisi, Georgia\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/uWGqjsUPKzE2\n");
        EUROPEAN.put("logo", R.drawable.europeon_logo);
        EUROPEAN.put("image", R.drawable.europeon_img);
        EUROPEAN.put("intoduction", "European University is a higher educational institution bearing status of an authorized teaching university which carries out educational programs of higher academic education in accordance with the legislation and issues a document certifying the qualification recognized by the state. \n" +
                "European University was founded on December 31, 2012 and is represented by 3 faculties:\n" +
                "    Faculty of Business and Technology;\n" +
                "    Faculty of Law, Humanitarian and Social Sciences;\n" +
                "    Faculty of Medicine;\n" +
                "Hundreds of Georgian and foreign students study at the European University at this stage and 17 accredited educational programs are implemented by over 300 academic and more than 100 administrative personnel. Educational programs are being carried out in two educational buildings in Tbilisi.\n" +
                "Our success should be completely attributed to our excellent team.  Owing to 6 years of tireless efforts and embodying various innovative ideas, European University managed to hold its niche among Georgian higher educational institutions. It’s important to us that both a student and the academic staff had a sense of complete freedom in learning and teaching process. Our priority is to make sure the university employees are focused on a common goal and equally share a role of the university as a higher educational institution in providing students with higher education.\n" +
                "The university is staffed by highly qualified academic personnel and scientists who have many years of scientific and academic experience working in the leading universities and scientific-research institutes in Georgia, Europe and the USA. We ensure constant development of our students’ ideas and knowledge and also encourage our professors to increase their knowledge. Therefore, the university carries out scientific-research field works, has scientific-research institutes and publishes scientific-practical journals that are peer-reviewed and indexed in international scientific bases such as: Oaji, Sis, Google Scholar and Index Copernicus.\n" +
                "The Faculty of Medicine of European University has already made a name for itself on Georgian and foreign market and is recognized by the World Health Organization (WHO) and Foundation for Advancement of International Medical Education and Research (FAIMER). In addition, European University is represented in the World Directory of Medical Schools. The faculty is also recognized by the Medical Council of India and Council of Higher Education of Turkey. European University is a member of Association for Medical Education in Europe (AMEE).\n" +
                "The faculty of law, humanitarian and social sciences cooperates with the Council of Europe and the house of court in Miami (USA). Consequently, successful students of the faculty have opportunity to do their internship in Strasburg and Miami. Four times a year at the faculty, lecturers invited from the US universities read the special courses of international law in English. There is a scientific-research institute at the faculty and international scientific reference and reviewing journal- Law and the World is published as well.\n" +
                "The faculty of business and technology collaborates with the universities of Michigan, Illinois and Chicago. Professors from the US universities visit us on a regular basis to give lectures.  There is an institute at the faculty for studying economic and social problems of globalization. Also, the scientific-practical journal Globalization and Business is published.\n" +
                "The university is equipped with modern technological base, various library facilities and necessary appliances for relevant programs. The institution keeps student oriented policy providing them with the university scholarships and an opportunity to study abroad. European University is focused on encouraging intercultural dialogues, thus establishes an educational area in which each student feels like a full member of the society regardless his/her ethnic, racial, religious or other distinguishing features. For the same purpose, Georgian and foreign students of the university are involved in joint bilingual projects in different directions.\n");

        EUROPEAN.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        EUROPEAN.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();

        temp_obj2.put("column1", "4500");
        temp_obj2.put("column2", "4500");
        temp_obj2.put("column3", "4500");
        temp_obj2.put("column4", "4500");
        temp_obj2.put("column5", "4500");
        temp_obj2.put("column6", "4500");
        temp_obj2.put("column7", "22500");

        temp_obj3.put("column1", "2,70,000");
        temp_obj3.put("column2", "2,70,000");
        temp_obj3.put("column3", "2,70,000");
        temp_obj3.put("column4", "2,70,000");
        temp_obj3.put("column5", "2,70,000");
        temp_obj3.put("column6", "2,70,000");
        temp_obj3.put("column7", "13,50,000");

        temp_obj4.put("column1", "72000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5.put("column1", "18000");
        temp_obj5.put("column2", "18000");
        temp_obj5.put("column3", "18000");
        temp_obj5.put("column4", "18000");
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "90,000");

        temp_obj6.put("column1", "3,60,000");
        temp_obj6.put("column2", "2,88,000");
        temp_obj6.put("column3", "2,88,000");
        temp_obj6.put("column4", "2,88,000");
        temp_obj6.put("column5", "2,88,000");
        temp_obj6.put("column6", "2,88,000");
        temp_obj6.put("column7", "15,12,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        EUROPEAN.put("fee", feeArray);
        EUROPEAN.put("feedetails", " ");
        EUROPEAN.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");
//////////////////////////////////////////////////////////////////////////////////////

        JSONObject MEDI = new JSONObject();
        MEDI.put("country", "Georgia");
        MEDI.put("name", "GEO MEDI MEDICAL UNIVERSITY");
        MEDI.put("overview", "GEO MEDI MEDICAL UNIVERSITY was established in 1998\n" +
                "Google Rating -4.7 star\n" +
                "Address- 3 Krtsanisi St, Tbilisi, Georgia\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/3RjXvficAkN2\n");
        MEDI.put("logo", R.drawable.geo_logo);
        MEDI.put("image", R.drawable.geo_img);
        MEDI.put("intoduction", "Founded in the year 1998, the Geomedi University is a highly acclaimed university of Georgia, which was founded by Dr. Mrs. Marina Pirtskhalava. The Geomedi University provides the students with the high level of education with the use of modern and up to date curriculum.\n" +
                "The main motto of the university is to imbibe the students with the needed talent and skills to compete at any international levels. Such is the education quality of the university that the students passing from the university are employed at some of the best places in the world and have established themselves fame and name all around.\n" +
                "Also, among the several amenities as offered to the students, they are given a chance to remain connected with the university by remaining employed at the University Clinic and its concerned departments.\n" +
                "The main goal of the Geomedi University is to impart their students with the high level of skills and knowledge and enable them to make themselves a brand of their own in their related field.\n" +
                "Affordable for all, the university has one of the lowest school fees, which stands at $3500 a year. The level of the education at the university can be judged by the fact that the educational programs and students assessments are based on the European Credit Transfer System (ECTS).\n" +
                "Geomedi University is Recognized by:\n" +
                "    World Health Organization (WHO).\n" +
                "    World Federation of Medical Education (WFME).\n" +
                "    Educational Commission for Foreign Medical Graduates (ECFMG).\n" +
                "    Foundation for Advancement of International Medical Education and Research (FAIMER).\n" +
                "\n" +
                "\n" +
                "\n" +
                "Faculty and Courses.\n" +
                "    Dentistry offering the degree of Doctor of Dental Medicine.\n" +
                "    Healthcare Economics and Management offering the degree of Bachelor of Health Care management and Master of Health Care management.\n" +
                "    Physical Medicine and Rehabilitation offering the degree of Bachelor of Health Care in Physical Medicine and Rehabilitation and Master of Health care in Physical Medicine and Rehabilitation.\n" +
                "Staff and Teaching.\n" +
                "The staff and teaching faculty at the Geomedi University are well experienced and knowledgeable. The staff ensures that the students pursuing their courses gain enough knowledge in the field of their study and also improve their practical skills along with the theoretical knowledge.\n" +
                "The well balanced teaching faculty ensures that the students get the best education during their stay at the university. The faculty at the Geomedi University offers all needed support to the students in the improvement of the learning capabilities and ensuring that they have a bright future ahead.\n");


        MEDI.put("Eligibility", " •\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        MEDI.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();

        temp_obj2.put("column1", "3000");
        temp_obj2.put("column2", "3000");
        temp_obj2.put("column3", "3000");
        temp_obj2.put("column4", "3000");
        temp_obj2.put("column5", "3000");
        temp_obj2.put("column6", "3000");
        temp_obj2.put("column7", "18000");

        temp_obj3.put("column1", "1,80,000");
        temp_obj3.put("column2", "1,80,000");
        temp_obj3.put("column3", "1,80,000");
        temp_obj3.put("column4", "1,80,000");
        temp_obj3.put("column5", "1,80,000");
        temp_obj3.put("column6", "1,80,000");
        temp_obj3.put("column7", "10,80,000");

        temp_obj4.put("column1", "72,000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5.put("column1", "18,000");
        temp_obj5.put("column2", "18,000");
        temp_obj5.put("column3", "18,000");
        temp_obj5.put("column4", "18,000");
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "1,08,000");

        temp_obj6.put("column1", "2,70,000");
        temp_obj6.put("column2", "1,98,000");
        temp_obj6.put("column3", "1,98,000");
        temp_obj6.put("column4", "1,98,000");
        temp_obj6.put("column5", "1,98,000");
        temp_obj6.put("column6", "1,98,000");
        temp_obj6.put("column7", "12,60,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        MEDI.put("fee", feeArray);
        MEDI.put("feedetails", " ");
        MEDI.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");
/////////////////////////////////////////////////////////////

        JSONObject DAVID = new JSONObject();
        DAVID.put("country", "Georgia");
        DAVID.put("name", "DAVID TVILDIANI MEDICAL UNIVERSITY");
        DAVID.put("overview", "DAVID TVILDIANI MEDICAL UNIVERSITYwas established in 1989\n" +
                "Google Rating -4.8 star\n" +
                "Address- 2/6 Lubliana Street, T'bilisi 0159, Georgia\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map -https://goo.gl/maps/rvCtqssNHjL2\n");
        DAVID.put("logo", R.drawable.david_logo);
        DAVID.put("image", R.drawable.david_img);
        DAVID.put("intoduction", " ABOUT David Tvildiani Medical University\n" +
                "“AIETI” Medical School is a branch of David Tvildiani Medical University. Its mission is to provide scientifically-oriented Higher Medical Education based on the best International experience.\n" +
                "AIETI Medical School is the first non-governmental highest educational Medical Institution in Georgia established by Academician David Tvildiani andDr. Dimitri Tvildiani in 1989.\n" +
                "After developing Residency, PHD and Doctorate programs and adding the Nursing School, AIETI Medical School has been upgraded by the National Authorization Council to the status of an University and from 2011 is named after its founder and the first rector as “DavidTvildiani Medical University”.\n" +
                "AIETI Medical School Has been recognized by the WHO (World Health Organization) and listed in “ World Directory of Medical Schools” in 1995. Shortly after that, it’s diploma hasbeen verified and authorized by the Medical Examination Committees of the USA, different countries of Europe and Asia.\n" +
                "Currently, David Tvildiani Medical University and its “AIETI Medical School” are active members of:\n" +
                "- Association of Medical Schools in Europe (AMSE);\n" +
                "- Association of Medical education in Europe (AMEE);\n" +
                "- ORPHEUS – Organization for PhD Education in Biomedicine and Health Sciences in European System;\n" +
                "- Foundation for Advancement of International Medical Education and Research (FAIMER);\n" +
                "- Eurasian Universities Union (EURAS)\n" +
                "DAVID TVILDIANI, MD; PhD; Academician of the Georgian Academy of Sciences; Honored Scientist of Georgia; Founder of Electro Cardiology in Georgia; Founder of the Scientific and Practical Center of Heliomagnetic Cardiology 1929-2010\n" +
                "Academician David Tvildiani - outstanding Georgian cardiologist, great educator, consummate master of medical art - was a bright representative of Georgian Medical Society, distinguishably combining in himself personal greatness, perfect professionalism in medical field and incomparable teaching talent, creating his era in Georgian Medicine. David Tvildiani initiated and founded a new direction in Medicine – Heliomagnetic Cardiology. He was first and permanent Rector of “AIETI” Medical School until the last days of his life.\n" +
                "DIMITRI TVILDIANI MD; PhD; President of David Tvildiani Medical University; Founder of the Modern Diagnostic Centers in New York, USA (2000). Currently working in the USA, rendering patronage to the AIETI Medical School and promoting the placement of the School graduates.\n" +
                "LEVAN TVILDIANI, MD, PhD, Professor ,Rector of David Tvildiani Medical University; Director of the Scientific and Practical Center of Heliomagnetic Cardiology\n" +
                "Over 200 graduates of DTMU have successfully passed the qualifying exams and have already completed or are currently enrolled in residency or other proficiency courses, working as physicians in prominent USA and European Universities and Clinics.\n" +
                "The absolute majority of our graduates have been employed in the professional field, while many more successfully passed the international exams (USMLE, PLAB, MCI) and are currently developing their skills at clinics and research centers of the USA, Germany, Britain, Sweden and other countries. A number of the graduates have returned to the School as proficient teachers. Many have earned their PhD degree.\n" +
                "AIETI is listed in the WHO AVICENNA Directory of Medical Schools, it is a member of the Association for Medical Education in Europe (AMEE), Association of Medical Schools in Europe (AMSE) and Organization for PhD Education in Biomedicine and Health Sciences in the European System (ORPHEUS).\n");


        DAVID.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        DAVID.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();

        temp_obj2.put("column1", "4500");
        temp_obj2.put("column2", "4500");
        temp_obj2.put("column3", "4500");
        temp_obj2.put("column4", "4500");
        temp_obj2.put("column5", "4500");
        temp_obj2.put("column6", "4500");
        temp_obj2.put("column7", "27000");

        temp_obj3.put("column1", "2,70,000");
        temp_obj3.put("column2", "2,70,000");
        temp_obj3.put("column3", "2,70,000");
        temp_obj3.put("column5", "2,70,000");
        temp_obj3.put("column6", "2,70,000");
        temp_obj3.put("column7", "16,20,000");

        temp_obj4.put("column1", "72000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5.put("column1", "18000");
        temp_obj5.put("column2", "18000");
        temp_obj5.put("column3", "18000");
        temp_obj5.put("column4", "18000");
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "1,08,000");

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
        DAVID.put("fee", feeArray);
        DAVID.put("feedetails", " ");
        DAVID.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");
/////////////////////////////////////////////////////////////

        JSONObject IVANE = new JSONObject();
        IVANE.put("country", "Georgia");
        IVANE.put("name", "IVANE JAVAKHISHVILI TBILISI STATE UNIVERSITY");
        IVANE.put("overview", "IVANE JAVAKHISHVILI TBILISI STATE UNIVERSITY was established in 1918\n" +
                "Google Rating -4 star\n" +
                "Address- 1 Chavchavadze Avenue, T'bilisi 0179, Georgia\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/2qUWgBVTfKq\n");
        IVANE.put("logo", R.drawable.ivane_logo);
        IVANE.put("image", R.drawable.ivane_img);
        IVANE.put("intoduction", "The first-ever national university in the Caucasus was opened in 1918 laying the foundation for a European-type higher school in Georgia, based on Georgian educational traditions. \n" +
                "The idea of foundation of the university first emerged as far back as the early 19th century amid intensification of the struggle for liberation from Russian empire. \n" +
                "A new generation led by great Georgian public figure Ilia Chavchavadze, with whom a new stage of spiritual revival in the history of our country is connected, appeared on the scene in the sixties of the 19th century. The struggle for establishing the university became especially vigorous during those years. \n" +
                "Real possibilities of establishing a higher school have opened up after the Nobiliary Manorial Estate Bank was founded in Tbilisi. It was the only bank throughout the Russian empire, which spent its incomes to promote the cultural-educational and economic interests of the nation. \n" +
                "From the beginning of the 20th century IvaneJavakhishvili, who underwent his studies in Petersburg and became its assistant professor, started to organize the foundation of the Georgian University. From the very first days of the February 1917 revolution, IvaneJavakhishvili, who was in Petersburg by then, started active preparations for the opening of a higher educational institution. \n" +
                "The first gathering of the founders of the University Society was held at the apartment of PetreMelikishvili in Tbilisi on May 12. The gathering was chaired by EkvtimeTakaishvili. It was just on that day, when the Georgian Free University Society was established, which later played a huge role in the foundation of the University. \n" +
                "In autumn 1917 the founders of the University intensified their efforts to open a higher educational institution. It was decided to establish only one faculty initially – the faculty of philosophy, which would have united humanitarian fields as well as natural science and mathematics. In late December Georgian press already reported about the enrollment of the first students into the Georgian University. \n" +
                "Thus, the first-ever national University in the Caucasus was opened on January 26, 1918, the day of commemoration of King David the Builder (new style February 8). \n" +
                "Upon the nomination of IvaneJavakhishvili, the Council of Professors elected PetreMelikishvili the first rector of the university. IvaneJavakhishvili took charge of the faculty of philosophy. \n" +
                "The following persons delivered lectures at the newly established university: IvaneJavakhishvili, IustineAbuladze, Giorgi Akhvlediani, PhilipeGogichaishvili, EkvtimeTakaishvili, KorneliKekelidze, ShalvaNutsubidze, ElisabedBagrationi-Orbeliani, Dimitri Uznadze, Vanda Gambashidze, Ilia Kipshidze, IosebKipshidze, AkakiShanidze, Andria Benashvili, Andria Razmadze, IvaneBeritashvili, and GrigolTsereteli. \n" +
                "In 1989 the Tbilisi State University was named after its founder, IvaneJavakhishvili. \n" +
                "Today the IvaneJavakhishvili Tbilisi State University is one of the first scientific-research institutions of Georgia. It implements about 200 local and international scientific grant programs annually. \n" +
                "The Tbilisi State University is one of the largest higher educational institutions by its scales. Today about 22 thousand students are undergoing studies at  seven faculties of TSU. \n" +
                "Along with bachelor’s, master’s and doctoral degree programs, the Tbilisi State University also implements higher vocational education, as well as short and long term certification programs. Based on close cooperation with foreign universities, Georgian students have opportunities to participate in exchange and joint international educational programs and gain double academic degrees.              \n" +
                "Tbilisi State University is an active member of leading international education networks and is proud of its alumni - prominent professors, scientists and graduates, who have successfully integrated into the European community and gained the recognition worldwide.  \n" +
                "\n" +
                "TSU offers a wide variety of degree programs at undergraduate, graduate and doctoral levels and short courses offered in English language attracting students from all over the world.  The internalization of TSU is fast- paced and it aims at creating multicultural environment that will enhance teaching and research opportunities. TSU promotes the equality to access education and believes in engaging and valuing all students and staff.\n");


        IVANE.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        IVANE.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();

        temp_obj2.put("column1", "4500");
        temp_obj2.put("column2", "4500");
        temp_obj2.put("column3", "4500");
        temp_obj2.put("column4", "4500");
        temp_obj2.put("column5", "4500");
        temp_obj2.put("column6", "4500");
        temp_obj2.put("column7", "27000");

        temp_obj3.put("column1", "2,70,000");
        temp_obj3.put("column2", "2,70,000");
        temp_obj3.put("column3", "2,70,000");
        temp_obj3.put("column4", "2,70,000");
        temp_obj3.put("column5", "2,70,000");
        temp_obj3.put("column6", "2,70,000");
        temp_obj3.put("column7", "16,20,000");

        temp_obj4.put("column1", "72000");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5.put("column1", "18000");
        temp_obj5.put("column2", "18000");
        temp_obj5.put("column3", "18000");
        temp_obj5.put("column4", "18000");
        temp_obj5.put("column5", "18,000");
        temp_obj5.put("column6", "18,000");
        temp_obj5.put("column7", "1,08,000");

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
        IVANE.put("fee", feeArray);
        IVANE.put("feedetails", " ");
        IVANE.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");





        JSONArray allColleges = new JSONArray();
        allColleges.put(BATUNI);
        allColleges.put(TBILISI);
        allColleges.put(VISION);
        allColleges.put(CAUCASUS);
        allColleges.put(EUROPEAN);
        allColleges.put(MEDI);
        allColleges.put(DAVID);
        allColleges.put(IVANE);
        return allColleges.getJSONObject(varCollegeName);
    }
}