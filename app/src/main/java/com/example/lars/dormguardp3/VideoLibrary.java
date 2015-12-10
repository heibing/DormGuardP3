package com.example.lars.dormguardp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class VideoLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_library);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageButton mainButton = (ImageButton) findViewById(R.id.ImageButtonVoD);

        mainButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // Start VideoLibraryPlayer.class
                Intent myIntent = new Intent(VideoLibrary.this,
                        VideoLibraryPlayer.class);
                startActivity(myIntent);

            }
        });}

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
            Intent myIntent = new Intent(VideoLibrary.this,
                    MainActivity.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.login){
            Toast.makeText(getApplicationContext(), "Login",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(VideoLibrary.this,
                    Login.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.liveFeed){
            Toast.makeText(getApplicationContext(), "LiveFeed",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(VideoLibrary.this,
                    LiveFeed.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.userAccess){
            Toast.makeText(getApplicationContext(), "UserAccess",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(VideoLibrary.this,
                    UserAccess.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.videoLibrary){
            Toast.makeText(getApplicationContext(), "VideoLibrary",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(VideoLibrary.this,
                    VideoLibrary.class);
            startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
