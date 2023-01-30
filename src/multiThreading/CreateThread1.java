package src.multiThreading;

public class CreateThread1 extends Thread{

    public void run(){

        for(int i=0;i<10;i++){
            System.out.println(i);
        }

    }


    public static void main(String[] args) {

        CreateThread1 createThread = new CreateThread1();
        createThread.start();

    }

}
