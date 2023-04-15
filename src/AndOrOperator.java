package src;

import java.util.Scanner;

public class AndOrOperator {

    public static void main(String[] args) {
        int a ;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        //condition :- should be even and divisible by 5

        if(a%2==0  && a%5==0){
            System.out.println("number is even and divisible by 5");
        }else{
            System.out.println("condition not matches");
        }

        //Condition :- number is even or divisible by 5

        if(a%2==0  || a%5==0){
            System.out.println("condition matches");
        }else {
            System.out.println("number is odd as well as not divisible by 5");
        }

    }

}
