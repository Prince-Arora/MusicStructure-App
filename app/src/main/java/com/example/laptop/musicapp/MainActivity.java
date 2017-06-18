package com.example.laptop.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.laptop.musicapp.R.id.artist;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button t1 = (Button) findViewById(R.id.artist);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(intent);
            }
        });
        Button t2 = (Button) findViewById(R.id.album);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AlbumsActivity.class);
                startActivity(intent);
            }
        });
        Button t3 = (Button) findViewById(R.id.playlist);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlaylistActivity.class);
                startActivity(intent);
            }
        });
        Button t4 = (Button) findViewById(R.id.podcast);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PodcastActivity.class);
                startActivity(intent);
            }
        });
        Button t5 = (Button) findViewById(R.id.online);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExternalAffects.class);
                startActivity(intent);
            }
        });


    }
}