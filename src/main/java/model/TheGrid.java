package model;


import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Method;
import java.util.List;

public class TheGrid {
    @Getter
    @Setter
    private String[][] theGrid = new String[10][43];
    private Integer count = 0;
    private String theCount = "";
    private boolean stop;
    Integer whereX, whereY = -1;
    boolean canPut = false;

    public String[][] putShapeIn(Shape theShape) {
        //check where the shape can go
        for (int y = 0; y < 40; y++) {
            for (int x = 0; x < 10; x++) {
                if (theGrid[x][y] == null) {//if that spot is null,
                    if (this.checkSurroundings(x, y,theShape.getFirst())) {//then go in and check surroundings
                        this.put(theShape, theGrid,x,y,theShape.getFirst());//then put it in.
                        return theGrid;
                    }
                    else if(this.checkSurroundings(x,y,theShape.getSecond())){
                        this.put(theShape,theGrid,x,y,theShape.getSecond());
                        return theGrid;
                    }
                    else if(this.checkSurroundings(x,y,theShape.getThird())){
                        this.put(theShape,theGrid,x,y,theShape.getThird());
                        return theGrid;
                    }
                    else if(this.checkSurroundings(x,y,theShape.getFourth())){
                        this.put(theShape,theGrid,x,y,theShape.getFourth());
                        return theGrid;
                    }
                }
            }
        }
        return theGrid;
    }

    public String[][] put(Shape theShape, String[][] theGrid, Integer x, Integer y, List<Coordinates> theMethod) {
        String label = theShape.getLabel();
        count++;
        if (count <= 9) {
            theCount = "00" + count;
        } else if (count <= 99) {
            theCount = "0" + count;
        }
        //this for loop writes the shape into the grid
        for (int i = 0; i < 4; i++) {
            whereX = theMethod.get(i).getX() + x;
            whereY = theMethod.get(i).getY() + y;
            //if ((whereX<=9)&&whereY<=42) {
            theGrid[whereX][whereY] = label + theCount;
            //}
        }
        return theGrid;
    }

    public boolean checkSurroundings(Integer x, Integer y, List<Coordinates> theMethod) {
        //put boolean for checking
        for (Coordinates coordinates : theMethod) {
            canPut = doCheck(coordinates, x, y);
            if (!canPut) {//if false, go to next orientation
                return false;//if canPut is false, the whole shape can not go there and it has to stop the loop
            }
        }
        return true;
    }

    public boolean doCheck(Coordinates coordinates, Integer x, Integer y) {
        whereX = coordinates.getX() + x;
        whereY = coordinates.getY() + y;
        if ((whereX < 10) && (whereY < 43) && (whereX > -1) && (whereY > -1)) {//System.out.println("off chart");
            if (theGrid[whereX][whereY] == null) {
                if (whereY > 39) {
                    setCheckStop(true);
                }
                return true;
            }
        }
        return false;//if at least one of the parts of the shape goes out of the limit, the whole shape can't go there
    }


    public void setCheckStop(boolean checkStop) {
        stop = checkStop;
    }

    public boolean getCheckStop() {
        return stop;
    }
}
