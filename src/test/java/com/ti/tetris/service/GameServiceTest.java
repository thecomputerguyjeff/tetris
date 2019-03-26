package com.ti.tetris.service;

import com.ti.tetris.model.Grid;
import com.ti.tetris.model.Gridline;
import com.ti.tetris.model.ShapeFactory;
import com.ti.tetris.model.ShapePlace;
import com.ti.tetris.model.shapes.I;
import com.ti.tetris.model.shapes.ShapeInterface;
import com.ti.tetris.model.shapes.T;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameServiceTest {


    @Mock
    private ShapeFactory shapeFactory;

    @Mock
    private ShapePlacer shapePlacer;

    private Grid grid1 = Grid.getGrid();

    @Spy
    private Grid grid = grid1;

    @InjectMocks
    private GameService gameService;

    @Test
    public void addShapeCanModifyAGridlineToHaveALineShape() {
        Integer currentShapeNo = 0;
        ShapeInterface testShape = new I();
        Gridline testLine = new Gridline();
        Gridline nextTestLine = new Gridline();
        testLine.setNext(nextTestLine);
        nextTestLine.setPrevious(testLine);
        when(shapeFactory.getShape()).thenReturn(testShape);
        when(shapePlacer.findShapePlace(any()))
                .thenReturn(ShapePlace.builder()
                        .positions(testShape.getPositions(0))
                        .startLine(testLine)
                        .startPlace(0)
                        .build());
        gameService.addShape();
        assertEquals("[I001, I001, I001, I001, X000, X000, X000, X000, X000, X000]", Arrays.toString(testLine.getContents()));
    }

    @Test
    public void addShapeCanAddAShapeOnTwoLines() {
        Integer currentShapeNo = 0;
        ShapeInterface testShape = new T();
        when(shapeFactory.getShape()).thenReturn(testShape);
        when(shapePlacer.findShapePlace(any()))
                .thenReturn(ShapePlace.builder()
                        .positions(testShape.getPositions(0))
                        .startLine(grid1.getBottomLine())
                        .startPlace(5)
                        .build());
        gameService.addShape();
        assertEquals("[X000, X000, X000, X000, X000, T001, T001, T001, X000, X000]", Arrays.toString(grid.getBottomLine().getContents()));
        assertEquals("[X000, X000, X000, X000, X000, X000, T001, X000, X000, X000]", Arrays.toString(grid.getBottomLine().getNext().getContents()));
    }

    //problem verifying on mock but cant call with spy
//    @Test
//    public void lineIsRemovedWhenFilled() {
//        Integer currentShapeNo = 0;
//        ShapeInterface testShape = new I();
//        grid.clearGrid();
//        Gridline bottomLine = grid1.getBottomLine();
//        when(shapeFactory.getShape()).thenReturn(testShape);
//        when(shapePlacer.findShapePlace(any()))
//                        .thenReturn(ShapePlace.builder()
//                        .positions(testShape.getPositions(0))
//                        .startLine(bottomLine)
//                        .startPlace(0)
//                        .build());
//        gameService.addShape();
//        when(shapeFactory.getShape()).thenReturn(testShape);
//        when(shapePlacer.findShapePlace(any()))
//                .thenReturn(ShapePlace.builder()
//                        .positions(testShape.getPositions(0))
//                        .startLine(bottomLine)
//                        .startPlace(4)
//                        .build());
//        gameService.addShape();
//        verify(grid,never()).removeLine(any());
//        testShape = new O();
//        when(shapeFactory.getShape()).thenReturn(testShape);
//        when(shapePlacer.findShapePlace(any()))
//                .thenReturn(ShapePlace.builder()
//                        .positions(testShape.getPositions(0))
//                        .startLine(bottomLine)
//                        .startPlace(8)
//                        .build());
//        gameService.addShape();
//        verify(grid, times(1)).removeLine(any());
//        assertEquals("[X000, X000, X000, X000, X000, X000, X000, X000, O003, O003]", Arrays.toString(grid.getBottomLine().getContents()));
//
//    }
}