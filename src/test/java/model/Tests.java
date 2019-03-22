package model;

import controllerService.Controller;
import controllerService.TetrisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import javax.naming.CompositeName;
import java.util.List;

//import static org.junit.Assert.assertEquals;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Tests {
    @Mock
    private ShapeFactory shapeFactory;

    @Mock
    private TheGrid theGrid;

    @InjectMocks
    private TetrisService tetrisService;

    @Test
    public void testTetrisService() {
        String[][] ret = new String[1][1];
        ret[0][0] = "1";
        when(shapeFactory.getShape()).thenReturn(new L());
        when(theGrid.putShapeIn(any())).thenReturn(ret);
        when(theGrid.getCheckStop()).thenReturn(false).thenReturn(true);
        assertEquals(ret, tetrisService.fillGrid());
        verify(shapeFactory, times(2)).getShape();
    }
}