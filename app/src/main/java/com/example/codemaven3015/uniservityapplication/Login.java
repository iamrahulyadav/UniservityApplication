package com.example.codemaven3015.uniservityapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText Name_editText,Mobile_editText,Mail_editText;
    Button cancelBtn,submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Name_editText=findViewById(R.id.Name_editText);
        Mobile_editText=findViewById(R.id.Mobile_editText);
        Mail_editText=findViewById(R.id.Mail_editText);
        cancelBtn=findViewById(R.id.cancelBtn);
        submitBtn=findViewById(R.id.submitBtn);

    }
}
