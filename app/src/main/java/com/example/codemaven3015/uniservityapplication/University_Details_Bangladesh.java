package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class University_Details_Bangladesh {
    private int varCollegeName;


    public University_Details_Bangladesh(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException {
        JSONObject obj = new JSONObject();

        obj.put("country", "BANGLADESH");

        obj.put("name", "ANWER KHAN MODERN MEDICAL COLLEGE");

        obj.put("overview", "ANWER KHAN MODERN MEDICAL COLLEGE was established in 1971\n" +
                "Google Rating -4 star\n" +
                "Address- Road No.8, House No. 17 Dhanmondi, Dhaka 1205, Bangladesh\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/bio9coDmpjH2\n");

        obj.put("logo", R.drawable.kirov_logo);

        obj.put("image", R.drawable.kirov);

        obj.put("intoduction", "Reaching health care to every citizen is a millennium development goal and Bangladesh has achieved a great success in this. The present government has developed the healthcare system from union Parishad to Upazilla, District, Divisional level through community health clinic, Upazilla health complex, District & Divisional Hospital and Medical College Hospital both government & private. Doctors and supporting health care professional like nurse, Paramedics, auxiliary staff, Technologists are the backbone of the health care delivery system. At present the doctor population ratio in Bangladesh is only 1:3125.\n" +
                "\n" +
                "Till now the available seats in medical colleges, public & private sector together is far short of meeting the requirement of the country. In our country a large number of students are willing to take part in the health care system, which is evidenced by the large number of applicants for admission tests in medical colleges. Unfortunately most of the eligible candidates are deprived from the opportunity of getting admitted in the medical colleges of Bangladesh due to lack of enough seats: This results in\n" +
                "\n" +
                "    1. Career planning of the eligible candidates, whose desires and dreams were quite appropriate and invaluable to the needs of the country.\n" +
                "    2. Migration of thousands of students for studies abroad, mainly in the neighboring countries resulting in constant drain of national economy for supporting studies.\n" +
                "    3. Social strains in the families concerned.\n" +
                "    4. Long term deleterious consequences on national health care delivery.\n" +
                "    5. Dependence on other countries for education and health care delivery. The overall impact overshadows out image and dignity as an independent nation.\n" +
                "\n" +
                "The Campus\n" +
                "A beautiful arranged modern campus with well-equipped academic and hospital buildings is the beauty of the area. It is situated at Road 8, Dhanmondi, Dhaka 1205, at the heart of the capital market. The first building (F) consists of Principal office, college secretary and administration block 1 lecture room for 200 students with multimedia presentation facilities. Also a modern library with 5000 recent medical text books on different disciplines and internet facilities, computer room were available for students and academic staff of the college. Adjacent to college building. block A,B,C,D are no used as hospitals with general beds, cabin. AKMMC main hospital building accommodates cabins, general wards, consultant chambers, operation theater, ICU, reception, modern diagnostic lab and hospital office. 2 lecture room one large with 300 seat capacity and one small with full air conditioned, multimedia presentation facilities, are located in 5th& 6th floor of Block A. Fully air conditioned, modern, well decorated and equipped floor space measuring 20,500 square feet at 4th& 5th floor of capital market is accommodating departments of Anatomy, Physiology, Biochemistry, Pathology, Pharmacology, Forensic Medicine, Microbiology, Community Medicine with tutorial and practical classes, museum and sitting arrangement of all academic staff of the departments mentioned. 1 lecture room with central air-conditioning, multimedia presentation and accommodations of 150 students is located in 5th floor of capital market Fulltime OPD facilities covering all disciplines Medicine, Surgery Pediatrics, Gyane& Obstetrics: Skin VD, ENT Eye, Psychiatry, Orthopedics and Oncology ate available at OPD located in 2nd& 3rd floor of first main building (A) of the college. Anwer Khan Modern Nursing college is a unit under AKMMC is located in 3rd floor of ARA plaza just opposite to our main building A covering 4000 sft accommodating 3 xlass room, 5 lecture room, 3 faculty room, 10 office assistant, 1 MLSS. Total no of students admitted up to this session is 120 (Diploma 83,33 BSc Nursing, Post basic Nursing 14.)\n" +
                "\n" +
                "Available Facilities\n" +
                "    Five lecture halls with state of the art audiovisual facilities.\n" +
                "    Adequate spacious class rooms for all the departments.\n" +
                "    Laboratories for different departments.\n" +
                "    Central computerized library with the internet facility\n" +
                "    Office space for college administration and management.\n" +
                "    All facilities mentioned above are fully air-conditioned.\n" +
                "    Prayer facilities for the students & staff.\n" +
                "    Cafeteria facilities for the students & staff.\n" +
                "\n" +
                "Proposed facilities\n" +
                "    Auditorium.\n" +
                "    Healthcare facilities with gymnasium.\n" +
                "    Own hall or residence for students.\n" +
                "    Other facilities as would be necessary.\n" +
                "    Own transport facility.\n");


        obj.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n" +
                "\n" +
                "\n");


        obj.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        JSONArray feeArray = new JSONArray();
        JSONObject temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "13,00,000");
        temp_obj2.put("column2", "3,575");
        temp_obj2.put("column3", "3,575");
        temp_obj2.put("column4", "3,575");
        temp_obj2.put("column5", "3,575");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "27,80,000");

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
        temp_obj6.put("column1", "13,02,000");
        temp_obj6.put("column2", "3,575");
        temp_obj6.put("column3", "3,575");
        temp_obj6.put("column4", "3,575");
        temp_obj6.put("column5", "3,575");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "27,80,000");
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

        DHAKA.put("country", "BANGLADESH");

        DHAKA.put("name", "DHAKA CENTRAL INT MEDICAL COLLEGE");

        DHAKA.put("overview", "- DHAKA CENTRAL INT MEDICAL COLLEGE was established in 1925\n" +
                "Google Rating -4 star\n" +
                "Address- 1228 East Monipur Road, Dhaka 1216, Bangladesh\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/X2qQpeL31At\n");

        DHAKA.put("logo", R.drawable.kirov_logo);

        DHAKA.put("image", R.drawable.kirov);

        DHAKA.put("intoduction", "Doctors and Supporting health professionals are the backbone of the health care delivery system. Yet the health care professionals & population ratio in our country is still one of the lowest in the world. At present the doctor population ratio in Bangladesh is 1: 3125. Till now the available seats in medical colleges, public & private sector together is far too short to meet the requirement of the countries ever growing need in this sector. In our country a large number of students are willing to take part in the health care system, which is evidenced by the large number of applicants for admission in medical colleges.\n" +
                "Unfortunately most of the eligible candidates are deprived from the opportunity of getting admitted in the medical colleges of Bangladesh due to lack of enough seats: This results in confusion over the career planning of the eligible candidates, whose desires and dreams to be a doctor would be nipped in the bud. Also migration of thousands of students for studying abroad, mainly in the neighboring countries resulting in constant draining of our national economy for supporting their studies and as a consequence dependence on other countries for education and health care delivery grows immensely. In this context, Dhaka Central International Medical College and Hospital is a humble initiative to provide scope for the eligible candidates to contribute in the health sector of Bangladesh. DCIMCH is a brainchild of some of the most generous business entrepreneur, doctors and Philanthropist.\n" +
                "The Dhaka Central International Medical College and Hospital is one of the leading medical college providing education and health care services of truly global standards. A comprehensive range of general and super specialty medical services are provided here.\n" +
                "The college focuses to deliver high quality, comprehensive, integrated medical education including innovative thoughts towards modern technology and research. We provide the finest in infrastructure and facilities to our students when it comes to learning and research along with experienced and dedicated faculty, outstanding clinical facilities, and a world-class environment that supports education. We offer different courses including medicine, dentistry, nursing, allied sciences and many more.\n" +
                "The College comprising of well-trained personnel provides focused health care services. We are successfully accomplishing our mission of serving the society with our widespread infrastructure, state-of-the-art equipment, backed by the nation’s best professionals, equals those available globally.\n" +
                "DCIMCH provides a 24-hour, seven-day-a-week services. Departments like emergency department, critical care unit, blood bank, central diagnostic Lab and ambulance services works round the clock to implement the growing requirements of patients.\n" +
                "DCIMCH serves over thousands of patients annually. As a leading educational and health care organization DCIMCH develops and maintains a spirit of charity and cooperation with the primary goal of improving patient safety and of promoting health in rural and underserved communities. DCIMCH wish to rise above the realm of therapeutic care with a new focus on preventive care, to bring health to the community.\n");


        DHAKA.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n" +
                "\n");


        DHAKA.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

         feeArray = new JSONArray();
      temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "7,80,000");
        temp_obj2.put("column2", "3,25,000");
        temp_obj2.put("column3", "3,25,000");
        temp_obj2.put("column4", "3,25,000");
        temp_obj2.put("column5", "3,25,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "20,80,000");

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
        temp_obj6.put("column1", "7,80,000");
        temp_obj6.put("column2", "3,25,000");
        temp_obj6.put("column3", "3,25,000");
        temp_obj6.put("column4", "3,25,000");
        temp_obj6.put("column5", "3,25,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "20,80,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        DHAKA.put("fee", feeArray);

        DHAKA.put("feedetails", " ");
        DHAKA.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");






        /////////////////////////////////////////////////////
        JSONObject JALALABAD = new JSONObject();

        JALALABAD.put("country", "BANGLADESH");

        JALALABAD.put("name", "JALALABAD RAGIB-RABEYA MEDICAL COLLEGE");

        JALALABAD.put("overview", "- JALALABAD RAGIB-RABEYA MEDICAL COLLEGE was established in 1995\n" +
                "Google Rating -4.5 star\n" +
                "Address- 29/5 Pathantola Rd, Sylhet, Bangladesh\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/SWxw4WXxxYK2\n");

        JALALABAD.put("logo", R.drawable.kirov_logo);

        JALALABAD.put("image", R.drawable.kirov);

        JALALABAD.put("intoduction", "Jalalabad Ragib-Rabeya Medical College, Sylhet is situated in divisional headquarter of Sylhet Division and located at Ragib-Rabeya Medical College Road, Pathantula, Sylhet, Bangladesh. Jalalabad Ragib-Rabeya Medical College, Sylhet which is about 225 km from Dhaka, the capital of Bangladesh. Sylhet is the land of saints and sufis and may be termed as the spiritual centre of Bangladesh. It is surrounded by lush tea gardens, hills and valleys in a picturesque landscape. It has an excellent rail, road, air and river communications linking with capital City Dhaka as well as Port City Chittagong. It takes only 22 minutes by air from Dhaka to Sylhet and 41/2 hours by road.\n" +
                "\n" +
                "COLLEGE ACCOMMODATION\n" +
                "The college has two 10 storied twin tower near the hospital building. Six floors of each buildings is now completed and remaining four floors of each building are to be completed very soon. At present the college is having 3,64,600sft. After completion of the 10 storied twin tower the total floor space of the college will be 5,13,300sft.\n" +
                "\n" +
                "YEAR OF ESTABLISHMENT\n" +
                "1995\n" +
                "FOUNDER\n" +
                "JanabDr.Ragib Ali - A renowned Philanthropist\n" +
                "PERMISSION OF THE GOVERNMENT\n" +
                "Permanent permission.\n" +
                "\n" +
                "RECOGNITION OF THE COLLEGE\n" +
                "Recognized by Bangladesh Medical and Dental Council (BMDC).\n" +
                "AFFILIATION\n" +
                "Affiliated with Shahjalal University of Science and Technology, Sylhet (A renowned public university).\n" +
                "ELIGIBILITY FOR THE ADMISSION OF FOREIGN STUDENTS\n" +
                "Eligible.\n" +
                "ENLISTMENT OF MEDICAL COLLEGE IN THE WORLD DIRECTORY OF MEDICAL SCHOOLS:\n" +
                "Enlisted in the World Directory of Medical Schools, published by WHO.\n" +
                "To see the list please click here visit: www.avicenna.ku.dk/database/medicine\n" +
                "ENLISTMENT OF MEDICAL COLLEGE IN THE INTERNATIONAL MEDICAL EDUCATION DIRECTORY (IMED)\n" +
                "Enlisted in the International Medical Education Directory (IMED). Required to apply in USMLE examination by ECFMG, USA for job/post graduate training in the USA and North American countries.\n" +
                "\n" +
                "ENLISTMENT OF MEDICAL COLLEGE IN THE INSTITUTE FOR INTERNATIONAL MEDICAL EDUCATION (IIME)\n" +
                "Enlisted.\n" +
                "\n" +
                "RECOGNITION OF THE POST GRADUATE TRAINING:\n" +
                "Postgraduate training in the hospital is recognized by Bangladesh College of Physicians and Surgeons (BCPS) in the following departments; which is required for post graduate study:\n" +
                "1. Medicine \t6. Otolaryngology \t11. Dermatology\n" +
                "2. Surgery \t7. Psychiatry \t12. Physical Medicine\n" +
                "3. Obs. &Gynae8. Pathology \t13. Radiology & Imaging\n" +
                "4. Paediatric \t9. Orthopaedics \t\n" +
                "5. Ophthalmology       10. Cardiology. \t\n" +
                "\n+FACILITIES\n" +
                "    Medical Education Unit with modern equipment’s\n" +
                "    Common rooms for male and female students\n" +
                "    Annual Magazines and wall magazines\n" +
                "    Debates and Seminars\n" +
                "    Games and Sports (indoor & outdoor)\n" +
                "    Incentive for teachers for their research works and publications.\n" +
                "    Guest house\n" +
                "    Study tour\n");


        JALALABAD.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        JALALABAD.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "9,75,000");
        temp_obj2.put("column2", "4,05,000");
        temp_obj2.put("column3", "4,05,000");
        temp_obj2.put("column4", "4,05,000");
        temp_obj2.put("column5", "4,05,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "25,95,000");

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
        temp_obj6.put("column1", "9,75,000");
        temp_obj6.put("column2", "4,05,000");
        temp_obj6.put("column3", "4,05,000");
        temp_obj6.put("column4", "4,05,000");
        temp_obj6.put("column5", "4,05,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "25,95,000");
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
        JSONObject NORTH = new JSONObject();

        NORTH.put("country", "BANGLADESH");

        NORTH.put("name", "NORTH EAST MEDICAL COLLEGE");

        NORTH.put("overview", "- NORTH EAST MEDICAL COLLEGE was established in 1998\n" +
                "Google Rating -4.5 star\n" +
                "Address- South Surma, Gohorpur Rd, Sylhet 3100, Bangladesh\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/EssYvbnkczF2\n");

        NORTH.put("logo", R.drawable.kirov_logo);

        NORTH.put("image", R.drawable.kirov);

        NORTH.put("intoduction", "For a long time the people of greater Sylhet have realized the Professional education and better health care services for community development. During the British period the community leaders were striving hard to establish a medical college in Sylhet with a view to develop the existing health care system.\n" +
                "Accordingly the then government of Assam agreed to establish a Medical College at Sylhet and construction work of the college and the hostel building started here in 1934. But due to the influence of some evil high official adviser the project was shifted to Gouhati. The then Asam government while under pressure announced an official gazette that a medical school would be established at Sylhet instead of college. After some time the proposed building was converted to hospital in 1936 which was later upgraded to cater for British and allied troops of the Burma front in the Second World War. In the year 1948 the hospital was further upgraded and converted into a Medical School with appropriate teaching staff and residential accommodation in order to produce Licentiate Medical Faculty doctors (LMF).\n" +
                "Later on in 1962 the then Pakistan government, while under pressure, decided to start a five years graduate course of study leading to award the MBBS degree (Bachelor of Medicine and Bachelor of Surgery) and hence converted it into a Medical College. The hospital was further upgraded and the bed strength was increased to five hundred. At present this 600 bedded hospital cannot bear the extra load of patients referred from greater Sylhet.\n" +
                "Over the past twenty-five years there has been increasing dissatisfaction about the hospital based health care services. This is due to inadequate health budget, the insufficient number of hospital beds, and an inappropriate staffing pattern. Taking the opportunity of such inadequate health coverage, private medical organizations began to develop which delivered health services with a very high cost. A major part of the society have restricted ability to avail these costly health services. The community realize the urgent need for an easily approachable health care system within the economic reach of society. Considering the health situation of the region a group of doctors took an initiative to establish a Medical College and Hospital to provide modern health to the public at a reasonable cost which would also promote medical education and research.\n");


        NORTH.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        NORTH.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "8,45,000");
        temp_obj2.put("column2", "3,77,000");
        temp_obj2.put("column3", "3,77,000");
        temp_obj2.put("column4", "3,77,000");
        temp_obj2.put("column5", "3,77,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "23,53,000");

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
        temp_obj6.put("column1", "8,45,000");
        temp_obj6.put("column2", "3,77,000");
        temp_obj6.put("column3", "3,77,000");
        temp_obj6.put("column4", "3,77,000");
        temp_obj6.put("column5", "3,77,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "23,53,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        NORTH.put("fee", feeArray);

        NORTH.put("feedetails", " ");
        NORTH.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



/////////////////////////////////////////////////////
        JSONObject PARK = new JSONObject();

        PARK.put("country", "BANGLADESH");

        PARK.put("name", "PARK VIEW MEDICAL COLLEGE");

        PARK.put("overview", "- PARK VIEW MEDICAL COLLEGE was established in 2008\n" +
                "Google Rating -4.8 star\n" +
                "Address- Telihaor Road, Sylhet 3100, Bangladesh\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/UiFvSTvMU8u\n");

        PARK.put("logo", R.drawable.kirov_logo);

        PARK.put("image", R.drawable.kirov);

        PARK.put("intoduction", "With a view to establish a new Medical College& Hospital in an attempt to produce expert health manpower as well as to provide a low cost but without compromising 'quality' to provide optimum health care, a group of noble dreamers got together by 2008 under the banner of Parkview Health Care Pvt Ltd & Associates of Parkview Health Care Pvt Ltd. As a consequence, Parkview Medical College has opened its door with 1st batch of students of MBBS course from January 2014.\n" +
                "Parkview Medical College has started its academic activities with sufficient teachers in all three preclinical departments of Phase-1(Anatomy, Physiology and Biochemistry), headed by well reputed senior teachers with a bunch of young, energetic & committed junior teachers. Hospital has set up a low cost specialized treatment facility for the common people which will eventually take shape of a centre of excellence in Bangladesh.There is specific target to create by phases all modern medical techniques and facilities and bring down the cost of treatment to an affordable range for the common people of the country without comprising the standard and quality of service. Now Parkview medical College & Hospital is providing round the clock emergency medical services with the help of its own doctors and specialists. There is service for outdoor patients with the help of concerned consultants. In the beginning, there are facilities of 250 beds for indoor patients in the Hospital and subsequently it will be increased up to 500 bed facilities by stages.\n" +
                "To establish a centre of excellence in the field of health and medical education in the country against which other medical establishment will be rated. It will provide opportunity for treatment of latest version of medical science available round the globe and to accommodate medical education to a large number of Bangladeshi residing at UK, USA, Gulf countries and other foreign countries. The Medical College & Hospital is committed to carry out research and development work in the arena of Medical Science.\n" +
                "To achieve excellence in imparting medical education, high quality training and low cost high quality health care delivery system is our stated mission. Hospital will set up a low cost specialized treatment facility for the common people which will eventually take shape of a centre of excellence in Bangladesh. There is specific target to introduce by phases all modern medical techniques and facilities and bring down the cost of treatment to an affordable range for the common people of the country without compromising the standard and quality of services. Hospital is committed to create a comprehensive and integrated health care system and bringing the health care cost within the reach of the vast majority of the people residing in the rural areas. We have a vision to establish a Nursing institute, Medical Technologist institute and a Dental unit with government health manpower development strategy to combat the present crisis in skilled manpower in relevant field.\n");


        PARK.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        PARK.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "6,50,000");
        temp_obj2.put("column2", "3,25,000");
        temp_obj2.put("column3", "3,25,000");
        temp_obj2.put("column4", "3,25,000");
        temp_obj2.put("column5", "3,25,000");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "19,50,000");

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
        temp_obj6.put("column1", "6,50,000");
        temp_obj6.put("column2", "3,25,000");
        temp_obj6.put("column3", "3,25,000");
        temp_obj6.put("column4", "3,25,000");
        temp_obj6.put("column5", "3,25,000");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "19,50,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        PARK.put("fee", feeArray);

        PARK.put("feedetails", " ");
        PARK.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



/////////////////////////////////////////////////////
        JSONObject SYLHET = new JSONObject();

        SYLHET.put("country", "BANGLADESH");

        SYLHET.put("name", "SYLHET WOMEN'S MEDICAL COLLEGE");

        SYLHET.put("overview", "SYLHET WOMEN'S MEDICAL COLLEGE was established in 2005\n" +
                "Google Rating -4 star\n" +
                "Address- Noyashorok Road,, Sylhet, Bangladesh\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/H2rituTLbSA2\n");

        SYLHET.put("logo", R.drawable.kirov_logo);

        SYLHET.put("image", R.drawable.kirov);

        SYLHET.put("intoduction", "Holy Land Private Limited and Sylhet Health and Education Services Limited joined together in 2005 for a noble cause in medical education and health care. Together they formed Holy Sylhet Holding Limited.\n" +
                "In 2007, Holy Sylhet Holding Limited (HSHL) commenced the college and hospital with the permission of the Government of Bangladesh and after completing all the necessary formalities with the respective Ministries, Departments, Medical Associations and University.\n" +
                "HSHL also has plans to establish a Dental College and 4-year Nursing College on its 3-Acre property in the heart of Sylhet City.\n" +
                "Presently, the entire organization has 96 Directors and 13 Shareholders and over 50% of them invest in the organization as Non Resident Bangladeshis. As per the Government of Bangladesh's investment policy this qualifies HSHL and its sister concerns as one of the largest NRB (Non Resident Bangladeshi) institutional investments in Bangladesh.\n" +
                "Sylhet Women's Medical College and Hospital is a state of the art teaching and medical facility with a unique architectual design throughout its 3 high-rise buildings built on 130,000 square feet of land in the heart of Sylhet.\n" +
                "\n" +
                "Sylhet Women's Medical College and Hospital are sister concerns of Holy Sylhet Holding Limited which also has two auxiliary companies called Holy Land Private Limited and Sylhet Health and Education Services Limited. Aside from Sylhet Women's Medical College and Hospital, Holy Sylhet Holding Limited is in the process of developing a Dental College and a four-year Nursing College to create world standard quality dentists and registered nurses.\n" +
                "Relying on the skill and expertise of approximately 250 college-based and community physicians, Sylhet Women’s Medical College & Hospital (SWMCH) provides comprehensive, multidisciplinary, family-focused care in more than 100 medical specialty areas. Presently,we treat approximately 200,000 outpatient and clinic visits; and have 16,200 discharges at SWMCH annually. As the primary teaching hospital for Sylhet Women’s Medical College & Hospital (SWMCH), we have supervised student physician supporting our medical staff by providing around-the-clock coverage and insightful patient care.\n" +
                "Sylhet Women’s Medical College & Hospital regularly ranks among the 5 best private teaching hospitals in Bangladesh and is accredited by Ministry of Health as well as Bangladesh Medical and Dental Council (BMDC). SWMCH is nationally recognized for its commitment to teaching and excellent medical treatment. It is also is guided by the Shahjalal University of Science and Technology.\n" +
                "In addition to providing quality medical care to patients and families, Sylhet Women’s Medical College & Hospital is the one of the largest employers in the Sylhet Division with more 500 employees.\n" +
                "Vision\n" +
                "Sylhet Women's Medical College & Hospital will be the health care organization of choice by providing superior client service to patients and physicians. It already has a unique service and treatment system that caters to patients from affluent society and the less advantaged utulizing luxury and economy in-patient department facilities\n" +
                "Mission\n" +
                "It is our mission to provide compassionate high quality health care services in addition to the best medical education through our family of professionals.\n");


        SYLHET.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        SYLHET.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "7,80,000");
        temp_obj2.put("column2", "3,575");
        temp_obj2.put("column3", "3,575");
        temp_obj2.put("column4", "3,575");
        temp_obj2.put("column5", "3,575");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "22,10,000");

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
        temp_obj6.put("column1", "7,80,000");
        temp_obj6.put("column2", "3,575");
        temp_obj6.put("column3", "3,575");
        temp_obj6.put("column4", "3,575");
        temp_obj6.put("column5", "3,575");
        temp_obj6.put("column6", "-");
        temp_obj6.put("column7", "22,10,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        SYLHET.put("fee", feeArray);

        SYLHET.put("feedetails", " ");
        SYLHET.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        return obj;
    }

}