package com.butteneers.koi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PersonnaliserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personnaliser);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        int numberOfRows = 10;
        int numberOfButtonsPerRow = 5;
        int buttonIdNumber = 0;


        final LinearLayout verticalLayout = (LinearLayout) findViewById(R.id.buttonlayout);

        for (int i = 0; i < numberOfRows; i++) {
            LinearLayout newLine = new LinearLayout(this);
            newLine.setLayoutParams(params);
            newLine.setOrientation(LinearLayout.HORIZONTAL);
            for (int j = 0; j < numberOfButtonsPerRow; j++) {
                Button button = new Button(this);
                // You can set button parameters here:
                button.setWidth(10);
                button.setId(buttonIdNumber);
                button.setLayoutParams(params);
                button.setText("Wa");

                newLine.addView(button);
                buttonIdNumber++;
            }
            verticalLayout.addView(newLine);

        }
    }
}
