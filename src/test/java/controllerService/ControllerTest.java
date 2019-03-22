package controllerService;

import model.L;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import view.View;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)

public class ControllerTest {
    @Mock
    private TetrisService tetrisService;
    @Mock
    private View view;
    @InjectMocks
    private Controller controller;

    @Test
    public void main() {
        tetrisService.fillGrid();
        verify(tetrisService,times(1)).fillGrid();
        view.printOut(tetrisService.fillGrid());
        verify(tetrisService,times(2)).fillGrid();
    }
}