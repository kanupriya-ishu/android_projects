package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout topAttractions = findViewById(R.id.topAttractions);

        topAttractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent attractionsIntent = new Intent(MainActivity.this, TopAttractions.class);

                // Start the new activity
                startActivity(attractionsIntent);
            }
        });

        RelativeLayout religiousPlaces = findViewById(R.id.religiousPlaces);

        religiousPlaces.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent religiousIntent = new Intent(MainActivity.this, ReligiousPlaces.class);

                // Start the new activity
                startActivity(religiousIntent);
            }
        });


        RelativeLayout eateries = findViewById(R.id.eateries);

        eateries.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent eateriesIntent = new Intent(MainActivity.this, Eateries.class);

                // Start the new activity
                startActivity(eateriesIntent);
            }
        });

        RelativeLayout hotels = findViewById(R.id.hotels);

        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hotelsIntent = new Intent(MainActivity.this, Hotels.class);

                // Start the new activity
                startActivity(hotelsIntent);
            }
        });

        RelativeLayout religious = findViewById(R.id.religiousPlaces);

        religious.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent religiousIntent = new Intent(MainActivity.this, ReligiousPlaces.class);

                // Start the new activity
                startActivity(religiousIntent);
            }
        });


    }
}