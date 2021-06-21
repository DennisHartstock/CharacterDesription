package com.example.characterdesription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors;
    private TextView textViewColorDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColors);
        textViewColorDescription = findViewById(R.id.textViewColorDescription);
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        textViewColorDescription.setText(description);
    }

    private String getDescriptionByPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.descriptions);
        return descriptions[position];
    }
}