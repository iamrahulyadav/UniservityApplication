package com.example.codemaven3015.uniservityapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 3/28/2018.
 */

public class CollegeRecycler_Card extends RecyclerView.Adapter<CollegeRecycler_Card.ViewHolder> {

    private Context context;

private String fromWhere;

    public CollegeRecycler_Card(Context context,String fromWhere) {
        this.context = context;
        this.fromWhere=fromWhere;
    }
    private int[] images = {
            R.drawable.image,R.drawable.image,R.drawable.image,
            R.drawable.image,R.drawable.image,R.drawable.image,
            R.drawable.image,R.drawable.image,R.drawable.image,

            R.drawable.image,R.drawable.image,R.drawable.image,
            R.drawable.image,R.drawable.image,R.drawable.image,
            R.drawable.image,R.drawable.image,R.drawable.image};


    private String[] countries ={"Ukrain","Russia"};
    private String[] college_ukrain = {"BOGOMOLETS NATIONALMEDICAL UNIVERSITY","Kharkiv National Medical University","Vinnitsa National Medical University",
            "ODESSA NATIONAL MEDICAL UNIVERSITY UKRAINE (KIEV)","Kiev Medical University UAFM","Dnipropetrovsk State Medical Academy",
            "V. N. Karazin Kharkiv National Medical University","ZAPOROZHYE STATE MEDICAL UNIVERSITY UKRAINE "};

    private String[] college_russia={"Moscow State University","PEOPLES' FRIENDSHIP UNIVERSITY OF RUSSIA",
            "STAVROPOL STATE MEDICAL UNIVERSITY", "SMOLENSK STATE MEDICAL UNIVERSITY",
            "KURSK STATE MEDICAL UNIVERSITY","BASHKIR STATE MEDICAL UNIVERSITY","KAZAN STATE MEDICAL UNIVERSITY",
            "VOLGOGRAD STATE MEDICAL UNIVERSITY","KIROV STATE MEDICAL UNIVERSITY"};

    private String[] allUniversities = {"BOGOMOLETS NATIONALMEDICAL UNIVERSITY","Kharkiv National Medical University","Vinnitsa National Medical University",
            "ODESSA NATIONAL MEDICAL UNIVERSITY UKRAINE (KIEV)","Kiev Medical University UAFM","Dnipropetrovsk State Medical Academy",
            "V. N. Karazin Kharkiv National Medical University","ZAPOROZHYE STATE MEDICAL UNIVERSITY UKRAINE ","Moscow State University","PEOPLES' FRIENDSHIP UNIVERSITY OF RUSSIA",
            "STAVROPOL STATE MEDICAL UNIVERSITY", "SMOLENSK STATE MEDICAL UNIVERSITY",
            "KURSK STATE MEDICAL UNIVERSITY","BASHKIR STATE MEDICAL UNIVERSITY","KAZAN STATE MEDICAL UNIVERSITY",
            "VOLGOGRAD STATE MEDICAL UNIVERSITY","KIROV STATE MEDICAL UNIVERSITY"};
    private String[] course = {"MBBS","MBBS","MBBS",
            "MBBS","MBBS","MBBS",
            "MBBS","MBBS","MBBS","MBBS","MBBS",
            "MBBS","MBBS","MBBS",
            "MBBS","MBBS","MBBS"};



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.college_card, null,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        if(fromWhere.equals("Universities")){
            viewHolder.card_img.setImageResource(images[i]);
            viewHolder. card_college.setText(allUniversities[i]);
            viewHolder. card_course.setText("MBBS");
            viewHolder.card_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(context,College_Info.class);
                    //intent.putExtra("menu","RUSSIA");
                    context.startActivity(intent);
                }
            });
        }else if(fromWhere.equals("Countries")) {
            viewHolder.card_img.setImageResource(images[i]);
            viewHolder.card_college.setText(countries[i]);
            viewHolder.card_course.setText("");
            viewHolder.card_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(context,Colleges.class);
                    intent.putExtra("menu","RUSSIA");
                    context.startActivity(intent);
                }
            });
        }else if(fromWhere.equals("UKRAINE")){

            viewHolder.card_img.setImageResource(images[i]);
            viewHolder. card_college.setText(college_ukrain[i]);
            viewHolder. card_course.setText("MBBS");

        }else  if(fromWhere.equals("RUSSIA")){

            viewHolder.card_img.setImageResource(images[i]);
            viewHolder. card_college.setText(college_russia[i]);
            viewHolder. card_course.setText("MBBS");
        }


    }

    @Override
    public int getItemCount() {
        //return images.length;
        if(fromWhere.equals("Universities")){
            return allUniversities.length;
        }else if(fromWhere.equals("Countries")) {
           return countries.length;
        }else if(fromWhere.equals("UKRAINE")){
            return college_ukrain.length;

        }else  if(fromWhere.equals("RUSSIA")){
            return college_russia.length;
        }
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public int currentItem;

        ImageView card_img;;
        TextView card_college,card_course;


        public ViewHolder(View itemView) {
            super(itemView);
            card_img=itemView.findViewById(R.id.card_img);
            card_college=itemView.findViewById(R.id.card_college);
            card_course=itemView.findViewById(R.id.card_course);
    }



    public void startDetailsActivity(){

    }

}}
