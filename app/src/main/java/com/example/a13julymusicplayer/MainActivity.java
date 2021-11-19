//package com.example.a13julymusicplayer;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.media.MediaPlayer;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity implements ItemClickListener {
//
//    private ArrayList<Music> musicArrayList = new ArrayList<>();
//    private RecyclerView recyclerView;
//
//    MediaPlayer player;
//    public void play(View view){
//        player.start();
//    }
//    public void pause(View view){
//        player.pause();
//    }
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        recyclerView = findViewById(R.id.recycler);
//
//        buildData();
//        buildrecyclerview();
//
//        setMusic();
//
//    }
//
//    private void setMusic() {
//        final MediaPlayer mediaPlayer = new MediaPlayer();
//        mplay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mediaPlayer.start();
//                itemClickListener.onclicked(music,getAdapterPosition());
//            }
//        });
//        mpause.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(mediaPlayer.isPlaying()){
//                    mediaPlayer.pause();
//                }
//                itemClickListener.onclicked(music,getAdapterPosition());
//            }
//        });
//        mdelete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                itemClickListener.onclicked(music,getAdapterPosition());
//            }
//        });
//
//
//    }
//
//    private void buildrecyclerview() {
//        musicAdopter musicAdopter = new musicAdopter(musicArrayList, this);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(musicAdopter);
//
//
//    }
//
//
//    private void buildData() {
//        musicArrayList=new ArrayList<>();
//        musicArrayList.add(new Music("calii", "3:00", R.drawable.maldives_2, R.raw.calii));
//        musicArrayList.add(new Music("down for you", "3:00", R.drawable.panda, R.raw.down));
//        musicArrayList.add(new Music("panda", "3:00", R.drawable.epic, R.raw.panda));
//        musicArrayList.add(new Music("epic", "3:00", R.drawable.ambient, R.raw.epic));
//        musicArrayList.add(new Music("ambient", "3:00", R.drawable.calii, R.raw.ambient));
//
//
//
//    }
//
//    @Override
//    public void onclicked(Music music, int position) {
////
//    }
//}
