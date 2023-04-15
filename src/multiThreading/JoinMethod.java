package src.multiThreading;


class ThreadJoin extends  Thread{
    public void run(){
        for (int i=0;i<10;i++){

            try{
                Thread.sleep(1000);
                System.out.println("value of i is : "+i+", thread name is :"+Thread.currentThread().getName());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class JoinMethod {

    public static void main(String[] args) {

        ThreadJoin threadJoin = new ThreadJoin();
        ThreadJoin threadJoin1 = new ThreadJoin();
        ThreadJoin threadJoin2 = new ThreadJoin();

        threadJoin.start();

        try {
            threadJoin.join(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        threadJoin1.start();


        try {
            threadJoin1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        threadJoin2.start();




    }

}
