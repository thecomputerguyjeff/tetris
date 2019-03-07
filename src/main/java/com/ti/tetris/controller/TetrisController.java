package com.ti.tetris.controller;

import com.ti.tetris.model.Grid;
import com.ti.tetris.service.GridService;
import com.ti.tetris.view.TetrisView;

public class TetrisController {
    GridService gridService = new GridService();
    TetrisView tetrisView = new TetrisView();

    public void addShape() {
        gridService.addShape();
    }
    public void clearGrid(){
        Grid.getGrid().clearGrid();
    }
    public void printGame() {
        tetrisView.printGame();

    }

}
