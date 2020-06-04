package com.pointp.loginui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  /* implements View.OnClickListener*/ g{

    Button btn_sup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        btn_sup=findViewById(R.id.btn_signup);
//
//        btn_sup.setOnClickListener(this);


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
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.btn_signup:
//                Intent intent = new Intent(MainActivity.this,Signup.class);
//                startActivity(intent);
//                break;
//        }
//    }
}


