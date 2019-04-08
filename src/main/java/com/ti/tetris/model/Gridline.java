package com.ti.tetris.model;

import lombok.Data;

@Data
public class Gridline {
    public Gridline previous;
    public Gridline next;
    public Integer filledSpots;
    public String[] contents;
    public Gridline(){
        contents = new String[]{"X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000"};
        filledSpots = 0;
    }

    public void increaseFilledSpots(){
        filledSpots++;
    }
}

