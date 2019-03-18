package view;

import service.GridService;


public class GridView {
    private GridService gridService = new GridService();

    private String[][] gridView;

    /**
     * Fills the grid when called in printGrid()
     */
    public void fillGrid(){
        gridView = gridService.fillGrid();
    }



    public void printGrid(){
        fillGrid();

        for(int row=42; row>=0; row--){

            for (int column=0; column<10; column++){
                System.out.print("    " + gridView[row][column]);

            }

            System.out.println();
        }

    }
}
