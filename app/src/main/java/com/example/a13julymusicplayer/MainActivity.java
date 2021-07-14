package com.example.a13julymusicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private ArrayList<Music> musicArrayList = new ArrayList<>();
    private RecyclerView recyclerView;

    MediaPlayer player;
    public void play(View view){
        player.start();
    }
    public void pause(View view){
        player.pause();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);

        buildData();
        buildrecyclerview();

    }

    private void buildrecyclerview() {
        musicAdopter musicAdopter = new musicAdopter(musicArrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(musicAdopter);


    }


    private void buildData() {
        musicArrayList=new ArrayList<>();
        musicArrayList.add(new Music("down for you", "3:00", R.drawable.maldives_2, R.raw.down));
        musicArrayList.add(new Music("down for you", "3:00", R.drawable.maldives_2, R.raw.down));
        musicArrayList.add(new Music("down for you", "3:00", R.drawable.maldives_2, R.raw.down));
        musicArrayList.add(new Music("london", "3:00", R.drawable.maldives_2, R.raw.panda));
        musicArrayList.add(new Music("london", "3:00", R.drawable.maldives_2, R.raw.panda));

//            Music music = new Music("down for you", "3:00", R.drawable.maldives_2, R.raw.down);

//            musicArrayList.add(music);
//


    }

    @Override
    public void onclicked(Music music, int position) {
//        player = new MediaPlayer();
//        player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                try {
//                    mp.setDataSource((music.getSong() + ""));
//                    mp.start();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                mp.start();
//            }
//        });
    }
}
