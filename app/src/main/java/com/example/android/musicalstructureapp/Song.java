package com.example.android.musicalstructureapp;

public class Song {

    /** Song Name */
    private String mSongName;

    /** Song Composer */
    private String mSongComposer;

    /** Image resource ID for the song */
    private int mImageResourceId;


    public Song(String songName, String songComposer) {
        mSongName = songName;
        mSongComposer = songComposer;
    }

    /**
     * Get the Song Name.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Song Composer.
     */
    public String getSongComposer() {
        return mSongComposer;
    }

    /**
     * Return the image resource ID of the song.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
