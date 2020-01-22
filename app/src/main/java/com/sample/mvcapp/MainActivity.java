package com.sample.mvcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        UserModel userModel = new UserModel();
        EditText userName = (EditText) findViewById(R.id.etMainActivityUserName);

        userModel.name = userName.getText().toString();

    }
}
