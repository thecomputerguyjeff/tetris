package com.ti.tetris.service;

import com.ti.tetris.model.Grid;
import com.ti.tetris.model.Gridline;
import com.ti.tetris.model.shapes.ShapeInterface;
import com.ti.tetris.model.ShapePlace;

import java.util.List;

public class ShapePlacer {

    private Grid grid = Grid.getGrid();
    Integer shapeOrientation;


//    public List<List> getAllPositions(ShapeInterface shape) {
//        List<List> shapePositions = new ArrayList<>();
//        for (int i = 0; i < shape.getNumberOfOrientations(); i++) {
//            List<List> position = shape.getPositions(i);
//            shapePositions.add(position);
//        }
//        return shapePositions;
//    }
//
//
////    public List getFinalPlacesToPutShape(ShapeInterface shape, Integer orientation) {
////        return shape.getPositions(orientation);
////    }
//
//    public List<List> testForPossiblePositions(ShapeInterface shape, Gridline line, int i) {
////        List<List> shapePositions = getAllPositions(shape);
////        for (List<List> position : shapePositions) {
////            if(testEachPlaceInPositionIfEmpty(position,line,i))
////                return position;
////        }
////        return Arrays.asList(Arrays.asList(99));
////    }

    public ShapePlace findShapePlace(ShapeInterface shape) {

        // will return array with line to start, place to start and position to use
        Gridline line = grid.getBottomLine();
        ShapePlace shapePlace = new ShapePlace();
        while (true){
            //String[] contents = line.getContents();
            for (int i = 0; i < 10; i++) {
                    if (testForPossiblePositions(shape, line, i)){
                        shapePlace.setPositions(shape.getPositions(shapeOrientation));
                        shapePlace.setStartLine(line);
                        shapePlace.setStartPlace(i);
                        return shapePlace;
                    }
            }
            line = line.getNext();
        }
    }
        private boolean testForPossiblePositions(ShapeInterface shape, Gridline line, int startingPlace) {
            for (int i = 0; i < shape.getNumberOfOrientations(); i++) {
                List<List> position = shape.getPositions(i);
                if(testEachPlaceInPositionIfEmpty(position,line,startingPlace)) {
                    shapeOrientation = i;
                    return true;
                }
        }
        return false;
    }


    public Boolean testEachPlaceInPositionIfEmpty(List<List> position, Gridline line, int startingPlace) {
        for (List<Integer> row : position) {
            for (Integer place : row) {
                if ((place + startingPlace >= 10) || (place + startingPlace < 0) || !(line.getContents()[place + startingPlace].equals("X000"))) {
                    return false;
                }
            }

            line = line.getNext();
        }
        return true;
    }
}
