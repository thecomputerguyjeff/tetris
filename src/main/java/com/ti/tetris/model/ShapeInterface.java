package com.ti.tetris.model;

import java.util.List;

public interface ShapeInterface {
    String getIdentifier();
    void rotate();
    List<Integer> getPositions();
}
