package com.example.android.miwok;

import java.util.ArrayList;

import static android.R.attr.button;
import static android.R.attr.id;

/**
 * Created by vamsi on 10/6/2016.
 */
public class Word {
    private String defaultWord;
    private String translatedWord;
    private int imageId = noimage;
    private int musicId;

    public static final int noimage = -1;

//    public Word(String word1, String word2) {
//        defaultWord = word1;
//        translatedWord = word2;
//    }

    public Word(String word1, String word2, int id, int music){
        translatedWord = word2;
        defaultWord = word1;
        imageId = id;
       musicId = music;
    }

    public Word(String word1, String word2, int music){
        translatedWord = word2;
        defaultWord = word1;
        musicId = music;
    }

    public int getMusicId() {
        return musicId;
    }

    public boolean hasImage(){
        return imageId!=noimage;
    }


    public String getTranslatedWord() {
        return translatedWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public int getImageId() {
        return imageId;
    }
}