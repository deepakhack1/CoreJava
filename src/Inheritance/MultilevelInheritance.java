package src.Inheritance;

 class M{

    void print(){
        System.out.println("M");
    }

}
class N extends M{


    void show(){
        System.out.println("N");
    }

}
class P extends N{

    void display(){
        System.out.println("P");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        P p = new P();
        p.display(); // P
        p.show();   // N
        p.print();  // M
    }


}
