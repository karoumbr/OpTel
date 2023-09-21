package com.example.operateurstelephoniques;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button submit;
    EditText login,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit);
        login = findViewById(R.id.login);
        pwd = findViewById(R.id.pwd);

        submit.setOnClickListener(view -> {
            //bon login = 'toto et le bon mot de passe = '123'


            String sLogin = login.getText().toString();
            String sPwd = pwd.getText().toString();
            if(sLogin.equals("toto") && sPwd.equals("123")){
                Intent myIntent = new Intent(getApplicationContext(), Dashboard.class);
                myIntent.putExtra("Login", sLogin);
                startActivity(myIntent);
            }

        });
    }
}