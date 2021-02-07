package com.example.tourguide;

public class Word {

    private String mName;
    private String mDescription;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String name, String description, int imageResourceId){
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getName(){
        return mName;
    }

    public String getDescription(){
        return mDescription;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}
