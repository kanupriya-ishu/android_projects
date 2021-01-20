package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
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

        return listItemView;
    }

}