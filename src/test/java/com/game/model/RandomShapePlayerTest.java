package com.game.model;

import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class RandomShapePlayerTest {

    private Player randomPlayer = new RandomShapePlayer();

    @Test
    public void getName() {
        assertEquals("RandomPlayer", randomPlayer.getName());
    }

    @Test
    public void getShapeType() {
        Set<Shape> shapes = IntStream.range(1,1000)
                .mapToObj(i -> randomPlayer.getShape())
                .collect(Collectors.toSet());
        assertEquals(3, shapes.size());
    }
}