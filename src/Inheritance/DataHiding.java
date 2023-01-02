package src.Inheritance;

class Base{

    int x = 50;

}
class Child extends Base{

    //int x=50;
    int x = 20;

    void show(){
        System.out.println(x);

    }
}

public class DataHiding {

    public static void main(String[] args) {

        Child child = new Child();
        child.show();
    }
}
