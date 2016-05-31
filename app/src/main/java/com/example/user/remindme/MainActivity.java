package com.example.user.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.user.remindme.R;

/**
 * Created by user on 30.05.16.
 */
public class MainActivity extends Activity {
    int LAYOUT = R.layout.activity_main;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initToolbar();
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
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
}

//https://youtu.be/6GXAZupRGlY?list=PLIU76b8Cjem54jkj0XtCAp8JqZooY_eBI&t=428