package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class OtpActivity extends AppCompatActivity {

    TextView mTextField;
    TextView textViewResendOTP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        mTextField = findViewById(R.id.tv_timer);
        textViewResendOTP = findViewById(R.id.tv_resend_otp);

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                mTextField.setText("Resend code in: " + millisUntilFinished / 1000);

                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                mTextField.setVisibility(View.GONE);
                textViewResendOTP.setVisibility(View.VISIBLE);
                textViewResendOTP.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }

        }.start();
    }
}