package com.butteneers.koi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String START_KOI_INTENT = "com.butteneers.koi.STARTKOI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startKoi(View view) {
        Log.i("startKoi", "button pressed");
        Intent intent = new Intent(this, SelectHiraganaActivity.class);
        intent.putExtra(START_KOI_INTENT, "konnichiwa");
        startActivity(intent);
    }


}
