package com.ti.tetris.model;

import lombok.Data;

import java.util.List;

@Data
public class ShapePlace {
    Integer startPlace;
    Gridline startLine;
    List<List> positions;
}
