package model.shapes;


import lombok.Getter;
import lombok.Setter;
import model.Shapes;
@Getter
@Setter
public class L extends Shapes {

    public static final String LABEL = "L ";
    String count = Shapes.count();


    public String[][] get1(){
            String[][]L = new String[2][3];
            L[1][2] = LABEL +count;
            L[0][0] = LABEL +count;
            L[0][1] = LABEL +count;
            L[0][2] = LABEL +count;

            return L;
        }

        public String[][] get2(){
            String[][]L = new String[3][2];
            L[0][0] = LABEL +count;
            L[0][1] = LABEL +count;
            L[1][0] = LABEL +count;
            L[2][0] = LABEL +count;

            return L;
        }

        public String[][] get3(){
            String[][]L = new String[3][2];
            L[0][1] = LABEL +count;
            L[1][1] = LABEL +count;
            L[2][0] = LABEL +count;
            L[2][1] = LABEL +count;

            return L;
        }

        public String[][] get4(){
            String[][]L = new String[2][3];
            L[0][0] = LABEL +count;
            L[1][0] = LABEL +count;
            L[1][1] = LABEL +count;
            L[1][2] = LABEL +count;

            return L;
        }
}