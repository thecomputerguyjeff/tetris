package model.shapes;

import model.Shapes;

public class BackwardL extends Shapes {

    public static final String LABEL = "bL";
    String count = Shapes.count();

    public String[][] get1(){
        String[][] backwardL = new String[2][3];

        backwardL[0][0] = LABEL+count;
        backwardL[1][0] = LABEL+count;
        backwardL[0][1] = LABEL+count;
        backwardL[0][2] = LABEL+count;

        return backwardL;
    }

    public String[][] get2(){
        String[][] backwardL = new String[3][2];

        backwardL[0][0] = LABEL +count;
        backwardL[0][1] = LABEL+count;
        backwardL[1][1] = LABEL+count;
        backwardL[2][1] = LABEL+count;

        return backwardL;
    }

    public String[][] get3(){
        String[][] backwardL = new String[3][2];

        backwardL[0][0] = LABEL+count;
        backwardL[1][0] = LABEL+count;
        backwardL[2][0] = LABEL+count;
        backwardL[2][1] = LABEL+count;

        return backwardL;
    }

    public String[][] get4(){
        String[][] backwardL = new String[2][3];

        backwardL[0][2] = LABEL+count;
        backwardL[1][2] = LABEL+count;
        backwardL[1][1] = LABEL+count;
        backwardL[1][0] = LABEL+count;

        return backwardL;
    }
}

