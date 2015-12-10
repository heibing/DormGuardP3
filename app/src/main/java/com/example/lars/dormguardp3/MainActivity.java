package com.example.lars.dormguardp3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    RelativeLayout r;
    ToggleButton t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        t= (ToggleButton) findViewById(R.id.toggleButton);
        r= (RelativeLayout) findViewById(R.id.layout);

        t.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b)
        {
            r.setBackgroundColor(Color.RED);
        }
        else
        {
            r.setBackgroundColor(Color.GREEN);
        }
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
        if (id == R.id.activation) {
            Toast.makeText(getApplicationContext(), "Activation", Toast.LENGTH_SHORT).show();
            // Start VideoLibraryPlayer.class
            Intent myIntent = new Intent(MainActivity.this,
                    MainActivity.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.login){
            Toast.makeText(getApplicationContext(), "Login",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this,
                    Login.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.liveFeed){
            Toast.makeText(getApplicationContext(), "LiveFeed",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this,
                    LiveFeed.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.userAccess){
            Toast.makeText(getApplicationContext(), "UserAccess",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this,
                    UserAccess.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.videoLibrary){
            Toast.makeText(getApplicationContext(), "VideoLibrary",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this,
                    VideoLibrary.class);
            startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
