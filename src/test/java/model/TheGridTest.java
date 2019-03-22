package model;

import com.diogonunes.jcdp.color.ColoredPrinter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TheGridTest {

    @Mock
    private Coordinates coordinates;
    @Mock
    private Shape shape;
    @InjectMocks
    private TheGrid theGrid;

//    @Test
//    public void putShapeIn() {
//        String[][] ret = new String[10][43];
//        Coordinates coordinates1=new Coordinates();
//        coordinates1.setX(0);
//        coordinates1.setY(0);
//        Coordinates coordinates2=new Coordinates();
//        coordinates2.setX(1);
//        coordinates2.setY(0);
//        Coordinates coordinates3=new Coordinates();
//        coordinates3.setX(2);
//        coordinates3.setY(0);
//        Coordinates coordinates4=new Coordinates();
//        coordinates4.setX(1);
//        coordinates4.setY(1);
//        when(shape.getFirst()).thenReturn(Arrays.asList(coordinates1,coordinates2,coordinates3,coordinates4));
//        coordinates1.setX(0);
//        coordinates1.setY(0);
//        coordinates2.setX(0);
//        coordinates2.setY(1);
//        coordinates3.setX(1);
//        coordinates3.setY(1);
//        coordinates4.setX(-1);
//        coordinates4.setY(1);
//        when(shape.getSecond()).thenReturn(Arrays.asList(coordinates1,coordinates2,coordinates3,coordinates4));
//        coordinates1.setX(0);
//        coordinates1.setY(0);
//        coordinates2.setX(0);
//        coordinates2.setY(1);
//        coordinates3.setX(0);
//        coordinates3.setY(2);
//        coordinates4.setX(1);
//        coordinates4.setY(1);
//        when(shape.getThird()).thenReturn(Arrays.asList(coordinates1,coordinates2,coordinates3,coordinates4));
//        coordinates1.setX(0);
//        coordinates1.setY(0);
//        coordinates2.setX(0);
//        coordinates2.setY(1);
//        coordinates3.setX(0);
//        coordinates3.setY(2);
//        coordinates4.setX(-1);
//        coordinates4.setY(1);
//        when(shape.getFourth()).thenReturn(Arrays.asList(coordinates1,coordinates2,coordinates3,coordinates4));
////        when(theGrid.checkSurroundings(0,0,(Arrays.asList(coordinates1,coordinates2,coordinates3,coordinates4)))).thenReturn(true); the checkSurroundings method is not working. It says that it can't return a boolean.
//    }

    @Test
    public void put() {
        Coordinates coordinates1 = new Coordinates();
        coordinates1.setX(0);
        coordinates1.setY(0);
        Coordinates coordinates2 = new Coordinates();
        coordinates2.setX(1);
        coordinates2.setY(0);
        Coordinates coordinates3 = new Coordinates();
        coordinates3.setX(0);
        coordinates3.setY(1);
        Coordinates coordinates4 = new Coordinates();
        coordinates4.setX(1);
        coordinates4.setY(1);
        List<Coordinates> coordinatesList = Arrays.asList(coordinates1, coordinates2, coordinates3, coordinates4);

        String[][] ret = new String[10][43];
        assertEquals(ret, theGrid.put(new Square(), ret, 0, 0, coordinatesList));
        assertEquals("X001", ret[0][0]);
        assertEquals("X001", ret[1][0]);
        assertEquals("X001", ret[1][1]);
        assertEquals("X001", ret[0][1]);
        theGrid.put(new Square(),ret,3,0,coordinatesList);
        assertEquals("X002", ret[3][0]);
        assertEquals("X002", ret[3][1]);
        assertEquals("X002", ret[4][0]);
        assertEquals("X002", ret[4][1]);
    }
    //@Test
    //public void checkSurroundings() {
//        Coordinates coordinates1=new Coordinates();
//        coordinates1.setX(0);
//        coordinates1.setY(0);
//        Coordinates coordinates2=new Coordinates();
//        coordinates2.setX(1);
//        coordinates2.setY(0);
//        Coordinates coordinates3=new Coordinates();
//        coordinates3.setX(0);
//        coordinates3.setY(1);
//        Coordinates coordinates4=new Coordinates();
//        coordinates4.setX(1);
//        coordinates4.setY(1);
//        List<Coordinates> coordinatesList= Arrays.asList(coordinates1,coordinates2,coordinates3,coordinates4);
       // when(theGrid.doCheck(any(),anyInt(),anyInt())).thenReturn(false);

       // when(coordinates.getX()).thenReturn(1);
       // when(coordinates.getY()).thenReturn(1);
        //assertFalse(theGrid.checkSurroundings(any(),any(),any()));


   // }

    @Test
    public void testDoCheck() {
        String[][] ret = new String[10][43];
        theGrid.setTheGrid(ret);
        when(coordinates.getX()).thenReturn(0);
        when(coordinates.getY()).thenReturn(0);
        assertTrue(theGrid.doCheck(coordinates,0,0));
        ret[0][0]="something here";
        assertFalse(theGrid.doCheck(coordinates,0,0));
        ret[0][0]=null;
        assertFalse(theGrid.doCheck(coordinates,10,0));
        assertFalse(theGrid.doCheck(coordinates,0,43));
        }


    @Test
    public void testSetAndGetCheckStop() {
        boolean stop=false;
        theGrid.setCheckStop(stop);
        assertFalse(theGrid.getCheckStop());
    }
}