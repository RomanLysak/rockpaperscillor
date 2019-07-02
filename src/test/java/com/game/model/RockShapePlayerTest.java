package com.game.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class RockShapePlayerTest {

    private Player rockPlayer = new RockShapePlayer();

    @Test
    public void getName() {
        assertEquals("RockPlayer", rockPlayer.getName());
    }

    @Test
    public void getShapeType() {
        assertEquals(Shape.ROCK, rockPlayer.getShape());
    }
}