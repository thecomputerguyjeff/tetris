package view;

import service.GridService;


public class GridView {
    private GridService gridService = new GridService();

    private String[][] gridView = gridService.fillGrid();

    public GridView(){};

    public void printGrid(){

        for(int i=42; i>=0; i--){

            for (int j=0; j<10; j++){
                System.out.print("    " + gridView[i][j]);

            }

            System.out.println();
        }

    }
}
