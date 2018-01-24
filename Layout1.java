package com.example.iis5.fragmentlist;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Layout1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //the layout inflater  inflates the views in the fragment
        //the view group contains views and is base class of layouts and views containers
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layout1, container, false);
    }
}