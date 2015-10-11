package com.example.alex.tmdbapp;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

public class MainActivity extends LoggingActivity {
    //private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private static final int LAYOUT = R.layout.activity_main;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initToolbar();
        initNavigationBar();

    }

    private void initNavigationBar() {
        //drawerLayout = (DrawerLayout)findViewById(R.id.navigation);
    }

    private void initToolbar() {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        //toolbar.setTitle(R.string.app_name);

        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.menu);   // TODO esta porra não aparece
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });


    }
}
