package com.example.codemaven3015.uniservityapplication;

import android.content.Context;
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



    public CollegeRecycler_Card(Context context) {
        this.context = context;

    }
    private int[] images = {
            R.drawable.image,R.drawable.image,R.drawable.image,
            R.drawable.image,R.drawable.image,R.drawable.image,
            R.drawable.image,R.drawable.image,R.drawable.image};



    private String[] college_name = {"Delhi University","Delhi University","Delhi University",
            "Delhi University","Delhi University","Delhi University",
            "Delhi University","Delhi University","Delhi University"};
    private String[] course = {"MBBS","MBBS","MBBS",
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
       viewHolder.card_img.setImageResource(images[i]);
        viewHolder. card_college.setText(college_name[i]);
        viewHolder. card_course.setText(course[i]);


    }

    @Override
    public int getItemCount() {
        return images.length;
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
