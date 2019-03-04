package com.ti.tetris.service;

import com.ti.tetris.model.Grid;
import com.ti.tetris.model.Gridline;
import com.ti.tetris.model.ShapeFactory;
import com.ti.tetris.model.ShapeInterface;

import java.util.List;

public class GridService {
    private ShapeFactory shapeFactory = new ShapeFactory();
    private Grid grid = Grid.getGrid();
    private Integer currentShapeNo = 0;

    private ShapeInterface getShape() {
        return shapeFactory.getShape();
    }

    public void addShape() {
        ShapeInterface shape = shapeFactory.getShape();
        currentShapeNo++;
        List<Integer> positions = shape.getPositions();
        Gridline bottomLine = grid.getBottomLine();
        String paddedNum = String.format("%03d", currentShapeNo);
        for (Integer position : positions) {
            bottomLine.contents[position] = shape.getIdentifier() + paddedNum;
        }
    }

}

