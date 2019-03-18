package model.shapes;

import lombok.Getter;
import lombok.Setter;
import model.Shapes;
@Getter
@Setter
public class BackwardZee extends Shapes {

    public static final String LABEL = "bZ";
    String count = Shapes.count();

    public String[][] get1(){
        String[][] backwardZee = new String[2][3];

        backwardZee[0][0] = LABEL +count;
        backwardZee[0][1] = LABEL +count;
        backwardZee[1][1] = LABEL +count;
        backwardZee[1][2] = LABEL +count;

        return backwardZee;
    }

    public String[][] get3(){
        String[][] backwardZee = new String[3][2];

        backwardZee[0][1] = LABEL +count;
        backwardZee[1][1] = LABEL +count;
        backwardZee[1][0] = LABEL +count;
        backwardZee[2][0] = LABEL +count;

        return backwardZee;
    }

    public String[][] get4(){

        return get3();
    }

    public String[][] get2(){

        return get1();
    }
}
