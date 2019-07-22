package com.example.poll.activities;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.example.poll.R;
import com.example.poll.fragments.AddPollFragment;
import com.example.poll.fragments.HomeFragment;
import com.example.poll.fragments.SearchFollowFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    FragmentTransaction home = getSupportFragmentManager().beginTransaction();
                    home.replace(R.id.container_frameLayout, new HomeFragment());
                    home.commit();
                    return true;
                case R.id.navigation_search:
                    FragmentTransaction follow = getSupportFragmentManager().beginTransaction();
                    follow.replace(R.id.container_frameLayout, new SearchFollowFragment());
                    follow.commit();
                    return true;
                case R.id.navigation_add:
                    FragmentTransaction add = getSupportFragmentManager().beginTransaction();
                    add.replace(R.id.container_frameLayout, new AddPollFragment());
                    add.commit();
                    return true;
                case R.id.navigation_person:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container_frameLayout, new HomeFragment());
        ft.commit();
    }

}
