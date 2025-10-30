package com.example.a2374820006_letuananh;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;

public class SongListActivity extends AppCompatActivity {

    ListView listSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        listSongs = findViewById(R.id.listSongs);

        // Dữ liệu mẫu
        ArrayList<HashMap<String, String>> songList = new ArrayList<>();
        HashMap<String, String> song1 = new HashMap<>();
        song1.put("title", "Shape of You");
        song1.put("artist", "Ed Sheeran");
        songList.add(song1);

        HashMap<String, String> song2 = new HashMap<>();
        song2.put("title", "Blinding Lights");
        song2.put("artist", "The Weeknd");
        songList.add(song2);

        HashMap<String, String> song3 = new HashMap<>();
        song3.put("title", "Levitating");
        song3.put("artist", "Dua Lipa");
        songList.add(song3);

        // Adapter đơn giản
        SongListAdapter adapter = new SongListAdapter(this, songList);
        listSongs.setAdapter(adapter);
    }
}
