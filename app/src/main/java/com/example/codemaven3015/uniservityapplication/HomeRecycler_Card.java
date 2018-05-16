package com.example.codemaven3015.uniservityapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Admin on 3/28/2018.
 */

public class HomeRecycler_Card extends RecyclerView.Adapter<HomeRecycler_Card.ViewHolder> {

    private Context context;



    public HomeRecycler_Card(Context context) {
        this.context = context;

    }
    private int[] images = {
            R.drawable.bangladesh,R.drawable.flag_of_belarus,R.drawable.china,
            R.drawable.flag_of_georgia,R.drawable.flag_of_kazakhstan,R.drawable.kyrgyzstan,
            R.drawable.nepal,R.drawable.philippines,R.drawable.poland,R.drawable.russia,R.drawable.ukraine_flag};



    private String[] text = {"BANGLADESH","BELARUS","CHINA","GEORGIA","KAZAKSHTAN",
            "KYRAGYZSTAN","NEPAL","PHILLIPINES","POLAND",
            "RUSSIA","UKRAIN"};



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.home_card, null,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
       viewHolder.card_img.setImageResource(images[i]);
        viewHolder. card_textview.setText(text[i]);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public int currentItem;

        ImageView card_img;;
        TextView card_textview;
        LinearLayout LinearLayoutOnclickHome;


        public ViewHolder(View itemView) {
            super(itemView);
            card_img = itemView.findViewById(R.id.card_img);
            card_textview = itemView.findViewById(R.id.card_textview);
            LinearLayoutOnclickHome = itemView.findViewById(R.id.LinearLayoutOnclickHome);
            LinearLayoutOnclickHome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int i = getAdapterPosition();
                    Intent inten = new Intent(context, Colleges.class);
                    inten.putExtra("menu", i + "");
                    context.startActivity(inten);
                }
            });
        }



    public void startDetailsActivity(){

    }

}}
