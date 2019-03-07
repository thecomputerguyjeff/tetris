package com.ti.tetris.view;

import com.ti.tetris.model.Grid;
import com.ti.tetris.model.Gridline;

public class TetrisView {
    public void printGame() {
        Grid grid = Grid.getGrid();
        Gridline line = grid.getTopLine();
        Integer lineNo = 43;
        while (line != null){
            System.out.print(lineNo+":");
            for (int i = 0; i < 10; i++) {
                System.out.print(" "+line.getContents()[i]);
            }
            lineNo--;
            System.out.println();
            line = line.getPrevious();
        }


    }
}
