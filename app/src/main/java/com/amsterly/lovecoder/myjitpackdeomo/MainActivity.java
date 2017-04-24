package com.amsterly.lovecoder.myjitpackdeomo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.amsterly.lovecoder.mylibrary.Utils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils utils = new Utils();
        Log.i(TAG, "onCreate: "+utils.name);
    }
}
