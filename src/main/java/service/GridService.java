package service;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import model.ShapeFactory;
import model.Shapes;



@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GridService {
    String[][] grid = new String [43][10];
    ShapeFactory shapeFactory = new ShapeFactory();
    Shapes shape;
    String [][] shape2;
    Integer[]location = new Integer[3];

    int v=0;
    int z=0;


    private Integer insertShape(){
        v=location[0];

        if ((location[1]-1)+shape2[0].length<10){

        for (int i = 0; i < shape2.length; i++) {
            z=location[1];

            for (int m=0; m<shape2[0].length; m++) {
                if ((shape2[i][m] != null)||((shape2[i][m] == null) &&(grid[v][z]==null))) {
                    grid[v][z] = shape2[i][m];
                }
                z++;
            }
            v++;
        }
        }

        return v;
    }

    //check if can go in that place by checking for nulls if doesn't work rotate shape and test again.
    private boolean checkShape(){
        v=location[0];
        int count=0;

        if ((location[1]-1)+shape2[0].length<10){

            for (int i = 0; i < shape2.length; i++) {
                z=location[1];

                for (int m=0; m<shape2[0].length; m++) {
                    if ((shape2[i][m] != null)&&(grid[v][z]==null)) {
                        count++;
                    }
                    z++;
                }
                v++;
            }
        }
        if (count==4){
        return true;}
        return false;
    }

    private boolean isNullInRow(){
        for (int row =0; row<43; row++){
            for (int column=0; column<9; column++){
                if (grid[row][column]==null){

                    location[0]=row;
                    location[1] = column;
                    shape2=shape.get1();
                        if(checkShape()){
                    //System.out.println(location[0] + " "+location[1]);
                    return true;
                }
                else {
                    shape2=shape.get2();
                    if (checkShape()){
                        return true;
                        }
                    else {
                        shape2=shape.get3();
                        if (checkShape()){
                            return true;
                        }
                        else {
                            shape2=shape.get4();
                            if (checkShape()){
                                return true;
                            }
                        }
                    }
                        }}
            }
        }
        return false;
    }

    public String[][] fillGrid(){

        do {
            shape = shapeFactory.getRandom();
            //shape2 = shape.get1();

            if(isNullInRow()) {

                v = insertShape();
            }
        }while (v<41);

        //make tests to see if working.
        return grid;
    }



}