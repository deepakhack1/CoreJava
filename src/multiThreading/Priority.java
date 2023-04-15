package src.multiThreading;


class ThreadPriority extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
//                Thread.sleep(10);
            System.out.println("value is " + i + "thread name  : " + Thread.currentThread().getName());
        }

    }


}

public class Priority {

    public static void main(String[] args) {


        ThreadPriority threadPriority = new ThreadPriority();
        ThreadPriority threadPriority1 = new ThreadPriority();
        ThreadPriority threadPriority2 = new ThreadPriority();

        System.out.println("main thread priority "+Thread.currentThread().getPriority());  //5

        Thread.currentThread().setPriority(8);  //main thread

        System.out.println("main thread priority "+Thread.currentThread().getPriority());  //8

        threadPriority.setPriority(10);
//
        System.out.println("priority of first thread : " + threadPriority.getPriority());
        System.out.println("priority of second thread : " + threadPriority2.getPriority());
        System.out.println("priority of third thread : " + threadPriority1.getPriority());

        threadPriority.start();
        threadPriority1.start();
        threadPriority2.start();


    }

}
