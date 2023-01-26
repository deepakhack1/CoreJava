package src.multipleThreading;


class Thread1 extends Thread{
    Thread1(String s){
        super(s);
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(getName());
        }
    }
}
class Thread2 extends Thread{
    Thread2(String s){
        super(s);
    }

    public void run(){

        for(int i=0;i<10;i++){
            System.out.println(getName());
        }

    }

}

class Thread3 extends Thread{

    Thread3(String s){
        super(s);
    }

    public void run(){

        for(int i=0;i<10;i++){
            System.out.println(getName());
        }

    }

}

public class ThreadScheduler {


    public static void main(String[] args) {

        Thread1 t1 = new Thread1("first thread");
        Thread2 t2 = new Thread2("Second Thread");
        Thread3 t3 = new Thread3("Third Thread");

        t1.start();
        t2.start();
        t3.start();

        for(int i=0;i<20;i++){
            System.out.println("current thread : "+Thread.currentThread().getName());
        }


    }




}
