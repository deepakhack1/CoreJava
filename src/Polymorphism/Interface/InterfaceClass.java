package src.Polymorphism.Interface;

interface A{
    void add();
    default void show(){
        System.out.println("show");
    }
    static void print(){
        System.out.println("print");
    }
}
 interface B{
     void sum();
}
class Temp implements A,B{
    public void add() {
        System.out.println("add");
    }

    public  void sum(){
        System.out.println("sum");
    }


}

public class InterfaceClass {
    public static void main(String[] args) {

        A a= new Temp();
        A.print();
        a.add();
        a.show();


    }
}
