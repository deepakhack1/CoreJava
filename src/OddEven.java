package src;

import java.util.Scanner;  //Scanner imports for user input

public class OddEven {  // class name

    public static void main(String[] args) {    // Main method

        int a;   // Variable declaration

        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();   // user input

         if(a%2==0){                               //checking even condition
             System.out.println("Even number");
         }else {                                   //else odd number
             System.out.println("odd number");
         }
    }

}
