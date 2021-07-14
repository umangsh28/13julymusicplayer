package com.example.a13julymusicplayer;

import android.widget.TextView;

public class Music {
    private String mName;
    private String mDuration;
    private int    mImg;
    private int msong;

    public Music(String name,String duration,int img,int song){
        this.mName=name;
        this.mDuration=duration;
        this.mImg=img;
        this.msong=song;
    }


    public String getmName() {
        return mName;
    }

    public String getmDuration() {
        return mDuration;
    }

    public int getmImg() {
        return mImg;
    }
    public int getSong(){
        return msong;
    }
}
