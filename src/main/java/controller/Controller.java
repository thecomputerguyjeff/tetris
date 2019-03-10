package controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import service.GridService;
import view.GridView;

@AllArgsConstructor
@NoArgsConstructor
public class Controller {

        GridService gridService = new GridService();
        GridView gridView = new GridView();

        public void fillingGrid () {
            gridService.fillGrid();
        }

        public void printingGrid () {
            gridView.printGrid();
        }



        public static void main(String[] args){
            Controller controller= new Controller();

            //controller.fillingGrid();
            controller.printingGrid();
        }
}
