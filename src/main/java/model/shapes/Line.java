package model.shapes;


import model.Shapes;

public class Line extends Shapes {

    public static final String LABEL = "Li";

    String count = Shapes.count();


    public String[][] get1(){
        String[][] Line = new String[1][4];
        Line[0][0]= LABEL +count;
        Line[0][1]= LABEL +count;
        Line[0][2]= LABEL +count;
        Line[0][3]= LABEL +count;

        return Line;
    }

    public String[][] get3(){
        String[][] Line = new String[4][1];
        Line[0][0]= LABEL +count;
        Line[1][0]= LABEL +count;
        Line[2][0]= LABEL +count;
        Line[3][0]= LABEL +count;

        return Line;
    }

    public String[][] get4(){
        return get3();
    }

    public String[][] get2(){
        return get1();
    }
}
