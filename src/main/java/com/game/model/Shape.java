package com.game.model;

import java.util.Optional;

public enum Shape {
    ROCK, PAPER, SCISSOR;

    public static Optional<Shape> getWinner(Shape shape1, Shape shape2) {
        Shape winner = null;

        if (shape1 == shape2)
        {
            return Optional.empty();
        } else {
            switch (shape1){
                case ROCK:
                    if (shape2 == SCISSOR) winner = shape1;
                    else winner = shape2;
                    break;
                case SCISSOR:
                    if (shape2 == PAPER) winner = shape1;
                    else winner = shape2;
                    break;
                case PAPER:
                    if (shape2 == ROCK) winner = shape1;
                    else winner = shape2;
                    break;
            }
        }
        return Optional.of(winner);
    }
}
