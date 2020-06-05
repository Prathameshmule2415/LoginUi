package com.pointp.loginui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        LoadFragment(R.id.topPanel,new LogoFragment(),"Logo Fragment");
        LoadFragment(R.id.signup_main,new SignupFragment (),"Login Fragment");

    }

    public void LoadFragment(int id, Fragment obj, String tag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(id,obj,tag);
        ft.commit();
    }
}
