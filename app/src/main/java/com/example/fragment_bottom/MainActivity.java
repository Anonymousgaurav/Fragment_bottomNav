package com.example.fragment_bottom;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv = findViewById(R.id.bnv);










        bnv.setOnNavigationItemSelectedListener(navlist);
       getSupportFragmentManager().beginTransaction().replace(R.id.frag, new frag1()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlist = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragm = null;

                switch (item.getItemId()) {
                    case R.id.item1:
                        fragm = new frag1();
                        break;

                    case R.id.item2:
                        fragm = new frag2();
                        break;

                    case R.id.item3:
                        fragm = new frag3();
                        break;


                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frag, fragm).commit();
                return true;
            }
        };


    }
