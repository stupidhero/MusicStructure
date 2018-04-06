package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        TextView titleView = (TextView) findViewById(R.id.titleInfoName);
        titleView.setText(song.getTitle());

        TextView artistView = (TextView) findViewById(R.id.titleInfoArtist);
        artistView.setText(song.getArtist());

        TextView durationView= (TextView) findViewById(R.id.songDurationView);
        artistView.setText(DateUtils.formatElapsedTime(song.getDuration()));

        TextView funFactView = (TextView) findViewById(R.id.funFactView);
        funFactView.setText(song.getFact());
    }
}
