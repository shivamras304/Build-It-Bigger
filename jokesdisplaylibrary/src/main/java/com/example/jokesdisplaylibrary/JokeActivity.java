package com.example.jokesdisplaylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();

        TextView jokeView = (TextView) findViewById(R.id.jokeView);
        jokeView.setText(intent.getStringExtra(getString(R.string.joke)));
    }
}
