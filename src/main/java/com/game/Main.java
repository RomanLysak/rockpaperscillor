package com.game;

import com.game.model.Player;
import com.game.model.RandomShapePlayer;
import com.game.model.RockShapePlayer;
import com.game.model.Shape;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        System.out.println("Game start");

        Player randomPlayer = new RandomShapePlayer();
        Player rockPlayer = new RockShapePlayer();

        for (int i = 0; i < 100; i++) {
            Shape shapeRandomPlayer = randomPlayer.getShape();
            Shape shapeRockPlayer = rockPlayer.getShape();
            Optional<Shape> shapeWin = Shape.getWinner(shapeRockPlayer, shapeRandomPlayer);
            if (shapeWin.isPresent()) {
                System.out.println(String.format("%s wins", shapeRockPlayer == shapeWin.get() ? rockPlayer.getName() : randomPlayer.getName()));
            } else {
                System.out.println("Tie");
            }
        }
    }

}
