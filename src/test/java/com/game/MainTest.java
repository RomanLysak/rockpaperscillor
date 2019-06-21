package com.game;

import com.game.model.Player;
import com.game.model.ShapeType;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private static final Player player1 = new Player("player 1");
    private static final Player player2 = new Player("player2", ShapeType.ROCK);

    @Test
    public void getWinner_firstWin() {
        player1.setShapeType(ShapeType.PAPER);

        Player result = Main.getWinner(player1, player2).get();

        assertEquals(player1, result);
    }

    @Test
    public void getWinner_secondWin() {
        player1.setShapeType(ShapeType.SCISSOR);

        Player result = Main.getWinner(player1, player2).get();

        assertEquals(player2, result);
    }


    @Test
    public void getWinner_tie() {
        player1.setShapeType(ShapeType.ROCK);

        Optional<Player> result = Main.getWinner(player1, player2);

        assertEquals(Optional.empty(), result);
    }
}