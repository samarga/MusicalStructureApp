package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WinterWonderlandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Holly And The Ivy", "Cecil Sharp"));
        songs.add(new Song("Ave Maria", "Franz Schubert"));
        songs.add(new Song("O Tannenbaum", "Ernst Anschütz"));
        songs.add(new Song("Silent Night", "Franz Xaver Gruber"));
        songs.add(new Song("Hark The Herald Angels Sing", "Felix Mendelssohn"));
        songs.add(new Song("What Child Is This", "William Chatterton Dix"));
        songs.add(new Song("Jingle Bells", "James Lord Pierpont"));
        songs.add(new Song("Wassail Song", "Unknown"));


        SongAdapter adapter = new SongAdapter(this, songs);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

