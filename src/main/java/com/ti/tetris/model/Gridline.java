package com.ti.tetris.model;

import lombok.Data;

@Data
public class Gridline {
    public Gridline previous;
    public Gridline next;
    public String[] contents  = {"X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000", "X000"};
}

