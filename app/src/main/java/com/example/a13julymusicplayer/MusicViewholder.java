package com.example.a13julymusicplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicViewholder extends RecyclerView.ViewHolder{

    private ArrayList<Music>musicArrayList;
    private TextView mname;
    private TextView mduration;
    private ImageView mImg;
    private Button mplay;
    private ItemClickListener itemClickListener;
//    MediaPlayer mediaPlayer;
    private Button mpause;
    private Button mdelete;


    public MusicViewholder(@NonNull View itemView,ItemClickListener itemClickListener) {

        super(itemView);
        this.itemClickListener=itemClickListener;
        initData(itemView);

    }

    private void initData(View itemView) {
        mname=itemView.findViewById(R.id.Sname);
        mduration=itemView.findViewById(R.id.Sdur);
        mplay=itemView.findViewById(R.id.play);
        mpause=itemView.findViewById(R.id.pause);
        mdelete=itemView.findViewById(R.id.delete);
        mImg=itemView.findViewById(R.id.Img1);
    }



    public void setData(Music music, int position) {
        mname.setText(music.getmName());
        mduration.setText(music.getmDuration());
        mImg.setImageResource(music.getmImg());
        final MediaPlayer mediaPlayer = MediaPlayer.create(mname.getContext(), music.getSong());
        mplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                itemClickListener.onclicked(music,getAdapterPosition());
            }
        });
        mpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }
                itemClickListener.onclicked(music,getAdapterPosition());
            }
        });
        mdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClickListener.onclicked(music,getAdapterPosition());
            }
        });

    }
}
