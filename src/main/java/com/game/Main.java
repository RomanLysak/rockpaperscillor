package com.game;

import com.game.model.Player;
import com.game.model.ShapeType;

import java.util.Optional;
import java.util.Random;

import static com.game.model.ShapeType.*;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println("Game start");

        Player playerRandom = new Player("PlayerRandom");
        Player playerRock = new Player("PlayerRock", ROCK);

        for (int i = 0; i < 100; i++) {
            playerRandom.setShapeType(getRandomShape());
            Optional<Player> player = getWinner(playerRandom, playerRock);
            if (player.isPresent()) {
                System.out.println(String.format("%s wins", player.get().getName()));
            } else {
                System.out.println(String.format("Tie"));
            }
        }
    }

    private static ShapeType getRandomShape() {
        return ShapeType.values()[RANDOM.nextInt(2)];
    }

    protected static Optional<Player> getWinner(Player player1, Player player2) {
        ShapeType shapeType1 = player1.getShapeType();
        ShapeType shapeType2 = player2.getShapeType();

        Player winner = null;

        if (shapeType1 == shapeType2)
        {
            return Optional.empty();
        } else {
            switch (shapeType1){
                case ROCK:
                    if (shapeType2 == SCISSOR) winner = player1;
                    else winner = player2;
                    break;
                case SCISSOR:
                    if (shapeType2 == PAPER) winner = player1;
                    else winner = player2;
                    break;
                case PAPER:
                    if (shapeType2 == ROCK) winner = player1;
                    else winner = player2;
                    break;
            }
        }
        return Optional.of(winner);
    }

}
