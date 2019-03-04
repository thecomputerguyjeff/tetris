package com.ti.tetris.model;

import java.util.ArrayList;
import java.util.List;

public class StraightLine implements ShapeInterface {
    String identifier = "l";
    Integer startingPoint;
    Integer position;
    Integer square1;
    Integer square2;
    Integer square3;
    Integer square4;

    public StraightLine(){
        startingPoint = 5;
        position = 1;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void rotate() {
    position = 1 - position;
    }

    @Override
    public List<Integer> getPositions() {
        if (position == 1) {
            square1 = startingPoint;
            square2 = startingPoint + 1;
            square3 = startingPoint + 2;
            square4 = startingPoint + 3;
        }

        List<Integer> list = new ArrayList<>();
        list.add(square1);
        list.add(square2);
        list.add(square3);
        list.add(square4);
        return list;
    }
}
