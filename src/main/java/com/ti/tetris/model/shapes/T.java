package com.ti.tetris.model.shapes;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class T implements ShapeInterface {
    String identifier = "T";
    Integer numberOfOrientations = 4;

    @Override
    public List<List> getPositions(Integer orientation) {
        List<List> coordinates = new ArrayList<>();
        switch (orientation){
            case 0:
                coordinates.add(Arrays.asList(0,1,2));
                coordinates.add(Arrays.asList(1));
                break;
            case 1:
                coordinates.add(Arrays.asList(0));
                coordinates.add(Arrays.asList(0,-1));
                coordinates.add(Arrays.asList(0));
                break;
            case 2:
                coordinates.add(Arrays.asList(0));
                coordinates.add(Arrays.asList(0,1));
                coordinates.add(Arrays.asList(0));
                break;
            case 3:
                coordinates.add(Arrays.asList(0));
                coordinates.add(Arrays.asList(-1,0,1));
                break;
        }
        return coordinates;
    }

}
