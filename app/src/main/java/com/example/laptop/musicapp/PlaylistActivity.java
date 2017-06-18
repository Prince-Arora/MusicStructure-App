package com.example.laptop.musicapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        Button t1 = (Button) findViewById(R.id.artist);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this, ArtistsActivity.class);
                startActivity(intent);
            }
        });
        Button t2 = (Button) findViewById(R.id.nowplaying);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button t3 = (Button) findViewById(R.id.album);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this,AlbumsActivity.class);
                startActivity(intent);
            }
        });
        Button t4 = (Button) findViewById(R.id.podcast);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this, PodcastActivity.class);
                startActivity(intent);
            }
        });
    }
}

