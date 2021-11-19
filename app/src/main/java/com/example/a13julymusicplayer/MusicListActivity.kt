package com.example.a13julymusicplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MusicListActivity : AppCompatActivity(), ItemClickListener {

    var musicArrayList = ArrayList<MusicModel>()
    var recyclerView: RecyclerView? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_list)
        recyclerView = findViewById(R.id.recycler)
        buildData()
        buildrecyclerview()

    }



    fun buildrecyclerview() {
        val musicAdopter = musicAdopter(musicArrayList, this)
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = linearLayoutManager
        recyclerView!!.adapter = musicAdopter
    }


    fun buildData() {
        musicArrayList = ArrayList()
        musicArrayList.add(MusicModel("calii", "Eminem", R.drawable.maldives_2, R.raw.calii))
        musicArrayList.add(MusicModel("down for you", "Raftaar", R.drawable.panda, R.raw.down))
        musicArrayList.add(MusicModel("panda", "G-Easy", R.drawable.epic, R.raw.panda))
        musicArrayList.add(MusicModel("epic", "Shawn", R.drawable.ambient, R.raw.epic))
        musicArrayList.add(MusicModel("ambient", "Ariana", R.drawable.calii, R.raw.ambient))
    }

    override fun onclicked(music: MusicModel?) {
        val intent = Intent(this,MusicPlayerActivity::class.java)
        intent.putExtra("music",music!!.msong)
        intent.putExtra("image",music.mImg)
        intent.putExtra("artist",music.artist)
        intent.putExtra("songName",music.mName)
        startActivity(intent)
    }


}
