package com.example.user.rockpaperscissors;

/**
 * Created by user on 14/12/2016.
 */
public class Player {
    Move move;

    public Player() {
        move = new Move();
    }

    public String makeMove(int index) {
        return move.getMoveAtIndex(index);
    }
}
