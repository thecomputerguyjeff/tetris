package com.ti.tetris.model.shapes;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Data
public class S implements ShapeInterface {
    String identifier = "S";
    Integer numberOfOrientations = 2;

    @Override
    public List<List> getPositions(Integer orientation) {
        List<List> coordinates = new ArrayList<>();
        switch (orientation) {
            case 0:
                coordinates.add(Arrays.asList(0, 1));
                coordinates.add(Arrays.asList(1, 2));
                break;
            case 1:
                coordinates.add(Arrays.asList(0));
                coordinates.add(Arrays.asList(0, -1));
                coordinates.add(Arrays.asList(-1));
                break;
            }
            return coordinates;
        }


    }

