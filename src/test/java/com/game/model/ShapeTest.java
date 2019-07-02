package com.game.model;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class ShapeTest {

    @Test
    public void getWinner_paperWin() {
        Shape result = Shape.getWinner(Shape.PAPER, Shape.ROCK).get();

        assertEquals(Shape.PAPER, result);
    }

    @Test
    public void getWinner_scissorWin() {
        Shape result = Shape.getWinner(Shape.PAPER, Shape.SCISSOR).get();

        assertEquals(Shape.SCISSOR, result);
    }

    @Test
    public void getWinner_rockWin() {
        Shape result = Shape.getWinner(Shape.SCISSOR, Shape.ROCK).get();

        assertEquals(Shape.ROCK, result);
    }

    @Test
    public void getWinner_tie() {
        Optional<Shape> result = Shape.getWinner(Shape.ROCK, Shape.ROCK);

        assertEquals(Optional.empty(), result);
    }

}