package com.example.android.buttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void msgDisplay(View view){

       View myView= findViewById( R.id.view_msg);
        myView.setVisibility(View.VISIBLE);

    }
}
