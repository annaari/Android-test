package com.test.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Music implements Parcelable {

    private String artist;
    private String song;

    Music(String artist, String song) {
        this.artist = artist;
        this.song = song;
    }

    private Music(Parcel in) {
        artist = in.readString();
        song = in.readString();
    }
    public String getArtist() { return artist; }
    public String getSong() { return song; }

    public static final Creator<Music> CREATOR = new Creator<Music>() {
        @Override
        public Music createFromParcel(Parcel in) {
            return new Music(in);
        }

        @Override
        public Music[] newArray(int size) {
            return new Music[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(artist);
        dest.writeString(song);
    }
}
