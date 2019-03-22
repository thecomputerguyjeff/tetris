package controllerService;

import model.Shape;
import model.ShapeFactory;
import model.TheGrid;

public class TetrisService {
    public ShapeFactory factory=new ShapeFactory();
    public TheGrid Grid=new TheGrid();

    public String[][] fillGrid() {
        String [][] theGrid;
        //boolean stop=false;
        do{//(int i=0;i<15;i++){
            Shape theShape=factory.getShape();
            theGrid=Grid.putShapeIn(theShape);
        }while(!Grid.getCheckStop());
        return theGrid;
    }

    //does those two things in a loop till the grid fills up
}
