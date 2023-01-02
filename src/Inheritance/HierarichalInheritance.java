package src.Inheritance;

class X{

    void print(){
        System.out.println("X");
    }

}
class Y extends X{

    void show(){
        System.out.println("Y");
    }

}
class Z extends  X{

    void display(){

        System.out.println("Z");

    }
}

public class HierarichalInheritance {

    public static void main(String[] args) {

        Z z = new Z();
        z.print();



    }




}
