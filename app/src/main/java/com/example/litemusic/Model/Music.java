package com.example.litemusic.Model;

import android.net.Uri;
import android.provider.MediaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Music {
    public Uri uri;
    public String name;
    public int duration;
    public int size;
    public String artist;

    public Music(Uri uri, String name, int duration, int size, String artist) {

        this.uri = uri;
        this.name = name;
        this.duration = duration;
        this.size = size;
        this.artist=artist;
    }
}