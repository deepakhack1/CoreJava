package src.Final;

class A{

    final void print(){
        System.out.println("print");
    }
}
class B extends  A {

    // final method cannot override

//    @Override
//    void print() {
//        super.print();
//    }
//

}
public class Temp2 {

    public static void main(String[] args) {
        B b = new B();
        b.print();
    }

}

