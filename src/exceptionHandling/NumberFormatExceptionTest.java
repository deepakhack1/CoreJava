package src.exceptionHandling;

import java.util.Scanner;

public class NumberFormatExceptionTest {

    public static void main(String[] args) {
        int x = 123;
        String str = String.valueOf(x);
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        try{
            Integer i = Integer.parseInt(str1);
            System.out.println(i);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("can not convert string into number");
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("can not convert string into number");
            try{
                int y = 10/0;
            }catch (ArithmeticException e1){
                e1.printStackTrace();
            }
        }


    }



}
