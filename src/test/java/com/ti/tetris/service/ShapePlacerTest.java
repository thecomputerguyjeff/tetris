package com.ti.tetris.service;

import com.ti.tetris.model.Grid;
import com.ti.tetris.model.Gridline;
import com.ti.tetris.model.shapes.I;
import com.ti.tetris.model.shapes.L;
import com.ti.tetris.model.shapes.ShapeInterface;
import com.ti.tetris.model.shapes.T;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ShapePlacerTest {

    @Mock
    private Grid grid;



    @InjectMocks
    private ShapePlacer shapePlacer;



    @Test
    public void testEachPlaceInPositionIfEmptyReturnsFalseIfAPositionisFilled() {
        Gridline line = new Gridline();
        line.setContents(new String[]{"filled", "filled", "filled", "X000", "X000", "filled", "X000", "X000", "X000", "X000"});
        List<List> positions = new I().getPositions(0);

        assertFalse(shapePlacer.testEachPlaceInPositionIfEmpty(positions,line, 4));
    }

    @Test
    public void testEachPlaceInPositionIfEmptyReturnsTrueIfAllPositionsAvailable() {
        Gridline line = new Gridline();
        line.setContents(new String[]{"filled", "filled", "filled", "X000", "X000", "filled", "X000", "X000", "X000", "X000"});
        List<List> positions = new I().getPositions(0);

        assertTrue(shapePlacer.testEachPlaceInPositionIfEmpty(positions,line, 6));
    }

    @Test
    public void testForPossiblePositionsCyclesThroughTheOrientations() throws Exception {
        Gridline falseBottom = new Gridline();
        falseBottom.setContents(new String[]{"filled", "filled", "filled", "X000", "X000", "filled", "X000", "X000", "X000", "X000"});
        Gridline secondLine = new Gridline();
        secondLine.setContents(new String[]{"filled", "X000", "X000", "X000", "filled", "filled", "X000", "X000", "X000", "X000"});
        falseBottom.setNext(secondLine);
        Gridline thirdLine = new Gridline();
        thirdLine.setContents(new String[]{"X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000"});
        secondLine.setNext(thirdLine);
        when(grid.getBottomLine()).thenReturn(falseBottom);
        ShapeInterface shape = new T();
        Class[] param_types = new Class[]{ShapeInterface.class, Gridline.class,Integer.class};
        Object[] params = new Object[]{shape,falseBottom,3};
        Method m = ShapePlacer.class.getDeclaredMethod("testForPossiblePositions", param_types);
        m.setAccessible(true);
        m.invoke(shapePlacer, params);
        assertEquals(1,(long) shapePlacer.getShapeOrientation());

    }

    @Test
    public void shapePlacedInFirstPositionIfAvailable() {
        Gridline falseBottom = new Gridline();
        falseBottom.setContents(new String[]{"filled", "filled", "filled", "X000", "X000", "filled", "X000", "X000", "X000", "X000"});
        Gridline secondLine = new Gridline();
        secondLine.setContents(new String[]{"filled", "X000", "X000", "filled", "filled", "filled", "X000", "X000", "X000", "X000"});
        falseBottom.setNext(secondLine);
        Gridline thirdLine = new Gridline();
        thirdLine.setContents(new String[]{"X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000"});
        secondLine.setNext(thirdLine);
        when(grid.getBottomLine()).thenReturn(falseBottom);
        ShapeInterface shape = new L();

        Integer actual = shapePlacer.findShapePlace(shape).getStartPlace();
        Integer expected = 6;

        assertEquals(expected,actual);
    }


}