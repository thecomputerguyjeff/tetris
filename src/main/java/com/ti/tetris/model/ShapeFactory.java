package com.ti.tetris.model;

public class ShapeFactory {
    public ShapeInterface getShape(){
        return new StraightLine();
    }
}
