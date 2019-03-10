package model;


public abstract class Shapes {

    static Integer counter = 0;

    public static String count(){
        counter = counter+1;
        if (counter<10)
            return "0"+counter;
        else
            return ""+counter;
    }

    public abstract String[][] get1();
    public abstract String[][] get2();
    public abstract String [][] get3();
    public abstract String [][] get4();


}
