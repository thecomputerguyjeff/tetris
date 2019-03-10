package controllerService;

import view.View;

public class Controller {
    public static void main(String[]args){
        TetrisService Service=new TetrisService();
        View viewer =new View();

        viewer.printOut(Service.fillGrid());
    //calls the service and then calls the view to print it out
    }
}
