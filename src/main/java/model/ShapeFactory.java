package model;


import java.util.Random;

public class ShapeFactory {

        public Shape getShape(){
            Shape theShape=null;
            Random rand=new Random();
            Integer shapeType=rand.nextInt(7)+1;

            switch (shapeType){
                case 1:
                    theShape=new Line();
                    break;
                case 2:
                    theShape=new Square();
                    break;
                case 3:
                    theShape=new S();
                    break;
                case 4:
                    theShape=new Z();
                    break;
                case 5:
                    theShape=new L();
                    break;
                case 6:
                    theShape=new J();
                    break;
                case 7:
                    theShape=new HalfPlus();
                    break;
            }
            //theShape=new HalfPlus();
            return theShape;
        }

}
