package com.ti.tetris.model;

import lombok.Data;

@Data
public class Grid {
// Grid is a LinkedList - allowing easy removal of lines when they are filled
    private static Grid instance = new Grid();
    //private Integer linesLeftInGame;
    private Gridline topLine;
    private Gridline bottomLine;

    private Grid(){
        bottomLine = new Gridline();
        topLine = bottomLine;
        for (int i = 0; i < 43; i++) {
            addLine();
        }
    }
    public static Grid getGrid(){
        return instance;
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


}
