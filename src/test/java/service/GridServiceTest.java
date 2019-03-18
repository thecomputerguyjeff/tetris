package service;

import model.ShapeFactory;
import model.Shapes;
import model.shapes.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.verification.VerificationOverTimeImpl;
import org.mockito.runners.MockitoJUnitRunner;

import java.awt.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


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
        gridService.shape=shapeFactory.getRandom();
        gridService.shape2=gridService.shape.get1();
        assertTrue(gridService.isNullInRow());
    }

    @Test
    public void TestStaticCountWorksAndIncrementsProperly(){

        gridService.shape=new Zee();
        assertEquals(((Zee) gridService.shape).getCount(), "01");
        gridService.shape=new L();
        assertEquals(((L) gridService.shape).getCount(), "02");
        gridService.shape=new BackwardL();
        assertNotEquals(((BackwardL) gridService.shape).getCount(), "07");
        gridService.shape=new BackwardZee();
        assertEquals(((BackwardZee) gridService.shape).getCount(), "04");

    }

    @Test
    public void TestShapeFactoryGetRandomIsCalled(){

        when(shapeFactory.getRandom()).thenReturn(new Zee());
       gridService.shape=shapeFactory.getRandom();

        gridService.fillGrid();
        verify(shapeFactory, times(97)).getRandom();

    }
}