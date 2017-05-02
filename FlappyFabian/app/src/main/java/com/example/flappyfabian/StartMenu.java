package com.example.flappyfabian;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class StartMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);


        //plays sound
        final MediaPlayer sound = MediaPlayer.create(this, R.raw.bell);
        Button StartGame = (Button) this.findViewById(R.id.Play_game);
        StartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.start();
            }
        });


        Button settings = (Button) this.findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent myIntent = new Intent(StartMenu.this, Settings.class);
                StartMenu.this.startActivity(myIntent);
            }
        });

    }




    public void startGame(){
        Intent i = new Intent(StartMenu.this, Game.class);
        startActivity(i);
    }

    public void help(){
        Intent i = new Intent(StartMenu.this, Help.class);
        startActivity(i);
    }


}
