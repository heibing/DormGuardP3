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
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class UserAccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_access);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        // Creating an array of strings
        final ListView listView = (ListView) findViewById(R.id.list);
        String[] values = new String[] { "Søren" , "Anna" , "Erik" };



        // Adding the strings from the array to the listview
        final ArrayList<String> list = new ArrayList<>();
        for (String value : values) {
            list.add(value);

            // Creating the adapter
            final StableArrayAdapter adapter = new StableArrayAdapter(this, android.R.layout.simple_list_item_1, list);
            listView.setAdapter(adapter);
        }*/

    }
    /*
    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<>();

        public StableArrayAdapter(list context, int textViewResourceId,
                                  ArrayList<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }*/

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
            Intent myIntent = new Intent(UserAccess.this,
                    MainActivity.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.login){
            Toast.makeText(getApplicationContext(), "Login",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(UserAccess.this,
                    Login.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.liveFeed){
            Toast.makeText(getApplicationContext(), "LiveFeed",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(UserAccess.this,
                    LiveFeed.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.userAccess){
            Toast.makeText(getApplicationContext(), "UserAccess",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(UserAccess.this,
                    UserAccess.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.videoLibrary){
            Toast.makeText(getApplicationContext(), "VideoLibrary",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(UserAccess.this,
                    VideoLibrary.class);
            startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
