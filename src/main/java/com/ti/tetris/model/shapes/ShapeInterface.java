package com.ti.tetris.model.shapes;

import java.util.List;

public interface ShapeInterface {
    String getIdentifier();
    Integer getNumberOfOrientations();
    List<List> getPositions(Integer orientation);
}
