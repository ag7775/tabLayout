package com.example.modabba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.menu:

                        fragment = new Menu(getApplicationContext());
                        loadFragment(fragment);
                        return true;

                    case R.id.subscribe:

                        fragment = new Subscribe(getApplicationContext());
                        loadFragment(fragment);
                        return true;


                    case R.id.profile:

                        fragment = new Profile(getApplicationContext());
                        loadFragment(fragment);
                        return true;


                }
                return true;
            }
        });
    }

    private void init() {

        bottomNavigationView = findViewById(R.id.bottom_nav);

    }
    private void loadFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.screens,fragment).commit();
    }
}
