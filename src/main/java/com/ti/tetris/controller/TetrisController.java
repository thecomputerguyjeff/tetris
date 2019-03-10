package com.ti.tetris.controller;

import com.ti.tetris.model.Grid;
import com.ti.tetris.service.GameService;
import com.ti.tetris.view.TetrisView;

public class TetrisController {
    GameService gameService = new GameService();
    TetrisView tetrisView = new TetrisView();

//    public void addShape() {
//        gameService.addShape();
//    }
//    public void clearGrid(){
//        Grid.getGrid().clearGrid();
//    }
//    public void printGame() {
//        tetrisView.printGame();
//    }

    public void playGame(){
        Grid.getGrid().clearGrid();
        gameService.playGame();
        tetrisView.printGame();
    }

}
