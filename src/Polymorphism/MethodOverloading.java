package src.Polymorphism;

public class MethodOverloading {

    void show(){

    }
    void show(int a){

    }
    void show(int x,int y){

    }
    void show(double m,int n){

    }
    void show(float f){

    }
    public static void main(String... args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.show(1.5f);

    }

}
