package src.Inheritance;

class Base1{
    void show(){
        System.out.println("BASE");
    }
}
class Child1 extends Base1{
    void show(){
        super.show();
        System.out.println("CHILD");

    }

}
public class MemberFunctions {

    public static void main(String[] args) {

        Base1 child = new Child1();
        child.show();
    }

}
