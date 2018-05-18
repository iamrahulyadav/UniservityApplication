package com.example.codemaven3015.uniservityapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {

    EditText Name_editText,Mobile_editText,Mail_editText;
    Button cancelBtn,submitBtn;
    String phone=null;
    String name=null;
    String email=null;
    public static final String MyPREFERENCES= "MyPrefs";
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cancelBtn=findViewById(R.id.cancelBtn);
        setsubmitBtn();
       sharedPreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        //setMobileValidation();


    }

    private boolean setMobileValidation()
    {
        Mobile_editText=findViewById(R.id.Mobile_editText);
        Mail_editText=findViewById(R.id.Mail_editText);
        Name_editText=findViewById(R.id.Name_editText);
         phone = Mobile_editText.getText().toString().trim();
         name = Name_editText.getText().toString().trim();
         email = Mail_editText.getText().toString().trim();
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("USERNAME",name);
        editor.commit();

        if(!checkIfEmpty(phone)){
            Mobile_editText.setError("Phone Number Cannot be empty");
            return false;
        }else if(!checkIfEmpty(name)){
            Name_editText.setError("Phone Number Cannot be empty");
            return false;
        }else if(!checkIfEmpty(email)){
            Mail_editText.setError("Phone Number Cannot be empty");
            return false;
        }else if(!checkPhoneNumber(phone)){
            Mobile_editText.setError("Please enter valid phone number");
            return false;
        }else if(!checkEmailValidation(email)){
            Mail_editText.setError("Please enter valid email id");
            return false;
        }


        return true;
    }
    private boolean checkEmailValidation(String text){
        boolean result = !TextUtils.isEmpty(text) && android.util.Patterns.EMAIL_ADDRESS.matcher(text).matches();
        return result;
    }

    private boolean checkIfEmpty( String text)
    {
        if(text.isEmpty()) {
            //Mobile_editText.setError("Phone Number Cannot be empty");
            return false;
        }else
            return true;
    }

    private boolean checkPhoneNumber(String text)
    {
       if(text.length()!=10) {
           Mobile_editText.setError("Please enter valid phone number");
           return false;
       }else
           return true;

    }

    private void setsubmitBtn()
    {
        submitBtn=findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(setMobileValidation()) {

                    loginServiceCall();
                }
                else {
                    return;
                }

            }
        });

    }

    private void loginServiceCall()
    {

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        String url = "http://192.168.0.105:8888/University_Service/REST/Service/login/";
        StringRequest jsonObject=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                Log.e("my app", "123"+response);
                if(response.equals("\"success\"")){
                    Intent i = new Intent(Login.this, Home.class);
                    startActivity(i);

                }else {
                    showMessage("Error","Wrong Username or password");
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
                params.put("username", name);
                params.put("email",email);
                params.put("phone",phone);
                return params;
            }

        };
        requestQueue.add(jsonObject);
    }



    private void showMessage(String title, String message)
    {AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        //builder.set
        builder.setMessage(message);
        //builder.show();
        AlertDialog dialog1 = builder.create();
        dialog1.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                Window view = ((AlertDialog)dialog).getWindow();
                view.setBackgroundDrawableResource(R.color.white);
            }
        });
        dialog1.show();
    }
    }

