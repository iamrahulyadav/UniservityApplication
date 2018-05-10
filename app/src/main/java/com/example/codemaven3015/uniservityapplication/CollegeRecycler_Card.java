package com.example.codemaven3015.uniservityapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Admin on 3/28/2018.
 */

public class CollegeRecycler_Card extends RecyclerView.Adapter<CollegeRecycler_Card.ViewHolder> {

    private Context context;
    private JSONArray list;
    private String fromWhere;

    public CollegeRecycler_Card(Context context,JSONArray list,String fromWhere) {
        this.context = context;
        this.list=list;
        this.fromWhere = fromWhere;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.college_card, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        JSONObject obj = new JSONObject();
        try {
            obj = list.getJSONObject(i);
            viewHolder.card_img.setImageResource(obj.getInt("image_logo"));
            viewHolder. card_college.setText(obj.getString("name"));
            viewHolder. card_course.setText("MBBS");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if(fromWhere.equals("Countries")) {
            viewHolder.card_course.setText("");
            viewHolder.card_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(context,Colleges.class);
                    intent.putExtra("menu","RUSSIA");
                    context.startActivity(intent);
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        //return images.length;
        return list.length();
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
           card_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int i = getAdapterPosition();
                    if(fromWhere.equals("Universities")){

                        //return allUniversities.length;
                    }else if(fromWhere.equals("Countries")) {
                        Intent intent = new Intent(context, Colleges.class);
                        if(i==0) {
                            intent.putExtra("menu", "UKRAINE");
                        }else{
                            intent.putExtra("menu", "RUSSIA");
                        }
                        context.startActivity(intent);
                        //return countries.length;
                        return;

                    }else if(fromWhere.equals("UKRAINE")){
                        //return college_ukrain.length;

                    }else  if(fromWhere.equals("RUSSIA")){
                        //return college_russia.length;
                        i = i+8;
                    }
                    Intent intent= new Intent(context,College_Info.class);
                    intent.putExtra("location",i);
                    context.startActivity(intent);
                }
            });
    }



}}
