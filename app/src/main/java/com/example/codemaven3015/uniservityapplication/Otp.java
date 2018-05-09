package com.example.codemaven3015.uniservityapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Otp extends AppCompatActivity {
    Button submitOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        setOnClickOtpButton();
    }

    private void setOnClickOtpButton() {
        submitOtp = findViewById(R.id.submitOtp);
        submitOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Otp.this,Home.class);
                startActivity(intent);
            }
        });
    }
}
