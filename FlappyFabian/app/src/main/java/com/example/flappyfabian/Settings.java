package com.example.flappyfabian;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        final MediaPlayer sound = MediaPlayer.create(this, R.raw.bell);
        Button StartGame = (Button) this.findViewById(R.id.Play_game);
        StartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.start();
            }
        });

    }

}
