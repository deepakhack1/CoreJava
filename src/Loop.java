package src;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        //For loop


//        int sum  = 0;
//
//        for(int i=1;i<=10;i++){
//            sum = sum + i;
//        }

                /*
        for(variable initialization;condition;increments){

        }
         */


        //While loop

        /*
            variable initialization

            while(condition){
                logic / body

                increment
            }
         */

//        int i =1;
//        int sum =0;
//
//        while (i<=10){
//            sum = sum + i;
//            i++;
//        }
//
//        System.out.println("total sum is :"+sum);

        //Do while loop

        /*
        variable initialization

        do{

        logic/body

        increment

        }while(condition)

         */

//        int i = 1;
//        int sum = 0;
//
//        do{
//            sum = sum +i;
//
//            i++;
//        }while (i<=10);
//
//
//        System.out.println("total sum is "+sum);
//

//        for(int i=9;i<8;i++){
//            System.out.println("Hello");
//        }

//        int i =9;
//
//        while (i<8){
//            System.out.println("Hello");
//            i++;
//        }

//
//        int i=9;
//
//        do{
//            System.out.println("Hello");
//            i++;
//        }while (i<8);

        //Break
//
//        for(int i=1;i<=100;i++){
//
//            if(i>50){
//                break;
//            }
//            System.out.println("Hello");
//        }


    //Continue

//        for(int i=1;i<=100;i++){
//
//            if(i%10==0){
//                continue;
//            }
//
//            if(i%3==0 || i%5==0){
//                System.out.println("Hello");
//            }
//
//            System.out.println("yes");
//
//
//
//        }

        //Table of any number
//
//        Scanner scanner = new Scanner(System.in);
//        int value = scanner.nextInt();
//
//        int mult =0;
//
//        for(int i=1;i<=10;i++){
//
//            mult = value * i;
//            System.out.println(value +" * "+i+"  = "+mult);
//
//        }


        int arr[] = new int[5];   //Created an array of size 5

       Scanner scanner = new Scanner(System.in);

       arr[0] = scanner.nextInt();
       arr[1] = scanner.nextInt();
       arr[2] = scanner.nextInt();
       arr[3] = scanner.nextInt();
       arr[4] = scanner.nextInt();
       
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

        int arr1[] = {10,12,13,15,20};


        for(int i=0;i<5;i++){
            System.out.println(arr1[i]);
        }





    }

}
