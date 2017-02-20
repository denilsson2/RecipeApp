package com.murva.murvapes;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import MurvaTools.MurvaTools;
import MurvaTools.Validation;


public class AccountCreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_create);
    }

    public void createAccount(final View view){
        Models.Account acc = new Models.Account();
        acc.userName = ((EditText) findViewById(R.id.editText_userName)).getText().toString();
        acc.Password = ((EditText) findViewById(R.id.editText_password)).getText().toString();

        if (Validation.validateSignUp(acc, view)){
            acc.latitude = 0;
            acc.longitude = 0;
            MurvaTools.SignUp(acc, view, this);
        }
        return;
    }
}
