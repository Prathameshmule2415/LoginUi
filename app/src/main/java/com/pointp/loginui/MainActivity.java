package com.pointp.loginui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadFragment(R.id.topPanel,new LogoFragment(),"Login Fragment");
        LoadFragment(R.id.middlePanel,new LoginFragment(),"Login Fragment");
        LoadFragment(R.id.bottompanel,new BottomFragment(),"Copyright Fragment");
    }

    public void LoadFragment(int id, Fragment obj,String tag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(id,obj,tag);
        ft.commit();
    }
}


