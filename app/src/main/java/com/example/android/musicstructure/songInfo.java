package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.widget.TextView;

public class songInfo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_info);

        //Retrieve the passed information on the song
        Intent songIntent = getIntent();
        musicSong song = songIntent.getParcelableExtra("song");

        //Display the information
        TextView titleView = findViewById(R.id.titleInfoName);
        titleView.setText(song.getTitle());

        TextView artistView = findViewById(R.id.titleInfoArtist);
        artistView.setText(song.getArtist());

        TextView durationView = findViewById(R.id.songDurationView);
        durationView.setText(DateUtils.formatElapsedTime(song.getDuration()));

        TextView funFactView = findViewById(R.id.funFactView);
        funFactView.setText(song.getFact());
    }
}
