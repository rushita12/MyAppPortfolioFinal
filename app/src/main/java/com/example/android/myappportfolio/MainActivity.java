package com.example.android.myappportfolio;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    String temp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void showmsg(String msg)
    {

        LayoutInflater inflater=getLayoutInflater();
        View layout = inflater.inflate(R.layout.custome_toast, (ViewGroup) findViewById(R.id.toast_layout));

        TextView textview = (TextView) layout.findViewById(R.id.toast_text_1);
        textview.setText("This Button Will Launch My "+msg);

        Toast toast = new Toast(getBaseContext());
        toast.setDuration(toast.LENGTH_LONG);

        toast.setView(layout);
        toast.show();
    }


    public void spotifyStreamer(View view)
    {

         temp="Spotify Streamer App";
        showmsg(temp);
    }

    public void scores(View view)
    {
        temp="Scores App";
        showmsg(temp);
    }


    public void library(View view)
    {
        temp="Library App";
        showmsg(temp);
    }

    public void buildBigger(View view)
    {
        temp="Build It Bigger App";
        showmsg(temp);
    }

    public void reader(View view)
    {
        temp="reader's App";
        showmsg(temp);
    }

    public void capstone(View view)
    {
        temp="Capstone App";
        showmsg(temp);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}

    
