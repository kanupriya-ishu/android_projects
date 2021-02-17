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

        words.add(new Word("Kyani’s, Lohar Chawl",
                "Kyani’s in Marine Lines is your one comfort food eatery. The best thing " +
                        "to munch on their egg dishes, sodas, caramel custards, and their beautiful" +
                        " cake. ",
                R.drawable.eateries1));

        words.add(new Word("Canon Pav Bhaji, CSMT",
                "This little place is right opposite the majestic CSMT Station and serves" +
                        " pav bhaji with a slab of Amul butter on it. The best dishes to try here " +
                        "are Amul Pav Bhaji and Cheese Pav Bhaji.",
                R.drawable.eateries2));

        words.add(new Word("Britannia & Co",
                "Britannia & Co is not your usual Irani restaurant, this place has been " +
                        "running for approximately 95 years now. This little cafe in Bombay has the" +
                        " best Mutton Berry Pulao which is their star dish.",
                R.drawable.eateries3));

        words.add(new Word("K Rustom",
                "K Rustom is a cute little ice cream shop in the Marine Drive area. Now, " +
                        "this is not your usual ice cream, it is sandwich ice cream, which tastes" +
                        " delicious! ",
                R.drawable.eateries4));

        words.add(new Word("Yazdani Bakery, Horniman Circle",
                "This little Irani outlet has the best chi and bun maska. You can also try" +
                        " their puddings. If you want to give your taste buds a vintage tinkle, then" +
                        " this is a must-visit breakfast place and also for your evenings. ",
                R.drawable.eateries5));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_eateries);
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
