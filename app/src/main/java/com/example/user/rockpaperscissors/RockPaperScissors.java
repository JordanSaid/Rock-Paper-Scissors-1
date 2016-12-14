package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperScissors extends AppCompatActivity {
    ImageButton rock;
    ImageButton scissors;
    ImageButton paper;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("RockPaperScissors", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rock = (ImageButton) findViewById(R.id.rock);
        scissors = (ImageButton) findViewById(R.id.scissors);
        paper = (ImageButton) findViewById(R.id.paper);

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Log.d("RockPaperScissors", "Rock button clicked");

                game = new Game();
            String result = game.play(0);

            Intent intent = new Intent(RockPaperScissors.this, GameActivity.class);
            intent.putExtra("result", result);

            startActivity(intent);
        }
    });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RockPaperScissors", "Paper button clicked");

                game = new Game();
                String result = game.play(1);

                Intent intent = new Intent(RockPaperScissors.this, GameActivity.class);
                intent.putExtra("result", result);

                startActivity(intent);
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RockPaperScissors", "Scissors button clicked");

                game = new Game();
                String result = game.play(2);

                Intent intent = new Intent(RockPaperScissors.this, GameActivity.class);
                intent.putExtra("result", result);

                startActivity(intent);
            }
        });

}

}
