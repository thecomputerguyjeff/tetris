import com.ti.tetris.controller.TetrisController;
import org.junit.Test;

public class TetrisControllerTest {
    TetrisController tetrisController = new TetrisController();
    @Test
    public void printEmptyGame(){
        tetrisController.printGame();
    }
    @Test
    public void printShapeInGrid() throws Exception{
        tetrisController.addShape();
        tetrisController.printGame();
    }
    @Test
    public void clearingGridbeforeNewGame(){
        tetrisController.clearGrid();
        tetrisController.printGame();
    }
    @Test
    public void printManyOfSameShapeInGrid() throws Exception{
        tetrisController.addShape();
        tetrisController.addShape();
        tetrisController.addShape();
        tetrisController.addShape();
        tetrisController.addShape();
        tetrisController.addShape();
        tetrisController.addShape();
        tetrisController.addShape();
        tetrisController.addShape();
        tetrisController.printGame();
    }

}

