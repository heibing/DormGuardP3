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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    private EditText email,password;
    private Button sign_in_register;
    //private RequestQueue requestQueue;
    private static final String URL = "http://localhost:8080/dormguard2/user_control.php";;
    private String localpassword;
    private String localemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Hardcoded email and password for testing
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        sign_in_register = (Button) findViewById(R.id.sign_in_register);


        //Method checking if email and password are correct using if statements and a clicklistener
        sign_in_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                localpassword = password.getText().toString();
                localemail = email.getText().toString();


                if (localemail.equals("test@gmail.com")==true) {
                    if (localpassword.equals("12345")==true) {
                        Toast.makeText(getApplicationContext(), "SUCCESS " + localpassword, Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(getApplicationContext(), MainActivity.class));

                    }}
            }
        });
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
            Intent myIntent = new Intent(Login.this,
                    MainActivity.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.login){
            Toast.makeText(getApplicationContext(), "Login",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(Login.this,
                    Login.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.liveFeed){
            Toast.makeText(getApplicationContext(), "LiveFeed",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(Login.this,
                    LiveFeed.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.userAccess){
            Toast.makeText(getApplicationContext(), "UserAccess",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(Login.this,
                    UserAccess.class);
            startActivity(myIntent);
            return true;
        }

        else if (id==R.id.videoLibrary){
            Toast.makeText(getApplicationContext(), "VideoLibrary",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(Login.this,
                    VideoLibrary.class);
            startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
