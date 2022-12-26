package src;

public class StaticExample {

      int count = 0;

     void increment(){
        count++;
    }

    void print(){
        System.out.println(count);
    }

    public static void main(String[] args) {

        StaticExample staticExample = new StaticExample();
        staticExample.increment();
        staticExample.print();
        StaticExample staticExample1 = new StaticExample();
        staticExample1.increment();
        staticExample.print();



    }


}
