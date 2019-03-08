package com.ti.tetris.model.shapes;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class L implements ShapeInterface {
    String identifier = "L";
    Integer numberOfOrientations = 4;

    @Override
    public List<List> getPositions(Integer orientation) {
        List<List> coordinates = new ArrayList<>();
        switch (orientation){
            case 0:
                coordinates.add(Arrays.asList(0,1,2));
                coordinates.add(Arrays.asList(2));
                break;
            case 1:
                coordinates.add(Arrays.asList(0,1));
                coordinates.add(Arrays.asList(0));
                coordinates.add(Arrays.asList(0));
                break;
            case 2:
                coordinates.add(Arrays.asList(0));
                coordinates.add(Arrays.asList(0));
                coordinates.add(Arrays.asList(0,-1));
                break;
            case 3:
                coordinates.add(Arrays.asList(0));
                coordinates.add(Arrays.asList(0,1,2));
                break;
        }
        return coordinates;
    }


}
