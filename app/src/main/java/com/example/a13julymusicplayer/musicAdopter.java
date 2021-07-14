package com.example.a13julymusicplayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class musicAdopter extends RecyclerView.Adapter<MusicViewholder> {
    private ArrayList<Music>musiclist;
    private ItemClickListener itemClickListener;

    public musicAdopter(ArrayList<Music> musiclist,ItemClickListener itemClickListener) {
        this.musiclist = musiclist;
        this.itemClickListener=itemClickListener;
    }

    @NonNull

    @Override
    public MusicViewholder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new MusicViewholder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewholder holder, int position) {
        Music music=musiclist.get(position);
        holder.setData(music,position);
    }

    @Override
    public int getItemCount() {
        return musiclist.size();
    }
}
