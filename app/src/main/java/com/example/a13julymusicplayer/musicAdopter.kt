package com.example.a13julymusicplayer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class musicAdopter(

    private val musiclist: ArrayList<MusicModel>,
    private val itemClickListener: ItemClickListener
) :
    RecyclerView.Adapter<MusicViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_design, parent, false)
        return MusicViewholder(view, itemClickListener)
    }

    override fun onBindViewHolder(holder: MusicViewholder, position: Int) {
        val music = musiclist[position]
        holder.setData(music)
    }

    override fun getItemCount(): Int {
        return musiclist.size
    }
}
