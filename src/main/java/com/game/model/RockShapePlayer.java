package com.game.model;

public final class RockShapePlayer implements Player{

    public String getName() {
        return "RockPlayer";
    }

    public Shape getShape() {
        return Shape.ROCK;
    }

}
