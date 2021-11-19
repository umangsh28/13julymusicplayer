package com.example.a13julymusicplayer

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MusicViewholder(itemView: View, private val itemClickListener: ItemClickListener) :
    RecyclerView.ViewHolder(itemView) {



    private var mname: TextView? = null
    private var mduration: TextView? = null
    private var mImg: ImageView? = null

    private fun initData(itemView: View) {
        mname = itemView.findViewById(R.id.Sname)
        mduration = itemView.findViewById(R.id.Sdur)
        mImg = itemView.findViewById(R.id.Img1)

    }

    fun setData(music: MusicModel) {

        mname!!.setText(music.msong)
        mduration!!.text = music.artist
        mImg!!.setImageResource(music.mImg)

        itemView.setOnClickListener {

            itemClickListener.onclicked(music)

        }

    }



    init {

        initData(itemView)

    }
}