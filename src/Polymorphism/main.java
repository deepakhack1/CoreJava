package src.Polymorphism;

abstract class AbstractClass {
     abstract void show(); // way of writing abstract method.
    void display(){
        System.out.println("display method");
    }
}

class Child2 extends AbstractClass{

    void show(){
        System.out.println("show method");
    }

    void display(){
        super.display();
        System.out.println("display method of child");
    }
}
public class main{

    public static void main(String[] args) {
        AbstractClass abstractClass = new Child2();
        abstractClass.display();
        abstractClass.show();
    }

}





