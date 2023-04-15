package src;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessingGame {

    public static void main(String[] args) {

        ThreadLocalRandom random = ThreadLocalRandom.current();
        int number = random.nextInt(1,100);  //here u got the random number
        int guessesTrails = 12;

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;

        for( int counter = 0;counter<guessesTrails;counter++){
            int guessValue = scanner.nextInt(); //here we are getting guess value
            if(guessValue == number){
                System.out.println("Correct ans");
                flag = true;
                break;
            }
            else if (guessValue > number){
                System.out.println("too high");
            }
            else {
                System.out.println("too low");
            }
            System.out.println("guessing tries left :"+(guessesTrails-counter-1));
        }

        if(flag == false){
            System.out.println("Couldn't get the right guess");
        }


    }

}
