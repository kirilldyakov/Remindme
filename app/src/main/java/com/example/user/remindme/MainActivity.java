package com.example.user.remindme;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.user.remindme.R;

public class MainActivity extends AppCompatActivity {
    private static final int LAYOUT = R.layout.activity_main;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initToolbar();
        initNavigationView();
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        if(toolbar==null) return;
        toolbar.setTitle(R.string.app_name);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                                               @Override
                                               public boolean onMenuItemClick(MenuItem item) {
                                                   return false;
                                               }
                                           }

        );

        toolbar.inflateMenu(R.menu.menu);
    }


    private void initNavigationView() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

    }
}

//https://youtu.be/6GXAZupRGlY?list=PLIU76b8Cjem54jkj0XtCAp8JqZooY_eBI&t=428
//https://youtu.be/k9dStNYqNXg?list=PLIU76b8Cjem54jkj0XtCAp8JqZooY_eBI