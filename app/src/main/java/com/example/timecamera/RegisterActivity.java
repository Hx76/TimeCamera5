package com.example.timecamera;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
public class RegisterActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
public void StartLogin (View view){
        Intent intent = new Intent();
        intent.setClass(RegisterActivity.this,LoginActivity.class);
        startActivity(intent);
    }

}
