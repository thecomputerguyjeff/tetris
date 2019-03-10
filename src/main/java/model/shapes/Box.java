package model.shapes;

import model.Shapes;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Box extends Shapes {
    public static final String LABEL = "B ";
    String count = Shapes.count();


    String[][] box = new String[2][2];

    public String[][] get1(){
        box[0][0] = LABEL +count;
        box[0][1] = LABEL +count;
        box[1][0]= LABEL +count;
        box[1][1]= LABEL +count;
        return box;
    }

    public String[][] get2(){
        return get1();
    }

    public String[][] get3(){
        return get1();
    }

    public String[][] get4(){
        return get1();
    }
}
