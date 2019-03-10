package view;

import com.diogonunes.jcdp.color.ColoredPrinter;
import model.TheGrid;

public class View {
    public void printOut(String[][] Grid){
        for(int i=42;i>=0;i--) {
            for(int j=0;j<10;j++) {
                ColoredPrinter coloredPrinter=new ColoredPrinter.Builder(1,false).build();
                System.out.print(Grid[j][i]+" ");
            }
            System.out.println();
        }
    }
}
