package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class University_Details_PHILIPPINES {

    private final int varCollegeName;

    public University_Details_PHILIPPINES(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException {
        /////////////////////////////////////////////////////
        JSONObject AMA = new JSONObject();
        AMA.put("country", "PHILIPPINES ");
        AMA.put("name", "AMA COLLEGE OF MEDICINE MAKATI METRO MANILA PHILIPPINES");
        AMA.put("overview", "AMA COLLEGE OF MEDICINE MAKATI METRO MANILA PHILIPPINES was established in 1945\n" +
                "Google Rating -4 star\n" +
                "Address- AMA Bldg. 1, 5486 South Superhighway, Makati, Metro Manila, Philippines\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/dWq4tb42fT52\n");
        AMA.put("logo", R.drawable.ama_logo);
        AMA.put("image", R.drawable.ama_img);
        AMA.put("intoduction", "AMA School of Medicine (AMASOM) is the medical school of AMA Education System (AMAES). It is housed in AMA College Makati, which is strategically located at the heart of Makati City, the Philippines' financial and business capital where the highest concentration of multinational, transnational and local corporations and international organizations and embassies hold their offices. The AMASOM office is at the 8th floor of AMA College Makati, which is located at 5486 South Superhighway, Bangkal, Makati City.\n" +
                "AMASOM has several facilities that are used for enhancement of students’ clinical and practical skills including laboratories for Histology, Gross Anatomy, Microbiology, Parasitology, and Pathology. Students perform hands-on dissection of cadavers in Gross Anatomy. These facilities as well as classrooms for Medicine students are situated at the 7th floor of the AMA One Building.\n" +
                "AMASOM aims to produce competent medical practitioners who are educated on an innovative case-based curriculum that will develop students to become self-directed and lifelong learners - qualities that will prepare them for professional practice. This is a hybrid curriculum designed to synchronize the basic science concepts and to utilize case-based scenarios to integrate concepts related to the basic science disciplines. The clinical disciplines are integrated vertically using a problem-based learning strategy to integrate concepts in the clinical disciplines. The AMA Medical Curriculum incorporates Information Technology-based capabilities to enhance learning and assessments, as this is strength that is offered by AMAES.\n" +
                "The four-year curriculum equips the students with clinical reasoning, problem-solving and critical thinking skills with emphasis on interdisciplinary and life-long learning. The first three years provide the students with an integrated understanding of the basic and clinical sciences in the classroom and community settings. The fourth year of the curriculum is devoted to the application of the basic and clinical concepts in actual clinical and community settings.\n" +
                "Selected subjects which include ethical and legal aspects of the practice of medicine, epidemiologic and health research programs and the practice of profession enhance the medical curriculum.\n" +
                "The medical curriculum also employs various teaching-learning and assessment strategies to achieve the educational goals. As early as the First Year, the students are exposed to cases that would allow them to relate basic science concepts to clinical practice. The First Year of the curriculum is designed as modules or blocks based on organ systems with similar or related functions. This instructional plan aims to synchronize topics in Anatomy, Biochemistry and Physiology. Correlation of selected concepts will be achieved through case discussion in a problem-based tutorial session, team learning and case method activities.\n" +
                "The Second and Third Years of the curriculum are a continuum of organ-based modules that integrate basic and clinical concepts. Problem-based learning (PBL) is a principal teaching-learning activity augmented by correlate activities as lectures, laboratory exercises and case method discussions. The students in a PBL small group setting (ratio of 1 tutor to at most 10 students) encounter and discuss problems common to practice.\n" +
                "The Fourth Year, which is the final year, allows the students to learn from clinical materials in affiliate hospitals and community settings.\n" +
                "Evaluation of student performance is based on the curriculum design where small group learning is a predominant activity. Assessment includes written examinations, practical examinations, clinical observations, and tutorial or case discussion participation and attitude development.\n" +
                "AMASOM boasts of a faculty from different excellent academic backgrounds and fields of specialization.\n" +
                "In summary, AMASOM is a student-centered Medicine school with the following features:\n" +
                "• Four-year integrated curriculum with an ideal faculty-to-student ratio\n" +
                "• Clinically oriented and problem-based method of teaching and learning\n" +
                "• Non-traditional lecture and instructional modules\n" +
                "• Hands-on anatomy dissection\n" +
                "• Faculty established in their chosen fields of specialization and in the academe\n" +
                "• Affordable, flexible payment schemes\n" +
                "• Affiliated with government hospitals and private health institutions\n" +
                "• Outstanding facilities and resources conducive to learning\n" +
                "The MD degree at AMASOM is recognized by the Medical Council of India (MCI) as equivalent to the Bachelor of Medicine and Bachelor of Surgery (MBBS) degree similarly offered in the UK, Australia, India and other Commonwealth countries. After their MD graduation from AMASOM, Indian students will be given a license to practice in India similar to the MBBS doctors from India after completion of licensing formalities with the MCI.\n");
        AMA.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. " +
                "This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        AMA.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");
        JSONArray feeArray = new JSONArray();
        JSONObject temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "3,00,000");
        temp_obj2.put("column2", "2,50,000");
        temp_obj2.put("column3", "2,50,000");
        temp_obj2.put("column4", "1,50,000");
        temp_obj2.put("column5", "1,00,000");
        temp_obj2.put("column6", "");
        temp_obj2.put("column7", "10,50,000");
        JSONObject temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "4,20,000");
        temp_obj3.put("column2", "3,50,0000");
        temp_obj3.put("column3", "3,50,000");
        temp_obj3.put("column4", "2,10,000");
        temp_obj3.put("column5", "1,40,000");
        temp_obj3.put("column6", "2,58,000");
        temp_obj3.put("column7", "14,70,000");
        JSONObject temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "");
        temp_obj4.put("column2", "");
        temp_obj4.put("column3", "");
        temp_obj4.put("column4", "");
        temp_obj4.put("column5", "");
        temp_obj4.put("column6", "");
        temp_obj4.put("column7", "");
        JSONObject temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "1,40,000");
        temp_obj5.put("column2", "1,40,000");
        temp_obj5.put("column3", "1,40,000");
        temp_obj5.put("column4", "1,40,000");
        temp_obj5.put("column5", "1,40,000");
        temp_obj5.put("column6", "1,40,000");
        temp_obj5.put("column7", "84,00,000");
        JSONObject temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "5,60,000");
        temp_obj6.put("column2", "4,90,000");
        temp_obj6.put("column3", "4,90,000");
        temp_obj6.put("column4", "3,50,000");
        temp_obj6.put("column5", "2,80,000");
        temp_obj6.put("column6", "");
        temp_obj6.put("column7", "21,70,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        AMA.put("fee", feeArray);
        AMA.put("feedetails", " ");
        AMA.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");
        /////////////////////////////////////////////////////
        JSONObject PERPETUAL = new JSONObject();
        PERPETUAL.put("country", "PHILIPPINES");
        PERPETUAL.put("name", "UNIVERSITY OF PERPETUAL HELP LAS PINAS");
        PERPETUAL.put("overview", "UNIVERSITY OF PERPETUAL HELP LAS PINASwas established in 1968\n" +
                "Google Rating -5 star\n" +
                "Address- 1740 Alabang–Zapote Road, Almanza Uno, Las Pinas, Metro Manila, Philippines\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/aJQdP9fryex\n");
        PERPETUAL.put("logo", R.drawable.perpetual_logo);
        PERPETUAL.put("image", R.drawable.perpetual_img);
        PERPETUAL.put("intoduction", "The University of Perpetual Help System DALTA shall emerge as a premier university in the Philippines. It shall provide a venue for the pursuit of excellence in academics, technology, and research through local and international linkages.\n" +
                "The University shall take the role of a catalyst for human development. It shall inculcate Christian values and Catholic doctrine, as a way of strengthening the moral fibre of the Filipino, a people who are “Helpers of God”, proud of their race and prepared for the exemplary global participation in the sciences, arts, humanities, sports and business.\n" +
                "It foresees the Filipino people enjoying a quality of life in abundance, living in peace and building a nation that the next generation will nourish, cherish and value.\n" +
                "The UNIVERSITY OF PERPETUAL HELP SYSTEM DALTA is dedicated to the development of the Filipino as a leader. It aims to graduate dynamic students who are physically, intellectually, socially and spiritually committed to the achievement of the highest quality of life.\n" +
                "As a system of Service in Health and in education, it is dedicated to the formation of Christ-cantered, service-oriented and research-driven individuals with great social concern and commitment to the delivery of quality education and health care.\n" +
                "It shall produce Perpetuities as “Helpers of God” – a vital ingredient to nation building.\n");
        PERPETUAL.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        PERPETUAL.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");
        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "3,00,000");
        temp_obj2.put("column2", "2,50,000");
        temp_obj2.put("column3", "2,50,000");
        temp_obj2.put("column4", "1,50,000");
        temp_obj2.put("column5", "1,50,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "11,00,000");
        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "4,20,000");
        temp_obj3.put("column2", "4,20,000");
        temp_obj3.put("column3", "2,80,000");
        temp_obj3.put("column4", "2,10,000");
        temp_obj3.put("column5", "2,10,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "14,70,000");
        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");
        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "1,40,000");
        temp_obj5.put("column2", "1,40,000");
        temp_obj5.put("column3", "1,40,000");
        temp_obj5.put("column4", "1,40,000");
        temp_obj5.put("column5", "1,40,000");
        temp_obj5.put("column6", "1,40,000");
        temp_obj5.put("column7", "7,00,000");
        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "5,60,000");
        temp_obj6.put("column2", "5,60,000");
        temp_obj6.put("column3", "4,20,000");
        temp_obj6.put("column4", "3,50,000");
        temp_obj6.put("column5", "3,50,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "22,40,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        PERPETUAL.put("fee", feeArray);
        PERPETUAL.put("feedetails", " ");
        PERPETUAL.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");
        /////////////////////////////////////////////////////
        JSONObject CAGAYAN = new JSONObject();
        CAGAYAN.put("country", "PHILIPPINES");
        CAGAYAN.put("name", "CAGAYAN STATE UNIVERSITY");
        CAGAYAN.put("overview", "CAGAYAN STATE UNIVERSITY was established in 1978\n" +
                "Google Rating -4 star\n" +
                "Address- Tuguegarao, Cagayan, Philippines MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/UZdFfbks4xA2\n");
        CAGAYAN.put("logo", R.drawable.cagayan_logo);
        CAGAYAN.put("image", R.drawable.cagayan_img);
        CAGAYAN.put("intoduction", "As representative of the Province of Cagayan in the Interim BatasangPambansa, then Minister (later Senate President) Juan Ponce Enrile drafted the Charter of the Cagayan State University that was signed into law as Presidential Decree No. 1436 by President Ferdinand E. Marcos on June 11, 1978. Except for provisions on the composition, powers and selection of the members of the governing board, the Charter has since remained unchanged.\n" +
                "It certainly was not creation out of nothing. Rather, the Charter consolidated existing post-secondary institutions, converting them into a single legal entity. These were the Cagayan Valley College of Arts and Trades at Tuguegarao, the Northern Luzon State College of Agriculture at Piat, the Aparri Institute of Technology, the Cagayan Valley Agricultural College at Lallo, the Bukig National Agricultural and Technical School in Aparri West, the Sanchez Mira Rural Vocational School, the Western Cagayan School of Arts and Trades at Lasam and the Gonzaga National Agricultural and Technical School. It is this fact that explains the present constellation of campuses of the Cagayan State University: Andrews (Caritan), Piat, Lasam, Lallo, Aparri, Sanchez Mira, and Gonzaga. When the university commenced operations, a site in Carig was developed - to which the Central Administration of the university would later transfer from Caritan. It is the Carig site that has evolved, by Board sufferance, into the Carig Campus, although the Central Administration has since returned to the Andrews Campus at Caritan\n" +
                "While the university was formed from pre-existing institutions that were mainly agricultural and technical, its Charter, Presidential Decree No. 1436, made it exceedingly clear that it was the intendment of the law that the university was to provide \"better service in professional and technical training in the arts, sciences, humanities, and technology and in the conduct of scientific research and technological studies\". Without a doubt then and by express legislative mandate, the university was not to be an agricultural, fisheries or technological university - although these remain vital and highly crucial concerns of CSU - but a \"comprehensive university\", a university as that term is understood in the academic world!\n" +
                "Academics of note were the first university officials, headed by Dr. Manuel Corpus from the University of the Philippines, and Dr.JoselitoJara, who did a doctorate in educational philosophy from the University of Maryland as Vice-President for Academic Affairs. The officials of the pre-existing colleges that were consolidated into the university were designated as \"Campus Deans\" and continued to supervise their respective campuses.\n" +
                "It was a truly enlightened decision of the Board of Regents to authorize the opening of a College of Medicine - the very first in the region, and an agreement with what was then the Cagayan Valley Regional Hospital (now the Cagayan Valley Medical Center) made the latter the training hospital of the College of Medicine. The first dean was a nationally recognized neurologist-psychologist, Dr. Gilberto Gamez of the Faculty of Medicine and Surgery of the University of Santo Tomas.\n" +
                "Soon after, other professional courses followed: Medical Technology, Engineering and Liberal Arts courses. Guided by what the National Economic and Development Authority (NEDA) has identified as priority courses of the Region, the university has always offered degree programs in the \"hard sciences\" - mathematics, physics, chemistry, biology - although, especially in regard to chemistry and physics, these have not been popular programs at all. But CSU now has a competent and highly credible corps of professors in these very disciplines!\n");
        CAGAYAN.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        CAGAYAN.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");
        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "3,00,000");
        temp_obj2.put("column2", "2,00,000");
        temp_obj2.put("column3", "2,00,000");
        temp_obj2.put("column4", "2,00,000");
        temp_obj2.put("column5", "2,00,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "11,00,000");
        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "4,20,000");
        temp_obj3.put("column2", "4,20,000");
        temp_obj3.put("column3", "2,80,000");
        temp_obj3.put("column4", "2,10,000");
        temp_obj3.put("column5", "2,10,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "14,70,000");
        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");
        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "1,40,000");
        temp_obj5.put("column2", "1,40,000");
        temp_obj5.put("column3", "1,40,000");
        temp_obj5.put("column4", "1,40,000");
        temp_obj5.put("column5", "1,40,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "7,00,000");
        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "5,60,000");
        temp_obj6.put("column2", "5,60,000");
        temp_obj6.put("column3", "4,20,000");
        temp_obj6.put("column4", "3,50,000");
        temp_obj6.put("column5", "3,50,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "22,40,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        CAGAYAN.put("fee", feeArray);
        CAGAYAN.put("feedetails", " ");
        CAGAYAN.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");


        /////////////////////////////////////////////////////
        JSONObject LYCEUM = new JSONObject();
        LYCEUM.put("country", "PHILIPPINES");
        LYCEUM.put("name", "LYCEUM NORTHWESTERN UNIVERSITY");
        LYCEUM.put("overview", "LYCEUM NORTHWESTERN UNIVERSITY was established in 1969\n" +
                "Google Rating -4.3 star\n" +
                "Address- Tapuac District, Dagupan, 2400 Pangasinan, Philippines\n" +
                " MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/iWgPa9e62hp\n");
        LYCEUM.put("logo", R.drawable.lyceum_logo);
        LYCEUM.put("image", R.drawable.lyceum_img);
        LYCEUM.put("intoduction", "Produce graduates who are ethically and socially responsible employees of choice, entrepreneurs and leaders in both public and private sector institutions.\n" +
                "Lyceum-Northwestern University endeavors to pursue the following objectives:\n" +
                "1. Excellence in Teaching\n" +
                "Undergraduate and graduate education that meet high academic standards and enable students to realize their full potentials; strong faculty leadership in teaching, research and public engagement; quality innovative education that integrates research and public engagement with teaching.\n" +
                "2. Excellence in Research\n" +
                "Active research community that stimulates new ideas and discoveries that lead to innovations and new technologies and strengthen University knowledge, skills and expertise.\n" +
                "3. Excellence in Public Engagement\n" +
                "Optimized institutional and individual contribution of knowledge, skills and expertise toward contributing to the economic, social, cultural, and environment development of communities.\n" +
                "4. Excellence in Governance and Stewardship\n" +
                "Enhanced policies, systems, structures, and processes that promote and support the core mission of the University.\n");
        LYCEUM.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        LYCEUM.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");
        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "25,785");
        temp_obj2.put("column2", "25,785");
        temp_obj2.put("column3", "25,785");
        temp_obj2.put("column4", "25,785");
        temp_obj2.put("column5", "25,785");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "1,28,925");
        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "3,61,000");
        temp_obj3.put("column2", "3,61,000");
        temp_obj3.put("column3", "3,61,000");
        temp_obj3.put("column4", "3,61,000");
        temp_obj3.put("column5", "3,61,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "18,05,000");
        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");
        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "1,20,000");
        temp_obj5.put("column2", "1,20,000");
        temp_obj5.put("column3", "1,20,000");
        temp_obj5.put("column4", "1,20,000");
        temp_obj5.put("column5", "1,20,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "6,00,000");
        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "5,31,000");
        temp_obj6.put("column2", "4,81,000");
        temp_obj6.put("column3", "4,81,000");
        temp_obj6.put("column4", "4,81,000");
        temp_obj6.put("column5", "4,81,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "24,55,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        LYCEUM.put("fee", feeArray);
        LYCEUM.put("feedetails", " ");
        LYCEUM.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");

/////////////////////////////////////////////////////
        JSONObject EMILIO = new JSONObject();
        EMILIO.put("country", "PHILIPPINES");
        EMILIO.put("name", "EMILIO AGUINALDO COLLEGE");
        EMILIO.put("overview", "EMILIO AGUINALDO COLLEGE was established in 1957\n" +
                "Google Rating -4.3 star\n" +
                "Address- Paco, Manila, Metro Manila, Philippines\n" +
                " MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/iWgPa9e62hp\n");
        EMILIO.put("logo", R.drawable.emilio_logo);
        EMILIO.put("image", R.drawable.emilio_img);
        EMILIO.put("intoduction", "THE HISTORY OF EMILIO AGUINALDO COLLEGE The history of EMILIO AGUINALDO COLLEGE begins with a man who had a dream — Dr. Paulo C. Campos, President of the University Physicians’ Services, Inc. (UPSI), who was its founding President, and where Emilio Aguinaldo College belongs among its subsidiaries. BACKGROUND The forerunner of Emilio Aguinaldo College was the Marian School of Midwifery founded in 1957, under the management of the Marian Clinics, Inc., headed by Dr. Jose Fontanilla as principal. In 1959 Dr.Crisanto S. Vito Cruz and Dr. Gregorio T. Delgado, together with Mrs. Lolita R. Vito Cruz established the ?rst Medical Secretarial School in the country. This was followed by the founding of the Marian School of Nursing headed by Ms. Carmen Karganilla. Mrs. Julia Vasquez was the head of the School of Midwifery. THE UPSI TAKE OVER The University Physicians’ Services, Inc. took over management of the school in 1973. Under the new management and with medical consultants and staff of Medical Center Manila, the development of the school as an institution of higher learning accelerated. The school became Marian Junior College, and in the same year, with the opening of new courses, the School of Food Service and Technology and the Dietetic Internship Program under Mrs. Rachel C. Fajardo, its status was elevated to a full-?edged college known as Marian College. The team headed by Dr. Paulo C. Campos as president, included Mrs. Soledad L. Dolor, Chairman of the Board, Sister Imelda Palanca as administrator, and Dr. Elias Imperial as Vice President for Educational Services. In 1975, Dr. Antonio D. Talusan took over as VP for Educational Services. In 1975, the EAC campus was established along Romualdez St., Ermita, Manila with the acquisition of the Tabacalera property and the Metaltek buildings. An innovative academic program, Medical Arts and Photography, with Dr.Crisanto Vito Cruz as Director, was started on this year. Also given government recognition was the 4-year course, Bachelor of Science in Secretarial Administration, popularly known as “Med Sec.” Additional courses were offered the following year, namely, the College of Arts and Sciences, headed by Dean CarmitaLegarda, offering Bachelor of Arts (AB) and Bachelor of Science (BS) programs. The Bachelor of Science in Nursing, followed by BSN Supplemental Course, were also given government recognition, thus establishing the College of Nursing. The Academic and Administrative Staff included Dean CarmitaLegarda, Chancellor and Academic Dean; CresencioTadena, Director for Educational Planning and Research; Mrs. Catalina Tible, Registrar; and Mrs. Daisy Barzaga, College Secretary, later to become the ?rst Dean of Student Affairs. In line with the government’s policy on the dispersal and decongestion of the student population in Metro Manila, particularly in institutions of higher learning, as well as the need for regional development and democratization of opportunities, Marian College began building the ?rst school units in Dasmarinas, Cavite in 1977.");
        EMILIO.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        EMILIO.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");
        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "3,53,961");
        temp_obj2.put("column2", "2,21,705");
        temp_obj2.put("column3", "2,21,705");
        temp_obj2.put("column4", "2,21,705");
        temp_obj2.put("column5", "2,21,705");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "12,40,781");
        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "4,80,000");
        temp_obj3.put("column2", "3,00,000");
        temp_obj3.put("column3", "3,00,000");
        temp_obj3.put("column4", "3,00,000");
        temp_obj3.put("column5", "3,00,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "16,80,000");
        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "");
        temp_obj4.put("column2", "");
        temp_obj4.put("column3", "");
        temp_obj4.put("column4", "");
        temp_obj4.put("column5", "");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "");
        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "1,68,000");
        temp_obj5.put("column2", "1,68,000");
        temp_obj5.put("column3", "1,68,000");
        temp_obj5.put("column4", "1,68,000");
        temp_obj5.put("column5", "1,68,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "8,40,000");
        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "6,48,000");
        temp_obj6.put("column2", "4,68,000");
        temp_obj6.put("column3", "4,68,000");
        temp_obj6.put("column4", "4,68,000");
        temp_obj6.put("column5", "4,68,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "25,20,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        EMILIO.put("fee", feeArray);
        EMILIO.put("feedetails", " ");
        EMILIO.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");

/////////////////////////////////////////////////////
        JSONObject FATIMA = new JSONObject();
        FATIMA.put("country", "PHILIPPINES");
        FATIMA.put("name", "OUR LADY OF FATIMA MEDICAL COLLEGE PHILIPPINES (OLFU)");
        FATIMA.put("overview", "OUR LADY OF FATIMA MEDICAL COLLEGE PHILIPPINES (OLFU)was established in 1967\n" +
                "Google Rating -4.3 star\n" +
                "Address- MacArthur Highway, Bgy. Marulas, Valenzuela, 1440 Metro Manila, Philippines\n" +
                " MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/QvKjhNRKegn\n");
        FATIMA.put("logo", R.drawable.fatima_logo);
        FATIMA.put("image", R.drawable.fatima_img);
        FATIMA.put("intoduction", "A HUMBLE BEGINNING. In 1967, Jose C. Olivares, a Chemistry professor-entrepreneur and his son-in-law Dr. Vicente M. Santos, a physician, founded Our Lady of Fatima Hospital in Valenzuela, a former municipality of Bulacan. The hospital immediately became the primary provider of medical and health care services for the residents of    Valenzuela.\n" +
                "Mr. Olivares, who was then a professor at the Ateneo de Manila University, envisioned a dream for Fatima.  He set his eyes in transforming the Our Lady of Fatima Hospital from a general hospital to a medical complex that will be the training ground for health care providers such as nurses and midwives.  Thus, in 1973, the Our Lady of Fatima College of Nursing was established.  And in 1976, the first batch of Nursing graduates garnered an unprecedented 100% passing average in the Nursing Board examinations.\n" +
                "As a result of the growth in enrollment in the mid-70’s, the College expanded its facilities and instituted more curricular programs.  In 1979, Dr. Vicente M. Santos, together with his wife Mrs. Juliet Olivares Santos, pursued the vision of Mr. Olivares even further by establishing the Fatima Medical Science Foundation, Inc. - Fatima College of Medicine.  Since then, Fatima College of Medicine has made its mark in medical education by producing holistically-empowered graduates who are consistent Medical Board topnotchers and highly respected medical physicians.\n" +
                "In the 1990’s, a more progressive and responsive perspective was embodied by Fatima Medical Science Foundation, Inc. and Our Lady of Fatima College.  As a response to the changing social and technological environment, the college engaged in new academic programs particularly in technology, maritime education, and business while at the same time fortifying and improving its performance in the paramedical courses, which Fatima is known for.\n" +
                "EARLY RECOGNITIONS. In its journey towards academic excellence, Our Lady of Fatima College received official recognition by achieving accredited status in its Nursing and Physical Therapy programs by the Philippine Association of Colleges and Universities Commission on Accreditation (PACUCOA). The Association of Christian Schools, Colleges and Universities (ACSCU), another prestigious accrediting body, would eventually give its mark of\n" +
                "excellence to our Graduate School programs in MA in Nursing, MA in Educational Management, MA in Teaching, Master in Public Administration, Master in Business     Administration, together with our undergraduate programs in Psychology and Biology.  Fatima Medical Science Foundation- Fatima College of Medicine was also accredited by the Association of Philippine Medical Colleges, the New York State Board of Education and the Illinois State Board of Education.  The College of Maritime Education, in turn, was ISO certified 9002: 1994 and included in the Commission on Higher Education’s White List (in 1998) as a qualified provider of maritime education\n" +
                "EARLY EXPANSION: QUEZON CITY. The next five years further saw a dramatic increase in infrastructure development. Modern buildings were established in Valenzuela City. OLFU made its presence known in Fairview, Quezon City with its new campus overlooking the La Mesa reservoir.\n" +
                "In 1996, the institution started to offer two programs, the Bachelor of Science in Physical Therapy and BS in Occupational Therapy and the students were housed at Fatima Physical Rehabilitation Center and Eye Clinic at Regalado, Fairview, Quezon City. On the succeeding year, the program offerings increased, namely BS in HRM, BS in Tourism, BS in Psychology, BS in Biology, BS in Nursing and BS in Computer Science.\n" +
                "With the increase of the programs, OLFU expanded the infrastructure to Hilltop, Lagro with an eight storey building, the College of Arts and Sciences Building. In 2001, another building was constructed, the Saint Jerome Building.  In the succeeding years, the institution further offered more  programs  namely BS in Education major in English, BEED major in  Preschool Education, BS in Information Technology, BS in Criminology, BS in Pharmacy, BS in Medical Technology, BS in Entrepreneurship, BS in Business Administration major in Marketing Management and other Allied Sciences and Health Education. In response to the growing population, two more buildings were constructed in Hilltop such as the Vicente Santos Building and the Basic Education Building and one building in Regalado Avenue where the Virtual Laboratory of the College of Nursing is located, particularly. To enhance the students’ athletic and physical fitness experience, the new and complete Athletic Center at Hilltop was constructed last year. It offers state-of-the-art amenities and facilities such as a basketball court, an inner jogging path, a semi-olympic swimming pool and a physical fitness gym.\n");
        FATIMA.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");
        FATIMA.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");
        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "4,70,000");
        temp_obj2.put("column2", "2,35,000");
        temp_obj2.put("column3", "2,35,000");
        temp_obj2.put("column4", "2,35,000");
        temp_obj2.put("column5", "2,35,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "14,10,000");
        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "6,58,000");
        temp_obj3.put("column2", "3,29,000");
        temp_obj3.put("column3", "3,29,000");
        temp_obj3.put("column4", "3,29,000");
        temp_obj3.put("column5", "3,29,000");
        temp_obj3.put("column6", "-");
        temp_obj3.put("column7", "19,74,000");
        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");
        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "1,40,000");
        temp_obj5.put("column2", "1,40,000");
        temp_obj5.put("column3", "1,40,000");
        temp_obj5.put("column4", "1,40,000");
        temp_obj5.put("column5", "1,40,000");
        temp_obj5.put("column6", "-");
        temp_obj5.put("column7", "7,00,000");
        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "7,98,000");
        temp_obj6.put("column2", "4,69,000");
        temp_obj6.put("column3", "4,69,000");
        temp_obj6.put("column4", "4,69,000");
        temp_obj6.put("column5", "4,69,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "26,74,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);
        FATIMA.put("fee", feeArray);
        FATIMA.put("feedetails", " ");
        FATIMA.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");


        JSONArray allColleges = new JSONArray();
        allColleges.put(AMA);
        allColleges.put(PERPETUAL);
        allColleges.put(CAGAYAN);
        allColleges.put(LYCEUM);
        allColleges.put(EMILIO);
        allColleges.put(FATIMA);

        return allColleges.getJSONObject(varCollegeName);
    }
}
