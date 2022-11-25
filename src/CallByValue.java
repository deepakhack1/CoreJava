package src;

public class CallByValue {

    int x;

    CallByValue(int x){
        this.x = x;
    }

    void show(int x){
        this.x = x;
        System.out.println("x is :"+x);
    }


    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue(10);
        callByValue.show(20);
        System.out.println("x is :"+callByValue.x);
    }

}
