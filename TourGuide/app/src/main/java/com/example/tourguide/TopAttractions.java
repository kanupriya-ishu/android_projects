package com.example.tourguide;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TopAttractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("The Gateway of India",
                "Standing proud on the banks of the Arabian Sea at the Apollo Bunder waterfront area, the Gateway of India is one of Mumbai's most popular and treasured landmarks.",
                R.drawable.attractions1));

        words.add(new Word("Marine Drive",
                "No trip to Mumbai would be complete without a cruise down Marine Drive. The 3.6-kilometer-long, C-shaped boulevard offers epic views of the coast.",
                R.drawable.attractions2));

        words.add(new Word("Bandra-Worli Sea Link",
                "One of Mumbai's most iconic sites is a cable-stayed bridge known as the Bandra-Worli Sea Link. ",
                R.drawable.attractions3));

        words.add(new Word("Kanheri Cave",
                "Spend a day at Sanjay Gandhi National Park exploring the Kanheri Caves, a complex of monuments that were carved out of the basalt formations around 2,000 years ago",
                R.drawable.attractions4));

        words.add(new Word("Elephanta Island",
                "The attraction is home to rock-cut cave temples honoring the Hindu god Shiva.",
                R.drawable.attractions5));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_attractions);
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
