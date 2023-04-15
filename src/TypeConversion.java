package src;

public class TypeConversion {

    public static void main(String[] args) {

        int a = 9;
        short b = (short)a ;

        short x = 10;
        int y = (int)x ;

        System.out.println(y);

        System.out.println("the value of a is"+a);
        System.out.println("the value of b is"+b);


        float m = 3.14f;
        double d = (double) m;

        System.out.println(d);

        int r = 100;
        long l = (long) r;

        System.out.println(l);

    }

}
