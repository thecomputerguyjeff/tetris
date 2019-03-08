package com.ti.tetris.service;

import com.ti.tetris.model.*;
import com.ti.tetris.model.shapes.ShapeInterface;

import java.util.List;

public class GridService {
    private ShapeFactory shapeFactory = new ShapeFactory();
    ShapePlacer shapePlacer = new ShapePlacer();
    private Integer currentShapeNo = 0;

    public void addShape() {
        ShapeInterface shape = shapeFactory.getShape();
        currentShapeNo++;
        ShapePlace shapePlace = shapePlacer.findShapePlace(shape);
        Integer startPlace = shapePlace.getStartPlace();
        List<List> positions = shapePlace.getPositions();
        Gridline line = shapePlace.getStartLine();
        String paddedNum = String.format("%03d", currentShapeNo);
        for (List<Integer> row : positions) {
            for (Integer place : row) {
                line.contents[startPlace + place] = shape.getIdentifier() + paddedNum;
            }
            line = line.getNext();

        }
    }



}

