package com.example.android.musicstructure;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jonas on 18.03.2018.
 */

public class musicSong implements Parcelable{

    //Store the song title
    private String songTitle;

    //Store the song artist
    private String songArtist;

    //Store the duration of the song in seconds
    private int songDuration;

    //Store a fun fact about the song
    private String funFact;

   //Constructor for new Songs
     public musicSong (String title, String artist, String fact, int duration){
         this.songTitle = title;
         this.songArtist = artist;
         this.songDuration = duration;
         this.funFact = fact;

     }
    //method to retrieve the song Title
     public String getTitle() {
        return songTitle;
    }

    //method to retrieve the artist's name
    public String getArtist() {
         return songArtist;
    }

    //method to retrieve the fun fact about the song
    public String getFact() {
        return funFact;
    }

    //method to retrieve the duration of the Song
    public int getDuration() {
        return songDuration;
    }


    //make it parcelable to pass an instance of the class - created by http://www.parcelabler.com/

    protected musicSong(Parcel in) {
        songTitle = in.readString();
        songArtist = in.readString();
        songDuration = in.readInt();
        funFact = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(songTitle);
        dest.writeString(songArtist);
        dest.writeInt(songDuration);
        dest.writeString(funFact);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<musicSong> CREATOR = new Parcelable.Creator<musicSong>() {
        @Override
        public musicSong createFromParcel(Parcel in) {
            return new musicSong(in);
        }

        @Override
        public musicSong[] newArray(int size) {
            return new musicSong[size];
        }
    };

}
