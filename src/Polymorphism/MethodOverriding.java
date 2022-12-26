package src.Polymorphism;

class Vehicle{
    void engine(){
        System.out.println("vehice class");
    }
}
class TwoWheelers extends Vehicle{
    void engine() {
        System.out.println("two wheeler class");
    }
}

class ThreeWheelers extends Vehicle{
    void engine(){
        System.out.println("three wheeler class");
    }
}

class FourWheelers extends Vehicle{
    void engine(){
        System.out.println("four wheeler class");
    }
}
public class MethodOverriding {

    public static void main(String[] args) {
        Vehicle vehicle = new FourWheelers();
        vehicle.engine();
    }


}
