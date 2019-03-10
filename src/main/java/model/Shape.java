package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface Shape {
    public List<Coordinates> coordinates=new ArrayList<>();
    public List<Coordinates> getFirst();
    public List<Coordinates> getSecond();
    public List<Coordinates> getThird();
    public List<Coordinates> getFourth();
    //public String print(List<List> theArray);
    public String getLabel();
}
