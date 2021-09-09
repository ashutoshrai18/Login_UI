package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSendOTP;
    EditText edtMobileNO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMobileNO = findViewById(R.id.edt_mobile_no);
        btnSendOTP = findViewById(R.id.btn_send_otp);

        btnSendOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dd = edtMobileNO.getText().toString();
                if (dd.isEmpty()){
                    edtMobileNO.setError("Please Enter Mobile No");
                    Toast.makeText(MainActivity.this, "Please Enter Mobile NO.", Toast.LENGTH_SHORT).show();
                }else
                {
                    Intent intent = new Intent(MainActivity.this,OtpActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}