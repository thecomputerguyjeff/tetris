package com.ti.tetris.model.shapes;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class I implements ShapeInterface {
    String identifier = "I";
    Integer orientation = 0;
    Integer numberOfOrientations = 2;

    @Override
    public List<List> getPositions(Integer orientation) {
        List<List> coordinates = new ArrayList<>();
        if (orientation == 0) {
            coordinates.add(Arrays.asList(0,1,2,3));
        }
        if (orientation == 1){
            coordinates.add(Arrays.asList(0));
            coordinates.add(Arrays.asList(0));
            coordinates.add(Arrays.asList(0));
            coordinates.add(Arrays.asList(0));
        }

        return coordinates;
    }


}
