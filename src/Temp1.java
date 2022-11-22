package src;

public class Temp1{

    int x = 10;


    //Temp1 t1 = t1;
    void show(int x,Temp1 t1){


        System.out.println(t1.x);
        System.out.println(x);
    }

    public static void main(String[] args) {
        Temp1 t1 = new Temp1();

        t1.show(20,t1);
        System.out.println(t1.x);

    }
}
