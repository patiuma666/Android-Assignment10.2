package com.example.iis5.fragmentlist;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;

//here i have created main class
// which extends  a class called AppCompatActivity where it implements  fragment interaction listener
public class MainActivity extends AppCompatActivity implements Fragment1.OnFragmentInteractionListener{


    //onCreate Called when the activity is first created.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    //creating a method onFragmentInteraction this called for interaction between the layouts
    public void onFragmentInteraction(String link) {
      //using FragmentManager where we can use fragment transaction
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        switch (link){
            case "Layout1":
                //creating the layout object
               Layout1 layout1 = new Layout1();
                //using fragment transaction we can replace a fragment layout
                fragmentTransaction.replace(R.id.detailFragment, layout1);
                // Commit the transaction
                fragmentTransaction.commit();
                break;
            case "Layout2":
               Layout2 layout2 = new Layout2();
                // Replace whatever is in the with this fragment,
                fragmentTransaction.replace(R.id.detailFragment, layout2);
                fragmentTransaction.commit();
                break;
            case "Layout3":
                Layout3 layout3 = new Layout3();
                fragmentTransaction.replace(R.id.detailFragment, layout3);
                fragmentTransaction.commit();
                break;
            case "Layout4":
               Layout4 layout4 = new Layout4();
                fragmentTransaction.replace(R.id.detailFragment, layout4);
                fragmentTransaction.commit();
                break;
        }

    }
}
