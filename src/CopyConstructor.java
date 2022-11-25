package src;

public class CopyConstructor {

    int x,y;

    CopyConstructor(int x,int y){
        this.x=x;
        this.y=y;
    }

    CopyConstructor(CopyConstructor t3){
        this.x = t3.x;
        this.y = t3.y;
    }

    void show(){

        System.out.println("x is :"+x);
        System.out.print("y is :"+y);

    }

    public static void main(String[] args) {

        CopyConstructor t1 = new CopyConstructor(10,20);
        t1.show();
        CopyConstructor t2 = new CopyConstructor(t1);
        t2.show();


    }

}
