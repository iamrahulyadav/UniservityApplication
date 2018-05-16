package com.example.codemaven3015.uniservityapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
        LinearLayout linearLayoutOnclick;


        public ViewHolder(View itemView) {
            super(itemView);
            card_img=itemView.findViewById(R.id.card_img);
            card_college=itemView.findViewById(R.id.card_college);
            card_course=itemView.findViewById(R.id.card_course);
            linearLayoutOnclick = itemView.findViewById(R.id.linearLayoutOnclick);
            linearLayoutOnclick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int i = getAdapterPosition();
                    if(fromWhere.equals("Universities")) {
                        Intent intent = new Intent(context, College_Info.class);
                        if (i >= 0 && i < 6) {
                            intent.putExtra("menu", 0+"");
                            intent.putExtra("location", i);
                        } else if (i >= 6 && i < 10) {
                            intent.putExtra("menu", 1+"");
                            intent.putExtra("location", (i - 6));
                        } else if (i >= 10 && i < 20) {
                            intent.putExtra("menu", 2+"");
                            intent.putExtra("location", (i - 10));
                        }
                        else if (i >= 20 && i < 28) {
                            intent.putExtra("menu", 3+"");
                            intent.putExtra("location", (i - 20));
                        }
                        else if (i == 28) {
                            intent.putExtra("menu", 4+"");
                            intent.putExtra("location", (0));
                        }
                        else if (i >= 29 && i < 33) {
                            intent.putExtra("menu", 5+"");
                            intent.putExtra("location", (i - 29));
                        }
                        else if (i >= 33 && i < 39) {
                            intent.putExtra("menu", 6+"");
                            intent.putExtra("location", (i - 33));
                        }
                        else if (i >= 39 && i < 45) {
                            intent.putExtra("menu", 7+"");
                            intent.putExtra("location", (i - 39));
                        }
                        else if (i == 45) {
                            intent.putExtra("menu", 8+"");
                            intent.putExtra("location", (0));
                        }
                        else if (i >= 46 && i < 55) {
                            intent.putExtra("menu", 9+"");
                            intent.putExtra("location", (i - 46));
                        }
                        else if (i >= 55 && i < 63) {
                            intent.putExtra("menu", 10+"");
                            intent.putExtra("location", (i - 55));
                        }
                        context.startActivity(intent);
                        return;

                        //return allUniversities.length;
                    }else if(fromWhere.equals("Countries")) {
                        Intent intent = new Intent(context, Colleges.class);
                        intent.putExtra("menu", i+"");
                        context.startActivity(intent);
                        notifyDataSetChanged();
                        //return countries.length;
                        return;

                    }else if(fromWhere.equals("search")){
                        try {
                            JSONObject obj = list.getJSONObject(i);
                            int idValue = obj.getInt("id");

                            Intent intent = new Intent(context, College_Info.class);
                            if (idValue >= 0 && idValue < 6) {
                                intent.putExtra("menu", 0+"");
                                intent.putExtra("location", idValue);
                            } else if (idValue >= 6 && idValue < 10) {
                                intent.putExtra("menu", 1+"");
                                intent.putExtra("location", (idValue - 6));
                            } else if (idValue >= 10 && idValue < 20) {
                                intent.putExtra("menu", 2+"");
                                intent.putExtra("location", (idValue - 10));
                            }
                            else if (idValue >= 20 && idValue < 28) {
                                intent.putExtra("menu", 3+"");
                                intent.putExtra("location", (idValue - 20));
                            }
                            else if (idValue == 28) {
                                intent.putExtra("menu", 4+"");
                                intent.putExtra("location", (0));
                            }
                            else if (idValue >= 29 && idValue < 33) {
                                intent.putExtra("menu", 5+"");
                                intent.putExtra("location", (idValue - 29));
                            }
                            else if (idValue >= 33 && idValue < 39) {
                                intent.putExtra("menu", 6+"");
                                intent.putExtra("location", (idValue - 33));
                            }
                            else if (idValue >= 39 && idValue < 45) {
                                intent.putExtra("menu", 7+"");
                                intent.putExtra("location", (idValue - 39));
                            }
                            else if (idValue == 45) {
                                intent.putExtra("menu", 8+"");
                                intent.putExtra("location", (0));
                            }
                            else if (idValue >= 46 && idValue < 55) {
                                intent.putExtra("menu", 9+"");
                                intent.putExtra("location", (idValue - 46));
                            }
                            else if (idValue >= 55 && idValue < 63) {
                                intent.putExtra("menu", 10+"");
                                intent.putExtra("location", (idValue - 55));
                            }
                            context.startActivity(intent);
                            return;
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                    Intent intent= new Intent(context,College_Info.class);
                    intent.putExtra("menu",fromWhere);
                    intent.putExtra("location",i);
                    context.startActivity(intent);
                }
            });
    }



}}
