package com.example.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LOGCAT","Entra en el Metodo onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LOGCAT","Entra en el Metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOGCAT","Entra en el Metodo onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LOGCAT","Entra en el Metodo onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOGCAT","Entra en el Metodo onDestroy");
    }
}
