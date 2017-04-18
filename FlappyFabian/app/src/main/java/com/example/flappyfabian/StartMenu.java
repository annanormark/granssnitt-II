package com.example.flappyfabian;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class StartMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
    }


    public void startGame(){
        Intent i = new Intent(StartMenu.this, Game.class);
        startActivity(i);
    }

    public void help(){
        Intent i = new Intent(StartMenu.this, Help.class);
        startActivity(i);
    }

    public void settings(){
        Intent i = new Intent(StartMenu.this, Settings.class);
        startActivity(i);
    }
}
