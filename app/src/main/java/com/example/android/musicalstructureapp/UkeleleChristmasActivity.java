package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class UkeleleChristmasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Joy To The World", "George Frideric Handel"));
        songs.add(new Song("Deck The Halls", "Thomas Oliphant"));
        songs.add(new Song("Greensleeves", "Henry VIII"));
        songs.add(new Song("God Rest Ye Merry Gentlemen", "James Nares"));
        songs.add(new Song("Away In A Manger", "James R. Murray"));
        songs.add(new Song("Silent Night", "Franz Xaver Gruber"));
        songs.add(new Song("The First Noel", "William Sandys"));
        songs.add(new Song("It Came Upon A Midnight Clear", "Edmund Sears"));
        songs.add(new Song("Auld Lang Syne", "Robert Burns"));


        SongAdapter adapter = new SongAdapter(this, songs);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
