package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class KidsStuffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Blow the Man Down", "Unknown"));
        songs.add(new Song("Home On The Range", "Daniel E. Kelley"));
        songs.add(new Song("Little Brown Jug", "Joseph Winner"));
        songs.add(new Song("Camptown Races", "Stephen Foster"));
        songs.add(new Song("Humpty Dumpty", " James William Elliott"));
        songs.add(new Song("London Bridge", "Unknown"));
        songs.add(new Song("Mary Had a Little Lamb", "Sarah Josepha Hale"));
        songs.add(new Song("Oh Susanna", "Stephen Foster"));
        songs.add(new Song("Pop Goes the Weasel", "Unknown"));
        songs.add(new Song("Rock a Bye Baby", "John Newbery"));
        songs.add(new Song("The Farmer In the Dell", "Unknown"));
        songs.add(new Song("The Mulberry Bush", "Clay Boland"));
        songs.add(new Song("Three Blind Mice", "Thomas Ravenscroft"));
        songs.add(new Song("Twinkle Twinkle Little Star", "Mozart"));
        songs.add(new Song("Yankee Doodle", "Unknown"));


        SongAdapter adapter = new SongAdapter(this, songs);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
