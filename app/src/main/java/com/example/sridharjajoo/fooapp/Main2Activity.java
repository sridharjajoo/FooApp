package com.example.sridharjajoo.fooapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.formlib.AppForm;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new AppForm(this));
    }
}
