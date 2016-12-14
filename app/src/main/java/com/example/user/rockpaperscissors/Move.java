package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 14/12/2016.
 */
public class Move {
    private ArrayList<String> moves;

    public Move() {
        this.moves = new ArrayList<String>();
        setupMoves();
    }


    public void add(String move) {
        moves.add(move);
    }

    public int moveCount() {
        return moves.size();
    }

    public String getMoveAtIndex(int index) {
        return moves.get(index);
    }

    public String getRandomMove() {
        Random rand = new Random();
        int listSize = moveCount();
        int index = rand.nextInt(listSize);
        String move = getMoveAtIndex(index);
        return move;
    }

    private void setupMoves() {
        String[] movesToAdd = {
                "Rock",
                "Paper",
                "Scissors"
        };
        for(String move : movesToAdd) {
            add(move);
        }
    }


    }

