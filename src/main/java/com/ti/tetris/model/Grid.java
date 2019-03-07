package com.ti.tetris.model;

import lombok.Data;

@Data
public class Grid {
// Grid is a LinkedList - allowing easy removal of lines when they are filled
    private static Grid grid = new Grid();
    //private Integer linesLeftInGame;
    private Gridline topLine;
    private Gridline bottomLine;

    private Grid(){
        clearGrid();
    }
    public static Grid getGrid(){
        return grid;
    }
    private void addLine() {
        Gridline line = new Gridline();
        line.setPrevious(topLine);
        topLine.setNext(line);
        topLine=line;

    }

    public void removeLine(Gridline line) {
        line.getPrevious().setNext(line.getNext());
        line.getNext().setPrevious(line.getPrevious());
        addLine();

    }
    public void clearGrid(){
        bottomLine = new Gridline();
        topLine = bottomLine;
        for (int i = 0; i < 42; i++) {
            addLine();
        }
    }

}
