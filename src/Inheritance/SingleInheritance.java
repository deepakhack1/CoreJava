package src.Inheritance;

class A{

    int a = 10;

    void print(){
        System.out.println("A");
    }

}

class B extends A{




}



public class SingleInheritance {

    public static void main(String[] args) {

        B b = new B();
        b.print();
        System.out.println(b.a);


    }
}
