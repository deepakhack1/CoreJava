package src.exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) throws FileNotFoundException  {

//        int age = 0;
//        Scanner sc = new Scanner(System.in);
//
//        if (age<18){
//            throw new ArithmeticException("age can not be less than 18");
//        }
//        else{
//            System.out.println("pass");
//        }

//        try {
//
//            FileReader file = new FileReader("C:\\Users\\deena\\Desktop\\abc.txt");
//            BufferedReader bufferedReader = new BufferedReader(file);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


            FileReader file = new FileReader("C:\\Users\\deena\\Desktop\\abc.txt");
            BufferedReader bufferedReader = new BufferedReader(file);

            throw new FileNotFoundException();








    }

}
