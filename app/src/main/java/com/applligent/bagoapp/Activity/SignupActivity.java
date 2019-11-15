package com.applligent.bagoapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.applligent.bagoapp.R;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signin(View view) {
        startActivity(new Intent(SignupActivity.this,SigninActivity.class));
    }

    public void dashboard(View view) {
        startActivity(new Intent(SignupActivity.this,Dashboard.class));
    }
}
