package com.udacity.gradle.chutkula;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.jokesdisplaylibrary.JokeActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.loading_spinner)
    ProgressBar loadingSpinner;

    @BindView(R.id.joke_button)
    Button jokeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
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
        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        jokeButton = (Button) findViewById(R.id.joke_button);
        jokeButton.setVisibility(View.GONE);
        loadingSpinner = (ProgressBar) findViewById(R.id.loading_spinner);
        loadingSpinner.setVisibility(View.VISIBLE);
        new FetchJokeTask().execute();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLoadJoke(String joke) {
        jokeButton.setVisibility(View.VISIBLE);
        loadingSpinner.setVisibility(View.GONE);
        if(joke == "null") {
            joke = getString(R.string.server_error);
            Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(this, JokeActivity.class);
            intent.putExtra(getString(R.string.joke), joke);
            startActivity(intent);
        }
    }

}
