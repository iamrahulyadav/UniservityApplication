package com.example.codemaven3015.uniservityapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Registration extends AppCompatActivity {
    public static final String MyPREFERENCES= "MyPrefs";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button updateBtn;
    String User_Name,College_Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        sharedPreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
       // SharedPreferences.Editor editor=sharedPreferences.edit();
        User_Name= sharedPreferences.getString("USERNAME", "name");
        College_Name= sharedPreferences.getString("COLLEGE_NAME", "name");
        
        //editor.putString(User_Name,name);
        setupdateBtn();
    }

    private void setupdateBtn()
    {
        updateBtn=findViewById(R.id.updateBtn);
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginServiceCall();
            }
        });
    }

    private void loginServiceCall()
    {

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        String url = "//192.168.0.105:8888/University_Service/service/update_u";
        StringRequest jsonObject=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                Log.e("my app", "123"+response);
                if(response.equals("\"success\"")){
                    Toast.makeText(getApplicationContext(),"Successfully Registered",
                            Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Registration.this, Home.class);
                    startActivity(i);

                }else {

                }


            }

        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Log.e("my app1","error");
            }
        }
        ) {

            @Override
            public String getBodyContentType() {
                return "application/x-www-form-urlencoded; charset=UTF-8";
            }

            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("name", User_Name);
                params.put("university",College_Name);

                return params;
            }

        };
        requestQueue.add(jsonObject);
    }
}
