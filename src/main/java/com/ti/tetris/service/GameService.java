package com.ti.tetris.service;

import com.ti.tetris.model.Grid;
import com.ti.tetris.model.Gridline;
import com.ti.tetris.model.ShapeFactory;
import com.ti.tetris.model.ShapePlace;
import com.ti.tetris.model.shapes.ShapeInterface;

import java.util.Arrays;
import java.util.List;

public class GameService {
    private ShapeFactory shapeFactory = new ShapeFactory();
    Grid grid = Grid.getGrid();
    ShapePlacer shapePlacer = new ShapePlacer();
    private Integer currentShapeNo = 0;

    public Integer addShape() {
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
        return currentShapeNo;
    }
    public void playGame(){
        while (Arrays.toString(grid.getTopLine().getPrevious().getPrevious().getContents()).equals("[X000, X000, X000, X000, X000, X000, X000, X000, X000, X000]")){
            Integer currentShapeNo = addShape();
        }
        System.out.println("Game over :(");
    }



}

