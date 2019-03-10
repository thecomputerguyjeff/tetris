package model;


import model.shapes.*;

public class ShapeFactory {

    Shapes shape;

    public Shapes getRandom(){

        switch ((int)(Math.random()*100)%7) {
            case 0:
                return new Tee();

            case 1:
                return new L();
            case 2:
                return new BackwardL();
            case 3:
                return new Zee();
            case 4:
                return new BackwardZee();
            case 5:
                return new Line();
            case 6:
                return new Box();
            default:
                return null;

        }
    }


}
