package service;

import model.ShapeFactory;
import model.Shapes;
import model.shapes.Tee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.awt.*;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class GridServiceTest {

@Mock
private ShapeFactory shapeFactory;

@InjectMocks
private GridService gridService;

    @Test
    public void TestInsertTeePutsIn00LocationInGrid(){

        when(shapeFactory.getRandom()).thenReturn(new Tee());
        gridService.fillGrid();
        assertEquals(gridService.grid[0][0], "T 01");

    }

    @Test
    public void TestIsNullInRowReturnsTrue(){
        when(shapeFactory.getRandom()).thenReturn(new Tee());
        gridService.shape=new Tee();
        gridService.shape2=gridService.shape.get1();
        assertTrue(gridService.isNullInRow());
    }

}