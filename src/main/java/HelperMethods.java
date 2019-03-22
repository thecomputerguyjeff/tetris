import model.Shape;

import java.util.List;
import java.util.Random;


public class HelperMethods  {

    public String getShape(){
        String theShape="";
        Random rand=new Random();
        Integer shapeType=rand.nextInt(7);
        theShape="line";
//        switch (shapeType){
//            case 1:
//                theShape="line";
//                break;
//            case 2:
//                theShape="square";
//                break;
//            case 3:
//                theShape="s";
//                break;
//            case 4:
//                theShape="z";
//                break;
//            case 5:
//                theShape="L";
//                break;
//            case 6:
//                theShape="j";
//                break;
//            case 7:
//                theShape="halfPlus";
//                break;
//        }
        return theShape;
    }

    //@Override
    public String print(List<List> theSetOfArrays) {
        String layout="";
        List array;
        //go through each layer starting from the top and
        //print out what is there with an enter after each line.
        for(int i=0;i<theSetOfArrays.get(i).size();i++) {
            for (int j = 0; j < theSetOfArrays.size(); j++) {
                array = theSetOfArrays.get(j);
                if(array.get(i).equals(null)){
                    array.add(j," ");
                }
                layout = layout + array.get(j);
            }
            layout=layout+"\n";
        }
        return layout;
    }



}
