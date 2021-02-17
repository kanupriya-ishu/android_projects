package com.example.tourguide;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("The Taj Mahal Palace",
                "Built by Jamsetji Tata in the year 1903, this palatial structure has" +
                        " welcomed numerous dignitaries, celebrities and other bigwigs. It stands " +
                        "next to the famous Gateway of India. ",
                R.drawable.hotels1));

        words.add(new Word("The Oberoi",
                "Standing by the Marine drive, overlooking the Arabian Sea is the stunning" +
                        " and stylish Oberoi Hotel. Located at the Nariman Point, Mumbai’s famous " +
                        "business hub, the hotel is close to all major commercial and entertainment " +
                        "sites.",
                R.drawable.hotels2));

        words.add(new Word("Trident Hotel Bandra-Kurla",
                "It is located in the Bandra Kurla Complex of North Mumbai and is " +
                        "surrounded by many financial and business organisations. The Trident has " +
                        "436 plush rooms designed in a contemporary style.",
                R.drawable.hotels3));
        words.add(new Word("The Gordon House Suites",
                "It is a small but beautifully designed and furnished hotel. The Gordon " +
                        "House Suites has 102 rooms which have been tastefully created with " +
                        "Mediterranean, Country and Scandinavian themes.",
                R.drawable.hotels4));

        words.add(new Word("ITC Grand Central",
                "The architecture of the Grand central has been based on the old colonial" +
                        " style which existed in Bombay of the earlier days. This structure, " +
                        "possessing old world charm, stands at 287, Dr Babasaheb Ambedkar Road, Parel.",
                R.drawable.hotels5));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_hotels);
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
