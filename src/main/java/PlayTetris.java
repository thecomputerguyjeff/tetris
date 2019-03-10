
import java.util.ArrayList;
import java.util.List;


public class PlayTetris extends HelperMethods{
    private static PlayTetris player=new PlayTetris();
    private List<List> theSetOfArrays=new ArrayList<List>();
    private List<String> array1=new ArrayList<>();
    private List<String> array2=new ArrayList<>();
    private List<String> array3=new ArrayList<>();
    private List<String> array4=new ArrayList<>();
    private List<String> array5=new ArrayList<>();
    private List<String> array6=new ArrayList<>();
    private List<String> array7=new ArrayList<>();
    private List<String> array8=new ArrayList<>();
    private List<String> array9=new ArrayList<>();
    private List<String> array10=new ArrayList<>();
    public HelperMethods helper;
    public String theShape;

//it adds to the end and I am playing upside-down
    public String PlayTetris() {
        helper = new HelperMethods();
        theShape=helper.getShape();
        if(theShape.equals("line")){
            //see if the bottom row is empty
            for (int i=0;i<4;i++) {
                array1.add("A1");
            }
        }
        theShape="square";
        if(theShape.equals("square")){
            //see if the bottom row is empty
            for (int i=0;i<4;i++) {
                array2.add("B1");
            }
        }
        theSetOfArrays.add((ArrayList) array1);
        theSetOfArrays.add((ArrayList) array2);
        theSetOfArrays.add((ArrayList) array3);
        theSetOfArrays.add((ArrayList) array4);
        theSetOfArrays.add((ArrayList) array5);
        theSetOfArrays.add((ArrayList) array6);
        theSetOfArrays.add((ArrayList) array7);
        theSetOfArrays.add((ArrayList) array8);
        theSetOfArrays.add((ArrayList) array9);
        theSetOfArrays.add((ArrayList) array10);
        String layout=helper.print(theSetOfArrays);

        return layout;
    }
    public static void main(String[]args){
        String layout=player.PlayTetris();
        System.out.println(layout);
    }
}
