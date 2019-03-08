package com.ti.tetris.model.shapes;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Data
public class O implements ShapeInterface {
    String identifier = "O";
    Integer numberOfOrientations = 1;

    @Override
    public List<List> getPositions(Integer orientation) {
        List<List> coordinates = new ArrayList<>();
        coordinates.add(Arrays.asList(0,1));
        coordinates.add(Arrays.asList(0,1));
        return coordinates;
    }


}
