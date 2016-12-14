package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class GameActivity extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("RockPaperScissors", "GameActivity.onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        result = (TextView)findViewById(R.id.game);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String gameResult = extras.getString("result");
        result.setText(gameResult);


    }

}