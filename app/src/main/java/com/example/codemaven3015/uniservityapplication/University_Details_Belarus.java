package com.example.codemaven3015.uniservityapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class University_Details_Belarus {
    private final int varCollegeName;

    public University_Details_Belarus(int varCollegeName) {
        this.varCollegeName = varCollegeName;
    }

    public JSONObject returnUniversityData() throws JSONException
    {
        /////////////////////////////////////////////////////
        JSONObject GRODON = new JSONObject();

        GRODON.put("country", "Belarus");

        GRODON.put("name", "GRODON STATE MEDICAL UNIVERSITY");

        GRODON.put("overview", "GRODON STATE MEDICAL UNIVERSITY was established in 1958\n" +
                "Google Rating -4.7 star\n" +
                "Address- UlitsaMaksimaGor'kogo 80, Grodno, Belarus\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/GdEp8VrTQtP2\n");

        GRODON.put("logo", R.drawable.grodon_logo);

        GRODON.put("image", R.drawable.grodon_img);

        GRODON.put("intoduction", "In the postwar period the social sphere of the Republic of Belarus began to develop actively. In order to improve the health service and to provide medical training and research in western region of Belarus, State Medical Institute in Grodno was established, 250 students were admitted for the academic year 1958/59. This was in accordance with the Decree of the BSSR Council of Ministers №541 from August 9, 1958, by the order of Ministry of Health of the Belorussian SSR №75 from August 14, 1958.\n" +
                "\n" +
                "It is difficult to imagine the huge amount of work on the creation of a new institution from scratch for anyone who doesn’t know much about the life of an educational institution. It's a pleasure to kindly remember those who took part in this complex process. Scientists and doctors from Russia, Ukraine, Baltic States, Tajikistan and Kyrgyzstan helped with the creation of the institute. Logistical assistance and personnel was also provided by Minsk Medical Institute and Vitebsk Medical Institute. Medical staff of Grodno was involved in the implementation of the educational process. Organizational assistance and financial support were provided by the Ministry of Health of the Republic. For instance, in 1963 the Ministry of Health gave thousands of rubles for the purchase of equipment. Local executive authorities and the party leadership of the region had taken a decision on the direction of the personnel, giving the institute buildings, material and technical resources. Initially buildings were located on Kolkhoznaya square, Karl Marx and E.Ozheshko streets. In 1960 the first building for biology classes was built. Later, the institute was given the administrative building under construction on Gorky Street (1974). Currently, the University has 5 academic buildings. Today they have acquired a modern look.\n" +
                "It is worthy of note that the University trains not only physicians but also researchers and the teaching staff for its own needs. In 1967, M.V. Borysiuk defended his Ph.D. thesis in 1982, N.F. Filippovich – his thesis for a Doctor's degree. In 1996 L.M. Lobanok was elected associate member of the National Academy of Sciences of Belarus. In 1976 V.P. Andreev was appointed head of the Department of Biology, in 1987 - the I.P. Protasiewicz was appointed dean, in 1987 M.V. Borysiuk became vice-rector for scientific work, in 1998 P.V. Garelik was the rector. Since 2010, the graduate of the GrSMU V.A. Snezhitskiy is the rector. In 2015, he was elected associate member of National Academy of Sciences of the Republic of Belarus.\n" +
                "The atmosphere of student life-\n" +
                "Each generation of medical students had their own active social position, created their own atmosphere of student life. Future doctors performed many good deeds, like the participation in the work of the Komsomol organization, harvesting potatoes, donation, voluntary national teams, construction teams, working as volunteers, science clubs and amateur talent groups. In 1970-80-s University student construction brigade was the best not only in the region, but in the whole country and its members received a considerable number of awards, including government awards. Only positive feedback about our students had been coming from Siberia, Karelia, Moldavia, Ukraine and Kazakhstan. Labor semesters not only formed the individuality, but also allowed to gain the first professional medical experience. Many of the students during the summer semester worked as physicians in construction teams from other universities. Later on, the first in the country specialized medical teams began to be formed in the institute.\n" +
                "Many future doctors were members of amateur talent groups. The institute was proud of its propaganda team, vocal-instrumental and brass bands, the achievements in various sports. Amateur arts festivals had become a tradition. In 1980 for the first time in Grodno disco club \"Panorama\" was created in our institute. At the end of the 1990s, the university revived KVN humor show, contests \"Miss University\", evenings of intellectual games were held. The current generation of students also lives an interesting life. Days of faculties, including student conferences on topical problems of modern life, interesting multimedia presentations, events, devoted to creating and presenting student’s own internet sites, healthy lifestyle activities, sports competitions, concerts are organized every year.\n");


        GRODON.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        GRODON.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        JSONArray feeArray = new JSONArray();
        JSONObject temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "4300");
        temp_obj2.put("column2", "4300");
        temp_obj2.put("column3", "4300");
        temp_obj2.put("column4", "4300");
        temp_obj2.put("column5", "4300");
        temp_obj2.put("column6", "-");
        temp_obj2.put("column7", "25800");

        JSONObject temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,58,000");
        temp_obj3.put("column2", "2,58,000");
        temp_obj3.put("column3", "2,58,000");
        temp_obj3.put("column4", "2,58,000");
        temp_obj3.put("column5", "2,58,000");
        temp_obj3.put("column6", "2,58,000");
        temp_obj3.put("column7", "15,48,000");

        JSONObject temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        JSONObject temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "48,000");
        temp_obj5.put("column2", "48,000");
        temp_obj5.put("column3", "48,000");
        temp_obj5.put("column4", "48,000");
        temp_obj5.put("column5", "48,000");
        temp_obj5.put("column6", "48,000");
        temp_obj5.put("column7", "2,88,000");

        JSONObject temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,06,000");
        temp_obj6.put("column2", "3,06,000");
        temp_obj6.put("column3", "3,06,000");
        temp_obj6.put("column4", "3,06,000");
        temp_obj6.put("column5", "3,06,000");
        temp_obj6.put("column6", "3,06,000");
        temp_obj6.put("column7", "18,36,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        GRODON.put("fee", feeArray);

        GRODON.put("feedetails", " ");
        GRODON.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        /////////////////////////////////////////////////////
        JSONObject BELARUSSIAN = new JSONObject();

        BELARUSSIAN.put("country", "Belarus");

        BELARUSSIAN.put("name", "BELARUSSIAN STATE MEDICAL UNIVERSITY");

        BELARUSSIAN.put("overview", "BELARUSSIAN STATE MEDICAL UNIVERSITY was established in 1930\n" +
                "Google Rating -4.7 star\n" +
                "Address- ProspektDzerzhinskogo 83, Minsk 220116, Belarus\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/uWGqjsUPKzE2\n");

        BELARUSSIAN.put("logo", R.drawable.belarussian_logo);

        BELARUSSIAN.put("image", R.drawable.belarussian_img);

        BELARUSSIAN.put("intoduction", "In 1960 the Dental Faculty was opened. The Pediatric Faculty and the Faculty of Preventive Medicine were set up in 1964. The Medical Faculty for International Students started its activity in 1967. The Faculty of Military Medicine was organized in 1995. In 2010 the Pharmaceutical Faculty welcomed its first students. The Faculty of Career Guidance and Prevocational Training was founded in 2012.\n" +
                "In 1971 for the achievements in training highly qualified medical specialists and for its contribution to the development of health care and medical science Minsk State Medical Institute received one of the highest national awards - the Order of Red Banner of Labor.\n" +
                "In 2001 Minsk State Medical Institute was renamed into the state higher educational institution 'Belarusian State Medical University' (BSMU). Since 2001 BSMU has a status of a leading higher medical education provider in the Republic of Belarus.\n" +
                "The University is committed to the advancement of knowledge, ensuring high quality teaching and learning experience, developing creative thinking and skills of analysis to meet the challenges of a changing society and produce better informed and more intellectually flexible graduates well equipped for employment in the 21st century. To be taken to the frontiers of knowledge and to consider the very latest developments and findings is an excellent experience for students. The University is always taking significant steps for improving existing facilities and creating new ones.\n" +
                "Our academic staff made up of first-class specialists with new perspectives and expertise will be keen to share their knowledge and insights and to explore their subject with you. It includes more than 880 educators, of whom more than 64% have a scientific degree including 3 Corresponding Members of the National Academy of Science, 12 laureates of the State Awards, 16 honoured scientists, physicians and other health care professionals of the Republic of Belarus. More than 350 employees of the clinical departments have a higher medical category. Our emphasis is on a research-informed curriculum and we use a variety of methods to support student-cantered learning.\n" +
                "International cooperation in science and education is one of the priorities of the University. BSMU is an Associate Member of the International Association of University Alumni, the International Association of Higher Medical Education Graduates, the Association of Medical Schools of Europe (AMSE); it works in collaboration with WHO, the World Society for the Protection of Animals (WSPA), participates in numerous international research programs and projects (TEMPUS, TASIS and others).\n" +
                "More than 800 educators and researchers are engaged in scientific work.\n" +
                "BSMU has excellent research facilities encompassing the Central Research Laboratory that has been functioning since 1954. In 2012 it was reorganized into a Research Division with 6 research laboratories and 8 scientific groups with the total number of about 100 researchers and technical specialists. In terms of research volume and scope, the level of material and technical equipment and personnel involvement the Research Division is comparable with the entire health care research institute. Along with the individual tasks within government programs, the University staff carries out innovative projects and programs funded by the Belarusian Foundation for Fundamental Research. For many years BSMU has been the only educational institution of the Republic of Belarus as the main organization pursuing two state scientific and technical programs.\n" +
                "The University successfully accomplishes training of highly qualified scientific personnel. On average the academic staff members and postgraduate students of the University defend 3 doctoral and 30 PhD theses annually.\n");


        BELARUSSIAN.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        BELARUSSIAN.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "4900");
        temp_obj2.put("column2", "4900");
        temp_obj2.put("column3", "4900");
        temp_obj2.put("column4", "4900");
        temp_obj2.put("column5", "4900");
        temp_obj2.put("column6", "4900");
        temp_obj2.put("column7", "29,400");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,94,000");
        temp_obj3.put("column2", "2,94,000");
        temp_obj3.put("column3", "2,94,000");
        temp_obj3.put("column4", "2,94,000");
        temp_obj3.put("column5", "2,94,000");
        temp_obj3.put("column6", "2,94,000");
        temp_obj3.put("column7", "17,64,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
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
        temp_obj5.put("column6", "48,000");
        temp_obj5.put("column7", "2,88,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,42,000");
        temp_obj6.put("column2", "3,42,000");
        temp_obj6.put("column3", "3,42,000");
        temp_obj6.put("column4", "3,42,000");
        temp_obj6.put("column5", "3,42,000");
        temp_obj6.put("column6", "3,42,000");
        temp_obj6.put("column7", "20,52,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        BELARUSSIAN.put("fee", feeArray);

        BELARUSSIAN.put("feedetails", " ");
        BELARUSSIAN.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");




        /////////////////////////////////////////////////////
        JSONObject VITEBSK = new JSONObject();

        VITEBSK.put("country", "Belarus");

        VITEBSK.put("name", "VITEBSK STATE MEDICAL UNIVERSITY");

        VITEBSK.put("overview", "VITEBSK STATE MEDICAL UNIVERSITY was established in 1934\n" +
                "Google Rating -4star\n" +
                "Address- VgmuAdministrativnoyeZdaniye, Frunze Ave 27, Viciebsk, Belarus\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/JVqFAcJEKiz\n");

        VITEBSK.put("logo", R.drawable.vitebsk_logo);

        VITEBSK.put("image", R.drawable.vitebsk_img);

        VITEBSK.put("intoduction", "Vitebsk State Medical Institute was established as a hospital-medical institute in November 1, 1934 by Resolution of the Council of People's Commissars of the BSSR. The total number of students on all courses was 250.\n" +
                "MD, Professor MoiseiAnisimovich Khazanov, a graduate of the Medical Faculty of the University of Bern (Switzerland) was appointed as the first Rector of the Institute. 12 Professors, well-known in the USSR and abroad medical scientists, started to work with him: Professor Pavel MarkovichGurevich, a graduate of the University of Strasbourg (Alsace - France), became the first dean. In 1938 a hospital-medical institute was renamed into Vitebsk Medical Institute.\n" +
                "Until 1941 seven turn-outs of physicians was carried out. The Great Patriotic War stalled the development of the Institute for many years. At the beginning of the war the Institute was evacuated to Chelyabinsk, and then in 1943 - to Yaroslavl. Subsequently, Yaroslavl Medical Institute was established on the basis of Vitebsk Medical Institute. In 1944 a part of the Institute staff returned to Minsk and participated in the reconstruction of Minsk Medical Institute. And only in 1946 the Institute returned to its native Vitebsk region. From 1946 to 1950 the Institute was headed by AnisimIvanovichSavchenko, Deputy Minister of Health of the Byelorussian SSR. In 1948 the student scientific society was created.\n" +
                "In 1951 the Institute was headed by a graduate of First Moscow Medical Institute, Professor Ivan IllarionovichBogdanovich. In 1952-53 a large group of famous academicians and professors came to the Institute from Moscow and Leningrad: V.V.Shapurov, S.B.Vainberg, I.B.Aleshkovich, L.N.Goldman, E.S.Ketiladze, N.M.Yanchur, K.L.Markuze, P.N.Maslov, L.Ya.Shostak, I.L.Sosnovik and others. For 10 years they have created strong medico-biological and clinical schools which are still honoredboth in our country and abroad.\n" +
                "In 1959 the main academic building was put into operation. In 1959 Pharmaceutical Faculty was created, along with the current General Medicine Faculty.\n" +
                "In 1961 the Institute was headed by Professor MedvedevaGlafiraAntonovna. In 1962 the Central Scientific Research laboratory was founded. From 1965 to 1979 Docent Medvetskiy Evgeniy Nikandrovich was the Rector of the Institute. Preparatory Training Department was opened in 1974.\n" +
                "From 1979 to 1996 Honored Worker of Science of BSSR, Professor Sachek Mikhail Grigoryevich was the Rector of the Institute. In 1981 the new laboratory and theoretical building housing the total area of 14 thousand square meters came into operation. In 1981 Vitebsk State Medical Institute began training medical and pharmaceutical specialists for foreign countries. For merits in training of highly qualified specialists and contribution to development of medical science and public health service according to the Decree of the Presidium of the Supreme Soviet of the USSR Vitebsk State Medical Institute was awarded the Order of Peoples’ Friendship in 1984 (by the 50th anniversary of VSMI). In 1984 the Faculty of Advanced Training of doctors was opened. In 1989 the Ministry of Health of the USSR passed the Institute for subordination to the Ministry of Health of the BSSR.\n" +
                "From 1997 to 2005 the University was headed by Alexander Nikolayevich Kosinets. During this period the University held a profound transformation. The Faculty of Overseas Students Training and Advanced Training and Retraining Faculty were opened in 1997, the Faculty of Career Guidance and Pre-University Training – in 1998, Stomatological Faculty – in 2001, the Faculty of Advanced Training in Pedagogics and Psychology – in 2001. New departments and courses of professional development are organized at the faculties. An electronic library was created, computer classes are connected to global sources of information. In March 10, 2003 by order of the Ministry of Health of the Republic of Belarus the Clinic of Vitebsk State Medical University was founded.\n" +
                "In 1998 the Institute has successfully passed the certification and accreditation of the status of higher educational establishment of a university type and was transformed into Vitebsk State Order of Peoples' Friendship Medical University.\n");


        VITEBSK.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        VITEBSK.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "4600");
        temp_obj2.put("column2", "4600");
        temp_obj2.put("column3", "4600");
        temp_obj2.put("column4", "4600");
        temp_obj2.put("column5", "4600");
        temp_obj2.put("column6", "4600");
        temp_obj2.put("column7", "27,600");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,76,000");
        temp_obj3.put("column2", "2,76,000");
        temp_obj3.put("column3", "2,76,000");
        temp_obj3.put("column4", "2,76,000");
        temp_obj3.put("column5", "2,76,000");
        temp_obj3.put("column6", "2,76,000");
        temp_obj3.put("column7", "16,56,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "45,000");
        temp_obj5.put("column2", "45,000");
        temp_obj5.put("column3", "45,000");
        temp_obj5.put("column4", "45,000");
        temp_obj5.put("column5", "45,000");
        temp_obj5.put("column6", "45,000");
        temp_obj5.put("column7", "2,70,000");

        temp_obj6 = new JSONObject();
        temp_obj6.put("column1", "3,21,000");
        temp_obj6.put("column2", "3,21,000");
        temp_obj6.put("column3", "3,21,000");
        temp_obj6.put("column4", "3,21,000");
        temp_obj6.put("column5", "3,21,000");
        temp_obj6.put("column6", "3,21,000");
        temp_obj6.put("column7", "19,26,000");
        feeArray.put(temp_obj2);
        feeArray.put(temp_obj3);
        feeArray.put(temp_obj4);
        feeArray.put(temp_obj5);
        feeArray.put(temp_obj6);

        VITEBSK.put("fee", feeArray);

        VITEBSK.put("feedetails", " ");
        VITEBSK.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");


        /////////////////////////////////////////////////////
        JSONObject GOMEL = new JSONObject();

        GOMEL.put("country", "Belarus");

        GOMEL.put("name", "GOMEL STATE MEDICAL UNIVERSITY");

        GOMEL.put("overview", "GOMEL STATE MEDICAL UNIVERSITY was established in 1990\n" +
                "Google Rating -4star\n" +
                "Address- vulicaLanhie 5, Homieĺ, Belarus\n" +
                "MCI Approved\n" +
                "WHO Approved\n" +
                "Google map - https://goo.gl/maps/gXbnSTYxyvz\n");

        GOMEL.put("logo", R.drawable.gomel_logo);

        GOMEL.put("image", R.drawable.gomel_img);

        GOMEL.put("intoduction", "n 1990 Gomel State Medical University was founded as per resolution of the Council of Ministers and Order of the Minister of Health of the Byelorussian Soviet Socialist Republic. It is the youngest of four medical universities in Belarus. Gomel State Medical University has attained the status of a modern university and is recognized by the World Health Organization (WHO) and many other international professional groups. Graduates of the University work in clinics throughout the Republic of Belarus, Western Europe, Africa, the Middle East and Asia. Today, Gomel State Medical University employs 600 highly qualified professors and assistant professors within 34 departments, 5 profile research laboratories and a central research laboratory and 18 large wellequipped clinics. The clinical base of the University is the best in Belarus, using advanced medical technologies for the diagnosis and treatment in the fields of endocrinology, cardiology, immunology, haematology, ophthalmology and oncology as well as other medical specialties. The University library, with its rich source of written and other material, Internet access and three reading halls, provides students with the means to excel during the educational process. Modern hostels offer comfortable flats, lounges and physical training rooms, as well as Internet access. Since its inception, the University has prepared more than 2000 doctors, training foreign students from Africa, Poland, Turkey, Russia, China, Vietnam, Lebanon, Iran, South America, India, Sri Lanka, Nepal and the Newly Independent States and Western Europe.\n" +
                "Education is one of the main priorities of the national policy of the Republic of Belarus.\n" +
                "Studying in Belarus should be the best choice for both domestic and International students. This is due to the standard and quality of Education system in Belarus. Education in Belarus is of very high standard, hence every year students from all over the world troop into Belarus for studies in their respective courses of choice.Studying in Belarus is more than just a dream of having a degree program or a Master program abroad; The Belarusian universities and other high institutions are immensely equipped with education facilities to meet the standard of any present day academic challenge.\n" +
                "INTERNATIONAL COOPERATION\n" +
                "The main directions of international cooperation of the educational establishment \"The Gomel State Medical University\" are\n" +
                "Enhancing the role of the university in international educational space and in the international market of educational services;\n" +
                "Development of international relations with foreign educational institutions;\n" +
                "The implementation of cultural and academic exchanges between the partner universities to study promising areas of educational process, introduction of innovative educational approaches to improve the scientific and professional level of teachers and students;\n" +
                "Ensuring the participation of departments, staff and students in international projects, programs, competitions;\n" +
                "Dissemination of educational services of the University Improving the educational process and improving the quality of training through the creative use of international experience.\n");


        GOMEL.put("Eligibility", "•\tThe student shall complete the age of 17 years on or before 31st December of the year of admission.\n" +
                "•\tThe student should have obtained 50% marks in the 12th standard examination. Students belonging SC/ST and OBC category are eligible having 40% marks in aggregate in the 12th standard examination.\n" +
                "•\tThe eligibility certificate is a legal proof given by the MCI that the medical university, which the student attends to study MBBS abroad, is authorized by the medical education regulator. And the MCI has now made it very clear to the students opting to study MBBS in foreign universities that they will have to clear their NEET examination even if they want to study abroad. To clear the NEET exam, a student needs to score a minimum of 50 percentile for general category and 40 percent for reserved category. This condition will be mandatory for the students from May 01, 2018 onwards.\n");


        GOMEL.put("facilities", "•\tfood \n" +
                "•\tHostel\n" +
                "•\tHospital\n" +
                "•\tLibrary\n");

        feeArray = new JSONArray();
        temp_obj2 = new JSONObject();
        temp_obj2.put("column1", "4200");
        temp_obj2.put("column2", "4200");
        temp_obj2.put("column3", "4200");
        temp_obj2.put("column4", "4200");
        temp_obj2.put("column5", "4200");
        temp_obj2.put("column6", "4200");
        temp_obj2.put("column7", "25200");

        temp_obj3 = new JSONObject();
        temp_obj3.put("column1", "2,52,000");
        temp_obj3.put("column2", "2,52,000");
        temp_obj3.put("column3", "2,52,000");
        temp_obj3.put("column4", "2,52,000");
        temp_obj3.put("column5", "2,52,000");
        temp_obj3.put("column6", "2,52,000");
        temp_obj3.put("column7", "15,12,000");

        temp_obj4 = new JSONObject();
        temp_obj4.put("column1", "-");
        temp_obj4.put("column2", "-");
        temp_obj4.put("column3", "-");
        temp_obj4.put("column4", "-");
        temp_obj4.put("column5", "-");
        temp_obj4.put("column6", "-");
        temp_obj4.put("column7", "-");

        temp_obj5 = new JSONObject();
        temp_obj5.put("column1", "36,000");
        temp_obj5.put("column2", "36,000");
        temp_obj5.put("column3", "36,000");
        temp_obj5.put("column4", "36,000");
        temp_obj5.put("column5", "36,000");
        temp_obj5.put("column6", "36,000");
        temp_obj5.put("column7", "2,16,000");

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

        GOMEL.put("fee", feeArray);

        GOMEL.put("feedetails", " ");
        GOMEL.put("services", "Pre- Departure\n" +
                "                                        Post Departure\n" +
                "                                        Documentation Assistance\n" +
                "                                        Visa process\n");



        JSONArray allColleges = new JSONArray();
        allColleges.put(GRODON);
        allColleges.put(BELARUSSIAN);
        allColleges.put(VITEBSK);
        allColleges.put(GOMEL);

        return allColleges.getJSONObject(varCollegeName);
    }
}
