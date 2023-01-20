package src.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedUnchecked {

    public static void main(String[] args) {


//        int x;
//        int y;
//
//        Scanner sc = new Scanner(System.in);
//
//        x = sc.nextInt();
//        y = sc.nextInt();
//
//        try{
//            int z = x/y;
//            System.out.println(z);
//        }catch (ArithmeticException e){
//            System.out.println("Can't divide by zero");
//        }

//        int arr[] = {1,2,3,4,5};
//        try {
//            int x = arr[5];
//            System.out.println(x);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("index is more than length of an array");
//        }


        String str = "Surya";
        try {
            String str1 = str.substring(8);
            System.out.println(str1);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("index is more than length of a string");
        }

        System.out.println("hello");





    }

}
