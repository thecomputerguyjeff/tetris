//import com.ti.tetris.controller.TetrisController;
//import com.ti.tetris.model.Grid;
//import org.junit.Test;
//
//import java.util.Arrays;
//
//public class TetrisControllerTest {
//    TetrisController tetrisController = new TetrisController();
//    @Test
//    public void printEmptyGame(){
//        tetrisController.printGame();
//    }
//    @Test
//    public void printShapeInGrid() throws Exception{
//        tetrisController.addShape();
//        tetrisController.printGame();
//    }
//    @Test
//    public void clearingGridbeforeNewGame(){
//        tetrisController.clearGrid();
//        tetrisController.printGame();
//    }
//    @Test
//    public void printManyOfSameShapeInGrid() throws Exception{
//        tetrisController.addShape();
//        tetrisController.addShape();
//        tetrisController.addShape();
//        tetrisController.addShape();
//        tetrisController.addShape();
//        tetrisController.addShape();
//        tetrisController.addShape();
//        tetrisController.addShape();
//        tetrisController.addShape();
//        tetrisController.printGame();
//        Grid grid = Grid.getGrid();
//        System.out.println(Arrays.toString(grid.getTopLine().getContents()));
//    }
//
//    @Test
//    public void endGameWhenHitOverflow(){
//        tetrisController.playGame();
//        tetrisController.printGame();
//    }
//
//}
//
