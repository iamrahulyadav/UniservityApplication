package com.example.codemaven3015.uniservityapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText Name_editText,Mobile_editText,Mail_editText;
    Button cancelBtn,submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cancelBtn=findViewById(R.id.cancelBtn);
        setsubmitBtn();
        //setMobileValidation();

    }

    private boolean setMobileValidation()
    {
        Mobile_editText=findViewById(R.id.Mobile_editText);
        Mail_editText=findViewById(R.id.Mail_editText);
        Name_editText=findViewById(R.id.Name_editText);
        String phone = Mobile_editText.getText().toString().trim();
        String name = Name_editText.getText().toString().trim();
        String email = Mail_editText.getText().toString().trim();

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
                    Intent intent = new Intent(Login.this, Otp.class);
                    startActivity(intent);
                }
                else {
                    return;
                }
            }
        });

    }
}
