package com.example.tourguide;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ReligiousPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Mumbadevi Temple",
                "The Mumbadevi Temple is dedicated to the goddess Mumba, whom the city of" +
                        " Mumbai was named after, and that's what makes this otherwise unremarkable" +
                        " temple noteworthy. ",
                R.drawable.religous1));

        words.add(new Word("Keneseth Eliyahoo Synagogue\n",
                "Keneseth Eliyahoo Synagogue was built in 1884 by Jacob Elias Sassoon and" +
                        " his brother Albert (the Sassoon family also built the Sassoon Docks), in " +
                        "memory of their father Eliyahoo Sassoon. ",
                R.drawable.religous2));

        words.add(new Word("Haji Ali",
                "The imposing Haji Ali is both a mosque and tomb. It was built in 1431 by" +
                        " wealthy Muslim merchant and Sufi saint Pir Haji Ali Shah Bukhari, who was " +
                        "inspired to change the course of his life after going to Mecca.",
                R.drawable.religous3));

        words.add(new Word("Mahalaxmi Temple",
                "As its name suggests, Mahalaxmi Temple is devoted to the Goddess Mahalaxmi." +
                        " One of the oldest temples in Mumbai, Mahalaxmi Temple was built in 1782 to" +
                        " bring good fortune and remove problems that were hampering the Hornby " +
                        "Vellard causeway construction project.",
                R.drawable.religous4));

        words.add(new Word("Siddhivinayak Temple",
                "Visit the famous Siddhivinayak Temple in Mumbai, devoted to Lord Ganesh. " +
                        "While many Hindu temples only allow Hindus to enter, thereby adding to the " +
                        "religion’s mystery, this temple welcomes everyone with its open door policy.",
                R.drawable.religous5));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_religious);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);
            }
        });

    }
}
