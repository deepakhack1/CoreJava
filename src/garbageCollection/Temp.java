package src.garbageCollection;

import static java.lang.Runtime.*;

public class Temp {

    protected void finalize(){
        System.out.println("garbage collection");
    }
    public static void main(String[] args) {

        Temp temp1 = new Temp();
        Temp temp2 = new Temp();
        temp1 = null;
        temp2 = null;
        System.gc();


    }

}
