package src.multiThreading;

public class ThreadSleep extends Thread{
    public void run(){

        long startTime = System.currentTimeMillis();

   //Thread.sleep(long milliseconds)
   //Thread.sleep(long milliseconds,long nanoseconds);

        for (int i=0;i<10;i++){
            try {
                Thread.sleep(1000,10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

        long endTime = System.currentTimeMillis();
       System.out.println("time is : " + (endTime-startTime));
    }
    public static void main(String[] args) {

        ThreadSleep threadSleep = new ThreadSleep();
        threadSleep.start();
        threadSleep.start();

    }

}
