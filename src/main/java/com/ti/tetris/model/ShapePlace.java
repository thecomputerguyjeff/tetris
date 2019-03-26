package com.ti.tetris.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShapePlace {
    Integer startPlace;
    Gridline startLine;
    List<List> positions;
}
