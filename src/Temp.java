package src;

public class Temp {

    int x =10;

     void show(int x){

        System.out.println(x);
        System.out.println(x);
        System.out.println(this.x);
}

    public static void main(String[] args) {

         Temp temp = new Temp();

        temp.show(20);

    }

}
