package com.example.yone.iplay.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.yone.iplay.R;

import java.util.logging.LogRecord;

public class WelcomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Handler handler = new Handler();
        handler.postDelayed(new Loading(),1000);
    }

    class Loading implements Runnable{

        @Override
        public void run() {
            startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
            WelcomeActivity.this.finish();
        }
    }
}
