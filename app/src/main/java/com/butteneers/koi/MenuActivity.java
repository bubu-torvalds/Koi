package com.butteneers.koi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    public static final String START_VOCAB_INTENT = "com.butteneers.koi.STARTVOCAB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void startVocab(View view) {
        Log.i("startVocab", "button pressed");
        Intent intent = new Intent(this, PersonnaliserActivity.class);
        intent.putExtra(START_VOCAB_INTENT, "konnichiwa");
        startActivity(intent);
    }
}
