package model.shapes;


import lombok.Getter;
import lombok.Setter;
import model.Shapes;
@Getter
@Setter
public class Tee extends Shapes {

    public static final String T = "T ";
    String count = Shapes.count();

    public String[][] get1(){
        String[][] tee = new String[2][3];
        tee[0][0] = T +count;
        tee[0][1] = T +count;
        tee[0][2] = T +count;
        tee[1][1] = T +count;

        return tee;
    }

    public String[][] get3(){
        String[][] tee = new String[3][2];
        tee[0][0] = T +count;
        tee[1][0] = T +count;
        tee[2][0] = T +count;
        tee[1][1] = T +count;

        return tee;
    }

    public String[][] get4(){
        String[][] tee = new String[3][2];
        tee[0][1] = T +count;
        tee[1][0] = T +count;
        tee[1][1] = T +count;
        tee[2][1] = T +count;

        return tee;
    }

    public String[][] get2(){
        String[][] tee = new String[2][3];
        tee[1][0] = T +count;
        tee[1][1] = T +count;
        tee[1][2] = T +count;
        tee[0][1] = T +count;

        return tee;
    }
}
