package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word word = getItem(position);


        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        defaultTranslation.setText(word.getDefaultTranslation());
        miwokTranslation.setText(word.getMiwokTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (word.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(word.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}