package src.multiThreading;

class Thread10 extends Thread{

    Thread10(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
class Thread11 extends Thread{

    Thread11(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class NamingThread {

    public static void main(String[] args) {

        Thread10 thread10 = new Thread10("Thread10");
        Thread11 thread11 = new Thread11("Thread11");
        System.out.println(thread10.getName());
        System.out.println(thread11.getName());

        System.out.println(Thread.currentThread().getName());


//        thread10.setName("surya");
//        System.out.println(thread10.getName());
//        System.out.println(thread11.getName());

        thread10.start();
        thread11.start();

    }









}
