package service;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import model.ShapeFactory;
import model.Shapes;
import view.GridView;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GridService {
    String[][] grid = new String [43][10];
    ShapeFactory shapeFactory = new ShapeFactory();
    Shapes shape;
    String [][] shape2;

    int v=0;

    private void insertShape(int i){
        for (int m=0; m<shape2[0].length; m++){
            if(shape2[i][m] != null){
            grid[v][m] = shape2[i][m];}
    }
    }

    //check if can go in that place by checking for nulls if doesn't work rotate shape and test again.
    private boolean checkShape(int i){
        for(int m=0; m<shape2[0].length; m++){
            grid[v][m] = shape2[i][m];
        }
        return true;
    }




    public String[][] fillGrid(){

         do {
            shape = shapeFactory.getRandom();
            shape2 = shape.get1();

            for (int i = 0; i < shape2.length; i++) {

               // lookForNull();
                checkShape(i);

               insertShape(i);
                v++;
            }

        }while (v<41);

        //make tests to see if working.
        return grid;
    }



}
