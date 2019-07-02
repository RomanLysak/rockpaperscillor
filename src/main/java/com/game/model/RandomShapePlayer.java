package com.game.model;

import java.util.Random;

public final class RandomShapePlayer implements Player{

    private static final Random RANDOM = new Random();

    public String getName() {
        return "RandomPlayer";
    }

    public Shape getShape() {
        return Shape.values()[RANDOM.nextInt(3)];
    }

}
