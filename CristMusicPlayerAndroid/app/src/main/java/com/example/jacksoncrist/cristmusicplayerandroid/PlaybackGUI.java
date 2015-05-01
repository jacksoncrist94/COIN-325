package com.example.jacksoncrist.cristmusicplayerandroid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;



public class PlaybackGUI extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playback_gui);

        Button t1 = (Button) findViewById(R.id.buttonPanel);
        Button t2 = (Button) findViewById(R.id.buttonPanel);
        Button t3 = (Button) findViewById(R.id.buttonPanel);
        Button t4 = (Button) findViewById(R.id.buttonPanel);
        Button t5 = (Button) findViewById(R.id.buttonPanel);
        Button t6 = (Button) findViewById(R.id.buttonPanel);
        Button t7 = (Button) findViewById(R.id.buttonPanel);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_playback_gui, menu);
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
