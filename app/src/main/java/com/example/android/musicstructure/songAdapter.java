package com.example.android.musicstructure;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonas on 18.03.2018.
 */

public class songAdapter extends ArrayAdapter<musicSong> {

    private Context mContext;
    private List<musicSong> songList = new ArrayList<musicSong>();

    public songAdapter(@NonNull Context context, ArrayList<musicSong> list) {
        super(context, 0, list);
        mContext = context;
        songList = list;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.music_item, parent, false);

        final musicSong currentSong = songList.get(position);

        //Show relevant info of the current song in the corresponding views
        TextView songTitleView = listItem.findViewById(R.id.songTitle);
        String title = currentSong.getTitle();
        songTitleView.setText(title);

        TextView artistView = listItem.findViewById(R.id.artistName);
        String artist = currentSong.getArtist();
        artistView.setText(artist);

        //Make the button work
        ImageButton playButton = listItem.findViewById(R.id.playButton);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent showSongInfo = new Intent(mContext, songInfo.class);

                //pass the info on the current track to the new activity
                showSongInfo.putExtra("song", currentSong);
                mContext.startActivity(showSongInfo);
            }
        });

        return listItem;
    }


}
