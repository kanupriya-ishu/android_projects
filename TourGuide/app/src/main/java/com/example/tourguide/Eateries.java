package com.example.tourguide;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Eateries extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("The Gateway of India",
                "",
                R.drawable.attractions1));

        words.add(new Word("Marine Drive",
                "",
                R.drawable.attractions2));

        words.add(new Word("Bandra-Worli Sea Link",
                "",
                R.drawable.attractions3));

        words.add(new Word("Kanheri Cave",
                "",
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
