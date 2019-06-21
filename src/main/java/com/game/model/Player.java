package com.game.model;

public class Player {

    public Player(String name, ShapeType shapeType) {
        this.name = name;
        this.shapeType = shapeType;
    }

    public Player(String name) {
        this.name = name;
    }

    private String name;
    private ShapeType shapeType;

    public String getName() {
        return name;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
}
