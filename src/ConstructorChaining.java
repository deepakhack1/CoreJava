package src;

public class ConstructorChaining {

    ConstructorChaining(){
        this(10,20);
        System.out.println("default constructor");
    }
    ConstructorChaining(int x){

        System.out.println("single parameterized constructor");
    }
    ConstructorChaining(int x,int y){
        this(10);

        System.out.println("double parameterized constructor");
    }
    public static void main(String[] args) {

        new ConstructorChaining(); //Anonymous object

    }
}
