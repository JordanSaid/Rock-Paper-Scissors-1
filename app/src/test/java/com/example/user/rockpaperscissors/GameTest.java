package com.example.user.rockpaperscissors;

import org.junit.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 14/12/2016.
 */
public class GameTest {
    Player player;
    Computer computer;
    Game game;
    Move move;

    @Before
    public void before() {
        move = new Move();
        computer = new Computer();
        game = new Game();
        player = new Player();
    }

    @Test
    public void gameHasResultTest() {
        assertEquals("Player Wins", game.play(0));
    }
}
