package model.shapes;

import model.Shapes;

public class Zee extends Shapes {
    public static final String LABEL = "Z ";
    private String count = Shapes.count();


    public String[][] get1(){
        String[][] zee = new String[2][3];

        zee[1][0] = LABEL +count;
        zee[1][1] = LABEL +count;
        zee[0][1] = LABEL +count;
        zee[0][2] = LABEL +count;

        return zee;
    }

    public String[][] get3(){
        String[][] zee = new String[3][2];

        zee[0][0] = LABEL +count;
        zee[1][0] = LABEL +count;
        zee[1][1] = LABEL +count;
        zee[2][1] = LABEL +count;

        return zee;
    }

    public String[][] get4(){

        return get3();
    }

    public String[][] get2(){

        return get1();
    }
}
