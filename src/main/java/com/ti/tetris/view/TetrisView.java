package com.ti.tetris.view;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;
import com.ti.tetris.model.Grid;
import com.ti.tetris.model.Gridline;

public class TetrisView {
    public void printGame() {
        ColoredPrinter coloredPrinter = new ColoredPrinter.Builder(1,false).build();

        Grid grid = Grid.getGrid();
        Gridline line = grid.getTopLine();
        Integer lineNo = 43;
        while (line != null){
            coloredPrinter.print("msg", Ansi.Attribute.NONE, Ansi.FColor.CYAN, Ansi.BColor.GREEN);
            System.out.print(String.format("%02d", lineNo)+":");
            for (int i = 0; i < 10; i++) {
                System.out.print(" "+line.getContents()[i]);
            }
            lineNo--;
            System.out.println();
            line = line.getPrevious();
        }


    }
}
