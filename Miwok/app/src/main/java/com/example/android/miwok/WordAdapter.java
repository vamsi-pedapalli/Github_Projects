package com.example.android.miwok;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vamsi on 10/7/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {


    private int colorResourceId;


    public WordAdapter(Context context, ArrayList<Word> wordList, int colorId) {
        super(context, 0, wordList);
        colorResourceId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);


        TextView miwokword = (TextView) listItemView.findViewById(R.id.miwok_name);
        miwokword.setText(currentWord.getTranslatedWord());


        TextView defaultWord = (TextView) listItemView.findViewById(R.id.default_name);
        defaultWord.setText(currentWord.getDefaultWord());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

         View textLayoutview = listItemView.findViewById(R.id.textLayout);

        int color = ContextCompat.getColor(getContext(), colorResourceId);

        textLayoutview.setBackgroundColor(color);

        return listItemView;

    }
}
