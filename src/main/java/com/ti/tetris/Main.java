package com.ti.tetris;

import com.ti.tetris.controller.TetrisController;

public class Main {

    public static void main(String args[]){
        TetrisController tetrisController = new TetrisController();
        tetrisController.playGame();
    }
}
