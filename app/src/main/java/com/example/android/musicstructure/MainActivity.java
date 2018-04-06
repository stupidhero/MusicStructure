package com.example.android.musicstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView songList;
        songAdapter sAdapter;

        songList = findViewById(R.id.songListView);

        ArrayList<musicSong> trackList = new ArrayList<musicSong>();

        trackList.add(new musicSong("Behind blue Eyes", "The Who", "For a considerably worse instance of this song, see the Limp Bizkit cover.", 138));
        trackList.add(new musicSong("Loosing my Religion", "REM", "It's a song about loosing your religion, or so they say.", 356));
        trackList.add(new musicSong("Mutter", "Rammstein", "Imagine you were but a clone of your mothers real child!", 212));

        sAdapter = new songAdapter(this, trackList);

        songList.setAdapter(sAdapter);


    }


}
