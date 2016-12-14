package com.example.user.rockpaperscissors;

/**
 * Created by user on 14/12/2016.
 */
public class Computer {
    Move move;

    public Computer() {
        move = new Move();
    }

    public String makeMove() {
        return move.getRandomMove();
    }
}
