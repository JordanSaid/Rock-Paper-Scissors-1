package com.example.user.rockpaperscissors;

import android.util.Log;

/**
 * Created by user on 14/12/2016.
 */
public class Game {
    Move move;
    Player player;
    Computer computer;

    public Game() {
        move = new Move();
        player = new Player();
        computer = new Computer();
    }

    public String play(int index) {
        String computerMove = computer.makeMove();
        String playerMove = player.makeMove(index);
        if (playerMove == computerMove) {
            return "The player chose: " + playerMove + "\n" + "\n"  + "\n" + "The computer chose: " + computerMove + "\n" + "\n" + "Draw";
        } else if (playerMove == "Rock" && computerMove == "Paper") {
            return "The player chose: " + playerMove + "\n" + "\n" + "The computer chose: " + computerMove + "\n" + "\n" + "Computer Wins";
        } else if (playerMove == "Rock" && computerMove == "Scissors") {
            return "The player chose: " + playerMove + "\n" + "\n" + "The computer chose: " + computerMove + "\n" + "\n" + "Player Wins";
        } else if (playerMove == "Paper" && computerMove == "Rock") {
            return "The player chose: " + playerMove + "\n" + "\n" + "The computer chose: " + computerMove + "\n" + "\n" + "Player Wins";
        } else if (playerMove == "Paper" && computerMove == "Scissors") {
            return "The player chose: " + playerMove + "\n" + "\n" + "The computer chose: " + computerMove + "\n" + "\n" + "Computer Wins";
        } else if (playerMove == "Scissors" && computerMove == "Rock") {
            return "The player chose: " + playerMove + "\n" + "\n" + "The computer chose: " + computerMove + "\n" + "\n" + "Computer Wins";
        } else if (playerMove == "Scissors" && computerMove == "Paper") {
            return "The player chose: " + playerMove + "\n" + "\n" + "The computer chose: " + computerMove + "\n" + "\n" + "Player Wins";
        }
        else {
            Log.d("anything", "");
            return "hvjhvh";
        }
    }
}

