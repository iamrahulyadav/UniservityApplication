package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class University_Details_Nepal {
    private int varCollegeName;


    public University_Details_Nepal(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException {
        /////////////////////////////////////////////////////
        JSONObject KOIRALA  = new JSONObject();

        KOIRALA .put("country", "NEPAL");

        KOIRALA .put("name", "B.P. KOIRALA INSTITUTE OF HEALTH SCIENCES");

        KOIRALA .put("overview", "B.P. KOIRALA INSTITUTE OF HEALTH SCIENCES was established in 1993\n" +
                "Google Rating -4.5 star\n" +
                "Address- Dharan 56700, Nepal\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/pAPMAKgAFr32\n");

        KOIRALA .put("logo", R.drawable.kirov_logo);

        KOIRALA .put("image", R.drawable.kirov);

        KOIRALA .put("intoduction", "B.P. Koirala Institute of Health Sciences (BPKIHS) was established on Jan 18, 1993 and subsequently upgraded as an autonomous Health Sciences University on Oct 28, 1998 with a mandate to work towards developing socially responsible and competent health workforce, providing health care & involving in innovative health research. The Institute, located in Eastern Nepal, has extended its continued health services through teaching district concept to Primary Health Care Centers, District Hospitals and Zonal Hospitals in different districts of the region. This University is aptly named after Bisheshwar Prasad Koirala, Nepal’s visionary leader in social uplifting, firm believer of national integration.\n" +
                "This Institute is envisaged as one of the successful examples of Nepal-India co-operation. The Health Ministers of the two countries signed the Indo-Nepal agreement for establishment of BPKIHS on the Hindu auspicious day of Mahashivaratri (Mar 10, 1994)\n" +
                "BPKIHS has a vision of a self-governing, self-reliant international Health Sciences University attracting students and teachers from all over the world to its constantly innovative educational programs. BPKIHS has also been envisioned by the Nepali Parliament as a centre of national importance to produce skilled health workforce to meet the country’s need and also to function as a centre of excellence in the field of tropical and infectious diseases. Its best example is the ongoing Kala-azar Project in collaboration with international bodies. BPKIHS has postgraduate, undergraduate, and university certificate programs and from this year starting Doctor of Philosophy (PhD) program. It has four colleges: Medical, Dental, Nursing, and Public Health with a 700-bedded Central Teaching Hospital. The medical college has well-established major clinical and basic science departments.\n" +
                "Postgraduate programs (MD, MS, and MSc) were started in 1999. All the MD, MS, MDS, MSc and MPH degrees awarded by BPKIHS are recognized by Nepal Medical Council and respective councils of Nepal. The MD/MS degrees (anesthesiology, clinical pharmacology & therapeutics, dermatovenerology, ENT, internal medicine, orthopedics, pediatrics, psychiatry, radiodiagnosis, and surgery) are recognized by Medical Council of India (MCI). Similarly, there is continued effort for getting MCI recognition of other disciplines as well. While selecting candidates for MD/MS/MDS postgraduate studies, the institute has given due recognition to the medical graduates who have served in the primary health centers and /or district hospitals.\n" +
                "The School of Public Health was established in 2005, and it runs a two-year MPH program. The MSc Nursing Program (in Community and Psychiatry Nursing) was started in 2008. Medical Councils of Nepal, India and Sri-Lanka have recognized the MBBS program since its inception in 1994. It is listed in the World Directory of Medical Schools published by the WHO.\n" +
                "The Institute started BDS program in 1999, which is recognized by the Nepal Medical Council. Our BDS graduates are allowed to sit for Dental Council of India screening test to pursue MDS courses in India. The duration of both BDS and MBBS is 4½ years followed by a one-year of Compulsory Community Oriented Residential Rotating Internship, which is mandatory to be completed in BPKIHS Central Teaching Hospital and its Teaching District Hospitals. This feature is new and unique in this part of the world and has been commended around the globe.\n" +
                "B.Sc. Nursing and University Certificate Nursing (staff nurse) programs are well recognized and the alumni sought after within and outside the country. Nepal Nursing Council recognizes all the nursing degrees. There are separate college complexes for all constituent colleges in the BPKIHS campus.\n" +
                "Nepal Health Professional Council recognizes the health science courses allied to medicine. In addition, BPKIHS organizes short-term academic programs/refresher courses for national and international students, doctors and faculty members. Continuing medical education on various aspects of health is a culture at BPKIHS.\n" +
                "This University aims at becoming center of excellence in patient care, teaching, and health sector research. It is following an integrated and holistic model in academics and services. The institute is committed to its social responsibility and accountability. The institute has provisions for admission to different underprivileged groups/sections of the society in different academic programs.\n" +
                "The Institute has innovative approach of community-based training of students, and providing services to the local people through the concept of Teaching District Hospitals (learning by doing at community level). Accordingly, students of various programs visit and/or are posted to the health institutions under faculty/specialist supervision where on one hand they get opportunity to learn in the community set-up; and on the other hand, the local health institutions get regular qualified health workforce to provide the quality services by a BPKIHS team of faculty/specialist and interns. The institute has given special attention to uplifting rural women from the marginalized communities.\n");


        KOIRALA .put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        KOIRALA .put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        JSONArray feeArray = new JSONArray();
        JSONObject temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "");
        temp_obj2.put("column2", "");
        temp_obj2.put("column3", "");
        temp_obj2.put("column4", "");
        temp_obj2.put("column5", "");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "65,000");

        JSONObject temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "-");
        temp_obj3.put("column2", "-");
        temp_obj3.put("column3", "-");
        temp_obj3.put("column4", "-");
        temp_obj3.put("column5", "-");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "-");

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
        temp_obj6.put("column1", "");
        temp_obj6.put("column2", "");
        temp_obj6.put("column3", "");
        temp_obj6.put("column4", "");
        temp_obj6.put("column5", "");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "39,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        KOIRALA.put("fee", feeArray);

        KOIRALA.put("feedetails", " ");
        KOIRALA.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



/////////////////////////////////////////////////////
        JSONObject INTERNATIONAL = new JSONObject();

        INTERNATIONAL.put("country", "NEPAL");

        INTERNATIONAL.put("name", "INTERNATIONAL SCHOOL OF MEDICINE");

        INTERNATIONAL.put("overview", "- INTERNATIONAL SCHOOL OF MEDICINE was established in 1972\n" +
                "Google Rating -4.5 star\n" +
                "Address- Ring Road 44600, Patan 44700, Nepal\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/eWrQDKgD7QE2\n");

        INTERNATIONAL.put("logo", R.drawable.kirov_logo);

        INTERNATIONAL.put("image", R.drawable.kirov);

        INTERNATIONAL.put("intoduction", "The Institute of Medicine (IOM) was established in 1972 under Tribhuvan University with the mandate and the responsibility of training all the categories of health manpower needed in the country. Within the first decade of its establishment, it developed a total of 12 campuses scattered over the country out of which 3 campuses were in Kathmandu and 9 campuses were outside the Kathmandu Valley.In the beginning, the importance was given to training of middle level health workers. The programs for this purpose were:\n" +
                "•\tANM\n" +
                "•\tCMA\n" +
                "•\tProficiency Certificate Course in General Medicine\n" +
                "•\tPharmacy\n" +
                "•\tRadiology\n" +
                "•\tPhysiotherapy\n" +
                "•\tNursing\n" +
                "•\tHealth Laboratory\n" +
                "•\tTraditional Medicine\n" +
                "With the passage of time , institutional goals of IOM changed according to the need of health personnel in the country. The new responsibility was to train the human resources of tertiary level health professionals. By 1977, it had started a graduate level of 2-year Bachelor of Nursing Programme in;\n" +
                "•\tCommunity Nursing\n" +
                "•\tPediatric Nursing\n" +
                "•\tAdult Nursing\n" +
                "\n" +
                "A three hundred-beded TU Teaching Hospital was completed in 1982 with the support from JICA. This hospital provides services to general population and is the center for the teaching/learning and research activities of different programs run by IOM.\n" +
                "At post-graduate level in 1982, three year Postgraduate Generalist Training (Family Physician, MD General Practice) was started with the collaboration with University of Calgary, Canada.\n" +
                "Now, IOM is running 29 different programs from proficiency certificate level to the highest postgraduate degree in medicine, public health, paramedical, nursing and traditional medicine (Ayurved Science) through 9 campuses scattered all over the country.\n");


        INTERNATIONAL.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        INTERNATIONAL.put("facilities", "•\tfood \n" +
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
        temp_obj2.put("column7", "55,000");

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
        temp_obj6.put("column7", "33,00,000");
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
        JSONObject MANIPAL = new JSONObject();

        MANIPAL.put("country", "NEPAL");

        MANIPAL.put("name", "MANIPAL COLLEGE OF MEDICAL SCIENCE");

        MANIPAL.put("overview", "- MANIPAL COLLEGE OF MEDICAL SCIENCE was established in 1992\n" +
                "Google Rating -3 star\n" +
                "Address- Pokhara 33700, Nepal\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/FB2idshSCp52\n");

        MANIPAL.put("logo", R.drawable.kirov_logo);

        MANIPAL.put("image", R.drawable.kirov);

        MANIPAL.put("intoduction", "Manipal Academy of Higher Education is synonymous with excellence in higher education. Over 28,000 students from 57 different nations live, learn and play in the sprawling University town, nestled on a plateau in Karnataka’s Udupi district. It also has nearly 2500 faculty and almost 10000 other support and service staff, who cater to the various professional institutions in health sciences, engineering, management, communication and humanities which dot the Wi-Fi-enabled campus.\n" +
                "The University has off-campuses in Mangalore and Bangalore, and off-shore campuses in Dubai(UAE) and Melaka (Malaysia). The Mangalore campus offers medical, dental, and nursing programs. The Bangalore Campus offers programs in Regenerative Medicine. The Dubai campus offers programs in engineering, management and architecture, and the Melaka campus offers programs in medicine and dentistry.\n" +
                "Every institute has world class facilities and pedagogy, which are constantly reviewed and upgraded to reflect the latest trends and developments in higher education.\n" +
                "In Manipal, these include educational facilities like the Simulation Lab with computer driven Manikins, an Innovation Centre, one of Asia’s largest health sciences libraries, one of the world’s best anatomy museums, a business incubation centre and various other centers of excellence. Academic collaborations and twinning programs with several universities in the US, UK, Australia and other countries ensure that students get international exposure and expertise.\n" +
                "The MARENA, a massive indoor sports complex with five badminton courts, four squash courts, three tennis courts, a basketball court, a hi-tech gym and a walking track, reflects the university’s belief that a healthy mind needs a healthy body.\n" +
                "Part of the Manipal Group, the University is ISO 9001:2008 and ISO 14001: 2004 certified,  and has won the prestigious IMC Ramkrishna Bajaj National Quality Award and the International Asia Pacific Quality Award in 2007- 2008.\n" +
                "The Manipal Group, a pioneer in higher education services with a 60-year-old legacy of excellence, also owns and operates campuses in Sikkim and Jaipur in India, and in Nepal, Malaysia, and Antigua, in the Caribbean.\n" +
                "On 18th October 1992, a historic agreement was signed between the-then His Majesty’s Government of Nepal and the Manipal Education and Medical Group for setting up a medical college.\n" +
                "Thus the Manipal College of Medical Sciences (MCOMS), affiliated to Kathmandu University was set up at Pokhara in 1994 with an MBBS program. It was the first private institution to establish a medical college in Nepal. Further to this, the 750 bed Manipal Teaching Hospital (MTH), Pokhara commenced in 1998. The college and hospital have been set up with modern facilities for modern education and health delivery.\n" +
                "Investment made by the Manipal Education & Medical Group:\n" +
                "A total investment of INR 40 billion has been made by the Manipal Group in MCOMS since its inception and it increases year after year in order to facilitate the steady growth of the institution.\n" +
                "Manipal is a conglomerate of educational institutions and hospitals (over 300,000 students and 7,000 hospital beds), and has established a fine reputation over the last five decades.\n" +
                "The venture has helped in the overall development of Nepal besides providing direct employment to a number of local people.\n");


        MANIPAL.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        MANIPAL.put("facilities", "•\tfood \n" +
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
        temp_obj2.put("column7", "40,000");

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
        temp_obj6.put("column7", "24,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        MANIPAL.put("fee", feeArray);

        MANIPAL.put("feedetails", " ");
        MANIPAL.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




/////////////////////////////////////////////////////
        JSONObject KATHMANDU = new JSONObject();

        KATHMANDU.put("country", "NEPAL");

        KATHMANDU.put("name", "KATHMANDU MEDICAL COLLEGE");

        KATHMANDU.put("overview", "- KATHMANDU MEDICAL COLLEGE was established in 1997\n" +
                "Google Rating -4.4 star\n" +
                "Address- Sinamangal Rd, Kathmandu 44600, Nepal\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/LVZTKYhu3D82\n");

        KATHMANDU.put("logo", R.drawable.kirov_logo);

        KATHMANDU.put("image", R.drawable.kirov);

        KATHMANDU.put("intoduction", "Established in 1997, Kathmandu Medical College (KMC Kathmandu) is a private medical college in Nepal permanently affiliated to Kathmandu University Nepal, one of the top universities in Nepal. KMC Kathmandu is committed to providing best medical education programs that produce skilled, committed and compassionate health professionals.\n" +
                "Kathmandu Medical College (KMC Kathmandu) functions from two complexes: Basic Sciences Complex in Duwakot and Clinical Sciences Complex in Sinamangal.\n" +
                "One of the best private medical colleges in Nepal, Kathmandu Medical College (KMC Kathmandu) is recognized by the Nepal Medical Council.\n" +
                "KATHMANDU MEDICAL COLLEGE COURSES OFFERED\n" +
                "Undergraduate Medical Course: Kathmandu Medical College (KMC Kathmandu) offers the Bachelor of Medicine and Bachelor of Surgery  (MBBS) of 4 ½ years followed by a compulsory internship training of one year. The MBBS course starts in August / September every academic year and the total number of seats is 115.\n" +
                "Postgraduate Medical Courses: The MD (Pathology) was started from 2003. The MD/MS course in clinical areas like Medicine, Surgery, Pediatric, Gynecology/Obstetrics and Anesthesia was started from February 2009. The duration of PG medical courses is 3 years.\n" +
                "KATHMANDU MEDICAL COLLEGE ADMISSION PROCESS\n" +
                "Undergraduate Medical Admission\n" +
                "Eligibility Criteria\n" +
                "Candidates seeking MBBS admission in Nepal Medical College i.e. KMC Kathmandu, affiliated to Kathmandu University Nepal, should have:\n" +
                " Completed 17 years of age at the time of their application\n" +
                "    Completed 10+2 years of education or equivalent with English, Biology, Physics, and Chemistry as main subjects and having secured not less than 50% marks in the subjects mentioned above put together and an overall aggregate of 50%.\n" +
                "MBBS Entrance Exam\n" +
                "Candidates seeking admission to MBBS in Nepal Medical College i.e. KMC Kathmandu must appear and qualify in Kathmandu University Medical Entrance Test (KUMET) MBBS exam conducted by the Kathmandu University in the month of September.\n");


        KATHMANDU.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        KATHMANDU.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "25,00,000");
        temp_obj2.put("column2", "10,00,000");
        temp_obj2.put("column3", "10,00,000");
        temp_obj2.put("column4", "10,00,000");
        temp_obj2.put("column5", "10,00,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "45,00,000");

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
        temp_obj6.put("column1", "25,00,000");
        temp_obj6.put("column2", "10,00,000");
        temp_obj6.put("column3", "10,00,000");
        temp_obj6.put("column4", "10,00,000");
        temp_obj6.put("column5", "10,00,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "45,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        KATHMANDU.put("fee", feeArray);

        KATHMANDU.put("feedetails", " ");
        KATHMANDU.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




/////////////////////////////////////////////////////
        JSONObject NEPALGANJ = new JSONObject();

        NEPALGANJ.put("country", "NEPAL");

        NEPALGANJ.put("name", "NEPALGANJ MEDICAL COLLEGE");

        NEPALGANJ.put("overview", "INTERNATIONAL SCHOOL OF MEDICINE was established in 2003\n" +
                "Google Rating -4.5 star\n" +
                "Address- H 12, 21904, Nepal\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/fRe7ReT7JLx\n");

        NEPALGANJ.put("logo", R.drawable.kirov_logo);

        NEPALGANJ.put("image", R.drawable.kirov);

        NEPALGANJ.put("intoduction", "Lord Buddha Educational Academy Ltd arrived with an aim of improving and strengthening the nation by giving excellent performance in the medical sector. Very soon, when it is started, an entire group of well-known medical professionals, distinguished entrepreneurs, famous educationalist and politically known people came forward to achieve the social responsibility and after all this, Nepalgunj Medical College was founded.\n" +
                "The MBBS course was started in 1997 in the college, in 2000 Nursing program was introduced, and in 2007 Post Graduation was begun in NGMC. Also, the College shows to the recommendation of India Medical Council, SAARC Medical Council, Medical Council of Nepal, Medical Council of Srilad and many different countries.\n" +
                "It also serves the curriculum which has been prescribed by the University of Kathmandu. The college is having its own equipped hospitals in the 2 major cities of Banke District, around 800 bedded hospitals for teaching located in Kolhapur and over 200 bedded hospitals situated in NepalgunjNepalgunj Medical College. In this way it is quite successful in contributing high-quality medical services, generating responsible and competitive medical professionals who could serve the whole nation.\n" +
                "NMC is located in western part of Nepal and it is controlled by Lord Buddha Educational Academy.\n" +
                "The College consists of two hospitals that are also eligible for teaching with over 1000 beds. One of the major and 1st teaching hospitals has been situated in Kolhapur with the capacity of around 800 beds. The other teaching hospital has been situated in Nepalgunj town that consists of more than 200 beds.\n" +
                "In December 1997, their MBBS program was begun.\n" +
                "Presently, there is one session that is conducted in the month of August with the admission of around 160 students.\n" +
                "The College is also registered in the ‘World Directory of Medical Schools’. Hence the Bachelors or graduates passed from this College can also appear for PLAB and USMLE test conducted in UK and USA.\n" +
                "Also, the hostel facility inside the campus is available for every student, whether they are doing their graduation or post-graduation. They provide separate hostels for girls and boys.\n" +
                "The Proper accommodation has been provided to the faculty members and the working doctors.\n");


        NEPALGANJ.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        NEPALGANJ.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "26,00,000");
        temp_obj2.put("column2", "10,00,000");
        temp_obj2.put("column3", "10,00,000");
        temp_obj2.put("column4", "10,00,000");
        temp_obj2.put("column5", "10,00,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "46,00,000");

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
        temp_obj6.put("column1", "26,00,000");
        temp_obj6.put("column2", "10,00,000");
        temp_obj6.put("column3", "10,00,000");
        temp_obj6.put("column4", "10,00,000");
        temp_obj6.put("column5", "10,00,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "46,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        NEPALGANJ.put("fee", feeArray);

        NEPALGANJ.put("feedetails", " ");
        NEPALGANJ.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




/////////////////////////////////////////////////////
        JSONObject COLLEGE = new JSONObject();

        COLLEGE.put("country", "NEPAL");

        COLLEGE.put("name", "COLLEGE OF MEDICAL SCIENCE");

        COLLEGE.put("overview", "- COLLEGE OF MEDICAL SCIENCE was established in 1993\n" +
                "Google Rating -4 star\n" +
                "Address- Bharatpur 44207, Nepal\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/PQVXVdhEAiG2\n");

        COLLEGE.put("logo", R.drawable.kirov_logo);

        COLLEGE.put("image", R.drawable.kirov);

        COLLEGE.put("intoduction", "The International Society for Medical Education Pvt. Ltd. (ISME Pvt. Ltd.) - non profit organisation had an agreement with Government of Nepal, which was signed on 8th August 1993 to establish the College of Medical Sciences - at Bharatpur for medical education, promotion of health and training Para-Medical staff in Nepal.\n" +
                "In reality the institution was established under the pioneer leadership of Mr. Nagender K. Pampati, a young MBA from Boston, USA, the Managing Director and Architect of this newly established Institution. The institution has been continuously progressing under the dynamic leadership of young medical graduate from the same institution and the Director of ISME Pvt. Ltd. Dr. V. Natraj Prasad.\n" +
                "College of Medical Sciences is currently headed by Professor A.C. Patowary, FRCPE, DPH (Edin.) as the principal, who was formerly Professor and Head of the Department of Community Medicine, Guwahati Medical College, Director of Medical Education, Planning and Research and Director of Health Services, Government of Assam, India.\n" +
                "\n" +
                "\n" +
                "The College\n" +
                "College of Medical Sciences is affiliated to the Kathmandu University and fully recognized by the Nepal Medical Council. The MBBS course was introduced in 1996.\n" +
                "Further more, the college was recognized by:\n" +
                "The General Medical Council, Great Britain, The ECFMG -U.S.A., The Sri Lankan Medical Council and Enlisted in the W.H.O’s World Directory of Medical Schools.\n" +
                "Recently, the college was inspected by the Medical Council of India (MCI) to give recognition Under Section 12(2) of the MCI act, 1956.\n" +
                "The college has excellent infrastructure and creating the best educational environment in the country having spacious class rooms, air conditioned library, clean hostels, hygienic canteen and furnished accommodation for faculty members.\n" +
                "National & International Collaboration\n" +
                "The college has been coordinating and collaborating with various national teaching Institutions like the B.P.Koirala Institute of Health Sciences, Dharan, B.P.Koirala Memorial Cancer Hospital, Bharatpur Govt. hospital of Bharatpur. The college has also liaison with the Royal College of Physicians of Edinburgh and the Armed Forces Research Institute of Medical Sciences, (AFRIMS) Bangkok, Thailand. Joint research projects related to local health problems are already under taken with collaboration of these institution.\n" +
                "The college already extending cooperation to the local practicing medical professionals, private hospitals, and NGOs. Inspiring local students and also inspiring to opt carrier in medicine, nursing and pharmacy. Medical College actively participating in Government Health Services programs. e.g. the Family Welfare Planning & Ophthalmic Care, Immunization and Tuberculosis control etc.\n");


        COLLEGE.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n" +
                "\n");


        COLLEGE.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "25,00,000");
        temp_obj2.put("column2", "10,00,000");
        temp_obj2.put("column3", "10,00,000");
        temp_obj2.put("column4", "10,00,000");
        temp_obj2.put("column5", "10,00,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "45,00,000");

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
        temp_obj6.put("column1", "25,00,000");
        temp_obj6.put("column2", "10,00,000");
        temp_obj6.put("column3", "10,00,000");
        temp_obj6.put("column4", "10,00,000");
        temp_obj6.put("column5", "10,00,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "45,00,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        COLLEGE.put("fee", feeArray);

        COLLEGE.put("feedetails", " ");
        COLLEGE.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        return KOIRALA;
    }
}
