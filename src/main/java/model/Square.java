package model;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data

public class Square implements Shape {


    @Override
    public List<Coordinates> getFourth() {
        return getFirst();
    }

    @Override
    public List<Coordinates> getThird() {
        return getFirst();
    }

    @Override
    public List<Coordinates> getSecond() {
        return getFirst();
    }

    @Override
    public List<Coordinates> getFirst() {
        Coordinates coordinates1=new Coordinates();
        coordinates1.setX(0);
        coordinates1.setY(0);
        Coordinates coordinates2=new Coordinates();
        coordinates2.setX(1);
        coordinates2.setY(0);
        Coordinates coordinates3=new Coordinates();
        coordinates3.setX(0);
        coordinates3.setY(1);
        Coordinates coordinates4=new Coordinates();
        coordinates4.setX(1);
        coordinates4.setY(1);
        return Arrays.asList(coordinates1,coordinates2,coordinates3,coordinates4);
    }

    @Override
    public String getLabel() {
        return "A";
    }
}
