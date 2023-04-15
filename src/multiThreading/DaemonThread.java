package src.multiThreading;


class ThreadDaemon extends Thread{

    public void run(){

        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon");
        }else
            System.out.println("not daemon");


    }

}
public class DaemonThread {

    public static void main(String[] args) {

        ThreadDaemon threadDaemon = new ThreadDaemon();
        ThreadDaemon threadDaemon1 = new ThreadDaemon();

        System.out.println(threadDaemon1.isDaemon());  //false

        threadDaemon1.setDaemon(true);

        System.out.println(threadDaemon1.isDaemon());

        threadDaemon.start();
        threadDaemon1.start();

    }



}
