package com.example.laptop.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);
        Button t1 = (Button) findViewById(R.id.nowplaying);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PodcastActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button t2 = (Button) findViewById(R.id.album);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PodcastActivity.this,AlbumsActivity.class);
                startActivity(intent);
            }
        });
        Button t3 = (Button) findViewById(R.id.playlist);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PodcastActivity.this,PlaylistActivity.class);
                startActivity(intent);
            }
        });
        Button t4 = (Button) findViewById(R.id.artist);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PodcastActivity.this, ArtistsActivity.class);
                startActivity(intent);
            }
        });
    }
}
