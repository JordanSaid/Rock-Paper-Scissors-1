package com.example.user.rockpaperscissors;

import org.junit.*;
import java.util.ArrayList;

import static org.junit.Assert.*;




/**
 * Created by user on 14/12/2016.
 */
public class MoveTest {

    ArrayList<String> moves;
    Move move;

    @Before
    public void before() {
        moves = new ArrayList<String>();
        move = new Move();

    }

    @Test
    public void canAddMoveTest() {
        move.add("ssnskn");
        assertEquals(4, move.moveCount());
    }

    @Test
    public void canPickRockTest() {
        assertEquals("Rock", move.getMoveAtIndex(0));
    }

//    @Test
//    public void canGetRandomMoveTest() {
//        assertEquals("Rock", move.getRandomMove());
//    }
}
