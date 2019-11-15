package com.applligent.bagoapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.applligent.bagoapp.R;

public class SigninActivity extends AppCompatActivity {

    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signin=findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SigninActivity.this,Dashboard.class));
            }
        });
    }

    public void signup(View view) {
        startActivity(new Intent(SigninActivity.this,SignupActivity.class));
    }


    public void forgotpassword(View view) {
        startActivity(new Intent(SigninActivity.this,ForgotPasswordActivity.class));
    }
}
