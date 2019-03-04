import com.ti.tetris.controller.TetrisController;
import org.junit.Test;

public class TetrisControllerTest {
    TetrisController tetrisController = new TetrisController();
    @Test
    public void printEmptyGame(){
        tetrisController.printGame();
    }
//@Test
//    public void print2ShapesInGrid() throws Exception{
//        tetrisController.addShape();
//        tetrisController.addShape();
//        assertEquals(Arrays.asList("l001", "l001", "l001", "l001", "l002", "l002", "l002", "l002", "X000", "X000"), tetrisController.printGame());
//    }

}

