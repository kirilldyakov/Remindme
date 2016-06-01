package com.example.user.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.user.remindme.R;

public class AbstractTabFragment extends Fragment {

    private String title;
    protected Context context;
    protected View view;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getTitle() {
        return title;
    }
}
