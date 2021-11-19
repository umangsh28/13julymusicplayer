package com.example.a13julymusicplayer

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_page2.*

class MusicPlayerActivity : AppCompatActivity() {


    var image:Int?=null
    var song:Int?=null
    var artist:String?=null
    var songName:String?=null



    var player: MediaPlayer? = null

    fun play(view: View?) {
        player!!.start()
    }

    fun pause(view: View?) {
        player!!.pause()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page2)



        getData()

        setMusic()
    }

    private fun getData() {
        image=intent.getIntExtra("image",0)
        artist=intent.getStringExtra("artist")
        song=intent.getIntExtra("music",0)
        songName=intent.getStringExtra("songName")

        Tv_songName.text=songName
        profile_image.setImageResource(image!!)


    }

    fun setMusic() {
        val mediaPlayer = MediaPlayer.create(this, song!!)
        btnPlay.setOnClickListener(View.OnClickListener {
            mediaPlayer.start()
//
        })



        prev.setOnClickListener(View.OnClickListener {
            if(mediaPlayer.isPlaying){
                mediaPlayer.pause()
            }
        })

    }
}